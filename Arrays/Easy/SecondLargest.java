package Arrays.Easy;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int secondLargest=secondLargest(arr);
        System.out.println(secondLargest);
    }
    public static int secondLargest(int[] arr){
        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
        }
        return secondLargest;
    }
}
