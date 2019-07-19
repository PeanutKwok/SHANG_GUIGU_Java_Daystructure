package demo02;

public class Zi extends Fu {
    int numZi = 20;
    int num = 200;
    public void methodZi() {
        //子类当中有num，所以使用子类当中num
        System.out.println(num);
    }
}
