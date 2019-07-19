package demo04;

/*
一个方法可以有0,1,多个参数，但是只能有0或者1个返回值，不能有多个返回值
如果希望一个方法当中产生了多个结果数据进行返回，怎么办？
解决方案，使用一个数组作为返回值类型即可

任何数据类型都能作为方法参数类型，或者返回值类型
数组作为方法的参数，传递进去是数组地址值
数组作为方法的返回值，返回的是数组的地址值


 */
public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculcate(10,20,30);
        System.out.println("main方法接收到的返回值数组是:");
        System.out.println(result);//
        System.out.println("综合:"+result[0]);
        System.out.println("平均数:"+result[1]);
    }


    public static int[] calculcate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        //需要使用数组，保存多个结果
        /*
        int [] array = new int[2];
        array[0]=sum;
        array[1]=avg;
         */

        int[] array = {sum, avg};
        System.out.println("calculate方法内部数组是:");
        System.out.println(array);//地址值
        return array;
    }
}
