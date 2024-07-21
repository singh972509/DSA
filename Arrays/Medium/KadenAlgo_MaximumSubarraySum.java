package Arrays.Medium;

public class KadenAlgo_MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution(arr));
    }
    public static int solution(int[] arr){
        int sum=0;
        int maxValue=0;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
            if(sum<=0){
                sum=0;
            }
            if(sum>maxValue){
                maxValue=sum;
            }
        }
        return maxValue;
    }
}
