package Arrays.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10},{2, 6}, {15, 18}};
        List<List<Integer>> ans = merge(arr);
        System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();
    }
    public static List<List<Integer>> merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0]; // Ascending order by the first element of each sub-array
            }
        });
        List<List<Integer>> mainList=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int el1=intervals[i][0];
            int el2=intervals[i][1];
            for(int j=i+1;j<intervals.length;j++){
                int el3=intervals[j][0];
                int el4=intervals[j][1];
                List<Integer> temp=new ArrayList<>();
                if(el2<el4 && el2>el3){
                    el2=el4;
                }
                else{
                    temp.add(el1);
                    temp.add(el2);
                    mainList.add(temp);
                    el1=el3;
                    el2=el4;
                }
            }
        }
        return mainList;
    }
}
