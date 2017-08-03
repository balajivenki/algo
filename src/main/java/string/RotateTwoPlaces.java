package string;

/**
 * Created by bvenkatesan on 8/2/17.
 * http://www.geeksforgeeks.org/check-string-can-obtained-rotating-another-string-2-places/
 */
public class RotateTwoPlaces {
    public static void main(String[] args) {
        String str1 = "amazon";
        String str2 = "azonam";
        String str3 = "onamaz";

        String str4 = "geeksforgeeks";
        String str5 = "geeksgeeksfor";



        checkIsRotated(str4, str5);
    }

    private static void checkIsRotated(String str1, String str2) {
        if(str1.length() != str2.length()) {
            System.out.println("No");
            return;
        }

        String clockRot = "";
        String antiClockRot = "";

        clockRot = clockRot + str2.substring(2, str2.length()) + str2.substring(0, 2);

        antiClockRot = antiClockRot + str2.substring(str2.length()-2, str2.length()) + str2.substring(0, str2.length()-2);

        if(str1.equals(clockRot) || str1.equals(antiClockRot)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
