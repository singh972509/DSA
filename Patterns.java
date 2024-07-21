import java.util.Scanner;

public class Patterns {
    public static long sumFirstN(long n) {
        // Write your code here.
        long sum=0;
        if(n<1){
            System.out.println(sum);
            return sum;
        }
        else{
            calculate(n,sum);
        }
        return sum;
    }
    public static void calculate(long n, long sum){
        calculate(n-1, sum+1);
    }

    public static void main(String[] args) {
        long sum1=sumFirstN(3);
        System.out.println(sum1);
    }
}
