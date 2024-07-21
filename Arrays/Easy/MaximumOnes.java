package Arrays.Easy;

public class MaximumOnes {
    public static void main(String[] args) {
int[] arr={1, 1, 0, 1, 1, 1};
        System.out.println(function(arr));
    }
    public static int function(int[] arr){
        int count=0;
        int j=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==1){
                j++;
                if(count<j){
                    count=j;
                }
            }
            else{
                j=0;
            }
        }
        return count;
    }
}
