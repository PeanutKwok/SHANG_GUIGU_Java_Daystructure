package demo01;

/*
day08_10
键盘输入一个字符串，并且统计其中各种字符出现的次数
种类有:大写字母，小写字母，数字，其他
1.键盘输入，肯定用到Scanner
2.获取键盘输入的一个字符串:String str = sc.next();
3.定义四个变量，代表四种字符出现的次数
4.需要对字符串组逐字检查，String变为char[],方法就是toCharArray()
5.遍历char[]字符数组，对当前字符的种类进行判断，用四个变量++操作


 */

import java.util.Scanner;

public class Demo07StringCount {
    public static void main(String[] args) {
        System.out.println("请输入字符串");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int countUpper=0;
        int countLower=0;
        int countNumber=0;
        int countOthers=0;


        char[] chars =str.toCharArray();

        //判断
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if('A' <= ch && ch <='Z'){
                countUpper++;

            }else if('a' <= ch && ch <='z' ){
                countLower++;
            }else if('0' <= ch && ch <= '9'){
                countNumber++;
            }else {countOthers++;
            }

        }
        System.out.println("大写字母有：" + countUpper +"个");
        System.out.println("小写字母有：" + countLower +"个");
        System.out.println("字母有：" + countNumber +"个");
        System.out.println("其他字母有：" + countOthers+"个");


    }
}

