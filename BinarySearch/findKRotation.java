package BinarySearch;

public class findKRotation {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findKRotation(arr,arr.length);
        System.out.println("The array is rotated " + ans + " times.");
    }
    static int findKRotation(int arr[], int n) {
        // code here
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            int next=(mid+1)%n;
            int prev=(mid+n-1)%n;
            if(arr[mid]<=arr[next] && arr[mid]<=arr[prev]){
                return mid;
            }
            if(arr[mid]<=arr[end]){
                end=mid-1;
            }
            else if(arr[mid]>=arr[start]){
                start=mid+1;
            }
        }
        return -1;
    }
}
