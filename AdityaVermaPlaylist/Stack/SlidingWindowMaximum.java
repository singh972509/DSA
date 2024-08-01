package AdityaVermaPlaylist.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {

    }
    public static int[] maxSlidingWindow(int[] a, int k) {
        int n = a.length;
        int[] r =new int[n-k+1];
        int ri=0;
        Deque<Integer>deque=new ArrayDeque<>();
        for(int i=0;i<a.length;i++){
            if(!deque.isEmpty() && deque.size()>k){
                deque.poll();
            }
            while(!deque.isEmpty()&&a[deque.peekLast()]<a[i]){
                deque.pollLast();
            }
            deque.offer(i);
            if(i>=k-1){
                r[ri++]=a[deque.peek()];
            }
        }
        return r;
    }
}
