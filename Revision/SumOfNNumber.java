package Revision;

public class SumOfNNumber {
    public static void main(String[] args) {
        System.out.println(solution(4));
        System.out.println(solution1(3));
        int[] arr=new int[]{1,2,3,4,5};
        reverseArray(arr);
        System.out.println(isPalindrome(0,"MADAMA"));
    }
    public static int solution(int n){
        if(n==1){
            return 1;
        }
        return n+solution(n-1);
    }
    public static int solution1(int n){
        if(n==1){
            return 1;
        }
        return n*solution1(n-1);
    }
    public static int[] reverseArray(int[]arr){
        int start=0;
        int end= arr.length-1;
        reverse(start,end,arr);
        return arr;
    }
    public static void reverse(int start,int end,int[] arr){
        if(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverse(start+1,end-1,arr);
        }
    }
    public static boolean isPalindrome(int i,String s){
        int l=s.length();
        if(i>=l/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(l-i-1)){
            return false;
        }
        isPalindrome(i+1,s);
        return true;
    }
}
