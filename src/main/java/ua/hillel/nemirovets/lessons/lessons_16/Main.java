package ua.hillel.nemirovets.lessons.lessons_16;

public class Main {
    public static void main(String[] args) {

        MatrixCalculator calculator = new MatrixCalculator();
        double[][] squareMatrix = {
                {1.5, 2.0, 3.0},
                {4.0, 5.5, 6.0},
                {7.0, 8.0, 9.5}
        };
        double[][] nonSquareMatrix = {
                {1.5, 2.0, 3.0},
                {4.0, 5.5, 6.0}
        };
        System.out.println("Is square matrix: " + calculator.isSquareMatrix(squareMatrix));
        System.out.println("Is square matrix: " + calculator.isSquareMatrix(nonSquareMatrix));
    }
}


