package demo02;


/*day08-15静态代码块
/*
静态代码块的格式：

public class类名称{
    static {

    //静态代码块的内容

    }
}

特点：当第一次用到本类时，静态代码块执行唯一的一次。
静态内容总是优先于非静态，静态代码块比构造方法先执行。

静态代码块的典型用途：
用来一次性的地对静态成员变量进行赋值
 */



public class Demo04Static {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();

    }
}

