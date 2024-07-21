package BinarySearch.Hard;

import java.util.Arrays;

public class AggresiveCows {
    public static void main(String[] args) {
        int[] stalls = {0, 3, 4, 7, 10, 9};
        int k = 4;
        int ans = aggressiveCows(stalls, k);
        System.out.println("The maximum possible minimum distance is: " + ans);
    }
    public static boolean canWePlaceCows(int[] arr,int distance,int cows){
        int last=arr[0];
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=distance){
                count++;
                last=arr[i];
            }
            if(count>=cows){
                return true;
            }
        }
        return false;
    }
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int low=1;
        int limit=stalls[stalls.length-1]-stalls[0];
        while(low<=limit){
            int mid=(low+limit)/2;
            if (canWePlaceCows(stalls, mid, k) == true) {
                low = mid + 1;
            } else limit = mid - 1;
        }
        return limit;
    }

}
