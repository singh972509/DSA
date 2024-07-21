package Strings;

import java.util.Arrays;

public class LargestCommonPrefix {
    public static void main(String[] args) {
    String[] strings1= {"flower", "flow", "flight"};
    String s=longestCommonPrefix(strings1);
        System.out.println(s);
    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder stringBuilder=new StringBuilder();
        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();
        for(int i=0;i<first.length;i++){
            if(first[i]==last[i]){
                stringBuilder.append(first[i]);
            }
        }
        return stringBuilder.toString();
    }
}
