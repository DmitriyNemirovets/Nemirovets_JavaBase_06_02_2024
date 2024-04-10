package ua.hillel.nemirovets.lessons.lessons_16;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class MatrixCalculatorTest {

        @Test
        public void testIsSquareMatrix() {
            MatrixCalculator calculator = new MatrixCalculator();
            double[][] squareMatrix = {
                    {1.5, 2.0, 3.0},
                    {4.0, 5.5, 6.0},
                    {7.0, 8.0, 9.5}
            };
            assertTrue(calculator.isSquareMatrix(squareMatrix));

            double[][] nonSquareMatrix = {
                    {1.5, 2.0},
                    {4.0, 5.5}
            };
            assertFalse(calculator.isSquareMatrix(nonSquareMatrix));
        }

        @Test
        public void testCalculateAverage() {
            MatrixCalculator calculator = new MatrixCalculator();
            double[][] testMatrix = {
                    {1.0, 2.0, 3.0},
                    {4.0, 5.0, 6.0},
                    {7.0, 8.0, 9.0}
            };
            double expectedAverage = 5.0;
            assertEquals(expectedAverage, calculator.calculateAverage(testMatrix), 0.001);
        }
    }



