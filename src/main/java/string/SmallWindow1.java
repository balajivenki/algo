package string;

/**
 * Created by bvenkatesan on 8/1/17.
 * http://practice.geeksforgeeks.org/problems/smallest-window-in-a-string-containing-all-the-characters-of-another-string/0
 */
public class SmallWindow1 {

    public static void findSmallWindow(String str1, String str2) {
        int[] distinct_chars = new int[256];
        int dist_count = 0;

        for(int i=0;i<str2.length();i++) {
            if(distinct_chars[str2.charAt(i)] == 0) {
                distinct_chars[str2.charAt(i)]++;
                dist_count++;
            }
        }


        int start=0;
        int start_index = 0;
        int min_length = Integer.MAX_VALUE;
        int cnt = 0;
        int[] current_count = new int[256];

        for(int i = 0;i< str1.length();i++) {

            current_count[str1.charAt(i)]++;

            if(current_count[str1.charAt(i)] == 1 && distinct_chars[str1.charAt(i)] == 1) {
                cnt++;
            }


            //now met all the distinct chars so far. now find min length
            if(cnt == dist_count) {

                while(start < i) {
                    if(distinct_chars[str1.charAt(start)] == 0 || current_count[str1.charAt(start)] > 1) {
                        start_index = start;
                        current_count[str1.charAt(start)]--;
                    } else {
                        break;
                    }

                    start++;
                }

                int len = i - start +1;
                if(len < min_length) {
                    min_length = len;
                    start_index = start;
                }


            }
        }

        System.out.println("start_index: " + start_index + ", min_length: " + min_length);
        System.out.println("Output: " + str1.substring(start_index, start_index+min_length));

    }

    public static void main(String[] args) {
        String str1 = "timetopractice";
        //String str1 = "zoomlazapzo";
        String str2 = "toc";
        //String str2 = "oza";

        findSmallWindow(str1, str2);
    }
}
