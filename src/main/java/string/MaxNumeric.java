package string;

/**
 * Created by bvenkatesan on 7/28/17.
 * http://www.geeksforgeeks.org/extract-maximum-numeric-value-given-string/
 */
public class MaxNumeric {
    public static void findMaxNum(String str) {
        int n = str.length();
        int maxSoFar = Integer.MIN_VALUE;
        int num = 0;
        for(int i=0;i<n;i++) {
            if(Character.isDigit(str.charAt(i))) {
                num = (num * 10) + Character.getNumericValue(str.charAt(i));
            } else {
                maxSoFar = Math.max(maxSoFar, num);
                num=0;
            }
        }

        System.out.println(Math.max(maxSoFar, num));
    }

    public static void main(String[] args) {
        String str = "100klh564abc365bg";
        findMaxNum(str);
    }
}
