package ua.hillel.nemirovets.lessons.lessons_16;

import java.util.Scanner;

public class MatrixCalculator {


    public static double calculateAverage(double[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty. Cannot calculate average.");
            return 0.0;
        }
        double total = 0.0;
        for (double num : array) {
            total += num;
        }
        return total / array.length;
    }

    public static boolean isSquareMatrix(double[][] inputMatrix) {
        if (inputMatrix == null || inputMatrix.length == 0 ) return false;
        int rows = inputMatrix.length;

        for (int i = 0; i < rows; i++) {
            if (inputMatrix[i].length != rows) {
                return false;
            }
        }
        return true;
    }

}


