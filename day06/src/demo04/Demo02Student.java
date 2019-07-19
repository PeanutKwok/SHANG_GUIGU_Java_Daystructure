package demo04;
/*
构造方法是专门用来创建对象的方法，当我们通过关键词new来创建对象时，其实就是在调用构造方法
格式:
public 类名称(参数类型 参数名称){
    方法体
}
/调用构造方法的关键字是new +空格
注意事项:
1.构造方法的名称必须和所在的类名称完全一样，就连大小写也要一样。
2.构造方法不要写返回值类型，连void都不写
3.构造方法不能return一个具体的返回值
4.如果没有编写任何构造方法，那么编译器将会默认赠送一个构造方法，没有参数，方法体什么都不做
public Student(){}
5.一旦编写了至少一个构造方法，那么编译器将不再赠送
6.构造方法也可以进行重载
//重载形式的全参数的构造方法，只是在创建对象时方便我们把现有的数据通过参数的形式直接设置进来，
省去了多次调用setXXX方法
但是在修改内容是，还是需要setXXX方法。
 */

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student();//用new关键字创建时，Student();就是一个构造方法
        Student stu2 = new Student("孙博士",27);

        System.out.println("姓名: "+stu2.getName()+" 年龄: "+stu2.getAge());
        stu2.setAge(28);
        System.out.println("姓名: "+stu2.getName()+" 年龄: "+stu2.getAge());

    }
}
