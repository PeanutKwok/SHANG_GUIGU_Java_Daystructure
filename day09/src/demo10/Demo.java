package demo10;
/*
Fu{
    int num = 10;
    method(){}//父
}
Zi extends Fu{
    int num = 20;
    method(){};//子
    show(){
        int num = 30;
        sout(num);//30
        sout(this.num);//20
        sout(super.num)//10

}
Demo{
    main(String[] args){
    Zi zi = new Zi();
    zi.show();
    zi.method();
}

Java语言是单继承的
一个类的直接父类只能有一个

class A {}
class B extends A {}//正确
class C {}
class D extends A,C{}//错误
 */

public class Demo {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();

        zi.method();
    }
}
