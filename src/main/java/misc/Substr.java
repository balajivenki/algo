package misc;

/**
 * Created by bvenkatesan on 7/18/17.
 */
public class Substr {

    public static int substr(String haystack, String needle) {

        if(haystack == null || needle == null) {
            return 0;
        }

        if(needle.length() == 0) {
            return 0;
        }

        for(int i = 0;i<haystack.length();i++) {
            if((i + needle.length()) > haystack.length()) {
                return -1;
            }

            int m = i;

            for(int j=0; j < needle.length();j++) {
                if(needle.charAt(j) == haystack.charAt(m)) {

                    if(j == (needle.length() -1)){
                        return i;
                    }

                    m++;
                } else {
                    break;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "GeeksForGeeks";
        String needle = "Fr";

        int pos = Substr.substr(haystack, needle);
        System.out.println("pos: " + pos);
    }
}
