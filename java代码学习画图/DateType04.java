public class DataType04
{
  public static void main（String[] args）{
    int a = 10;
    int b = 010;//整数型字面值以0开头的，后面那一串数字就是八进制形式
    int c = 0x10;//十六进制

    System.out.println;

    System.out.println(b);

    System.out.println(c);

    System.out.println(d);

    int i = 123;

    System.out.println(i);
    //123这个整数型字面值是int类型
    //i变量声明的时候也是int类型
    //int类型的123赋值给int类型的变量i,不存在类型转换

    long x = 456;
    //456正数型字面值被当做int类型，占用4个字节
    //x变量在声明的时候是long类型，占用8个字节
    //int类型的字面值456赋值给long类型，存在类型转换
    //int类型转换成long类型
    //int类型是小容量 long类型是大容量
    //小容量可以自动转换成大容量，称为自动类型转换机制。

    long y = 2147483647;
    System.out.println(y);
    //2147483647字面值是int类型，占用4个字节
    //y是long类型，占用8个字节，自动类型转换

    long z = 2147483648;
    System.out.println(Z);//错误
    //2147483648超出int数据类型的最大取值范围和long类型无关
    //避免错误，一上来就当作long类型来处理，在字面值后面添加L

    long z = 2147483648L;//正确

    







  }
}
