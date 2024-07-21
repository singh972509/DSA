package AdityaVermaPlaylist.Heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKElements {
    public static void main(String[] args) {
    int[] arr={1,1,1,2,2,3};
    int k=2;
    int[] sol=solution(arr,k);
    }
    public static int[] solution(int[]nums,int k){
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i],1);
            }
            else{
                int freq=hashMap.get(nums[i]);
                freq++;
                hashMap.put(nums[i],freq);
            }
        }
        PriorityQueue<int[]>priorityQueue=new PriorityQueue<>((a,b)->-(b[0]-a[0]));
        for(int i: hashMap.keySet()){
            priorityQueue.offer(new int[]{hashMap.get(i),i});
            if(priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }
        int[]arr=new int[k];
        int count=0;
        while(!priorityQueue.isEmpty()){
            arr[count]=priorityQueue.peek()[1];
            count++;
            priorityQueue.poll();
        }
        return arr;
    }
}
