package BinarySearch;

public class SingleNonDuplicate {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        int ans = singleNonDuplicate(arr);
        System.out.println("The single element is: " + ans);
    }
    public static int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int n=nums.length;
        while(low<=high){
            int mid=(low+high)/2;
            int next=(mid+1)%n;
            int prev=(mid+n-1)%n;
            if(nums[mid]!=nums[next] && nums[mid]!=nums[prev]){
                return nums[mid];
            }
            if((mid%2==1 && nums[mid]==nums[mid-1])|| (mid%2==0 && nums[mid]==nums[mid+1])){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
