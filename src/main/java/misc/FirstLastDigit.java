package misc;

/**
 * Created by bvenkatesan on 8/1/17.
 * http://www.geeksforgeeks.org/count-numbers-first-last-digits/
 */
public class FirstLastDigit {


    public static int findFirstDigit(int n) {
        while(n >= 10) {
            n = n/10;
        }

        return n;
    }

    public static int getDigitcount(int n) {

        //if the number.UniqueNumber is less than 10 then all single digits are considered as
        if(n < 10) {
            return  n;
        }

        //count the number.UniqueNumber of tens
        int tens = n/10;

        //just blindly add the single digits
        int total = tens + 9;

        //check the first digit
        int first = findFirstDigit(n);

        //last digit
        int last = n % 10;

        // if last is < first then there is no matching like 44, if greater like 46 then 44 is considered
        if(last < first) {
            total--;
        }

        return total;
    }

    public static int getCount(int start, int end) {
        return (getDigitcount(end) - getDigitcount(start -1));
    }

    public static void main(String[] args) {
        int start = 5;
        int end = 43;

        System.out.println(getCount(start, end));

    }
}
