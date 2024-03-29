package demo03;

/*
获取数组的长度，格式
数组名称.Length

这将会得到一个int数字，代表数组的长度
数组一旦创建，程序运行器件，长度不可改变

*/

public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {10, 20, 30, 6, 4, 8, 44, 224, 546, 42};
        int len = arrayB.length;
        System.out.println("arrayB数组的长度是:" + len);
        System.out.println("============");

        int[] arrayC = new int[3];
        System.out.println(arrayC.length);//3
        arrayC = new int[5];
        System.out.println(arrayC.length);//5
    }
}