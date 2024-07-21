package Arrays.Hard;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int nums[] = {1,2,-3,0,-4,-5};
//        int answer = maxProduct(nums);
//        System.out.print("The maximum product subarray is: "+answer);
    }
    public static int maxProductMyMthod(int[] nums) {
        int maxPositive=0;
        int positive=1;
        int negative=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                negative=negative*nums[i];
                if(negative>0){
                    positive=negative;
                    maxPositive=Math.max(maxPositive,positive);
                    negative=1;
                }else{
                    positive=1;
                }
            }
            else if(nums[i]>0){
                positive=positive*nums[i];
                negative=negative*nums[i];
                maxPositive=Math.max(positive,maxPositive);
            }
            else{
                positive=1;
                negative=1;
            }
        }
        return maxPositive;
    }
}
