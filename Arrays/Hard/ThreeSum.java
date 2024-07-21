package Arrays.Hard;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> ans = threeSum1(arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                //Calculate the 3rd element:
                int third = -(nums[i] + nums[j]);

                //Find the element in the set:
                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    temp.sort(null);
                    st.add(temp);
                }
                hashset.add(nums[j]);
            }
        }

        // store the set elements in the answer:
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
    public static List<List<Integer>> threeSum1(int[] nums){
        Set<List<Integer>> hashSet=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int k= nums.length-1;
            int j=i+1;
            while(j<=k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k]);
                    hashSet.add(temp);
                    j++;
                }
            }
        }
        List<List<Integer>> mainList=new ArrayList<>(hashSet);
        return mainList;
    }
}
