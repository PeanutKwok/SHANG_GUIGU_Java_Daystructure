package sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {101,34,119, 1,30,50};
        insertSort(arr);
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insertVal = arr[i];//第一轮为arr[1] 第二轮arr[2]
            int insertIndex = i - 1;//待插入数的索引，其实就是前一个有序表数的索引，arr[1]的前面这个数的下标待插入数下标为1
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {//从大到小 < 改成 >
                arr[insertIndex + 1] = arr[insertIndex];//变成{101,101,119,1} 39已经保存insertVal里
                insertIndex--;
            }
            arr[insertIndex + 1] = insertVal;
            System.out.println("第"+ i +"轮插入后");
            System.out.println(Arrays.toString(arr));
        }
    }
}

           /* //第一轮{(101),34,119,1}; => {(34,101),119,1}

            //定义待插入的数
            int insertVal = arr[1];//第一轮为arr[1] 第二轮arr[2]
            int insertIndex = 1-1;//待插入数的索引，其实就是前一个有序表数的索引，arr[1]的前面这个数的下标待插入数下标为1

            //给insertVal找到插入的位置
            //说明
            //1.insertIndex >= 0保证在insertVal找插入位置，不越界
            //2.insertVal < arr[insertIndex] 待插入的数，还没有找到插入位置 比如例子中的34 < 101需要进行移动
            //3.就需要将arr[insertIndex]后移
            while (insertIndex >= 0 && insertVal < arr[insertIndex]){
                arr[insertIndex +1] =arr[insertIndex];//变成{101,101,119,1} 39已经保存insertVal里
                insertIndex--;
            }
            //当退出while循环时，说明插入的位置找到，insertIndex+1
            arr[insertIndex + 1] = insertVal;
            System.out.println("第一轮插入后");
            System.out.println(Arrays.toString(arr));
        }
        //第二轮*/
    


