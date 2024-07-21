package Arrays.Medium;

public class RearrangeElementsPositiveNegative {
    public static void main(String[] args) {
        int[ ] arr={1,2,-4,-5};
        int[] arr2=solution_optimal(arr);
    }
    public static int[] solution(int[] arr){
        int[] pos=new int[arr.length/2];
        int[] neg=new int[arr.length/2];
        int j=0;
        int k=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>0){
                pos[j]=arr[i];
                j++;
            }
            else{
                neg[k]=arr[i];
                k++;
            }
        }
        for(int a=0;a<arr.length/2;a++){
            arr[2*a]=pos[a];
            arr[2*a+1]=neg[a];
        }
        return arr;
    }
    public static int[] solution_optimal(int[] arr){
        int[] arr2=new int[arr.length];
        int pos=0;
        int neg=1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<0){
                arr2[neg]=arr[i];
                neg=neg+2;
            }
            else{
                arr2[pos]=arr[i];
                pos=pos+2;
            }
        }
        return arr2;
    }
}
