package demo03;

/*
问题描述:定义Person年龄时，无法阻止不合理的数值被设置进来
解决方案:用private关键字将需要保护的成员变量进行修饰

一旦使用private进行修饰，那么本类当中仍然可以随意访问
超出本类(class)范围之外，就不能再直接访问了。
private 提高了代码的安全性


间接访问privite成员变量，定义一组getter setter 方法

必须交setXxx或者getXxx命名规则
对于Getter来说，不能有参数，返回值类型和成员变量对应。
对于Setter来说，不能有返回值，参数类型和成员变量对应。
 */

public class Person {

    String name;
    private int age;//本类当中不受影响 Demo03Person中无法使用

    public void show() {
        System.out.println("我是"+name+" 年龄: "+age);
    }
    //这个成员方法，专门用于向age设置数据
    public void setAge(int num){//setAge固定格式
        if(num < 100 && num>0){
            age = num;}
        else{
            System.out.println("数据不合理");//num不符合前提下，不赋值给age,age=0
        }

    }
    //这个成员方法，专门用于获取age的数据
    public int getAge(){
        return age;
    }
}