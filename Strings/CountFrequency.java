package Strings;
import java.util.*;

public class CountFrequency {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
    public static String frequencySort(String s) {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(char ch:s.toCharArray()){
            hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
        }
        String sortedString="";
        while(!hashMap.isEmpty()){
            int maxFrequency=Integer.MIN_VALUE;
            char maxChar='\0';
            Set<Character> keySet=hashMap.keySet();
            for(Character ch: keySet){
                if(hashMap.get(ch)>maxFrequency){
                    maxFrequency=hashMap.get(ch);
                    maxChar=ch;
                }
            }
            for(int i=0;i<maxFrequency;i++){
                sortedString=sortedString+maxChar;
            }
        }
        return sortedString;
    }
}
