package sort;

import java.util.Arrays;

/**
 * Created by bvenkatesan on 7/12/17.
 */
public class MergeSort {

    public void merge(int[] arr, int l, int m, int r) {
        int n1 = m -l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0;i<n1;++i) {
            L[i] = arr[l+i];
        }

        for(int j=0;j<n2;++j) {
            R[j] = arr[m+j+1];
        }

        int i=0, j=0;
        int k=l;

        while(i<n1 && j <n2) {
            if(L[i] <=R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }

            k++;
        }

        while(i<n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j<n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public void sort(int[] arr, int l, int r) {
        if(l < r) {
            int mid = (l+r)/2;

            sort(arr, l, mid);

            sort(arr, mid+1, r);

            merge(arr, l, mid, r);
        }
    }

    public static void main(String[] args) {
        int[] values = {12, 11, 13, 5, 6, 7};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(values, 0, values.length - 1);

        Arrays.stream(values).forEach(value -> System.out.println(value));
    }
}
