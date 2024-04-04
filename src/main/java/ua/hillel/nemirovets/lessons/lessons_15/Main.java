package ua.hillel.nemirovets.lessons.lessons_15;

public class Main {
    public static void main(String[] args) {
        //        CarTypeClass qwe = new CarTypeClass("qwe");

//        System.out.println(CarTypeClass.CAR);

//        System.out.println(CarType.CAR.getType());

//        CarType[] values = CarType.values();
//
//        for (CarType value : values) {
//            System.out.println(value.getType());
//        }


//        CarType car = CarType.valueOf("CAR");
//        System.out.println(car.getType());


//        switch (car) {
////            case CAR : {
////                System.out.println(CarType.CAR.getType());
////                break;
////            }
//            case BUS : {
//                System.out.println(CarType.BUS.getType());
//                break;
//            }
//            case TRUCK: {
//                System.out.println(CarType.TRUCK.getType());
//                break;
//            }
//            case MOTORCYCLE : {
//                System.out.println(CarType.MOTORCYCLE.getType());
//                break;
//            }
//            default: {
//                System.out.println("not found");
//                break;
//            }
//        }


        String carStr = "CAR";

        CarType[] values = CarType.values();
        CarType carType = null;
        for (CarType value : values) {
            String objName = value.toString();
            if (objName.equals(carStr)) {
                carType = CarType.valueOf(carStr);
                break;
            }
        }

        if (carType != null) {
            System.out.println(carType.getType());
        }


        System.out.println(CarType.BUS.getType2());

    }
}
