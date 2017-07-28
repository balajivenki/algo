package bit;

/**
 * Created by bvenkatesan on 7/26/17.
 * http://practice.geeksforgeeks.org/problems/check-set-bits/0
 */
public class CheckBit {
    public static void checkBit(int n) {
        if(n == 0) {
            System.out.println("No");
            return;
        }

        System.out.println(((n+1) & n));

        if(((n+1) & n) == 0) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");
    }

    public static void main(String[] args) {
        checkBit(7);
    }
}
