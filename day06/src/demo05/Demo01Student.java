package demo05;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        //分别使用set方法，赋值年龄和姓名
        stu1.setName("蔡徐坤");
        stu1.setAge(20);
        System.out.println("姓名" + stu1.getName() + ",年龄: " + stu1.getAge() );
        System.out.println("============");
        //直接使用构造方法赋值
        Student stu2 = new Student("加拿大炮王",16);
        System.out.println("姓名" + stu2.getName() + ",年龄: " + stu2.getAge() );
        //更改数据时使用
        stu2.setAge(-10);
        System.out.println("姓名" + stu2.getName() + ",年龄: " + stu2.getAge() );



    }
}
