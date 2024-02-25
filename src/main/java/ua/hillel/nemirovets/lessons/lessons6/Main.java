package ua.hillel.nemirovets.lessons.lessons6;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

//        for (int i = 0; i < 10; i += 2){
//            System.out.println("Hello world");
//        }
//        int i = 0;
//        for(; i<10;i++){
//            System.out.println("Hello Worls");
//            System.out.println(i);
//        }
//        System.out.println("i = " + i);
//        for (int i = 0; ; i++){               // bezkinecnuy cukl
//            System.out.println("Hello world");
//            System.out.println(i);
//        }

//        for (int i =0; i < 5;){
//            System.out.println("Hello world");
//            System.out.println(i);
//        }
//           int i =0;
//        for( ; ; ){
//            System.out.println("hello world");
//            if (i>=5){
//                break;
//            }
//            i++;
//        }

//        for(int i = 0; i <10; i ++ ){
//            System.out.println(i);
//            if (i == 5){
//                break;
//            }
//            if (i == 7){
//                break;
//            }
//        }

//        for (int i = 0; i < 10; i++){
//            if (i == 1 || i == 2){
//                continue;
//            }
//            System.out.println(i);
//            if ( i == 5){
//                break;
//            }
//        }
//        for (int i = 0, j =10; i <10 && j > 5; i++, j--){
//            System.out.println("i = " + i);
//            System.out.println("j = " + j);
//            System.out.println();
//        }
//        for (int i = 0; i < 3; i++){
//            System.out.println("strart first loop");
//            System.out.println("first loop i = " + i);
//
//            for (int j = 0; j < 2; j++){
//                System.out.println("sescond loop");
//                System.out.println("i = " + i);
//                System.out.println("j = " + j);
//            }
//
//            System.out.println("end first loop");
//        }

//        for (int i = 0; i <= 20  ;  i +=2) {
//            System.out.println(i);
//
//        }

//        int num1 = 1;
//        int num2 = 1;
//        int sum = 0;
//        System.out.print(num1 + " " + num2 + " ");
//
//        for (int i = 0; i < 3 ; i++) {
//            sum = num1 + num2;
//            System.out.print(sum + " ");
//            num1 = num2;
//            num2 = sum;
//        }

//        int i = 0;
//        while (i < 5){
//            System.out.println("Hello World");
//            i++;
//        }

//        int i =10;
//
//        do {
//            System.out.println("Hello world");
//        } while( i < 5);
//        int  i = 0;
//        while (true){
//
//            System.out.println(i);
//            if ( i >= 5){
//                break;
//            }
//            i++;
//        }

        Scanner scanner = new Scanner(System.in);
        int userValue = 0;
        while (true){
            System.out.println("Please enter integer from 10 to 20");
            if (scanner.hasNextInt()) {
                userValue = scanner.nextInt();
                 if (userValue >=10 && userValue <= 20){
                     break;
                 }else {
                     System.out.println("From 10 to 20!!!");
                     scanner.nextLine();
                 }
            }else{
                System.out.println("Wrong data, try again!");
                scanner.nextLine();
            }
        }
        System.out.println("userValue = " + userValue);

//        int integer  = 10;
//        while (true){
//            System.out.println(integer);
//            int random = (int) (Math.random() * 101);
//            if (random>=85 && random <=100) {
//                System.out.println("Win!!!!!!!");
//                break;
//            }
//            System.out.println(integer);
//            integer -= 1;
//            if (integer == - 1){
//                System.out.println("Boom!!!");
//                break;
//            }
//        }
//
//        int integer = 10;
//
//        while (true) {
//            System.out.println(integer);
//            int random = (int) (Math.random() * 101); // 0 - 100
//            if (random >= 85 && random <= 100) {
//                System.out.println("WIN!!!!!!!!!!");
//                break;
//            }
//            integer -= 1;
////            integer--;
//            if (integer == -1) {
//                System.out.println("BOOOM!!!");
//                break;
//            }
//        }




    }
}
