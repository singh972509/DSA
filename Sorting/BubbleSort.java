package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,5,7,13,6,52,3};
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr){
            for(int i= arr.length-1;i>=1;i--){
                for(int j=0;j<=i-1;j++){
                    if(arr[j]>arr[j+1]){
                        swap(j,j+1,arr);
                    }
                }
            }
        }

    private static void swap(int i, int j, int[] arr) {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
