package demo06;
/*成员方法：编译看左边，运行看右边
成员变量:编译看左边，运行还看左边
1.对象的向上转型，其实就是多态的写法：
父类名称 对象名 = new 子类名称();                   Animal animal = new Cat();
含义:右侧创建一个子类对象，把它当做父类来看待使用。 创建了一只猫，当作动物看待

注意：向上转型一定是安全的，因为从小范围转向大范围。 从小范围的猫，向上转型为更大类型的动物
类似于 double num =100; int--->double 自动类型转换

一旦向上转型为父类，那么就无法调用子类原本特有的方法

解决方案:用对象的向下转型【还原】。本来就是猫，才能还原为猫

对象的向下转型，其实是一个【还原】的动作。
格式:子类名称 对象名 = (子类名称) 父类对象；
含义：将父类对象，还原成为本来的子类对象

Animal animal = new Cat();本来是猫，向上转型成为动物
Cat cat = (cat) animal; 本来是猫，已经被当作动物了，还原回来成为本来的猫
注意事项：
a.必须保证对象本来创建的时候，就是猫，才能向下转型成为猫
b.如果对象创建的时候本来不是猫，现在非要向下转型成为猫，就会报错

类似于 int num =(int)10.0;可以
       int num =(int)10.5;不可以，精度损失
 */

public class Demo1Main {
    public static void main(String[] args) {
        //对象的向上转型，就是父类引用指向子类对象
        //父类名称 对象名 = new 子类名称();
        Animal animal = new Cat();
        animal.eat();
        //编译看左，运行看右,Animal里有eat(); 右侧Cat();覆盖重写

        //animal.catchMouse();//错误写法

        //向下转型，进行还原动作
        Cat cat = (Cat) animal;
        cat.catchMouse();//猫抓老鼠

        //下面是错误的向下转型
        //格式:子类名称 对象名 = (子类名称) 父类对象；
        Dog dog =(Dog) animal;//本来new的时候是猫，现在当作狗
        //编译不报错，运行异常
        //java.lang.ClassCastException
    }
}
