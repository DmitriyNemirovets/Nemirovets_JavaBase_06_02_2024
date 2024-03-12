package ua.hillel.nemirovets.lessons.lessons9;

import java.util.Arrays;

public class Demo8 {
    public static void main(String[] args) {
        int [] array = new int[6];

        int minValue = 0;
        int maxValue = 0;

        for (int i = 0; i < array.length ; i++) {
            int result = (int)(Math.random() * 10 + 1 );
            array[i] = result;
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        System.out.println(Arrays.toString(array));
    }
}
