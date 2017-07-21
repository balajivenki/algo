package sort;

/**
 * Created by bvenkatesan on 7/12/17.
 */
class BubbleSort
{
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    public void recurBubbleSort(int arr[], int n) {
        if(n==1){
            return;
        }

        for(int i=0;i<n-1;i++) {
            if(arr[i] > arr[i+1]) {
                int tmp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = tmp;
            }
        }

        recurBubbleSort(arr, n-1);
    }

    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.recurBubbleSort(arr, arr.length);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
