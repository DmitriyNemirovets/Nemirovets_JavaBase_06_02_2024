package ua.hillel.nemirovets.lessons.lessons9;

import java.util.Scanner;

public class Demo3Home {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;

        System.out.println("Enter Value n : ");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                if (temp <= 0 || temp >= 10) {
                    System.out.println("Value must be in range of 1 to 9");
                } else {
                    n = temp;
                    System.out.println("n = " + n);
                    break;
                }
            } else {
                System.out.println("Wrong data please enter number");
            }
            scanner.nextLine();
        }

        System.out.println("Enter Value m : ");
        int m = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                if (temp <= 0 || temp >= 10) {
                    System.out.println("Value must be in range of 1 to 9");
                } else {
                    m = temp;
                    System.out.println("m = " + m);
                    break;
                }
            } else {
                System.out.println("Wrong data please enter number");
            }
            scanner.nextLine();
        }
        int[][] array1 = new int[m][n];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Matrix 1");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }
        int[][] array2 = new int[n][m];

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array1[j][i];
            }
        }
        System.out.println("Matrix 2");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
