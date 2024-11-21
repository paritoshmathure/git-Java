package Sorting.InsertionSort;

public class insertionSort {
    public static void insertionsort(int[] arr){
        for(int i = 1; i<arr.length ; i++){
            int temp = arr[i];
            int j= i-1;
            while(j>-1 && temp < arr[j]){
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
