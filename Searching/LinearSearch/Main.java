package Searching.LinearSearch;

public class Main { 
    public static void main(String[] args) {
        int[] array = {4,6,12,19,2,-9,5,-7};
        int target = 19;
        int ans = linearSearch(array, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
    
}
