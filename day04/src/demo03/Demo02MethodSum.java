package demo03;
/*
day04_15
    三要素
        返回值:有返回值，int sum
        方法名:getSum
        参数列表：数据范围已经确定，不需要任何条件

 */
public class Demo02MethodSum {
    public static void main(String[] args) {
        /*int i,sum=0;
        for(i=0;i<=100;i++)
        {
            sum=sum+i;
        }
        System.out.println("1~100所有数字和为"+sum);
        */

        System.out.println("结果是"+getSum());
    }

    public static int getSum(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum +=i;


        }
        return sum;

    }
}
