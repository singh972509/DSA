package Arrays.Medium;

import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(new Integer[] {11,7,13,8,16,13 });
        nextGreaterPermutation(A);
    }
    public static List< Integer > nextGreaterPermutation(List< Integer > A) {
        // Write your code here.
        int index=-1;
        int n=A.size();
        for(int i=n-2;i>=0;i--){
            if(A.get(i)<A.get(i+1)){
                index=i;
                break;
            }
        }
        if(index==-1){
            List<Integer> list=reverList(A,0,A.size()-1);
            return list;
        }
        for(int i=n-1;i>index;i--){
            if(A.get(i)>A.get(index)){
                int temp=A.get(i);
                A.set(i,A.get(index));
                A.set(index,temp);
                break;
            }
        }
        reverList(A, index+1, A.size()-1);
        return A;
    }
    public static List<Integer> reverList(List<Integer> A,int i,int j){
        while(i<=j){
            int temp=A.get(i);
            A.set(i,A.get(j));
            A.set(j,temp);
            i++;
            j--;
        }
        return A;
    }
}
