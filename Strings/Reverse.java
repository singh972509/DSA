package Strings;

public class Reverse {
    public static void main(String[] args) {
        String sb=reverseWords(" the sky is blue");
        System.out.println(sb);
    }
    public static String reverseWords(String s) {
        StringBuilder sb=new StringBuilder(s);
        int back=-1;
        int front=0;
        boolean foundElement=false;
        StringBuilder sb1=new StringBuilder();
        for(int i=sb.length()-1;i>=0;i--){
            char ch= sb.charAt((i));
            if(ch ==' ' && !foundElement){
                continue;
            }
            if(ch!=' ' && !foundElement){
                foundElement=true;
                back=i;
            }
            if(foundElement){
                if(ch==' '){
                    front=i+1;
                    sb1.append(sb.substring(front,back+1));
                    sb1.append(' ');
                    foundElement=false;
                }
            }
        }
        if(sb1.charAt(sb1.length()-1)==' '){
            sb1.delete(sb1.length()-1,sb1.length());
        }
        return sb1.toString();
    }
}
