package demo04;

/*
数组的长度不可以发生改变
但是ArrayList集合的长度是可以随意变化的。

对于ArrayList来说，有一个尖括号<E>表示泛型
泛型：装在集合类当中的所有元素，全都是统一的什么类型
注意：泛型只能是引用类型，不能是基本类型

注意事项:
对于ArrayList集合来说，直接打印得到的不是地址值，而是内容
如果内容是空，得到的是空的[]

*/

import java.util.ArrayList;

public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合的名称是List，里面装的全部都是String字符类型的数据。
        //从JDK 1.7开始，右侧的尖括号内部可以不写内容，但是<>本身还是要写的。
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]

        //向集合当中添加一些数据，需要用到add方法
        list.add("AP Racing");
        System.out.println(list);//[]
        list.add("Skoda");
        list.add("Logitech");//

        //错误写法
        //list.add(100);定义的泛型是String


    }
}