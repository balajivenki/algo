package list;

import java.util.LinkedList;

/**
 * Created by bvenkatesan on 8/1/17.
 * http://www.geeksforgeeks.org/stepping-numbers/
 */
public class SteppingNumber {

    public static void bfs(int start, int end, int num) {
        java.util.LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.push(num);

        while(!linkedList.isEmpty()) {
            int stepNum = linkedList.poll();

            if(stepNum <= end && stepNum >= start) {
                System.out.println(stepNum + " ");
            }

            if(stepNum == 0 || stepNum > end) {
                continue;
            }

            int lastDigit = stepNum % 10;

//            System.out.println("lastDigit: " + lastDigit);

            int stepNumA = stepNum * 10 + (lastDigit - 1);
            int stepNumB = stepNum * 10 + (lastDigit + 1);

/*            System.out.println("stepNumA: " + stepNumA);
            System.out.println("stepNumB: " + stepNumB);
            System.out.println("===");*/

            if(lastDigit == 0) {
                linkedList.push(stepNumB);
            } else if (lastDigit == 9) {
                linkedList.push(stepNumA);
            } else {
                linkedList.push(stepNumA);
                linkedList.push(stepNumB);
            }
        }
    }

    public static void displaySteppingNum(int start, int end) {
        for(int i=0;i<=9; i++) {
            bfs(start, end, i);
        }
    }

    public static void main(String[] args) {
        int start = 0;
        int end = 21;

        displaySteppingNum(start, end);
    }
}
