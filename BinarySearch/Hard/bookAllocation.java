package BinarySearch.Hard;

import java.util.ArrayList;

public class bookAllocation {
    public static void main(String[] args) {

    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here
        if(m>n){
            return -1;
        }
        int low=0;
        int sum=0;
        for(int i=0;i<arr.size();i++){
            if(low<=arr.get(i)){
                low=arr.get(i);
            }
            sum+=arr.get(i);
        }
        int high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            int student=bookAllocation(arr,mid);
            if(student>m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public static int bookAllocation(ArrayList<Integer> arr, int pages){
        int student=1;
        int pagesStudent=0;
        for(int i=0;i<arr.size();i++){
            if(pagesStudent+arr.get(i)<=pages){
                pagesStudent=pagesStudent+arr.get(i);
            }
            else{
                student++;
                pagesStudent=arr.get(i);
            }
        }
        return student;
    }
}
