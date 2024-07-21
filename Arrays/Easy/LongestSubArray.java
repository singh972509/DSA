package Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArray {
    public static void main(String[] args) {
        int[] arr={1,2,1,3};
        int arr2=getLongestSubarray(arr,2);
        System.out.println(arr2);
    }
    public static int longestSubArray(int[] a,long k){

        HashMap<Long,Integer> hashMap=new HashMap<>();
        long sum=0;
        int maxLen=0;
        for(int i=0;i< a.length;i++){
            sum=sum+a[i];
            if(sum==k){
                maxLen=Math.max(maxLen,i+1);
            }
            long rem=sum-k;
            if(hashMap.containsKey(rem)){
                int len=i-hashMap.get(rem);
                maxLen=Math.max(len,maxLen);
            }
            if(!hashMap.containsKey(rem)){
                hashMap.put(sum,i);
            }
        }
        return maxLen;
    }

    public static int longestSubarray2(int[] arr,long k){
        long sum=0;
        int maxLen=0;
        HashMap<Long,Integer> hashMap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum=arr[i]+sum;
            if(sum==k){
                maxLen=i+1;
            }
            long rem=sum-k;
            if(hashMap.containsKey(rem)){
                int len=i-hashMap.get(rem);
                maxLen=Math.max(maxLen,len);
            }
            if(!hashMap.containsKey(sum)){
                hashMap.put(sum,i);
            }
        }
        return maxLen;
    }
    public static int getLongestSubarray(int []nums, int k) {
        int sum=nums[0];
        int maxLen=0;
        int i=0;
        int j=0;
        while(i< nums.length) {
            while(j<=i && sum>k){
                sum=sum-nums[j];
                j++;
            }
            if(sum==k){
                maxLen=Math.max(maxLen,i-j+1);
            }
            i++;
            if(i<nums.length){
                sum=sum+nums[i];
            }
        }
        return maxLen;
    }
}
