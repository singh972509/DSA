package BinarySearch.TwoDArray;

public class Search2DMatrix {
    public static void main(String[] args) {

    }
//    Optimized solution
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            int low=0;
            int high=m*n-1;
            while(low<=high){
                int mid=(low+high)/2;
                int row=mid/n;
                int col=mid%m;
                if(matrix[row][col]>target){
                    high=mid-1;
                }
                else if(matrix[row][col]<target){
                    low=mid+1;
                }
                else{
                    return true;
                }
            }
        }
        return false;
    }
}
