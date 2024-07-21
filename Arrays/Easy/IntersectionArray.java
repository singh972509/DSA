package Arrays.Easy;

import java.util.ArrayList;

public class IntersectionArray {
    public static void main(String[] args) {
        int[] a={1,2,2,3,4,5};
        int[] b={2,2,3,4};
        ArrayList<Integer> arrayList=intersection(a,b);

    }
    public static ArrayList<Integer> intersection(int[]a,int[] b){
        int i=0;
        int j=0;
        ArrayList<Integer> arrayList=new ArrayList<>();
        while(i<a.length && j< b.length){
            if(a[i]==b[j]){
                arrayList.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return arrayList;
    }
}
