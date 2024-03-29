package Array;
//如何删除数组中的元素

import java.util.Arrays;

public class TestOpArray2 {
    public static void main(String[] args) {
        //目标数组
        int[] arr = new int[]{9,8,7,6,5,4};
        //要删除的元素的下标
        int dst=3;
        System.out.println(Arrays.toString(arr));

        //创建一个新数组，长度是原数组的长度-1
        int[] newArr=new int[arr.length-1];
        //复制原数组中除了要删除元素外其他元素
        for(int i=0;i<newArr.length;i++){
            //要删除的元素之前的元素
            if(i<dst){
                newArr[i]=arr[i];
                //要删除的元素之后的元素
            }else{newArr[i]=arr[i+1];
            }
        }
        arr=newArr;
        System.out.println(Arrays.toString(arr));
    }
}
