package AdityaVermaPlaylist.Heap;

import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int N = 10;
        int[] arr = { 10, 5, 4, 3, 48, 6, 2, 33, 53, 10 };
        int K = 4;
        System.out.println(solution(arr,K));
    }
    public static int solution(int[] nums,int k){
        PriorityQueue<Integer>priorityQueue=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<nums.length;i++) {
            priorityQueue.offer(nums[i]);

            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
        return priorityQueue.peek();
    }
}
