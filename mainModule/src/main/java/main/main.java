package main;

import org.apache.log4j.Logger;

import java.util.Arrays;

import static util.BubbleSort.bubbleSort;
import static util.InsertionSort.insertionSort;
import static util.MergeSort.mergeSort;
import static util.QuickSort.quickSort;
import static util.SelectionSort.selectionSort;
import static util.ShellSort.shellSort;
import static util.ShuttleSort.shuttleSort;

public class main {

    private static final Logger logger = Logger.getLogger(main.class);

    public static void main(String[] args) {

        int[] ints = new int[100000];
        int index = 0;
        for (int i = 0 ; i < ints.length ; i++) {
            index = (int) Math.floor(Math.random() * 100000);
            ints[i] = index;
        }

        long startTime = System.currentTimeMillis();
        Arrays.sort(ints);
        long endTime = System.currentTimeMillis();
        long defaultSortTime = endTime-startTime;

        String defSortText =  ". Default sort time - " + defaultSortTime;

        //BubbleSort
        long bubbleSortTime = bubbleSort(ints);
        logger.info("Bubble sort . Time - " + bubbleSortTime + defSortText);
        System.out.println("Time of bubbleSort = " + bubbleSortTime + defSortText);

        // insertionSort
        long insertionSortTime = insertionSort(ints);
        logger.info("insertion Sort . Time - " + insertionSortTime + defSortText);
        System.out.println("Time of insertionSort = " + insertionSortTime + defSortText);

        // mergeSort
        long mergeSortTime = mergeSort(ints , ints.length);
        logger.info("merge Sort . Time - " + mergeSortTime + defSortText);
        System.out.println("Time of mergeSort = " + mergeSortTime + defSortText);

        // quickSort
        long quickSortTime = quickSort(ints, ints[0], ints[ints.length - 1]);
        logger.info("quick Sort . Time - " + quickSortTime + defSortText);
        System.out.println("Time of quickSort = " + quickSortTime + defSortText);

        // selectionSort
        long selectionSortTime = selectionSort(ints);
        logger.info("selection Sort . Time - " + selectionSortTime + defSortText);
        System.out.println("Time of selectionSort = " + selectionSortTime + defSortText);

        // shellSort
        long shellSortTime = shellSort(ints);
        logger.info("shell Sort . Time - " + shellSortTime + defSortText);
        System.out.println("Time of shellSort = " + shellSortTime + defSortText);

        // shuttleSort
        long shuttleSortTime = shuttleSort(ints);
        logger.info("shuttle Sort . Time - " + shuttleSortTime + defSortText);
        System.out.println("Time of shuttleSort = " + shuttleSortTime + defSortText);
        

        System.out.println("Time of array.sort() = " + defaultSortTime);

    }
}
