package Arrays.Medium;

public class StocksBuySell {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(solution(arr));
    }
    public static int solution(int[] arr){
        int profit=0;
        int minValue=arr[0];
        for(int i=1;i< arr.length;i++){
            int cost=arr[i]-minValue;
            profit=Math.max(profit,cost);
            minValue=Math.min(minValue,arr[i]);
        }
        return profit;
    }
}
