package AdityaVermaPlaylist.Heap;

import java.util.PriorityQueue;

public class SortKSortedArray {
    public static void main(String[] args) {
        int[] nums={6, 5, 3, 2, 8, 10, 9};
        int k=3;
        int[]arr=solution(nums,k);
    }
    public static int[] solution(int[]nums,int k){
        PriorityQueue<Integer>priorityQueue=new PriorityQueue<>();
        int[]arr=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++) {
            priorityQueue.offer(nums[i]);

            if (priorityQueue.size() > k) {
                arr[count] = priorityQueue.peek();
                priorityQueue.poll();
                count++;
            }
        }
        while(!priorityQueue.isEmpty()){
            arr[count] = priorityQueue.peek();
            priorityQueue.poll();
            count++;
        }
        return arr;
    }
}
