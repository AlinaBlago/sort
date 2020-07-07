package util;

import java.util.Arrays;

public class ShellSort {

    public static long shellSort(int[] array) {
        long startTime = System.currentTimeMillis();
        // Высчитываем промежуток между проверяемыми элементами
        int gap = array.length / 2;
// Пока разница между элементами есть
        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                // Смещаем правый указатель, пока не сможем найти такой, что
                // между ним и элементом до него не будет нужного промежутка
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]) {
                        //swap(array, c, c + gap);
                        int temp = array[c];
                        array[c] = array[c+gap];
                        array[c+gap] = temp;
                    }
                }
            }
            // Пересчитываем разрыв
            gap = gap / 2;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(array));

        return endTime - startTime;
    }
}
