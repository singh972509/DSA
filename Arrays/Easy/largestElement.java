package Arrays.Easy;

public class largestElement {
    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
