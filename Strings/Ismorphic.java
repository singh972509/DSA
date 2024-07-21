package Strings;

import java.util.HashMap;

public class Ismorphic {
    public static void main(String[] args) {

    }
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap hashMap=new HashMap<>();
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        for(int i=0;i<s1.length;i++){
            if(hashMap.containsKey(s1[i])){
                char ch=(char)hashMap.get(s1[i]);
                if(ch!=s2[i]){
                    return false;
                }
                if(hashMap.containsValue(s2[i])){
                    return false;
                }
            }
            else{
                hashMap.put(s1[i],s2[i]);
            }
        }
        return true;
    }
}
