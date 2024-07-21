package BinarySearch;

public class MinimumNumberOfDaysToMakeMBouquets {
    public static void main(String[] args) {
        int[] bloomDay={7,7,7,7,12,7,7};
        int minDays=minDays(bloomDay,2,3);
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        int numberOfFlowers=m*k;
        int maxDays=Integer.MIN_VALUE;
        int minDays=Integer.MAX_VALUE;
        if(numberOfFlowers>bloomDay.length){
            return -1;
        }
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]>maxDays){
                maxDays=bloomDay[i];
            }
            if(bloomDay[i]<minDays){
                minDays=bloomDay[i];
            }
        }
        int low=minDays;
        int high=maxDays;
        while(low<=high){
            int check=0;
            int count=0;
            int mid=(low+high)/2;
            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<=mid){
                    count++;
                }
                else{
                    check+=count/k;
                    count=0;
                }
            }
            check+=count/k;
            if(check>=m){
                minDays=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return minDays;
    }
}
