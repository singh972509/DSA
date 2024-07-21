package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class LastOccurance {
    public static void main(String args[]) {
        int n = 7;
        int key = 13;
        int[] v = {3,4,13,13,13,20,40};

        // returning the last occurrence index if the element is present otherwise -1
//        System.out.println(solve(n, key, v));
    }
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int lastOccurance=-1;
        List<Integer> temp=new ArrayList<>();
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                lastOccurance=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }


        int low1=0;
        int high1=nums.length-1;
        int firstOccurance=-1;
        while(low1<=high1){
            int mid1=(low1+high1)/2;
            if(nums[mid1]==target){
                firstOccurance=mid1;
                high1=mid1-1;
            }
            else if(nums[mid1]>target){
                high1=mid1-1;
            }
            else{
                low1=mid1+1;
            }
        }
        temp.add(firstOccurance);
        return new int[]{firstOccurance,lastOccurance};
    }
}
