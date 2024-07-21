package Arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
int[] arr={2,6,5,8,11};
int target=14;
        System.out.println(optiomalApproach(arr.length,arr,target));
    }
    public static String read(int n, int []book, int target){
        // Write your code here.
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<book.length;i++){
            int freq=0;
            if(hashMap.containsKey(book[i])){
                freq=hashMap.get(book[i]);
                freq++;
                hashMap.put(book[i],freq);
            }
            else{
                hashMap.put(book[i],1);
            }
        }
        for(int i=0;i<book.length;i++){
            int rem=target-book[i];
            if(hashMap.containsKey(rem)){
                return "YES";
            }
        }
        return "NO";
    }
    public static String optiomalApproach(int n, int []book, int target){
    int left=0;
    int right=n-1;
    int sum=0;
        Arrays.sort(book);
    while(left<=right){
    sum=book[left]+book[right];
    if(sum==target){
        return "YES";
    }
    else if(sum>target){
        right--;
    }
    else{
        left++;
    }
}
    return "NO";
    }
}
