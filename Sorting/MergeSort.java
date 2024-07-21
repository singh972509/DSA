package Sorting;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        mergeSort(arr,0, arr.length-1);
    }
    public static void mergeSort(int[]arr,int low,int high){
        int mid=(low+high)/2;
        if(low>=high){
            return;
        }
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
