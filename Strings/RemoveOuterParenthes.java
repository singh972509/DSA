package Strings;

import java.util.Arrays;

public class RemoveOuterParenthes {
    public static void main(String[] args) {
        String s=removeOuterParentheses("(()(()))");
        System.out.println("String: "+s);
    }
    public static String removeOuterParentheses(String s) {
        char[] a= s.toCharArray();
        StringBuilder result =new StringBuilder();
        int index=0;
        for(int i=1;i<a.length-1;i++){
            result.append(a[i]);
            index=index+1;
        }
        return result.toString();
    }
}
