package AdityaVermaPlaylist.Stack;

import java.util.Stack;

public class NGR {
//    Nearest greatest left
public static void main(String[] args) {
    int[] nums={1,2,3,5,4,7};
int[] res=nextGreaterElements1(nums);
}
    public static int[] nextGreaterElements1(int[] nums) {
        int[] list1=new int[nums.length];
        int count=0;
        Stack<Integer> stack=new Stack<>();
        for(int i= nums.length-1;i>=0;i--){
            while(!stack.isEmpty()&&nums[i]>=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                list1[count]=-1;
                count++;
            }
            else{
                list1[count]=stack.peek();
                count++;
            }
            stack.push(nums[i]);
        }
        int i=0;
        int j=list1.length-i-1;
        while(i<=j){
            int temp=list1[i];
            list1[i]=list1[j];
            list1[j]=temp;
            i++;j--;
        }
        return list1;
    }
    public static int[] nextGreaterElements2(int[] nums) {
        int[] result=new int[nums.length];
        Stack<Integer> stack=new Stack<>();
        int index=0;
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()>=nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[index]=-1;
            }
            else{
                result[index]=stack.peek();
            }
            index++;
            stack.push(nums[i]);
        }
        return result;
    }
}
