package demo01;

/*
使用动态初始化数组的时候，其中的元素将会拥有一个默认值
如果是整数类型，默认值0
如果是浮点类型，默认值0.0
//如果是字符类型，默认值 不可见字符
如果是布尔类型，默认值false

注意事项:
静态初始化也有默认值的过程，只不过系统马上将默认值替换为大括号当中的具体数值。
 */
public class Demo05ArrayUse {

    public static void main(String[] args) {
        //动态初始化一个数组
        int[] array = new int[3];
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //将数据123赋值给数组array当中的1号元素
        array[1]=123;
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);



    }
}