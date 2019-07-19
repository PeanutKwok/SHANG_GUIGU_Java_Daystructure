package demo04;

/*
day05_17数组作为方法参数
数组可以作为方法的参数
当调用方法的时候，向方法的小括号进行参数传递，传递进去的其实是数组的地址值
 */
public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println(array);
        printArray(array);//传递的就是array对应的地址值
        System.out.println("====AAA====");
        printArray(array);
        System.out.println("===BBB===");
    }

    /*
    返回值类型：只需要打印，不需要进行计算，也没有结果，用void
    方法名称：printArray
    参数列表:必须要有元素才能打印
     */
    public static void printArray(int[] array) {//任何数据类型都能做方法的参数
        System.out.println("printArray方法收到的参数是:");
        System.out.println(array);//地址值
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }
}