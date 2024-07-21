package Arrays.Easy;

public class MoveZero {
    public static void main(String[] args) {
        int[] arr={1,2,0,0,0,4,5,6};
        optiomalSolution(arr.length,arr);
    }
    public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        int countZero=0;
        int[] temp=new int[a.length];
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                temp[j]=a[i];
                j++;
            }
            else{
                countZero++;
            }
        }
        for(int i=0;i<countZero;i++){
            temp[j]=0;
        }
        return temp;
    }
    public static void optiomalSolution(int n, int[] a){
        int j=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                j=i;
                break;
            }
        }
        for(int k=j+1;k<a.length;k++){
            if(a[k]!=0){
                swap(a,k,j);
                j++;
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
