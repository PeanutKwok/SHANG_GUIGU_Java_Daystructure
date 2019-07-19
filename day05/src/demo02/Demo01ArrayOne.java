package demo02;

/*
Java内存划分为5个部分:
1.栈(stack):存放的都是方法中的局部变量。方法的运行一定要在栈当中。
	局部变量:方法的参数，或者是方法{ }内部的变量
	作用域:一旦超出作用域，立刻从栈内存中消失
2.堆(Heap):new出来的东西，都存在堆中。
	堆内存里面都有一个地址值:16进制
	堆内存里的数据，都有默认值，规则:
		如果是正数 		默认为0
		如果是浮点数		默认为0.0
		如果是字符			默认为'/u0000'
		如果是布尔			默认为false
		如果是引用类型		默认为null
3.方法区(Method Area):存储.class相关信息，包含方法的信息。
4.本地方法栈（Native Method Stack): 与操作系统相关。
5.寄存器( pc Register): 与CPU相关

 */
public class Demo01ArrayOne {
    public static void main(String[] args) {
        int[] array = new int[3];//动态初始化
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //改变数组当中元素的内容
        array[1]=10;
        array[2]=20;
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);


    }
}
