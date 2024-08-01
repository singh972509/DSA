package AdityaVermaPlaylist.Stack;

import java.util.Map;
import java.util.Stack;

public class StockPlan {
    public static void main(String[] args) {
        int[]arr={100,80,60,70,60,75,85};
        int[]res=solution(arr);
    }
    static class Pair{
        int index;
        int price;
        Pair(int index,int price){
            this.index=index;
            this.price=price;
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
    public static int[] solution1(int[] arr){
        int[] res=new int[arr.length];
        int count=0;
        Stack<Pair> stack=new Stack<>();
        for(int i=0;i< arr.length;i++){
            while(!stack.isEmpty() && stack.peek().price>=arr[i]){
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
