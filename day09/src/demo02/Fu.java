package demo02;

public class Fu {
    int numFu = 10;
    int num = 100;

    public void methodFu(){
        //使用本类当中的num，不会向下找子类当中的num
        System.out.println(num);
    }
}


