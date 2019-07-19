package demo06;

//定义一个新手机，使用老手机作为父类

public class NewPhone extends Phone {
    @Override
    public void show() {
        //把父类的show方法拿过来重复利用
        //自己之类再添加更多内容
        super.show();//把父类的方法拿来重复利用
        //System.out.println("显示号码");不写了
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
