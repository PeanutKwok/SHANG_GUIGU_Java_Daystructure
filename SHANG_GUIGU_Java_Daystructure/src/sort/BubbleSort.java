package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
//冒泡排序的时间复杂度，两个for循环O(n^2)
//为了容易理解，我们把冒泡排序演变过程展示出来
//第一趟排序，就是将最大的数排在最后\
//从0开始，数组长度是arr.length-1=5-1=4 一共4次

public class BubbleSort {
    public static void main(String[] args) {
       // int arr[] = {-2, 222, 13, 10, 220};
        int[] arr = new int[80000];
        for(int i = 0;i<8;i++) {
            arr[i] = (int)(Math.random()*80000);//生成[0,80000)数

            Date data1 = new Date();
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
          //  String date1Str = SimpleDateFormat.format(data1);

        }
        System.out.println("排序前");
        System.out.println(Arrays.toString(arr));
//测试冒泡排序的速度O(n^2)，给80000个数据，测试一下
        //创建随机数组



        bubbleSort(arr);
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));
        /*int temp = 0;//临时变量
        boolean flag = false;//标识变量，表示是否进行过交换

        for (int i = 0; i < arr.length - 1; i++) {


            for (int j = 0; j < arr.length - 1 - i; j++) {
                //如果前面的数比后面的数大，交换
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
            System.out.println("第" + (i + 1) + "次排序后的数组");
            System.out.println(Arrays.toString(arr));

            if (flag == false) {
                //flag== false 在排序过程中，交换没有发生
                break;
            } else {
                flag = false;//重置flag，进行下一次判断

            }*/

    }
    //将冒泡排序算法，封装成一个方法


    public static void bubbleSort(int[] arr) {
        int temp = 0;//临时变量
        boolean flag = false;//标识变量，表示是否进行过交换

        for (int i = 0; i < arr.length - 1; i++) {///1


            for (int j = 0; j < arr.length - 1 - i; j++) {
                //如果前面的数比后面的数大，交换
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
            //  System.out.println("第" + (i + 1) + "次排序后的数组");
            // System.out.println(Arrays.toString(arr));

            if (flag == false) {
                //flag== false 在排序过程中，交换没有发生
                break;//break跳出的是最外的for循环
            } else {//flag==true时，表示
                flag = false;//重置flag，进行下一次判断

            }


        }
    }
}

      /*  //第二趟排序，就是将第二大的数排在倒数第二\
        for (int j = 0; j < arr.length - 2; j++) {
            //如果前面的数比后面的数大，交换
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println("第三次排序后的数组");
        System.out.println(Arrays.toString(arr));
        //第三趟排序，就是将第三大的数排在倒数第三
        for (int j = 0; j < arr.length -1- 2; j++) {
            //如果前面的数比后面的数大，交换
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println("第三次排序后的数组");
        System.out.println(Arrays.toString(arr));

        //第四趟排序，就是将第三大的数排在倒数第四
        for (int j = 0; j < arr.length -1-3; j++) {
            //如果前面的数比后面的数大，交换
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println("第四次排序后的数组");
        System.out.println(Arrays.toString(arr));
    }

}*/
