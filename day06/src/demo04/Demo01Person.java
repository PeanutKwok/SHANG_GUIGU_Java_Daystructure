package demo04;

/*
day06_16
当方法的局部变量和成员变量名重名的时候，根据"就近原则",优先使用局部变量
如果需要访问本类当中的成员变量，需要使用格式:
this.成员变量名
“通过谁调用的方法，谁就是this”
 */

public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "郭花生";
        person.sayHello("孙大帅");//person调用的sayHello,person就是this
        System.out.println(person);//打印得到的应该是地址值的
    }
}
