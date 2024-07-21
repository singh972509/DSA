public class reverseArray_Recursion {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5};
        int l=0;
        int r=arr.length-1;
        int[] arr1=reverse(l,arr,r);
    }
    public static int[] reverse(int l, int[] arr, int r){
        if(l>=r){
            return arr;
        }
        swap(arr,l,r);
        reverse(l+1,arr,r-1);
        return arr;
    }
    public static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}
