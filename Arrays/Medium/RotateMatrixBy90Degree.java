package Arrays.Medium;

public class RotateMatrixBy90Degree {
    public static void main(String[] args) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotateMatrix(arr);
    }
    public static void rotateMatrixBruteForce(int [][]mat){
        // Write your code here.
        int n=mat.length;
        int m=mat[0].length;
        int[][] matrix1=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix1[j][n-i-1]=mat[i][j];
            }
        }
        mat=matrix1;
    }
    public static void rotateMatrix(int [][]mat){
        // Write your code here.
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                transpose(mat,i,j);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m/2;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][m-i-1];
                mat[i][m-i-1]=temp;
            }
        }
    }
    public static void transpose(int[][] mat,int i,int j){
        int temp=mat[i][j];
        mat[i][j]=mat[j][i];
        mat[j][i]=temp;
    }
}
