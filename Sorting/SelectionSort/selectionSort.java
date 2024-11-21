package Sorting.SelectionSort;

public class selectionSort {
    public static void SelectionSort(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            int minIndex = i;
            for(int j = i+1 ; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(i!=minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
