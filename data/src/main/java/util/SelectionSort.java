package util;

import java.util.Arrays;

public class SelectionSort {

    public static long selectionSort(int[] array) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // замена
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(array));

        return endTime - startTime;
    }
}
