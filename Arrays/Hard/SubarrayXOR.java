package Arrays.Hard;

public class SubarrayXOR {
    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        int ans = solve(a, k);
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }
    public static int solve(int[] A, int B) {
        int cnt=0;
        for(int i=0;i<A.length;i++){
            int xor=0;
            for(int j=i;j<A.length;j++){
                xor=xor^A[j];
                if(xor==B){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
