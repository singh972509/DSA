package AdityaVermaPlaylist.Stack;

import java.util.Stack;

public class NSL {
    public static void main(String[] args) {
        int[]nums={4,5,2,10,8};
int[]arr=NextSmallerElements(nums);
    }
    public static int[] NextSmallerElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int[] arr=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
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
        return arr;
    }
}
