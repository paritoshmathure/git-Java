package MergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] originalArray = {3,1,4,2,5,8,7,6};
        int[] sortedArray = mergeSort.MergeSort(originalArray);

        System.out.println("Original Array: "+ Arrays.toString(originalArray));

        System.out.println("\nSorted Array: "+ Arrays.toString(sortedArray));
    }
}
