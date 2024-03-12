package ua.hillel.nemirovets.lessons.lessons9;

import java.util.Arrays;

public class Demo9 {
    public static void main(String[] args) {
        int[] array = new int[6];

        for (int i = 0; i < array.length; i++) {
            int result = (int) (Math.random() * 10 + 1);
            array[i] = result;
        }

        int maxValue = array[0];
        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("minValue = " + minValue);
        System.out.println("maxValue = " + maxValue);


    }
}
