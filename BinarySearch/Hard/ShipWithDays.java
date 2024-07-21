package BinarySearch.Hard;

public class ShipWithDays {
    public static void main(String[] args) {
        int[] weight={1,2,3,1,1};
        int result=shipWithinDays(weight,4);
        System.out.println(result);
    }
    public static int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < weights.length; i++) {
            max = max + weights[i];
            if (weights[i] > min) {
                min = weights[i];
            }
        }
        for (int i = min; i <= max; i++) {
            int daysReq=reqDays(weights,i);
            if(daysReq<=days){
                return i;
            }
        }
        return max;
    }

    public static int reqDays(int[] weights, int capacity) {
        int days=1;
        int load=0;
        for(int j=0;j<weights.length;j++){
            if(load+weights[j]>capacity){
                days=days+1;
                load=weights[j];
            }
            else{
                load+=weights[j];
            }
        }
        return days;
    }

}