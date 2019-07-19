package demo01;
/*
接口当中也可以定义“成员变量”，但是必须使用public static final三个关键字进行修饰
从效果上看，这其实就是接口的[常量]
注意事项：
1.接口当中的常量，可以省略 public static final
注意：不写也照样是这样(默认有这三个关键字)
2.接口当中的常量，必须进行赋值，不能不赋值
3.接口中常量的名称，使用完全大写的字母，使用下划线进行分割

public sitatic final 数据类型 变量名称 = 数据值；

注意：一旦使用final关键字进行修饰，说明不可修改
 */

public interface MyInterfaceConst {
    //这其实就是一个常量，一旦赋值，不可以修改
    public static final int NUM_OF_MYCLASS =12;
}
