package demo05;

public class Zi extends Fu {
   // @Override 错误 只有方法能够覆盖重写，方法不能覆盖重写。
    int num =20;

    int age = 16;

    @Override
    public void showNum() {
        System.out.println(num);
    }

    @Override
    public void method() {
        System.out.println("子类方法");
    }
    public void methodZi(){
        System.out.println("子类特有方法");
    }
}
