package demo02;
/*
题目要求，定义一个方法，【求出】两个数字值和
你帮我算，算完之后把结果告诉我
题目变形: 定义一个方法，【打印】两个数字值和
对于有返回值的方法，可以使用【单独调用】、【打印调用】或者【赋值调用】。
但是对于无返回值的方法，只能使用【单独调用】，不能使用打印调用或者赋值调用。

 */

public class Demo04MethodReturn {
    public static void main(String[] args) {
        //我是main方法，我来调用你。
        //我调用你，你来帮我计算一下，算完之后，结果告诉num

        int num = getSum(10, 20);// getSum有返回值，可以赋值调用
        System.out.println("返回值是:"+num);
        System.out.println("=============");

        printSum(100,200);       //printSum无返回值，只能直接调用
        System.out.println("=============");

        System.out.println(getSum(2,3));//getSum有返回值，打印调用
        getSum(3,5);  //getSum有返回值，直接调用，但是没有用到输出结果。



        //System.out.println(printSum(2,3));错误 无返回值类型printSum


        //int num2 = printSum(2,3);错误 无返回值类型printSum


    }

    public static int getSum(int a, int b){//个
        int result =a+b;
        return result;

    }

    //我没有返回值，不会把结果输出，我自己进行打印输出
    public static  void printSum(int a,int b){
        int result =a+b;
        System.out.println("结果是:"+result);
    }
}

/*
数组是一种容器，可以同时存放多个数据值
数组的特点:
1.数组是一种引用数据类型
2.数组当中的多个数据，类型必须统一
3.数组的长度在程序运行期间不可改变

数组的初始化：在内存当中创建一个数组，并且向其中赋予一组默认值

两种常见的初始化方式
1.动态初始化(指定长度）
2.静态初始化（指定内容）

动态初始化数组的格式:
数据类型[] 数组名称 = new 数据类型[数组长度];

解析含义：
左侧数据类型，也就是数组当中保存的数据，全都是统一的什么类型
左侧的中括号，代表我是一个数组
左侧的数组名称，给数据取名字
右侧的new：代表创建数组的动作
右侧的数据类型：必须和左边的数据类型保持一致
右侧中括号的长度：也就是数组当中，到底可以保存多少个数据，是一个int数字
 */

public class Demo01Array {
    public static void main(String[] args) {
        /*int score1 = 100;
        int score2 = 98;
        int score3 = 99;
        System.out.println();

        */
        //创建一个数组，里面可以存放300个int数据
        //数据类型[] 数组名称 = new 数据类型[数组长度];
        int[] arrayA = new int[300];

        //创建一个数组，存放10个double类型数据

        double[] arrayB = new double[10];

        //创建一个数组，能存放5个字符串

        String[] arrayC = new String[5];


    }
}
