package sort;
/*
选择排序一共有数组大小-1轮排序
每一轮排序，又是一个循环，循环的规则(代码)
2.1假定当前这个数是最小的数
2.2和后面的每个数进行比较，如果发现有比当前数更小的数
就重新确定最小数，并得到下标
2.3当遍历到数组的最后时，得到本轮最小数和下标
2.4交换
 */

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1};
        System.out.println("排序前");
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
    }

    public static void selectSort(int[] arr) {
        //原始的数组: 101,34,119,1//第一轮排序: 1,34,119,101
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int min = arr[0];

            for (int j = i + 1; j < arr.length; j++) {//用假定的最小值和后面的数进行比较，后面的数从0+1开始

                if (min > arr[j]) {//说明假设的最小值不是最小的// ****************如果改成从大到小排列呢,直接改符号？ // if (min > arr[j])
                    min = arr[j];//新的最小值发现，赋值给min,重置min
                    minIndex = j;//发现最小的数所在的索引值，赋值给minIndex重置minIndex
                }
            }
            //将最小值，放在arr[0],交换
          //  if (minIndex != i) {//minIndex不等于0，进行交换
                arr[minIndex] = arr[i];
                arr[i] = min;
         //   }
            System.out.println("第" + (i + 1) + "轮后的结果");
            System.out.println(Arrays.toString(arr));
        }
    }
}

//  //第二轮
//
//        minIndex = 1;
//        min =arr[1];
//        //用假定的最小值和后面的数进行比较，后面的数从0+1开始
//        for(int j = 0 + 1 + 1;j< arr.length;j++){
//            if(min > arr[j]){//说明假设的最小值不是最小的
//                min = arr[j];//重置min
//                minIndex = j;//重置minIndex
//            }
//
//        }
//        //将最小值，放在arr[1],交换
//        if(minIndex !=0) {
//        arr[minIndex] = arr[1];}
//        arr[1] = min;
//        System.out.println("第二轮后的结果");
//        System.out.println(Arrays.toString(arr));
//
//
//        //第三轮
//
//        minIndex = 2;
//        min =arr[2];
//        //用假定的最小值和后面的数进行比较，后面的数从0+1开始
//        for(int j = 0 + 1 + 2;j< arr.length;j++){
//            if(min > arr[j]){//说明假设的最小值不是最小的
//                min = arr[j];//重置min
//                minIndex = j;//重置minIndex
//            }
//
//        }
//        //将最小值，放在arr[1],交换
//        if(minIndex !=2) {
//            arr[minIndex] = arr[2];}
//        arr[2] = min;
//        System.out.println("第二轮后的结果");
//        System.out.println(Arrays.toString(arr));


