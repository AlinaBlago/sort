package main;

import java.util.Arrays;

import static util.BubbleSort.bubbleSort;
import static util.InsertionSort.insertionSort;
import static util.MergeSort.mergeSort;
import static util.QuickSort.quickSort;
import static util.SelectionSort.selectionSort;
import static util.ShellSort.shellSort;
import static util.ShuttleSort.shuttleSort;

public class main {
    public static void main(String[] args) {

        int[] ints = new int[100000];
        int index = 0;
        for (int i = 0 ; i < ints.length ; i++) {
            index = (int) Math.floor(Math.random() * 100000);
            ints[i] = index;
        }
        for (int anInt : ints) {
            System.out.println("anInt = " + anInt);
        }

        //bubbleSort(ints);
        //insertionSort(ints);
        //mergeSort(ints , ints.length);
        //quickSort(ints, ints[0], ints[ints.length - 1]);
        //selectionSort(ints);
        //shellSort(ints);
        //shuttleSort(ints);



        // BubbleSort
        //long sortTime = bubbleSort(ints);
        //System.out.println("Time of bubbleSort = " + sortTime);

        // insertionSort
        //long sortTime = insertionSort(ints);
        //System.out.println("Time of insertionSort = " + sortTime);

        // mergeSort
        //long sortTime = mergeSort(ints , ints.length);
        //System.out.println("Time of mergeSort = " + sortTime);

        // quickSort
        //long sortTime = quickSort(ints, ints[0], ints[ints.length - 1]);
        //System.out.println("Time of quickSort = " + sortTime);

        // selectionSort
        //long sortTime = selectionSort(ints);
        //System.out.println("Time of selectionSort = " + sortTime);

        // shellSort
        //long sortTime = shellSort(ints);
        //System.out.println("Time of shellSort = " + sortTime);

        // shuttleSort
        long sortTime = shuttleSort(ints);
        System.out.println("Time of shuttleSort = " + sortTime);
        
        long startTime = System.currentTimeMillis();
        Arrays.sort(ints);
        long endTime = System.currentTimeMillis();
        long sortTimeOfSort = endTime-startTime;
        System.out.println("Time of array.sort() = " + sortTimeOfSort);

    }
}
