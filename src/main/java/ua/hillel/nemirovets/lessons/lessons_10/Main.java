package ua.hillel.nemirovets.lessons.lessons_10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        printHelloWorld();
//        printHelloName("Den");
//        printHelloName("Alex");
//        printHelloName("Oleg");
        String dima = "Dima";
        printHelloNameAndSurname(dima,"Nemirovets" );
//        int a = 5;
//        int b = 10;
//        printSum(a, b);
//        System.out.println("a " + a);

        // ��������� ���� �����
//        int[] arr = {1, 2, 3, 4, 5};
//        printArray(arr);
//        System.out.println("After");
//        System.out.println(Arrays.toString(arr));

//        demo(1,1.1, "qwe", 'q', new int[]{1,2,3});

//        int randomNamber = getRandomNumber();
//        System.out.println(randomNamber);
//
//        System.out.println(getRandomNumber());

//        printSum(getRandomNumber(), getRandomNumber());
//        System.out.println(getSum(10,10));

//        printVarArgs(1, 1, 2, 3, 4);

//        System.out.println();
//        demoReturnVoidMerthod(3);
//        System.out.println(demoReturnMethod(4));


//        demoBadRecursion();
//        int result = 1;
//        for (int i = 1; i <=5 ; i++) {
//            result *= i;
//        }
//        System.out.println(result);
//        System.out.println(getFactorial(5));
        System.out.println(evclid(11,9));


   }


   static int evclid(int n, int m){
        if(n == m){
            return n;
        }else if( n > m){
            return evclid(n-m,m);
        }else{
            return evclid(n, m - n);
        }
   }


   static  int getFactorial(int number){
        if(number == 1){
            return 1;
        }
        return number * getFactorial(number -1);

   }

   //Bad

    static void demoBadRecursion(){
        System.out.println("erfefefefeferfe");
        demoBadRecursion();
    }

   static  int demoReturnMethod(int x){
        if(x == 2){
            return 2;
        }else if(x == 3){
            return 3;
        }else{
            return 999;
        }

   }

   static void demoReturnVoidMerthod(int x){
        if(x == 2){
            return;
        }
       System.out.println("dsfdssdfsdfsd");
   }
    static int sum(int a , int b, int c, int d){
        return a + b + c + d;
    }
    static int sum(int a , int b, int c){
        return a + b + c;
    }

   static int sum(int a, int b){
      return a + b;
    }




   static void printVarArgs(int x, int... varArgs){
       System.out.println(Arrays.toString(varArgs));

   }

   static  int getSum(int a, int b){
        int c = 20;
        return getSumDemo(a,b,c);
   }
   static int getSumDemo (int a, int b, int c){
        return a + b + c;
   }


   static int getRandomNumber(){
        int random = (int)(Math.random() * 11);
        return random;
//       return (int)(Math.random()*11);
   }

   static void demo(int x, double y, String str, char ch, int[] array){

   }


    static void  printArray(int [] array){
        array[0] = 77;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static void printSum(int a, int b){
        a = 10;
        System.out.println(a + b);
    }

    static void printHelloWorld(){
        System.out.println("Hello World!!!");
    }
    static void printHelloName(String name) {
        System.out.println("Hello " + name);
    }
    static void printHelloNameAndSurname(String name,String surname) {
        System.out.println("Hello " + name + " " + surname);
    }

}
