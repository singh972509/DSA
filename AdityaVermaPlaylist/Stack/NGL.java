package AdityaVermaPlaylist.Stack;

import java.util.Stack;

public class NGL {
    public static void main(String[] args) {
        int[]arr={1,3,2,4};
        int[] list=previousGreaterElements1(arr);
    }
    public static int[] previousGreaterElements1(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int[] arr=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty()&&nums[i]>=stack.peek()){
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

    public static int[] previousGreaterElements2(int[] nums) {

        int[] result=new int[nums.length];
        return result;
    }

}
