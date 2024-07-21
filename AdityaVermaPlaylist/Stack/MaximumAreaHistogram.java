package AdityaVermaPlaylist.Stack;

import java.util.Stack;

public class MaximumAreaHistogram {
    public static void main(String[] args) {
        int[] arr={6,2,5,4,5,1,6};
        System.out.println(largestRectangleArea(arr));
    }
    public static class PairNsl{
        int height;
        int nsl;
        PairNsl(int height,int nsl){
            this.height=height;
            this.nsl=nsl;
        }
    }
    public static class PairNsr{
        int height;
        int nsr;
        PairNsr(int height,int nsr){
            this.height=height;
            this.nsr=nsr;
        }
    }
    public static int largestRectangleArea(int[]heights){
        int maxArea = 0;
        Stack<PairNsl> stackNsl=new Stack<>();
        int[] arr1=new int[heights.length];
        int count=0;
        for(int i=0;i<heights.length;i++){
            while(!stackNsl.isEmpty()&&heights[i]<=stackNsl.peek().height){
                stackNsl.pop();
            }
            if(stackNsl.isEmpty()){
                arr1[count]=-1;
                count++;
            }
            else{
                arr1[count]=stackNsl.peek().nsl;
                count++;
            }
            stackNsl.push(new PairNsl(heights[i],i));
        }
        int[] arr2=new int[heights.length];
        count=0;
        Stack<PairNsr> stackNsr=new Stack<>();
        for(int i=heights.length-1;i>=0;i--){
            while(!stackNsr.isEmpty()&&heights[i]<=stackNsr.peek().height){
                stackNsr.pop();
            }
            if(stackNsr.isEmpty()){

                arr2[count]= heights.length;
                count++;
            }
            else{
                arr2[count]=stackNsr.peek().nsr;
                count++;
            }
            stackNsr.push(new PairNsr(heights[i],i));

        }
        swap(arr2,0,arr2.length-1);

        for(int i=0;i<heights.length;i++){
            int breath=arr2[i]-arr1[i]-1;
            if(breath==0){
                breath=1;
            }
            int area=heights[i]*breath;
            if(area>maxArea){
                maxArea=area;
            }
        }
        return maxArea;
    }

    public static void swap(int[] arr2, int i, int length) {
        while(i<length){
            int temp=arr2[i];
            arr2[i]=arr2[length];
            arr2[length]=temp;
            i++;
            length--;
        }
    }
}
