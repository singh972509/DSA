package Revision.Recursion_LoveBabbar;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Utkarsh"));
    }
    public static String reverseString(String string){
        char[] ch=string.toCharArray();
        int front=0;
        int back=ch.length-1;
        recursion(ch,front,back);
        return new String(ch);
    }
    public static void recursion(char[] chars,int front,int back){
        if(front>=back){
            return;
        }
        recursion(chars,front+1,back-1);
        char temp=chars[front];
        chars[front]=chars[back];
        chars[back]=temp;
    }
}
