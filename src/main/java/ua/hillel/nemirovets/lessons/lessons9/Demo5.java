package ua.hillel.nemirovets.lessons.lessons9;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value");
        int sum = 0;
        while (sum <= 1000) {
            if (scanner.hasNextInt()) {
                System.out.println("Enter Value : ");
                int temp = scanner.nextInt();
                if (temp >= 0 && temp <= 100) {
                    sum += temp;
                } else {
                    System.out.println("Enter Value 0 to 100");
                }
            } else {
                System.out.println("Wrong Data. Enter Value");
            }
            scanner.nextLine();
        }
        System.out.println("Sum Value > 1000 ");
        System.out.println("Sum Value = " + sum);

    }
}

