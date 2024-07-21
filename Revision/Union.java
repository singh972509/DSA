package Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Union {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6,7,8,9,10};
        int[] nums2 = {2,3,4,4,5,11,12};
        int[] arr1={1,1,2,2,3,3,4,4,45};
//        ArrayList<Integer> arr=optimalSolution(nums1,nums2,nums1.length,nums2.length);
//        System.out.println(solution(arr1));
//        int[] a = {2, 3, 5, 1, 9};
//        long k = 10;
//        int b=getLongestSubarray(a,k);
//        System.out.println(b);
//        int b1=getLongestSubarray1(a,k);
//        System.out.println(b1);
//        int[] arr={2,6,5,8,11};
//        int target=14;
//        String a=Sum2Problem(arr,target);
//        System.out.println(a);
//        int[] arr={1,1,0,0,2,1,0,2,2,2,2,2,2};
////        solution1(arr);
//        System.out.println(majorityElement1(arr));
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = KadensAlgo(arr);
        ArrayList<Integer> arr2=kadensAlgoPrintArray(arr);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }
    public static int[] unionSolution(int[] nums1,int[] nums2,int n,int m){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int[] arr=new int[n+m];
        for(int i=0;i<n;i++){
            if(!hashMap.containsKey(nums1[i])){
                hashMap.put(nums1[i],1);
            }
            else{
                int freq=hashMap.get(nums1[i]);
                hashMap.put(nums1[i],freq+1);
            }
        }
        for(int i=0;i<m;i++){
            if(!hashMap.containsKey(nums2[i])){
                hashMap.put(nums2[i],1);
            }
            else{
                int freq=hashMap.get(nums2[i]);
                hashMap.put(nums2[i],freq+1);
            }
        }
        int index=0;
        for(int i:hashMap.keySet()){
            arr[index]=i;
            index++;
        }
        return arr;
    }
    public static ArrayList<Integer> optimalSolution(int[] nums1,int[] nums2,int n,int m){
        int i=0;
        int j=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<n && j<m){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            if(nums1[i]>nums2[j]){
                list.add(nums2[j]);
                j++;
            }
            if(nums1[i]<nums2[j]){
                list.add(nums1[i]);
                i++;
            }
        }
        while(i<n){
            list.add(nums1[i]);
            i++;
        }
        while(j<m) {
            list.add(nums2[j]);
            j++;
        }
        return list;
    }
    public static int solution(int[]nums){
        int num=nums[0];
        for(int i=1;i<nums.length;i++){
            num=num^nums[i];
        }
        return num;
    }
    public static int getLongestSubarray(int []a, long k){
        HashMap<Long,Integer>hashMap=new HashMap<>();
        long sum=0;
        int maxlen=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            long key=sum-k;
            if(!hashMap.containsKey(key)){
                hashMap.put(sum,i); //TC=O(NLog(N))
            }
            if(hashMap.containsKey(key)){
                int len=i-hashMap.get(sum-k)+1;
                if(len>maxlen){
                    maxlen=len;
                }
            }
            if(key==0){
                int len=i+1;
                if(len>maxlen){
                    maxlen=len;
                }
            }
        }
        return maxlen;
    }
    public static int getLongestSubarray1(int []a, long k){
        int left=0;
        int right=0;
        int maxlen=0;
        long sum=a[0];
        int n=a.length;
        while(right<n){
            while(left<=right && sum>k){
                sum=sum-a[left];
                left++;
            }
            if(sum==k){
                maxlen=Math.max(maxlen,right-left+1);
            }
            right++;
            if(right<n){
                sum=sum+a[right];
            }
        }
        return maxlen;
    }
    public static String Sum2Problem(int[] nums,int target){
        Arrays.sort(nums);
        int right=nums.length-1;
        int left=0;
        while(right<nums.length){
            if(nums[left]+nums[right]<target){
                left++;
            }
            else if(nums[left]+nums[right]>target){
                right--;
            }
            else{
                return "YES";
            }
        }
        return "NO";
    }
    public static int[] solution1(int[] nums){
        int low=0;
        int mid=0;
        int high= nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }
        return nums;
    }
    public static int majorityElement(int []v){
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        for(int i=0;i< v.length;i++){
            hashMap.put(v[i],hashMap.getOrDefault(v[i],0)+1);
        }
        for(int i: hashMap.keySet()){
            if(hashMap.get(i)>(v.length/2)){
                return i;
            }
        }
        return -1;
    }
    public static int majorityElement1(int []v){
        int cnt=0;
        int el=v[0];
        for(int i=1;i<v.length;i++){
            if(cnt==0){
                el=v[i];
                cnt=1;
            }
            if(v[i]==el){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1=0;
        for(int i=0;i<v.length;i++){
            if(v[i]==el){
                cnt1++;
            }
        }
        if(cnt1>(v.length/2)){
            return el;
        }
        return -1;
    }
    public static int KadensAlgo(int[] nums){
        int maxi=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum<0){
                sum=0;
            }
            if(sum>maxi){
                maxi=sum;
            }
        }
        return maxi;
    }
    public static ArrayList<Integer> kadensAlgoPrintArray(int[] nums){
        int maxi=0;
        int sum=0;
        int startIndex=0;
        int maxStartIndex=0;
        int maxLastIndex=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum<0){
                sum=0;
                startIndex=i+1;
            }
            if(sum>maxi){
                maxi=sum;
                maxLastIndex=i+1;
                maxStartIndex=startIndex;
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=maxStartIndex;i<maxLastIndex;i++){
            list.add(nums[i]);
        }
        return list;
    }
}
