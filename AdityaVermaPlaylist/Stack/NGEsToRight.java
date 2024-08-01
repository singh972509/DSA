package AdityaVermaPlaylist.Stack;

import java.util.Stack;

public class NGEsToRight {
    public static void main(String[] args) {
        int[] arr={3, 4, 2, 7, 5, 8, 10, 6};
        int[] indices={0,5};
        int[] output=count_NGEs(args.length,arr,2,indices);
    }
    public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
        // code here
        Stack<Integer> stack=new Stack<>();
        int[] output=new int[2];
        for(int i=arr.length-1;i>=0;i--){
            if(i==indices[1]){
                int count=0;
                while(!stack.isEmpty()&&stack.peek()>=arr[i]){
                    count++;
                    stack.pop();
                }
                output[1]=count;
            }
            else{
                stack.push(arr[i]);
            }
        }
        Stack<Integer> stack1=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(i==indices[0]){
                int count=0;
                while(!stack1.isEmpty()){
                    if(stack1.peek()>=arr[i]){
                        count++;
                    }
                    stack1.pop();
                }
                output[0]=count;
            }
            else{
                stack1.push(arr[i]);
            }
        }
        return output;
    }
}
