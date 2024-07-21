package Arrays.Hard;

import java.util.*;

public class MajorityElement {
    public static void main(String args[]) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majorityElement1(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i:nums){
            int freq=1;
            if(hashMap.containsKey(i)){
                freq=hashMap.get(i);
                freq=freq+1;
                hashMap.put(i,freq);
            }
            else{
                hashMap.put(i,1);
            }
        }
        int targetValue=nums.length/3;
        for(Map.Entry<Integer,Integer> entry: hashMap.entrySet()){
            if(entry.getValue()>targetValue){
                list.add(entry.getKey());
            }
        }
        return list;
    }
    public static List<Integer> majorityElement1(int[] nums){
        List<Integer> list=new ArrayList<>();
        int cnt1=0;
        int el1=Integer.MIN_VALUE;
        int cnt2=0;
        int el2=Integer.MIN_VALUE;
        for(int i=0;i< nums.length;i++){
            if(cnt1==0 &&nums[i]!=el2){
                cnt1=1;
                el1=nums[i];
            }
            else if(cnt2==0 &&nums[i]!=el1){
                cnt2=1;
                el2=nums[i];
            }
            else if(nums[i]==el1){
                cnt1++;
            }
            else if(nums[i]==el2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        int target= nums.length/3;
        if(cnt1>target) {
            list.add(el1);
        }
        if(cnt2>target) {
            list.add(el2);
        }

        return list;
    }
}
