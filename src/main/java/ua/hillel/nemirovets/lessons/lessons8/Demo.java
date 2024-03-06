package ua.hillel.nemirovets.lessons.lessons8;

import com.sun.source.tree.BinaryTree;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] lottery = new int[7];
        int[] player = new int[7];

        int minValue = 0;
        int maxValue = 9;

        double sum1 = 0.0;
        double sum2 = 0.0;

               for (int i = 0; i < lottery.length; i++) {
            int result1 = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
            lottery[i] = result1;
            sum1 += lottery[i];
            int key = lottery[i];
            int j = i - 1;
            while (j >= 0 && lottery[j] > key) {
                lottery[j + 1] = lottery[j];
                j--;
            }
            lottery[j + 1] = key;
        }

        for (int i = 0; i < player.length; i++) {
            int result = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
            player[i] = result;
            sum2 += player[i];
            int key = player[i];
            int j = i - 1;
            while (j >= 0 && player[j] > key){
                player[j + 1] =  player[j];
                j--;
            }
            player[j + 1] = key;
        }

        System.out.println(Arrays.toString(lottery));
        System.out.println(Arrays.toString(player));


    }
}
