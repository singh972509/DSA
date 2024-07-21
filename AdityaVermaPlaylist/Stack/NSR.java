package AdityaVermaPlaylist.Stack;

import java.util.Stack;

public class NSR {
    public static void main(String[] args) {
        int[]nums={4,5,2,10,8};
        int[]arr=NextSmallerElementsRight(nums);
    }
    public static int[] NextSmallerElementsRight(int[] nums) {
        int[] arr=new int[nums.length];
        int count=0;
        Stack<Integer> stack=new Stack<>();
        for(int i= nums.length-1;i>=0;i--){
            while(!stack.isEmpty()&&nums[i]<=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                arr[count]=-1;
                count++;
            }
            else{
                arr[count]=stack.peek();
                count++;
            }
            stack.push(nums[i]);
        }
        int i=0;
        int j= arr.length-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
}
