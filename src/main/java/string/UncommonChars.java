package string;

/**
 * Created by bvenkatesan on 7/27/17.
 * http://practice.geeksforgeeks.org/problems/uncommon-characters/0
 */
public class UncommonChars {

    public static void findUncommon(String str1, String str2) {
        int[] chars1 = new int[256];
        int[] chars2 = new int[256];

        for(int i = 0;i< str1.length();i++) {
            chars1[str1.charAt(i)]++;
        }

        for(int i = 0;i< str2.length();i++) {
            chars2[str2.charAt(i)]++;
        }

        for(int i=0;i<256;i++) {
            // char1 has it >0 and char2 has 0 or char1 has 0 and char2 has it
            if((chars1[i] > 0 && chars2[i] == 0) || (chars1[i] == 0 && chars2[i] > 0)) {
                char c = (char) i;
                System.out.println(c);
            }
        }

    }

    public static void main(String[] args) {
        String str1 = "characters";
        String str2 = "alphabets";

        findUncommon(str1, str2);
    }
}
