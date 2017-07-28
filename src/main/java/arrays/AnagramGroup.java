package arrays;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by bvenkatesan on 7/27/17.
 */
public class AnagramGroup {

    public static void printGroups(String[] words) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        String[] sorted = new String[words.length];

        for(int i = 0;i< words.length;i++) {
            char[] chars = words[i].toCharArray();
            Arrays.sort(chars);
            hashMap.put(i, new String(chars));

            sorted[i] = new String(chars);
        }

        Arrays.sort(sorted);

        int cnt = 1;
        String prev = sorted[0];
        for(int i=1;i<sorted.length;i++) {
            String current = sorted[i];

            if(prev.equals(current)) {
                cnt++;
            } else {
                System.out.println(cnt);
                cnt=1;
                prev = current;
            }
        }

        System.out.println(cnt);

        System.out.println(Arrays.toString(sorted));

    }

    public static void main(String[] args) {
        String[] words = {"cat", "dog", "tac", "god", "act"};

        printGroups(words);
    }
}
