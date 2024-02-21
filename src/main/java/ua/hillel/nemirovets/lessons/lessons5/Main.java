package ua.hillel.nemirovets.lessons.lessons5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

//        int a = 10;
//        int b = 15;
//
//        System.out.println(a > b);
//        System.out.println(a >= b);
//        System.out.println(a < b);
//        System.out.println(a <= b);
//        System.out.println(a == b);
//        System.out.println(a != b);
//
//        System.out.println();
//        System.out.println();
//
//        System.out.println(!true);
//        System.out.println(!false);
//
//
//        boolean result = a > b;
//        System.out.println("result = " + result);


//        String str1 = "Hello";
//        String str2 = "Hello";
//        String str3 = new String("Hello");


//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);

//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str3));


//        int a = 10;
//        int b = 15;
//        int c = 20;


//        boolean result = a < b && c++ > ++a;
//
//        System.out.println(result);
//
//        System.out.println("a = " + a);
//        System.out.println("c = " + c);


//        boolean result2 = (a > b || true) && (c < a || c > a) || true;
//        System.out.println(result2);



//        int x = 5;
//
//        System.out.println(++x > 5);    // true
//        System.out.println("x = " + x); // 6
//        System.out.println(x++ == 5);   // true   false
//        System.out.println("x = " + x); // 5       7
//        System.out.println(++x != 6);   // true
//        System.out.println("x = " + x); // 8


        int a = 10;
        int b = 10;


//        if (a < b) {
//            System.out.println("Hello");
//            System.out.println("Hello");
//        }

//        if (a < b) {
//            System.out.println("a < b");
//        } else {
//            System.out.println("a >= b");
//        }

//        if (a > b) {
//            System.out.println("a > b");
//        } else if (a < b) {
//            System.out.println("a < b");
//        } else {
//            System.out.println("a == b");
//        }

//        if (a == 1) {
//            System.out.println("a = 1");
//        } else if (a == 2) {
//            System.out.println("a = 2");
//        } else if (a == 3) {
//            System.out.println("a = 3");
//        } else if (a == 4) {
//            System.out.println("a = 4");
//        } else if (a == 5) {
//            System.out.println("a = 5");
//        } else if (a == 6) {
//            System.out.println("a = 6");
//        } else {
//            System.out.println("HELLO");
//        }


//        if (a >= b) {
//            System.out.println("a >= b");
//
//            if (a > b) {
//                System.out.println("a > b");
//            } else {
//                System.out.println("a == b");
//            }
//
//        } else {
//            System.out.println("a < b");
//        }

        a = 11;

        // BAD VERSION
//        if (a == b)
//            System.out.println("a = b");
//            System.out.println("a = b");
//            System.out.println("a = b");

        a = 11;

//        switch (a) {
//            case 1 : {
//                System.out.println("COFFEE");
//            }
//            case 2 : {
//                System.out.println("TEA");
//                break;
//            }
//            case 3 : {
//                System.out.println("3");
//
//            }
//            case 4 : {
//                System.out.println("4");
//                break;
//            }
//            default: {
//                System.out.println("default");
//                break;
//            }
//        }



//        String str = "QwE";
//
//        switch (str) {
//            case "QWE" : {
//                System.out.println(1);
//                break;
//            }
//            case "Qwe" : {
//                System.out.println(2);
//                break;
//            }
//            case "QWe" : {
//                System.out.println(3);
//                break;
//            }
//            case "QwE" : {
//                System.out.println(4);
//                break;
//            }
//        }

//        char charValue = '#';
//
//        switch (charValue) {
//            case '!' : {
//                System.out.println(1);
//                break;
//            }
//            case '#' : {
//                System.out.println(2);
//                break;
//            }
//            case '@' : {
//                System.out.println(3);
//                break;
//            }
//            case '$' : {
//                System.out.println(4);
//                break;
//            }
//        }


        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter some string");
//
//        String strUserValue = scanner.next();
//
//        System.out.println("user value = " + strUserValue);
//
//        String strUserValue2 = scanner.next();
//        String strUserValue3 = scanner.next();
//        String strUserValue4 = scanner.next();
//
//        System.out.println(strUserValue2);
//        System.out.println(strUserValue3);
//        System.out.println(strUserValue4);





//        System.out.println("Please enter some integer");
//
//        int userValueInt = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("user value = " + userValueInt);
//
//        System.out.println("Please enter some string");
//
//        String strUserValue = scanner.nextLine();
//
//        System.out.println("user value = " + strUserValue);


        System.out.println("Please enter some integer");

        int userValueInt = 0;
        if (scanner.hasNextInt()) {
            userValueInt = scanner.nextInt();
            System.out.println(userValueInt);
        } else {
            System.out.println("Wrong data. Restart app");
            System.exit(0);
        }
        System.out.println(userValueInt);
    }

}