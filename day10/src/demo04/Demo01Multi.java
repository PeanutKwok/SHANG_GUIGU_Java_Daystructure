package demo04;
/*
对象的多态性
extends继承或者implements实现，是多态性的前提
代码当中体现多态性，其实就是一句话：父类引用指向子类对象
格式:
父类名称 对象名 = new 子类名称();
或者
接口名称 对象名 = new 实现类名称();
 */

public class Demo01Multi {
    public static void main(String[] args){
        //使用多态的写法
        //左侧父类的引用，指向了右侧子类的对象
        Fu obj = new Zi();

        obj.method();//method 是个成员方法，new的是谁就运行谁
        obj.methodFu();//子类没有，向上找父类
    }
}
