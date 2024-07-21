package BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7};
        int x = 6;
        int ind = searchInsert(arr, x);
        System.out.println("The index is: " + ind);
    }
    public static int searchInsert(int [] nums, int target){
        int low=0;
        int high=nums.length-1;
        int insertIndex=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
                insertIndex=mid;
            }
            else{
                low=mid+1;
            }
        }
        return insertIndex;
    }
}
