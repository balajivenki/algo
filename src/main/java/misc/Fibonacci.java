package misc;

/**
 * Created by bvenkatesan on 7/27/17.
 */
public class Fibonacci {

    public static int printFibonacci(int n) {
        if(n<=1) {
            return 1;
        }

        return printFibonacci(n-1) + printFibonacci(n-2);
    }

    public static void main(String[] args) {
        int n = 10;

        for(int i=1;i<=n;i++) {
            System.out.println(printFibonacci(i));
        }

    }

}
