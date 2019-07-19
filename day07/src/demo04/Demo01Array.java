package demo04;

/*
定义一个数组，用来存储3个person对象

数组有一个缺点：一旦创建，程序运行期间长度不可以改变
 */

public class Demo01Array {
    public static void main(String[] args) {

        //首先创建一个长度为3的数组，里面用来存放Person类型的对象
        Person[] array =new Person[3];
        System.out.println(array[0]);//null

        Person one = new Person("Lampard",36);
        Person two = new Person("Cech",28);
        Person three = new Person("Kroos",28);

        //将one当中的地址值赋值到数组的0号元素位置
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);
        System.out.println(array[1].getName());
    }
}
