package Strings.Hard;

import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {

    }
    public int romanToInt(String s) {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        hashMap.put('I',1);
        hashMap.put('V',5);
        hashMap.put('X',10);
        hashMap.put('L',50);
        hashMap.put('C',100);
        hashMap.put('D',500);
        hashMap.put('M',1000);
        int result=0;
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(i==c.length-1){
                result=result+hashMap.get(c[i]);
                break;
            }
            if(hashMap.get(c[i])<hashMap.get(c[i+1])){
                result=result-hashMap.get(c[i]);
            }
            else{
                result=result+hashMap.get(c[i]);
            }
        }
        return result;
    }
}
