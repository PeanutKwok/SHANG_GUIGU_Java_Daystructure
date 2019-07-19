package demo02;
/*
有参数:小括号当中有内容，当一个方法需要一些数据条件才能完成任务的时候
例如两个数字相加，必须知道这两个数字是多少，才能相加。
无参数:小括号当中留空。一个方法不需要任何条件就能独立完成任务
例如定义一个方法，打印固定10次HelloWord

*/

public class Demo03MethodParam {
    public static void main(String[] args) {
        method1(10,20);
        method2();

    }
    //两个数字相乘做乘法，有参数
    public static void method1(int a,int b){
        int result = a*b;
        System.out.println("结果是"+ result);
    }

    //没有参数，打印10次文本字符串
    public static void method2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello,World" + i);


        }
    }
}


