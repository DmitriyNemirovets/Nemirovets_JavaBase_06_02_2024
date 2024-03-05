package ua.hillel.nemirovets.lessons.lessons8;

import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // O(N)
//        int N=10000;
//        for (int i = 0; i < N; i++) {
//        }

        // O (N^2)
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//            }
//        }
        // O (N^3)
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                for (int k = 0; k < 2; k++) {
//                }
//            }
//        }


//        int[] array = {1, -5, 6, -42, 9, 67, 234, 456, 123, 8, 23, 9};
//
//        int counter = 0;
//        for (int i = 0; i < array.length - 1 ; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                counter++;
//                if (array[j] > array[j + 1] ) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp ;
//                }
//            }
//        }
//        System.out.println("counter = " + counter);
//        System.out.println(Arrays.toString(array));

//        Integer[] array = {1, -5, 6, -42, 9, 67, 234, 456, 123, 8, 23, 9};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//
//        Arrays.sort(array, Collections.reverseOrder());
//        System.out.println(Arrays.toString(array));

//        int[] array = {1, -5, 6, -42, 9, 67, 234, 456, 123, 8, 23, 9};
//        int element = 234;
//        int index = -1;
//        int counter = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            counter++;
//            if(element == array[i]){
//                index = i;
//                System.out.println(element);
//                break;
//            }
//
//        }
//
//        System.out.println("counter = " + counter);
//        System.out.println("element = " + element);
//        System.out.println("index = " + index);

//        int[] array = {-42, -5, 1, 6, 8, 9, 19, 23, 67, 123, 234, 456};
//        int element = 234;
//        int index = -1;
//        int counter = 0;
//
//        int left = 0;
//        int right = array.length - 1;
//
//        while(left <= right){
//            counter++;
//
//            int mid =(left + right) / 2;
//
//            if(array[mid] == element){
//
//
//                index = mid;
//            break;
//            }else if(array[mid] < element){
//                left = mid + 1;
//        }else{
//                right = mid -1;
//            }
//        }
//        System.out.println("counter = " + counter);
//        System.out.println("index = " + index);

//        Arrays.binarySearch(array,234);
//        System.out.println("index = " + index);


//        int[]array = {1, 2, 3, 4, 5};
//        int[]array3 = array;
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array3));
//        array[0] = 777;
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array3));
//        C
//        int[]array2 = new int[array.length];
//
//        for (int i = 0; i < array.length; i++) {
//            array2[i] = array[i];
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));
//        array[0] = 777;
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));

//        int[]array = {1, 2, 3, 4, 5};
//        int[]array2 = Arrays.copyOf(array, 5);
//
//        System.out.println(Arrays.toString(array2));



    }
}
