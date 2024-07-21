package AdityaVermaPlaylist.Stack;

import java.util.Map;
import java.util.Stack;

public class StockPlan {
    public static void main(String[] args) {
        int[]arr={100,80,60,70,60,75,85};
        int[]res=solution(arr);
    }
    static class Pair{
        int price;
        int index;
        Pair(int price,int index){
            this.price=price;
            this.index=index;
        }
    }
    public static int[] solution(int[] arr){
        int[] res=new int[arr.length];
        int count=0;
        Stack<Pair> stack=new Stack<>();
        for(int i=0;i< arr.length;i++){
            while(!stack.isEmpty()&&arr[i]>=stack.peek().price){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[count]=1;
                count++;

            }
            else{
                res[count]=i-stack.peek().index;
                count++;
            }
            stack.push(new Pair(arr[i],i));
        }
        return res;
    }
}
