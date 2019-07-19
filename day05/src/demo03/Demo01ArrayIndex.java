package demo03;

public class Demo01ArrayIndex {
    /*
    索引编号从0开始，一直到"数组长度减1"为止
    如果访问数组元素的时候，索引编号并不存在，那么会发生数组索引越界异常

    原因:索引编号写错
    解决办法:修改成为存在的正确索引编号

     */
    public static void main(String[] args) {
        int[] array = {15,25,35};

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //错误写法，并不存在3号元素，数组索引越界异常。
        // System.out.println(array[3]);
    }
}
