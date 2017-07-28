package arrays;

import java.util.Arrays;

/**
 * Created by bvenkatesan on 7/28/17.
 * http://practice.geeksforgeeks.org/problems/unsorted-array/0
 * http://www.geeksforgeeks.org/find-the-element-before-which-all-the-elements-are-smaller-than-it-and-after-which-all-are-greater-than-it/
 */
public class LeftMax {

    public static void findLeftMax(int[] array) {
        int n = array.length;

        int[] leftMax = new int[n];
        //int[] rightMin = new int[n];

        leftMax[0]=Integer.MIN_VALUE;
        for(int i=1;i<n;i++) {
            leftMax[i] = Math.max(leftMax[i-1], array[i-1]);
        }

        System.out.println(Arrays.toString(leftMax));

        int rightMin=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--) {
            if(array[i] > leftMax[i] && array[i] < rightMin) {
                System.out.println("i: " + i + ", val: " + array[i]);
            }
            rightMin = Math.min(rightMin, array[i]);
        }

        /*System.out.println(Arrays.toString(rightMin));

        for(int i=0;i<n;i++) {
            System.out.println(array[i]);
            System.out.println(leftMax[i]);
            System.out.println(rightMin[i]);
            System.out.println("---");
            if(array[i] > leftMax[i] && array[i] < rightMin[i]) {
                System.out.println("i: " + i + ", val: " + array[i]);
            }
        }*/

    }

    public static void findLeftMaxArray(int[] array) {
        int n = array.length;

        int i=0;
        int j=n-1;

        while(i<n && j>=0 && i<=j) {
            System.out.println(array[i]);
            System.out.println(array[j]);
            if((i+1) == j) {
                System.out.println("j: " + j + ", val: " + array[j]);
                break;
            }
            if(i == j) {
                System.out.println("j: " + (j+1) + ", val: " + array[j+1]);
                break;
            }
            if(array[i] < array[j]) {
                i++;
                j--;
            } else {
                System.out.println("-1");
                return;
            }
        }
    }

    public static void main(String[] args) {
        //int[] array = {11, 9, 12};
        int[] array = {4, 3, 2, 7, 8, 9};
        //int[] array = {5, 6, 7, 1, 8, 10, 12};
        //findLeftMax(array);
        findLeftMaxArray(array);
    }
}
