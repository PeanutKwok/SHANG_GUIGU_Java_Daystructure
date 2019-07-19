package demo07;
/*
继承关系中，父子类构造方法的访问特点:
1.子类构造方法当中有一个默认隐含的"super()"调用，
所以一定是先调用的父类构造
2.可以通过super关键字，子类构造调用父类重载构造。
3.super的父类构造调用，必须是子类构造方法的第一个语句。
不能一个子类构造调用多次super构造。

总结：
子类必须调用父类构造方法，不屑则赠送super()
写了就用写的指定的super调用，super只能由一个，还必须是第一个

 */

public class Demo01Constructor {
    public static void main(String[] args) {
        Zi zi = new Zi();
    }

    public void method(){
        //super();//错误写法！只有子类构造方法，才能调用父类构造方法
    }
}
