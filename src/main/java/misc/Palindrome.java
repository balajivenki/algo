package misc;

/**
 * Created by bvenkatesan on 7/18/17.
 */
public class Palindrome {

    public boolean isPalindrome(String str) {
        if(str.length() <=1 ){
            return true;
        }

        if(str.charAt(0) == str.charAt(str.length()-1)) {
            return isPalindrome(str.substring(1, str.length()-1));
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "malayalam";
        Palindrome palindrome = new Palindrome();

        if(palindrome.isPalindrome(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
