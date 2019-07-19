package demo03;

/*
局部变量        直接写成员变量名
本类的成员变量   this.成员变量
父类的成员变量   super.成员变量
*/

public class Zi extends Fu {
    //子类方法的成员变量
    int num = 20;
    public void method(){
        //子类方法的局部变量
        int num = 30;
        System.out.println(num);//局部变量

        System.out.println(this.num);
        System.out.println(super.num);
    }
}
