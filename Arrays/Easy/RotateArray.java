package Arrays.Easy;

import java.util.ArrayList;

public class RotateArray {
    public static void main(String[] args) {
int[] arr={1,2,3,4,5,6,7};
optimalSolution(arr,2);
    }
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int numberOfRotations=k%(arr.size());
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=numberOfRotations;i<arr.size();i++){
            arrayList.add(arr.get(i));
        }
        for(int i=0;i<numberOfRotations;i++){
            arrayList.add(arr.get(i));
        }
        return arrayList;
    }
    public static void optimalSolution(int[] arr,int k){
        int numberOfRotations=k%(arr.length);
        reverse(arr,0,numberOfRotations-1);
        reverse(arr,numberOfRotations, arr.length-1);
        reverse(arr,0, arr.length-1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
