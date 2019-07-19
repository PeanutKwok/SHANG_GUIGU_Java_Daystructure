package demo02;
/*
使用接口的时候，需要注意:

1.接口是没有静态代码块或者构造方法的

2.一个类的直接父类是唯一的，但是一个类可以同时实现多个接口

1.
 */

public class MyInterfaceImpl /*extends Object 也是有父类的，Object 类*/ implements MyInterfaceA,MyInterfaceB {
    ////alt+enter来源与两个接口的抽象方法都要进行覆盖重写
    //一个类的父类是唯一的，但是实现的接口可以有多个
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");

    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了AB接口都有的抽象方法");

    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口当中冲突的默认方法进行了覆盖重写");

    }
}
