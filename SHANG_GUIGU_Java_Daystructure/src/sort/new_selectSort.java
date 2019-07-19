package sort;

import java.util.Arrays;

public class new_selectSort {
        public static void main(String[] args){
            int [] arr = new int [] {8,9,5};
            bubbleSort(arr);
            System.out.println(Arrays.toString(arr));
        }
        public static void bubbleSort(int[] arr){
            //遍历所有的数
            for(int i =0;i< arr.length;i++){
                int minIndex = i;
                //把当前遍历的数和后面所有的数依次进行比较，并记录下最小的数的下标。
                int min = arr[i];

                for(int j = i+1;j< arr.length;j++){
                    //如果后面比较的数比记录的最小的数小
                    if(arr[minIndex]>arr[j]){
                        minIndex = j;
                    }
                }
                //如果最小的数和当前遍历的数下标不一致,如果不一致，
                //说明下标为minIndex的数比当前遍历的数更小
                if(i!= minIndex){
                    int temp = arr[i];
                    arr[i]=arr[minIndex];
                    arr[minIndex]=temp;
                }
            }
        }
    }
