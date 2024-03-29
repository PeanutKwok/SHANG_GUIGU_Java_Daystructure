package demo02;

/*
day07_06
创建对象的标准格式
类名称 对象名 = new 类名称();

匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
new 类名称();

注意事项：
匿名对象只能使用唯一的一次，下次还需要再创建一个新对象
使用建议：如果确定有一个对象只需要使用唯一的一次，就可以使用匿名对象。
 */

public class Demo01Anonymous {
    public static void main(String[] args) {
        //左边的one就是对象的名字
        Person one = new Person();
        one.name = "蔡徐坤";
        one.showName();//成员方法
        System.out.println("=============");

        //匿名对象
        new Person().name = "大碗宽面";
        new Person().showName();

    }
}