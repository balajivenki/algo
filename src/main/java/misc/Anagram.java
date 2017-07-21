package misc;

/**
 * Created by bvenkatesan on 7/13/17.
 */
public class Anagram {

    public boolean isAnagram(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        if(str1 == null || str2==null || len1 != len2){
            return false;
        }

        int[] count = new int[256];

        for(int i=0;i<len1;i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        for(int i=0;i<256;i++) {
            if(count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "salvador dali";
        String str2 = "avida dollars";

        Anagram anagram = new Anagram();
        if(anagram.isAnagram(str1, str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
