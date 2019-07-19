package demo02;

//将one中保存的对象地址值给two
public class Demo03PhoneSame {
    public static void main(String[] args) {
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
        System.out.println("==============");

        //////////////////////////////////////
        Phone two =  one;//将one中保存的对象地址值给two
        //////////////////////////////////////
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
