package Revision.Recursion_LoveBabbar;

public class checkPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(4));
    }
    public static boolean checkPalindrome(long N) {
        // Write your code here.
        String str=String.valueOf(N);
        if(str.length()==1){
            return true;
        }
        char[] ch=str.toCharArray();
        int front=0;
        int back=ch.length-1;
        return recursion(ch,front,back);
    }
    public static boolean recursion(char[]ch,int front,int back){
        if(front>=back){
            return true;
        }
        if(ch[front]!=ch[back]){
            return false;
        }
        return recursion(ch,front+1,back-1);

    }
}
