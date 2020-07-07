package util;

import java.util.Arrays;


public class ShuttleSort {

    public static long shuttleSort(int[] array) {
        long startTime = System.currentTimeMillis();

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                //swap(array, i, i - 1);
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (array[z] < array[z - 1]) {
                       // swap(array, z, z - 1);
                        int change = array[z];
                        array[z] = array[z - 1];
                        array[z - 1] = change;
                    } else {
                        break;
                    }
                }
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(array));

        return endTime - startTime;
    }
}
