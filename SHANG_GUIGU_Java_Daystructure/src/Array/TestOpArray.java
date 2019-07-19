package Array;

import java.util.Arrays;

public class TestOpArray {
    public static void main(String[] args) {
        //数组在初始化时，要么确定长度，要么赋值。
        //都会确定长度，数组长度是不可变的。
        //解决数组元素不可变的问题，创建一个新数组

        int [] arr = new int[] {9,8,7};
        //快速查看数组中元素的方式
        System.out.println(Arrays.toString(arr));
        //要加入数组的目标元素dst
        int dst = 6;
        //创建一个新的数组，长度是元数组长度+1
        int []newArr = new int[arr.length+1];
        //把原数组中的数据全部复制到新数组中
        for(int i=0;i<arr.length;i++){
            newArr[i] = arr[i];
        }
        //把目标元素放入新数组的最后
        newArr[arr.length] = dst;
        //新数组替换原数组
        arr = newArr;//应该是传递地址值
        System.out.println(Arrays.toString(arr));


    }
}
