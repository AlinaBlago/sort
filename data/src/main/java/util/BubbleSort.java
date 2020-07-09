package util;

import java.util.Arrays;

public class BubbleSort {

    public static long bubbleSort(int[] array) {
        long startTime = System.nanoTime();
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
