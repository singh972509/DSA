package AdityaVermaPlaylist.Heap;

import java.util.PriorityQueue;

public class ConnectRopeToMinimiseCost {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(solution(arr));
    }
    public static int solution(int[]nums){
        PriorityQueue<Integer>priorityQueue=new PriorityQueue<>((a,b)->a-b);
        for(int i=0;i<nums.length;i++){
            priorityQueue.offer(nums[i]);
        }
        int cost=0;
        while(priorityQueue.size()>=2){
            int first=priorityQueue.peek();
            priorityQueue.poll();
            int second=priorityQueue.peek();
            priorityQueue.poll();
            cost=cost+first+second;
            priorityQueue.offer(first+second);
        }
        return cost;
    }
}
