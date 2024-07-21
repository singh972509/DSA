package Arrays.Hard;
import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;
        List<List<Integer>> ans = fourSum1(nums, target);
        System.out.println("The quadruplets are: ");
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> list=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                Set<Long> set=new HashSet<>();
                for(int k=j+1;k<nums.length;k++){
                    long fourthNumber=-(nums[i]+nums[j]+nums[k])+target;
                    if(set.contains(fourthNumber)){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int)fourthNumber);
                        temp.sort(null);
                        list.add(temp);
                    }
                    set.add((long)nums[k]);
                }
            }
        }
        List<List<Integer>> mainList=new ArrayList<>(list);
        return mainList;
    }
    public static List<List<Integer>> fourSum1(int[] nums, int target) {
        int n=nums.length;
        List<List<Integer>> mainList=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int k=j+1;
                int l=n-1;
                while(k<l){
                    long longSum=nums[i]+nums[j]+nums[k]+nums[l];
                    if(longSum==target){
                        List<Integer> list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        mainList.add(list);
                        k++;l--;
                        while(k<l && nums[k]==nums[k-1]){k++;}
                        while(k<l && nums[l]==nums[l-1]){
                            l--;
                        }
                    }
                    else if(longSum<target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }
        return mainList;
    }
}
