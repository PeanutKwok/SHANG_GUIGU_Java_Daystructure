package demo01;
/*
从Java8 开始，接口里允许定义默认方法
格式:
public default 返回值类型 方法名称（参数列表）{
    //方法体
}

备注:接口当中的默认方法，可以解决接口升级的问题。
 */
public interface MyInterfaceDefault {

    //抽象方法
    public abstract void methodAbs();

    //新添加了一个抽象方法 DefaultA/B没有全部覆盖重写，报错
    //public abstract void methodAbs2();

    //新添加的方法：改成默认方法 就能解决问题
    public default void methodDefault(){//public 灰色，可以省略
        System.out.println("这是新添加的默认方法");
    }
}
