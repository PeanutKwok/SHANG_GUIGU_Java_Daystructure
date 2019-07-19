package demo03;

/*
Random类用来生成随机数字，使用起来三个步骤
1、导包
import java.util.Random

2、创建
Random r = new Random();

3、使用
获取一个随机的int数字(int所有范围，有正负两种数字)：int num =r.nextInt();
获取一个随机的int数字（参数代表范围，左闭右开区间）：int num = r.nextInt(3);
实际上代表的含义是：[0,3)，也就是0~2



 */

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数是: " + num);
    }
}

