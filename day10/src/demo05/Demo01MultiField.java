package demo05;
/*
如果不用多态，只用子类，写法是:
Teacher one = new Teacher();
one.work();//讲课
Assistant two =new Assistant();
two.work;//辅导

现在要做的是，调用work方法，其他的功能不关心

如果使用多态的写法,对比以下
Employee one = new Teacher();
one.work();//讲课
Employee two = new Assistant();
two.work();//辅导

好处:无论new的时候换成哪个子类对象，等号左边调用方法都不会变化。让代码更加灵活

1.对象的向上转型，其实就是多态的写法：
父类名称 对象名 = new 子类名称();                   Animal animal = new Cat();
含义:右侧创建一个子类对象，把它当做父类来看待使用。 创建了一只猫，当作动物看待

注意：向上转型一定是安全的，因为从小范围转向大范围。 从小范围的猫，向上转型为更大类型的动物



小明是一个对象，
这个对象既有学生形态，也有人类形态
一个对象拥有多种形态，这就是:
对象的多态性

访问成员变量的两种方式
1.直接通过对象名称访问成员变量，看等号左边是谁，优先用谁，没有向上找
2.间接通过成员方法访问成员变量，看该方法属于谁，优先用谁
 */

public class Demo01MultiField {
    public static void main(String[] args) {

        //使用多态的方法，父类引用指向子类对象
        Fu obj = new Zi();

        System.out.println(obj.num);//

       // System.out.println(obj,age);不能向下找，错误写法。

        System.out.println("============");

        //子类没有覆盖重写，就是父:10
        //子类如果覆盖重写，就是子:20
        obj.showNum();

        // 子类没有覆盖重写，就是父， 10
    }
}
//如果