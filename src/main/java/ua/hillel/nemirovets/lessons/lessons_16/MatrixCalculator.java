package ua.hillel.nemirovets.lessons.lessons_16;
import java.util.Scanner;

public class MatrixCalculator {
    private int rows;
    private int cols;
    private double[][] matrix;

    public MatrixCalculator() {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new double[rows][cols];
    }

    public void createMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
    }

    public double calculateAverage() {
        double total = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                total += matrix[i][j];
            }
        }
        return total / (rows * cols);
    }

    public double calculateAverage(double[][] inputMatrix) {
        int rows = inputMatrix.length;
        int cols = inputMatrix[0].length;
        double total = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                total += inputMatrix[i][j];
            }
        }
        return total / (rows * cols);
    }
    public boolean isSquareMatrix(double[][] inputMatrix) {
        int rows = inputMatrix.length;
        int cols = inputMatrix[0].length;
        return rows == cols;
    }


}


