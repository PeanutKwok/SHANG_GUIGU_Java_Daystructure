package demo02;

///两 个对象的内存图Demo01PhoneOne
public class Demo02PhoneTwo {
    public static void main(String[] args) {
        //根据Phone类，创建一个名为one的对象
        //类名称 对象名 = new 类名称();
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("==============");

        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "黑色";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("==============");

        one.call("乔布斯");
        one.sendMessage();
        Phone two = new Phone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("==============");

        two.brand = "三星";
        two.price = 5999.0;
        two.color = "蓝色";
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("==============");

        two.call("Korean");
        two.sendMessage();





    }

}

