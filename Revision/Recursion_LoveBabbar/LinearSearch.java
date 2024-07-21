package Revision.Recursion_LoveBabbar;

public class LinearSearch {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        boolean bool=linearSearch(arr, arr.length, 5);
        System.out.println(bool);
    }
    public static boolean linearSearch(int[]arr,int size,int element){
        int index=0;
        boolean remainingPart=false;
        if(size==0){
            return false;
        }
        else{
            remainingPart=search(arr,size,element,index);
        }
        return remainingPart;
    }
    public static boolean search(int[] arr,int size,int element,int index){
        if(size==index){
            return false;
        }
        if(arr[index]==element){
            return true;
        }
        return search(arr,size,element,index+1);
    }
}
