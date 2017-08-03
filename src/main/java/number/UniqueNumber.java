package number;

/**
 * Created by bvenkatesan on 8/2/17.
 * http://www.geeksforgeeks.org/numbers-unique-distinct-digits/
 */
public class UniqueNumber {
    public static void main(String[] args) {
        int start = 10;
        int end = 30;
        printUniqueNumbers(start, end);
    }

    private static void printUniqueNumbers(int start, int end) {
        for(int i=start;i<=end;i++) {
            boolean[] visited = new boolean[10];
            int num = i;
            while(num != 0) {
                int last = num % 10;

                if(visited[last]) {
                    break;
                }

                visited[last] = true;

                num = num/10;
            }

            if(num == 0) {
                System.out.println(" " + i);
            }

        }
    }
}
