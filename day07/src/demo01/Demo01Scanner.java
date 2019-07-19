package demo01;

import java.util.Scanner;//导包

/*
day07_01-03
Scanner类的功能，可以实现键盘输入数据，到程序当中

引用类型的一般使用步骤：
1.导包
import 包路径.类名称:
如果需要使用的目标类，和当前类处于同一个包下，可以省略语句不写。
只有java.lang包下的内容不需要导包，其它都需要import语句


2.创建
类名称 对象名 = new 类名称();

3.使用
对象名.成员方法名();

获取键盘输入的int数字
int num = sc.nextInt();
获取键盘输入的字符串
String str = sc.nextLine();
 */

public class Demo01Scanner {
    public static void main(String[] args) {
        //创建
        Scanner sc = new Scanner(System.in);//从键盘进行输出
        //String str ="123";
        //3.获取键盘输入的int 数字
        int num = sc.nextInt();
        System.out.println("输入的int数字是: " + num);

    }
}
