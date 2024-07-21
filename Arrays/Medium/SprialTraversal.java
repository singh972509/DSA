package Arrays.Medium;

import java.util.ArrayList;

public class SprialTraversal {
    public static void main(String[] args) {

    }
    public static int[] spiralMatrix(int [][]MATRIX) {
        // Write your code here.
        int n = MATRIX.length;
        int m = MATRIX[0].length;
        int top = 0;
        int left = 0;
        int right = m - 1;
        int bottom = n - 1;
        ArrayList<Integer> arrayList=new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                arrayList.add(MATRIX[top][i]);
            }
            top++;
            for(int i=top;top<=bottom;i++){
                arrayList.add(MATRIX[i][right]);
            }
            right--;
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    arrayList.add(MATRIX[bottom][i]);
                }
                bottom--;
            }
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    arrayList.add(MATRIX[i][left]);
                }
                left++;
            }
        }
        int[] arr=new int[n*m];
        return arr;
    }
}
