package Strings;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
isAnagram("anagram","nagaram");
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        HashMap<Character,Integer> hashMap1=new HashMap<>();
        HashMap<Character,Integer> hashMap2=new HashMap<>();
        for(int i=0;i<s1.length;i++){
            if(!hashMap1.containsKey(s1[i])){
                hashMap1.put(s1[i],1);
            }
            else{
                int freq=hashMap1.get(s1[i]);
                freq++;
                hashMap1.put(s1[i],freq);
            }
            if(!hashMap2.containsKey(t1[i])){
                hashMap2.put(t1[i],1);
            }
            else{
                int freq=hashMap2.get(t1[i]);
                freq++;
                hashMap2.put(t1[i],freq);
            }
        }
        for(Map.Entry<Character,Integer> entry: hashMap1.entrySet()){
            char key=entry.getKey();
            if(hashMap2.containsKey(key)&& entry.getValue()==hashMap2.get(key)){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
