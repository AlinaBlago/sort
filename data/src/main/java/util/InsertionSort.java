package util;

import java.util.Arrays;

public class InsertionSort {

    public static long insertionSort(int[] array) {
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }

        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(array));

        return endTime - startTime;
    }

}
