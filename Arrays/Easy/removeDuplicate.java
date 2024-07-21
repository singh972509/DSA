package Arrays.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3,4,4,5,5};
        int size=removeDuplicates(arr, arr.length);
        System.out.println(size);
    }
    public static int removeDuplicatesBruteForce(int[] arr,int n) {
        // Write your code here.
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length-1;i++){
            set.add(arr[i]);
        }
        for(int x:set){
            System.out.println(x);
        }
        return set.size();
    }
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}
