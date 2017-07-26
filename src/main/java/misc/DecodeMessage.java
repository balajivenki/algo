package misc;

import java.util.Arrays;

/**
 * Created by bvenkatesan on 7/21/17.
 */
public class DecodeMessage {
    public static void numDecodings(String s) {
        if(s == null || s.length() == 0){
            System.out.println("0");
        }
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;

        Arrays.stream(dp).forEach(value -> System.out.println(value));

        for(int i = 2; i <= n; i++){
            int first = Integer.valueOf(s.substring(i-1,i));
            int second = Integer.valueOf(s.substring(i-2,i));

            System.out.println("i: " + i);
            System.out.println("first: " + first);
            System.out.println("second: " + second);

            System.out.println("before");
            Arrays.stream(dp).forEach(value -> System.out.println(value));

            if(first >= 1 && first <= 9){
                dp[i] += dp[i-1];
            }
            if(second >= 10 && second <= 26){
                dp[i] += dp[i-2];
            }

            System.out.println("after");
            Arrays.stream(dp).forEach(value -> System.out.println(value));

        }

        System.out.println(dp[n]);

    }

    public static void main(String[] args) {
        DecodeMessage.numDecodings("123");
    }
}
