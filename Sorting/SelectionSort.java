package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,13,4,1,3,6,28};
    }
    public static void selectionSort(int[] arr){
        for(int i=0;i<=arr.length-2;i++){
            int min=i;
            for(int j=i;j<= arr.length-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            swap(min,i,arr);
        }
    }

    private static int[] swap(int i, int j,int[] arr) {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
        return arr;
    }
}
