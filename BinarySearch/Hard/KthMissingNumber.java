package BinarySearch.Hard;

public class KthMissingNumber {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int num=findKthPositive1(arr,5);
    }
    public int findKthPositive(int[] arr, int k) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k)k++;
            else{
                break;
            }
        }
        return k;
    }
    public static int findKthPositive1(int[] arr, int k) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            int missing=arr[mid]-mid-1;
            if(missing==0){
                low=mid+1;
            }
            else if(missing<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low+k;
    }
}
