package BinarySearch.Hard;

public class KokoBananas {
    public static void main(String[] args) {
        int[] v = {805306368,805306368,805306368};
        int h = 1000000000;
        int ans = minEatingSpeed(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int maxi=findMax(piles);
        //No of bananas per hour
        int low=1;
        int high=maxi;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            int reqTime=calculateTotalHours(piles, mid);
            if(reqTime<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    private static int calculateTotalHours(int[] piles, int i) {
        double totalHours=0;
        for(int j=0;j<piles.length;j++){
            totalHours=totalHours+(int)Math.ceil(((double)piles[j])/(double)(i));
        }
        return (int)totalHours;
    }

    public static int findMax(int[] piles){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            maxi=Math.max(maxi,piles[i]);
        }
        return maxi;
    }
}
