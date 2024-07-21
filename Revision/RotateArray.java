package Revision;

import java.util.ArrayList;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int k=3;
    }

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> list=new ArrayList<>();
        int largerIndex=0;
        int index=0;
        if(n>=m){
            index=m;
            largerIndex=n;
        }
        else{
            index=n;
            largerIndex=m;
        }
        int index1=0;
        int index2=0;
        for(int i=0;i<index;i++){
            if(arr1[index1]<arr2[index2]){
                list.add(arr1[index1]);
                index1++;
            }
            else if(arr1[index1]>arr2[index2]){
                list.add(arr2[index2]);
                index2++;
            }
            else{
                list.add(arr1[index1]);
                index1++;
                index2++;
            }
        }
        if(index!=largerIndex && largerIndex==n){
            for(int i=index;i<largerIndex;i++){
                list.add(arr1[index]);
            }
        }
        else if(index!=largerIndex && largerIndex==m){
            for(int i=index;i<largerIndex;i++){
                list.add(arr2[index]);
            }
        }
        return list;
    }
}
