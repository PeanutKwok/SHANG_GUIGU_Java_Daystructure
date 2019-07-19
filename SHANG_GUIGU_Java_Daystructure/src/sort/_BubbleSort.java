package sort;

import java.util.Arrays;

public class _BubbleSort {
    public static void main(String[] args) {
        int array1[] = {4, 2, 33, -4, -5,20,36,544};
        BubbleSort(array1);

    }

    public static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int temp = 0;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}


