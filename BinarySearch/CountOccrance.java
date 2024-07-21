package BinarySearch;

public class CountOccrance {
    public static void main(String[] args) {
        int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13};
        int n = 8, x = 8;
        int ans = firstAndLastPosition(arr, n, x);
        System.out.println("The number of occurrences is: " + ans);
    }
    public static int firstAndLastPosition(int arr[], int n, int x){
        int low=0;
        int high=n-1;
        int firstOccurance=firstOccurabce(arr,n,x);
        int lastOccurance=lastOccurabce(arr,n,x);
        return lastOccurance-firstOccurance+1;
        }
    public static int firstOccurabce(int [] arr,int n,int x){
        int low=0;
        int high=n-1;
        int firstOccurance=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                firstOccurance=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return firstOccurance;
    }
    public static int lastOccurabce(int [] arr,int n,int x){
        int low=0;
        int high=n-1;
        int lastOccurance=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=x){
                lastOccurance=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return lastOccurance;
    }
}

