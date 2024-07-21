package TwoPointer;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        int a=lengthOfLongestSubstring("abcaaabcde");
        int b=approach2("abcaaabcde");
    }
    public static int lengthOfLongestSubstring(String s) {
        char[] str=s.toCharArray();
        int res=0;
        for(int i=0;i<str.length;i++){
            Set<Character> set=new HashSet<>();
            int counter=0;
            for(int j=i;j<str.length;j++){
                if(set.contains(str[j])){
                    break;
                }
                set.add(str[j]);
                counter++;
            }
            if(res<counter){
                res=counter;
            }
        }
        return res;
    }
    public static int approach2(String s){
        char[] str=s.toCharArray();
        int res=0;
        int left=0;
        int right=0;
        Set<Character>set=new HashSet<>();
        while(right<str.length){
            if(set.contains(str[right])){
                while(left<right && set.contains(str[right])){
                    set.remove(str[left]);
                    left++;
                }
            }
            set.add(str[right]);
            res=Math.max(right-left+1,res);
            right++;
        }
        return res;
    }
}
