package Revision;

public class Recursion {
    public static void main(String[] args) {
//        recursion(1,5);
//        printN(5);
        int[] arr={0,1,1};
        numberOfAlternatingGroups(arr);
    }
    public static void recursion(int i,int n){
        if(i>n){
            return;
        }
        recursion(i+1,n);
        System.out.print(i + " ");
    }
    public static void printN(int n){
        if(n==0){
            return ;
        }
        System.out.print(n+" ");
        printN(n-1);
    }
    public static int fibonacciNumber(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return fibonacciNumber(n-1)+fibonacciNumber(n-2);
    }

    public static int numberOfAlternatingGroups(int[] colors) {
        int i=0;
        int cnt=0;
        for(i=0;i<colors.length-2;i++){
            if(colors[i]!=colors[i+1]&&colors[i+1]!=colors[i+2]){
                cnt++;
            }
        }
        if(i==colors.length-2){
            if(colors[i]!=colors[i+1]&&colors[i+1]!=colors[0]){
                cnt++;
            }
        }
        i++;
        if(i==colors.length-1){
            if(colors[i]!=colors[0]&&colors[0]!=colors[1]){
                cnt++;
                i++;
            }
        }
        return cnt;
    }
}
