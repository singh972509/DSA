package Arrays.Medium;

import java.util.ArrayList;
import java.util.*;

public class ZeroMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        int n=matrix.size();
        int m=matrix.get(0).size();
        zeroMatrixBruteForce(matrix,n,m);
    }
    public static ArrayList<ArrayList<Integer>> zeroMatrixBruteForce(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
        // Write your code here.
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j)==0){
                    makeRowZero(matrix,i,m);
                    makeColZero(matrix,n,j);
                }
            }
        }
        return matrix;
    }

    private static void makeRowZero(ArrayList<ArrayList<Integer>> matrix, int RowNumber,int numOfCols) {
        for(int i=0;i<numOfCols;i++){
            if(matrix.get(RowNumber).get(i)!=0){
                matrix.get(RowNumber).set(i,-1);
            }
        }
    }
    private static void makeColZero(ArrayList<ArrayList<Integer>> matrix, int numOfRows,int ColNumber){
        for(int i=0;i<numOfRows;i++){
            if(matrix.get(i).get(ColNumber)!=0){
                matrix.get(i).set(ColNumber,-1);
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
        // Write your code here.
        int[] row=new int[n];
        int[] col=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j)==0){
                    row[i]=-1;
                    col[j]=-1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==-1 || col[j]==-1){
                    matrix.get(i).set(j,0);
                }
            }
        }
        return matrix;
    }
}
