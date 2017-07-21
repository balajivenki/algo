package misc;

import java.util.TreeMap;

/**
 * Created by bvenkatesan on 7/18/17.
 */
public class NumberToRoman {
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public static String printRoman(int number) {
        int l = map.floorKey(number);
        if(l == number) {
            return map.get(number);
        }

        return map.get(l) + printRoman(number-l);
    }

    public static void main(String[] args) {
        int number = 11;
        System.out.println(NumberToRoman.printRoman(number));
    }
}
