package string;

import java.util.Arrays;

/**
 * Created by bvenkatesan on 7/31/17.
 * http://www.geeksforgeeks.org/smallest-window-contains-characters-string/
 */
public class SmallestWindow {
    public static void printSDW(String str) {
        int n = str.length();
        int dist_count = 0;
        int[] dist_chars = new int[256];

        Arrays.fill(dist_chars, 0);

        for(int i=0;i<n;i++) {
            dist_chars[str.charAt(i)]++;
            if(dist_chars[str.charAt(i)] == 1) {
                dist_count++;
            }
        }

        System.out.println("dist_count: " + dist_count);

        int start_index = 0;
        int start = 0;
        int min_length = Integer.MAX_VALUE;
        int[] current_count = new int[256];
        int cnt = 0;
        Arrays.fill(current_count, 0);

        for(int j=0;j<n;j++) {

            current_count[str.charAt(j)]++;

            if(current_count[str.charAt(j)] == 1){
               cnt++;
            }

            //found all distinct chars so far
            if(cnt == dist_count) {
                while(current_count[str.charAt(start)] > 1) {
                    if(current_count[str.charAt(start)] > 1) {
                        current_count[str.charAt(start)]--;
                    }
                    start++;
                }

                int len_window = j - start +1;
                if(min_length > len_window) {
                    min_length = len_window;
                    start_index = start;
                }
            }
        }

        System.out.println("Result: " + str.substring(start_index, min_length));
    }


    public static void main(String[] args) {
        String str = "aabcbcdbca";
        SmallestWindow.printSDW(str);
    }
}
