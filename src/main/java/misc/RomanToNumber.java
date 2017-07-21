package misc;

import java.util.Hashtable;

/**
 * Created by bvenkatesan on 7/20/17.
 */
public class RomanToNumber {

    private final static Hashtable<Character, Integer> hashtable = new Hashtable<>();


    static {
        hashtable.put('I', 1);
        hashtable.put('V', 5);
        hashtable.put('X', 10);
        hashtable.put('L', 50);
        hashtable.put('C', 100);
        hashtable.put('D', 500);
        hashtable.put('M', 1000);
    }

    public static void toNumber(String roman) {
        int len = roman.length();

        int prev = 0;
        int result = 0;

        //traverse from the end
        for(int i= len-1;i>=0;i--) {
            int temp = hashtable.get(roman.charAt(i));

            if(temp > prev) {
                result += temp;
            } else {
                result -= temp;
            }

            prev = temp;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        String roman = "MCMIV";
        RomanToNumber.toNumber(roman);
    }
}
