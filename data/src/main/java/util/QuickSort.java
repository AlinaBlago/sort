package util;

import java.util.Arrays;

public class QuickSort {



    static int partition(int[] array, int begin, int end) {

        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;


        return counter;
    }

    public static long quickSort(int[] array, int begin, int end) {
        long startTime = System.nanoTime();
        if (end <= begin) return System.currentTimeMillis() - startTime;
        int pivot = partition(array, begin, end);
        _pQuickSort(array , begin , end);

        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static void _pQuickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int support = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < support) {
                i++;
            }

            while (array[j] > support) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }


}
