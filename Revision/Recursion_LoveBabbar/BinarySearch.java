package Revision.Recursion_LoveBabbar;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        System.out.println(BinarySearch(arr,0,arr.length-1,4));
    }
    public static int BinarySearch(int[] arr,int low,int high,int element){
         int mid=(low+high)/2;
         if(low>high){
             return -1;
         }
         if(arr[mid]==element){
             return mid;
         }
         else if(arr[mid]>element){
             high=mid-1;
         }
         else{
             low=mid+1;
         }
         return BinarySearch(arr,low,high,element);
    }
}
