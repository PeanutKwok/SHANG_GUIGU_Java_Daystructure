package demo02;

/*
day08_12静态static关键字修饰
一旦使用static关键字，这个变量不再属于对象自己，而是属于类的。
多个对象共享一份数据才行。

*/



public class Demo01StaticField {
    public static void main(String[] args) {


        Student two = new Student("良心想",50);
        Student one = new Student("傻多戴",5000);
        two.room = "101教室";
        System.out.println("姓名: " + one.getName() + ", 年龄 :" + one.getAge() + ", 教室:" +one.room + " ,学号 "+one.getId() );
        System.out.println("姓名: " + two.getName() + ", 年龄 :" + two.getAge() + ", 教室:" +one.room +" ,学号 "+two.getId() );

    }



}

