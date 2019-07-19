package demo01;

/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用

1、导包:也就是指出需要使用的类，在什么位置
import 包名称，类名称
import day06.Student;
对于和当前类属于同一个包的情况，可以省略导包语句不写。

2、创建：格式
类名称 对象名 = new 类名称();
Student stu = new Student();

3、使用：分为两种情况
使用成员变量：对象名.成员变量名
使用成员方法：对象名.成员方法名(参数)
也就是，想用X，就用 对象名.X

注意事项：
如果成员变量没有进行赋值，将会有一个默认值，规则和数组一样。
boolean=false
int=0;
double= 0.0;
char=/u0000;
String=null;

 */
public class Demo02Student {
    public static void main(String[] args) {
        //1.导包
        //需要使用Student类和本类Demo02Student位于同一个包下，省略不写

        //2.创建 格式
        //类名称 对象名 = new 类名称();
        //根据Student类，创建了一个名为stu的对象
        Student stu = new Student();

        //3.使用其中的成员变量，格式：
        //对象名，成员变量名
        System.out.println(stu.name);//null
        System.out.println(stu.age);//0
        System.out.println("===============");

        //改变对象中的成员变量数值内容
        stu.name= "雅蔑蝶";//将右侧字符串，赋值交给stu对象当中的name成员变量
        stu.age = 18;
        System.out.println(stu.name);//
        System.out.println(stu.age);
        System.out.println("===============");

        //4.使用对象的成员方法，格式
        //对象名.成员方法名()
        stu.eat();
        stu.study();
        stu.sleep();

    }
}
