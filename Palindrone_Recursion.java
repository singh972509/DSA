public class Palindrone_Recursion {
    public static void main(String[] args) {
        boolean b=isPalindrome1("abbba");
        System.out.println(b);
    }
    public static boolean isPalindrome(String str) {
        // Write your code here.
        int l=0;
        int r=str.length()-1;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            else{
                l++;
                r--;
            }
        }
        return true;
    }
    public static boolean isPalindrome1(String str){
        int i=0;
        recursion(i,str);
        if(i>=str.length()/2){
            return true;
        }
        return false;
    }
    public static void recursion(int i,String str){
        if(i>=str.length()/2){
            return;
        }
        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            return;
        }
        recursion(i+1,str);
    }

}
