package Searching.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-18,-12,-5,2,6,7,9,22,24,25};
        int target = -18;
        int ans = BinarySearch(arr,target);
        System.out.println(ans);
    }

    static int BinarySearch(int[] arr ,int target){
        int start = 0 ;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) /2;

            if(target < arr[mid]){
                end = mid -1 ;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
