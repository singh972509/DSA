package Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {

    }
    public static int majorityElement(int []v) {
        int majorityElement=0;
        int majorValue=v.length/2;
        // Write your code here
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<v.length;i++){
            int freq=0;
            if(hashMap.containsKey(v[i])){
                freq=hashMap.get(v[i]);
                freq++;
                hashMap.put(v[i],freq);
            }
            else{
                hashMap.put(v[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: hashMap.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            if(value>majorValue){
                return key;
            }
        }
        return -1;
    }
    public static int majorityElementOptimal(int []v) {
        int element=v[0];
        int count=1;
        for(int i=1;i<v.length;i++){
            if(v[i]==element){
                count++;
            }
            if(v[i]!=element){
                count--;
            }
            if(count==0){
                element=v[i];
            }
        }
        int cnt=0;
        for(int i=0;i<v.length;i++){
            if(v[i]==element){
                cnt++;
            }
        }
        if(cnt>((v.length)/2)){
            return element;
        }
        return -1;
    }
}
