package Arrays.Hard;

public class PascalTriangle {
    public static void main(String[] args) {
//int[][] arr=pascalTriangle(4);
pascalTriangle1(6);
    }
    public static int[][] pascalTriangle(int N) {
        // Write your code here.
        int[][] mat=new int[N][];
        for(int i=0;i<N;i++){
            mat[i] = new int[i + 1];
            mat[i][0]=1;
            mat[i][i]=1;
            for(int j=1;j<i;j++){
                mat[i][j]=mat[i-1][j-1]+mat[i-1][j];
            }
        }
        return mat;
    }
    public static void pascalTriangle1(int n) {
        int ans=1;
        System.out.print(ans+" ");
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            System.out.print(ans+" ");
        }

    }
}
