package QuickSort;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] myArr = {4,6,1,7,3,5,2};
        quickSort(myArr);
        System.out.println(Arrays.toString(myArr));
    }

    public static void quickSort(int[] arr){
        quickSortHelper(arr,0,arr.length - 1);
    }

    public static void quickSortHelper(int[] arr , int left,int right){
        if(left < right){
            int pivotIndex = pivot(arr, left, right);
            quickSortHelper(arr, left, pivotIndex - 1);
            quickSortHelper(arr, pivotIndex+1, right);
        }
    }

    public static void swap(int[] arr,int firstIndex , int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    public static int pivot(int[] arr,int pivotIndex,int endIndex){
        int swapIndex = pivotIndex;
        for(int i = pivotIndex+1;i <= endIndex;i++){
            if(arr[i] < arr[pivotIndex]){
                swapIndex++;
                swap(arr,swapIndex,i);
            }
        }
        swap(arr,pivotIndex,swapIndex);
        return swapIndex;
    }
}
