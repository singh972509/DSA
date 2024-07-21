package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={5,3,2,1};
        insertion(arr);
    }
    public static void insertion(int[] arr){
        for(int i=0;i<= arr.length-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                swap(j-1,j,arr);
                j--;
            }
        }
    }

    private static int[] swap(int i, int j, int[] arr) {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
        return arr;
    }
}
