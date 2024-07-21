package Revision;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverse(0, arr.length-1,arr);
    }
    public static void reverseArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        reverse(start,end,arr);
    }
    public static void reverse(int start,int end,int[] arr) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverse(start + 1, end - 1, arr);
            }
        }
}
