//package ua.hillel.nemirovets.lessons.lessons_15;'
//
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Exam {
//    /*
//        створіть клас Exam, у ньому попросіть користувача ввести тип
//        транспортного засобу:
//        MOTORCYCLE, CAR, BUS, TRUCK
//        b. залежно від вибраного виду, виведіть літеру категорії прав, яка
//        необхідна для керування цим транспортним засобом.
//        приклад: MOTO = A, CAR = B
//        c. виведіть у консоль букву категорії:
//        "Для керування CAR необхідна категорія В"
//        d. для кожної категорії створіть метод, який приймає на вхід
//        кількість років досвіду водіння (вводимо з консолі), в якому рахуйте
//        чи достатньо в людини досвіду щоб водити це транспортне
//        засіб. З такими параметрами:
//        А: від 3 років досвіду водіння
//        В: від 0 років досвіду
//        C: від 5 років досвіду
//        D: від 7 років досвіду
//        e. викликайте відповідний метод у switch
//        f. створіть клас DriverLicense і якщо користувач може отримати права -
//        створюйте йому екземпляр прав
// */
//
//    public static void main(String[] args) {
//        runApp();
//        System.out.println("count driver license: " + DriverLicense.counter);
//    }
//
//    public static void runApp() {
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < 3; i++) {
//
//            CarType userCarType = null;
//            int year = -1;
//            CarType[] carTypes = CarType.values();
//
//            while (userCarType == null) {
//                System.out.println("Please enter transport type from lise : " + Arrays.toString(carTypes));
//                String userValue = scanner.nextLine().toUpperCase();
//                for (CarType carType : carTypes) {
//                    String objName = carType.toString();
//                    if (objName.equals(userValue)) {
//                        userCarType = CarType.valueOf(userValue);
//                        break;
//                    }
//                }
//            }
//
//
//            while (true) {
//                System.out.println("Please enter drive experience");
//                if (scanner.hasNextInt()) {
//                    year = scanner.nextInt();  // 0 - 99
////                if (year < 0 || year > 99) {
////                    System.out.println("Please enter value from 0 to 99");
////                } else {
////                    break;
////                }
//                    if (year >= 0 && year <= 99) {
//                        break;
//                    } else {
//                        System.out.println("Please enter value from 0 to 99");
//                    }
//                } else {
//                    System.out.println("Please enter correct value!!!");
//                }
//                scanner.nextLine();
//            }
//
//            boolean ok = false;
//
//            switch (userCarType) {
//                case MOTORCYCLE: {
//                    System.out.println("for " + CarType.MOTORCYCLE + " need category " + Category.A);
//                    ok = checkYears(year, Category.A);
//                    break;
//                }
//                case CAR: {
//                    System.out.println("for " + CarType.CAR + " need category " + Category.B);
//                    ok = checkYears(year, Category.B);
//                    break;
//                }
//                case TRUCK: {
//                    System.out.println("for " + CarType.TRUCK + " need category " + Category.C);
//                    ok = checkYears(year, Category.C);
//                    break;
//                }
//                case BUS: {
//                    System.out.println("for " + CarType.BUS + " need category " + Category.D);
//                    ok = checkYears(year, Category.D);
//                    break;
//                }
//            }
//
//            if (ok) {
//                System.out.println("Take you license");
//                new DriverLicense();
//            } else {
//                System.out.println("You need more drive experience");
//            }
//            userCarType = null;
//        }
//    }
//
//    /*
//        А: від 3 років досвіду водіння
//        В: від 0 років досвіду
//        C: від 5 років досвіду
//        D: від 7 років досвіду
//     */
//
//    static boolean checkYears(int years, Category category) {
////        boolean ok = false;
////        switch (category) {
////            case A: {
////                if (years >= 3) {
////                    ok = true;
////                }
////                break;
////            }
////            case B: {
////                if (years >= 0) {
////                    ok = true;
////                }
////                break;
////            }
////            case C: {
////                if (years >= 5) {
////                    ok = true;
////                }
////                break;
////            }
////            case D: {
////                if (years >= 7) {
////                    ok = true;
////                }
////                break;
////            }
////        }
////        return ok;
//
//        switch (category) {
//            case A: {
//                return years >= 3;
//            }
//            case B: {
//                return years >= 0;
//            }
//            case C: {
//                return years >= 5;
//            }
//            case D: {
//                return years >= 7;
//            }
//            default: {
//                return false;
//            }
//        }
//    }
//}
