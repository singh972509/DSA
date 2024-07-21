package Arrays.Easy;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6};
        System.out.println(missing(arr,6));
    }
    public static int missing(int[] arr,int N){
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        int actualSum=(N)*(N+1)/2;
        return actualSum-sum;
    }
}
