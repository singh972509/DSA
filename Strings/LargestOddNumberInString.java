package Strings;

public class LargestOddNumberInString {
    public static void main(String[] args) {
        String sb= largestOddNumber("52");
    }
    public static String largestOddNumber(String num) {
        StringBuilder sb=new StringBuilder(num);
        StringBuilder sb1=new StringBuilder();
        if((int)sb.charAt(sb.length()-1)%2!=0){
            return sb.toString();
        }
        else{
            for(int i=sb.length()-1;i>=0;i--){
                if((int)sb.charAt(i)%2!=0){
                    sb1.append(sb.substring(0,i+1));
                    break;
                }
            }
        }
        return sb1.toString();
    }
}
