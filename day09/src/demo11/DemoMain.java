package demo11;

public class DemoMain {
    public static void main(String[] args) {
        //错误
        //Animal animal = new Animal(); 不能直接创建抽象类对象
        Cat cat = new Cat();
        cat.eat();
    }

}
