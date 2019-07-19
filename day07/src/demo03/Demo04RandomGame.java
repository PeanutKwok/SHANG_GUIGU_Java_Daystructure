package demo03;

/*
Day07_11
用代码模拟猜数字的小游戏

思路:
1、首先需要产生一个随机数字，并且一旦产生不再变化。用Random的nextInt方法
2、需要键盘输入，使用Scanner
3、获取键盘输入的数字，用Scanner当中的nextInt方法
4、已经得到两个数字，判断(if)一下：
如果大，提示太大，并且重试
如果小，提示太小，并且重试
猜中了，游戏结束
5、重试就是再来一次，循环次数不确定，用While(True)
 */

import java.util.Random;
import java.util.Scanner;

public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r =new Random();
        int randomNum = r.nextInt(100) + 1;//取值范围[1,100]
        Scanner sc = new Scanner(System.in);
        while(true) {

            System.out.println("请输入你猜的数字：");
            int guessNum = sc.nextInt();//键盘输入猜测的数字

            if (guessNum > randomNum) {
                System.out.println("大了，请重试");
            } else if (guessNum < randomNum) {
                System.out.println("小了，请重试");
            } else {
                System.out.println("猜中了，666666");
                break;//猜中了，游戏结束
            }

        }
        System.out.println("游戏结束");



    }
}