package demo13;

public class DemoMain {
    public static void main(String[] args) {

        //Animal animal = new Animal();//错误，抽象类不能直接创建抽象对象
        //Dog dog = new Dog();//错误，也是抽象类
        DogHuskie ha = new DogHuskie();//普通类，可以直接new对象
        ha.eat();
        ha.sleep();
        System.out.println("==================");

        DogGoldren golden = new DogGoldren();
        golden.eat();
        golden.sleep();
    }
}
