public class Fibonaaci {
    public static void main(String[] args) {
        int a = generateFibonacciNumbers1(6);
        System.out.println(a);
    }

    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
        int[] arr = new int[n];
        int i = 2;
        if (n == 1) {
            arr[0] = 0;
            return arr;
        }
        if (n == 2) {
            arr[0] = 0;
            arr[1] = 1;
            return arr;
        }
        arr[0] = 0;
        arr[1] = 1;
        while (i < n) {
            arr[i] = arr[i - 1] + arr[i - 2];
            i++;
        }
        return arr;
    }
    public static int generateFibonacciNumbers1(int n){
        if(n<=1){
            return n;
        }
        int last = generateFibonacciNumbers1(n-1);
        int slast = generateFibonacciNumbers1(n-2);
        return last+slast;
    }
}
