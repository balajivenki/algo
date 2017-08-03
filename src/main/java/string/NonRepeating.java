package string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bvenkatesan on 8/2/17.
 * http://www.geeksforgeeks.org/find-first-non-repeating-character-stream-characters/
 */
public class NonRepeating {
    public static void main(String[] args) {
        String str = "geeksforgeeksandgeeksquizfor";
        printNonRepeating(str);
    }



    private static void printNonRepeating(String str) {

        List<Character> list = new ArrayList<>();
        boolean[] visited = new boolean[256];

        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            if(!visited[c]) {
                if(list.contains(c)) {
                    visited[c] = true;
                    list.remove((Character) c);
                } else {
                    list.add(c);
                }
            }

            if(!list.isEmpty()) {
                System.out.println("Non repating char is: " + list.get(0));
            }
        }

    }
}
