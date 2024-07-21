package AdityaVermaPlaylist.Heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class FrequencySort {
    public static void main(String[] args) {
        int[] arr={1,1,1,3,3,3,3,3,2,2,3};
        int k=2;
        int[] sol=solution(arr);

    }

    public static int[] solution(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], 1);
            } else {
                int freq = hashMap.get(nums[i]);
                freq++;
                hashMap.put(nums[i], freq);
            }
        }
        PriorityQueue<int[]>priorityQueue=new PriorityQueue<>((a,b)->(b[0]-a[0]));
        for(int i: hashMap.keySet()){
            priorityQueue.offer(new int[]{hashMap.get(i),i});
        }
        int[]arr=new int[nums.length];
        int count=0;
        while(!priorityQueue.isEmpty()){
            int freq=priorityQueue.peek()[0];
            int element=priorityQueue.peek()[1];
            while (freq>0){
                arr[count]=element;
                freq--;
                count++;
            }
            priorityQueue.poll();
        }
        return arr;
    }
}