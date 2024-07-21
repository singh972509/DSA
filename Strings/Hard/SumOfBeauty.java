package Strings.Hard;

import java.util.HashMap;
import java.util.Map;

public class SumOfBeauty {
    public static void main(String[] args) {
        int integer=beautySum("aabcb");
    }
    public static int beautySum(String s) {
        char[] s1=s.toCharArray();
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            HashMap<Character,Integer> hashMap=new HashMap<>();
            for(int j=i;j<n;j++){
                if(!hashMap.containsKey(s1[j])){
                    hashMap.put(s1[j],1);
                }
                else{
                    int freq=hashMap.get(s1[j]);
                    freq++;
                    hashMap.put(s1[j],freq);
                }
                int max=0;
                int min=Integer.MAX_VALUE;
                for(Map.Entry<Character,Integer> map:hashMap.entrySet()){
                    if(map.getValue()>max){
                        max=map.getValue();
                    }
                    if(map.getValue()<min){
                        min=map.getValue();
                    }
                }
                int beauty=max-min;
                ans=ans+beauty;
            }
        }
        return ans;
    }
}
