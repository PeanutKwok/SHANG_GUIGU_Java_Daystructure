package sort;

import java.util.Arrays;

public class retry_selectSort {

        public static void main(String[] args){
            int [] arr = {3,4,5,7,1,2,0,3,6,8};
            selectSort(arr);
            System.out.println(Arrays.toString(arr));
        }
        public static void selectSort(int[] arr){
            for(int i=0;i < arr.length-1;i++){
                int minIndex = i;//写错了 自己写成0
                for(int j=i+1;j <arr.length;j++){
                    if(arr[minIndex] > arr[j]){
                        minIndex = j;
                    }
                }
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;

            }
        }
    }