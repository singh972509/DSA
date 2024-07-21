package Strings.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        System.out.println(frequencySort1("treezzzz"));
    }

    public static String frequencySort1(String s) {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(char ch:s.toCharArray()){
            hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
        }
        List<Character> list=new ArrayList<>(hashMap.keySet());
        list.sort((ob1,ob2)->(hashMap.get(ob2)-hashMap.get(ob1)));
        StringBuilder stringBuilder=new StringBuilder();
        for(char ch:list){
            for(int i=0;i<hashMap.get(ch);i++){
                stringBuilder.append(ch);
            }
        }

        return stringBuilder.toString();
    }
}
