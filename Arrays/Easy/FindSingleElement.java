package Arrays.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindSingleElement {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3};
        System.out.println(getSingleElementOptimalSolution(arr));
    }
    public static int getSingleElement(int []arr){
        // Write your code here.
        for(int i=0;i<arr.length;i++){
            if(i==0){
                if(arr[i]!=arr[i+1]){
                    return arr[i];
                }
            }
            else if(i>0 && i<arr.length-1){
                if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]){
                    return arr[i];
                }
            }
            else{
                if(arr[i]!=arr[i-1]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static int getSingleElement1(int []arr){
        // Write your code here.
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int freq=0;
        for(int i=0;i< arr.length;i++){
            if(hashMap.containsKey(arr[i])){
                freq=hashMap.get(arr[i]);
                freq++;
                hashMap.put(arr[i],freq);
            }
            else{
                hashMap.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            if(entry.getValue()<2){
                return entry.getKey();
            }
        }
        return -1;
    }
    public static int getSingleElementOptimalSolution(int []arr){
        // Write your code here.
        int xor=0;
        for(int i=0;i< arr.length;i++){
            xor=xor^arr[i];
        }
        return xor;
    }
}
