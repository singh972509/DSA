package AdityaVermaPlaylist.Heap;

import java.util.PriorityQueue;

public class KClosestElement {
    public static void main(String[] args) {
        int[] nums = {10, 2, 14, 4, 7, 6};
        int target = 5;
        int k = 3;
        int[]arr= solution(nums, k,target);
    }
    public static int[] solution(int[] nums,int k,int target){
        PriorityQueue<int[]>priorityQueue=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<nums.length;i++){
            int abs=Math.abs(nums[i]-target);
            priorityQueue.offer(new int[]{abs,nums[i]});
            if(priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }
        int[] arr=new int[k];
        int count=0;
        while(!priorityQueue.isEmpty()){
            arr[count]=priorityQueue.peek()[1];
            priorityQueue.poll();
            count++;
        }
        return arr;
    }
}
