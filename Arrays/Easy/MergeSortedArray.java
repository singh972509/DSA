package Arrays.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b= {2, 3, 6};
        List<Integer> arr=sortedArray2(a,b);
    }
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int j=0;j<b.length;j++){
            set.add(b[j]);
        }
        for(int i:set){
            result.add(i);
        }
        return result;
    }
    public static List< Integer > sortedArray2(int []a, int []b) {
        List<Integer> result = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                if(result.size()!=0 && result.get(result.size()-1)==a[i]){
                    i++;
                }
                else {
                    result.add(a[i]);
                    i++;
                }
            }
            else{
                if(result.size()!=0 && result.get(result.size()-1)==b[j]){
                    j++;
                }
                else {
                    result.add(b[j]);
                    j++;
                }
            }
        }
        while(i<a.length){
            result.add(a[i]);
            i++;
        }
        while(j<b.length){
            result.add(b[j]);
            j++;
        }
        return result;
    }
    public static void check(List<Integer> result,int i){
        if(result.get(result.size()-1)==i){

        }
    }
}
