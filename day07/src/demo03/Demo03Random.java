package demo03;

import java.util.Random;

/*
题目要求：
根据int变量n的值，来获取随机数字，范围是[1,n]，可以取到1也可以取到n

思路:
1、定义一个int变量n，随意赋值
2、要使用Random：三个步骤：导包、创建、使用
3、如果写10，那么就是0~9，然而想要的是1-10，可以发现整体+1即可。
4、打印随机数字
 */
public class Demo03Random {
    public static void main(String[] args){
        int n =5;
        Random r = new Random();
        //本来范围是[1，n+1)，也就是(1,n)
        for (int i = 0; i < 100; i++) {
            int result = r.nextInt(n) + 1;// +1写在括号的外面，不能写在括号里面，否则从0到n
            System.out.println(result);

        }


    }
}
