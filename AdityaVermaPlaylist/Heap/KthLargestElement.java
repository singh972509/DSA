package AdityaVermaPlaylist.Heap;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        int a[]
                = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };
        int n = a.length;
        int k = 3;
        int[]arr=solution(a,k);
    }
    public static int[] solution(int[] nums,int k){
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            priorityQueue.offer(nums[i]);
            if(priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }
        int[] arr=new int[k];
        int count=0;
        while(!priorityQueue.isEmpty()){
            arr[count]=priorityQueue.peek();
            priorityQueue.poll();
            count++;
        }
        return arr;
    }
}
