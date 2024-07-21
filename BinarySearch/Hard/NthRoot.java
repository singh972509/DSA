package BinarySearch.Hard;

public class NthRoot {
    public static void main(String[] args) {
        int ans=NthRoot(6,4096);
     }
    public static int NthRoot(int n, int m)
    {
        // code here
        int low=1;
        int high=m;
        while(low<=high){
            int mid=(low+high)/2;
            long search=1;
            for(int i=0;i<n;i++){
                search=search*mid;
                if(search>m){
                    break;
                }
            }
            if(search==m){
                return mid;
            }
            else if(search<m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }

}
