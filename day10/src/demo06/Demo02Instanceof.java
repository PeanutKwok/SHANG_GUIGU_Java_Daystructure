package demo06;
/*
如何才能知道一个父类引用的对象，本来是什么子类
格式:
对象 instanceof 类型
这将得到一个boolean值结果，判断前面的对象能不能当作后面类型的实例
向下转型一定要进行判断

 */

public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal =new Dog();//本来是一只猫
        animal.eat();

        //如果希望调用子类特有方法，需要向下转型
        //判断下父类引用animal是不是DOg
        if(animal instanceof Dog){
            Dog dog =(Dog) animal;
            dog.watchHouse();
        }
        //判断下animal本来是不是Cat
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

    }
    public static void giveMeAPet(Animal animal){
        giveMeAPet(new Dog());
        if(animal instanceof Dog){
            Dog dog =(Dog) animal;
            dog.watchHouse();
        }
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
