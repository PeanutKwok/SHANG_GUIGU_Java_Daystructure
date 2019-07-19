package demo01;
/*
接口就是多个类的公共规范
接口是一种引用数据类型，最重要的内容就是其中的抽象方法。
如何定义一个接口的格式
public interface 接口名称{
        //接口内容
}
备注 :换成了关键字interface之后，编译生成的字节码文件仍然是.java————————>.class
如果Java 7，接口中包含的内容:
1.常量
2.抽象方法

如果是Java 8,额外包含
3.默认方法
4.静态方法

Java 9 ，额外包含
5.私有方法

接口使用步骤：
1.接口不能直接使用，必须有一个“实现类”来“实现”该接口
格式:
public class 实现类名称 implements 接口名称{
    //
    }
2.接口的实现类必须覆盖重写（实现）接口中所有的抽象方法
实现:去掉abstract关键字，加上方法体大括号

3.创建实现类的对象，进行使用

注意事项：
如果实现类没有覆盖重写接口中所有的抽象方法，那么这个实现类自己必须是抽象类


Java 9+中，接口的内容可以有

1.成员变量其实是常量，格式:
[public] [static][final]数据类型 = 数据值;
注意:1.常量必须进行赋值，而且一旦赋值就不能改变
     2.常量名称完全大写，用下划线进行分隔

2.接口中最主要的就是抽象方法，格式:
[public][abstract]返回值类型 方法名称(参数列表);
注意：实现类必须覆盖重写接口所有的抽象方法，除非实现类是抽象类

3.从Java 8开始，接口里允许定义默认方法，格式:
[public] default 返回值类型 方法名称(参数列表){方法体}
注意：默认方法也可以被覆盖重写

4.从Java8开始，接口里允许定义静态发给发，格式:
[public] static 返回值类型 方法名称(参数列表){方法体}
注意：应该通过接口名称进行调用，不能通过实现类对象调用静态接口方法

5.从Java 9 开始，接口里允许定义私有方法，格式:
普通私有方法:private 返回值类型 方法名称(参数列表){方法体}
注意:private的方法只有接口自己才能调用，不能被实现类或别人使用。
 */

public class Demo01Interface {
    public static void main(String[] args) {
        //错误写法！不能直接new接口对象使用
       // MyInterfaceAbstract inter = new MyInterfaceAbstract();

        //创建实现类的对象使用
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs1();
        impl.methodAbs2();
    }
}
