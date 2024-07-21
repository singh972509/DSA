package Revision;

import static Revision.BubbleSort.bubble_sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        bubble_sort(arr,arr.length);
    }
    public static void InsertionSort(int[]arr){
        for(int i=0;i< arr.length;i++){
            int j=i;
            while(j>0&&arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
        }
    }
}
