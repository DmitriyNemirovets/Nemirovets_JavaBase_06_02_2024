package ua.hillel.nemirovets.lessons.lessons_16;

public class ArrayOperations {
    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }

    public static boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        for (int[] row : matrix) {
            if (row.length != matrix.length) {
                return false;
            }
        }

        return true;
    }
}