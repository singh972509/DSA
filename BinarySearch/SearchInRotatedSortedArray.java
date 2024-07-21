package BinarySearch;

import java.util.*;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 8, 9, 1, 2, 3, 4, 5, 6));
//        int n = 9, k = 1;
//        int ans = search(arr, n, k);
//        if (ans == -1)
//            System.out.println("Target is not present.");
//        else
//            System.out.println("The index is: " + ans);
            ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 8, 1, 2, 3, 3, 3, 4, 5, 6));
//            int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
            int k = 3;
            int ans = search(arr,arr.size(), k);
            if (ans == -1)
                System.out.println("Target is not present.");
            else
                System.out.println("Target is present in the array.");
    }

    private static int search(ArrayList<Integer> arr, int n, int k) {
        int minElement=minimumElement(arr);
        int index=BinarySearch(arr,0,minElement,k);
        if(index==-1){
            index=BinarySearch(arr,minElement,n,k);
        }
        return index;
    }
    public static int minimumElement(ArrayList<Integer> arr){
        int low=0;
        int high=arr.size()-1;
        int n= arr.size();
        while (low<=high){
            int mid=(low+high)/2;
            int next=(mid+1)%n;
            int prev=(mid+n-1)%n;
            if(arr.get(mid) <= arr.get(next) && arr.get(mid) <= arr.get(prev)){
                return mid;
            }
            if(arr.get(mid) <= arr.get(high)){
                high=mid-1;
            }
            else if(arr.get(mid) >= arr.get(low)){
                low=mid+1;
            }
        }
        return -1;
    }
    public static int BinarySearch(ArrayList<Integer> arr,int start,int end,int k){
        int low=start;
        int high=end;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr.get(mid)==k){
                return mid;
            }
            else if (arr.get(mid)<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
