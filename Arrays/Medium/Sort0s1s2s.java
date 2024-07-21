package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class Sort0s1s2s {
    public static void main(String[] args) {
ArrayList<Integer> arrayList= new ArrayList<>();
arrayList.add(1);
arrayList.add(0);
arrayList.add(2);
arrayList.add(2);
arrayList.add(1);
arrayList.add(0);
sortArray(arrayList,arrayList.size());
    }
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr.get(mid)==0){
                int temp=arr.get(low);
                arr.set(low,arr.get(mid));
                arr.set(mid,temp);
                mid++;
                low++;
            }
            else if(arr.get(mid)==1){
                mid++;
            }
            else{
                int temp=arr.get(high);
                arr.set(high,arr.get(mid));
                arr.set(mid,temp);
                high--;
            }
        }
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
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                firstOccurance=mid;
                high=mid-1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        temp.add(firstOccurance);
        return new int[]{firstOccurance,lastOccurance};
    }
}
