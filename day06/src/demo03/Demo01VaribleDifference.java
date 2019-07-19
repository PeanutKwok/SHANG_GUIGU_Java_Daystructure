package demo03;

/*
局部变量和成员变量的区别
1.定义的位置不一样【重点】
局部变量：在方法的内部
成员变量: 在方法的外部，直接写在类当中

2.作用范围不一样【重点】
局部变量：只有在方法当中才可以使用，出了方法不能使用
成员变量:整个类都可以通用。

3.默认值不一样【重点】
局部变量:没有默认值，如果想要使用，必须进行手动赋值
成员变量:如果没有赋值，会有默认值，规则和数组一样。

4.内存的位置不一样(了解)
局部变量:位于栈内存
成员变量:位于堆内存

5.生命周期不一样
局部变量:随着方法进栈而诞生，随着方法出栈而消失
成员变量:随着对象创建而诞生，随着对象被垃圾回收而消失



*/

public class Demo01VaribleDifference {


    String name;//成员变量

    public void methodA(){
        int num = 20;//在方法内部，局部变量
        System.out.println(num);
        System.out.println(name);
    }
    public void methodB(int param){//方法参数是局部变量
        System.out.println(param);
        //参数在方法调用的时候必然会被赋值

        int age;//局部变量不赋值，不能使用
        // System.out.println(age);没有赋值，不能使用
        //System.out.println(num);错误写法
        System.out.println(name);
    }



}
