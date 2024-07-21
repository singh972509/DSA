package Arrays.Medium;
import java.util.*;
public class LongestSuccessiveElements {
    public static void main(String[] args) {
        int[] arr={15 ,6 ,2 ,1 ,16 ,4 ,2 ,29 ,9 ,12 ,8 ,5 ,14 ,21 ,8 ,12,17,16,6,26,3 };
        System.out.println(longestSuccessiveElements(arr));
    }
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        Arrays.sort(a);
        int maxSuccessiveElements=1;
        int count=1;
        for(int i=1;i<a.length;i++){
            if((a[i]-a[i-1])==1){
                count++;
                if(count>maxSuccessiveElements){
                    maxSuccessiveElements=count;
                }
            }
            else if((a[i]-a[i-1])==0){
                continue;
            }
            else{
                count=1;
            }
        }
        return maxSuccessiveElements;
    }
    public static int longestSuccessiveElementsOptimalSolution(int []a) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add((a[i]));
        }
        int maxSucessiveElements=1;
        for(int it:set){
            if(!set.contains(it-1)){
                int x=it;
                int count=1;
                while(set.contains(x+1)){
                    x=x+1;
                    count++;
                }
                maxSucessiveElements=Math.max(maxSucessiveElements,count);
            }
        }
        return maxSucessiveElements;
    }
}
