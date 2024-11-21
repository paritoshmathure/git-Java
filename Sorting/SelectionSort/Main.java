package Sorting.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {6,3,7,1,5,2};
        selectionSort.SelectionSort(myArray);  
        
        System.out.println(Arrays.toString(myArray));
    }
}
