package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplementationByQUeue {
    public static void main(String[] args) {
        stack s=new stack();
        s.push(5);
    }
    static class stack {
        void push(int x) {
            Queue<Integer> queue1 = new LinkedList<>();
            Queue<Integer> queue2 = new LinkedList<>();
            queue2.add(x);
            while(queue1.size()!=0){
                queue2.add(queue1.poll());
            }

        }
    }
}
