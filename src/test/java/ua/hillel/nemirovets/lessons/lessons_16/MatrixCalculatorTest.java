package ua.hillel.nemirovets.lessons.lessons_16;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MatrixCalculatorTest {
    static double  [] array = null;
    static double averageValue = 0.0;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("BEFORE ALL");
        array = new double [] {1, 2, 3, 4, 5};
        double total = 0.0;
        for (double num : array) {
            total += num;
        }
        averageValue =  total / array.length;
    }

    @Test
    public void testIsSquareMatrixWithSquareMatrix() {
        double[][] testMatrix = {
                {1.5, 2.0, 3.0},
                {4.0, 5.5, 6.0},
                {7.0, 8.0, 9.5}
        };
        assertTrue(MatrixCalculator.isSquareMatrix(testMatrix));
    }

    @Test
    public void testIsSquareMatrixWithNonSquareMatrix() {
        double[][] testMatrix = {
                {1.5},
                {4.0, 5.0},
                {7.0, 8.0, 9.5}
        };
        assertFalse(MatrixCalculator.isSquareMatrix(testMatrix));
    }

    @Test
    public void testIsSquareMatrixWithEmptyMatrix() {
        double[][] emptyMatrix = new double[0][0];
        assertFalse(MatrixCalculator.isSquareMatrix(emptyMatrix));
    }
    @Test
    public void testIsSquareMatrixWithNull() {
               assertFalse(MatrixCalculator.isSquareMatrix(null));
    }
    @Test
    public  void testCalculateAverageWithNonEmptyArray(){
        assertEquals(averageValue,MatrixCalculator.calculateAverage(array));

    }
    @Test
    public  void testCalculateAverageWithEmptyArray(){
        assertEquals(0.0,MatrixCalculator.calculateAverage(new double[0]));
    }
    @Test
    public  void testCalculateAverageWithNullArray(){
        assertEquals(0.0,MatrixCalculator.calculateAverage(null));
    }
}



