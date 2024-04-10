package ua.hillel.nemirovets.lessons.lessons_16;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTest {

    @Test
    public void testCalculateAverage() {
        int[] array = {1, 2, 3, 4, 5};
        double expectedAverage = 3.0;

        double actualAverage = ArrayOperations.calculateAverage(array);

        assertEquals(expectedAverage, actualAverage, 0.0001);
    }

    @Test
    public void testIsSquareMatrix() {
        int[][] squareMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] nonSquareMatrix = {{1, 2, 3}, {4, 5, 6}};

        assertTrue(ArrayOperations.isSquareMatrix(squareMatrix));
        assertFalse(ArrayOperations.isSquareMatrix(nonSquareMatrix));
    }
}