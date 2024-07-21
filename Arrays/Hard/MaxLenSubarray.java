package Arrays.Hard;

import java.util.HashMap;

public class MaxLenSubarray {
    public static int maxLen(int arr[], int n)
    {
        // Your code here
        int maxLen=0;
        int maxSum=0;
        for(int i=0;i<n;i++){
            int sum=arr[i];
            for(int j=i+1;j<n;j++){
                sum=sum+arr[j];
                if(sum==0){
                    maxLen=Math.max(maxLen,j-i+1);
                }
            }

        }
        return maxLen;
    }

    public static void main(String[] args) {
        int a[] = {9, -3, 3, -1, 6, -5};
        System.out.println(maxLen1(a,a.length));
    }
    public static int maxLen1(int arr[], int n)
    {
        int maxLen=0;
        int sum=0;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum==0){
                maxLen=i+1;
            }
            else{
                if(hashMap.containsKey(sum)){
                    maxLen=Math.max(maxLen,i-hashMap.get(sum));
                }
                else{
                    hashMap.put(sum,i);
                }
            }
        }
        return maxLen;
    }
}
