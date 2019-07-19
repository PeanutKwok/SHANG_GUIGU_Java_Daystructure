package demo03;

/*
遍历数组，说的就是对数组当中的每一个元素进行逐一处理
默认的处理方式就是打印


 */
public class Demo04Array {
    public static void main(String[] args) {
        int[] array = {15,25,30,40,50};

        System.out.println(array[0]);//15
        System.out.println(array[1]);//25
        System.out.println(array[2]);//30
        System.out.println(array[3]);//40
        System.out.println(array[4]);//50
        System.out.println("==============");

        //使用循环，次数就是数组的长度
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);

        }
        System.out.println("==============");
        int len=array.length;
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);

        }


    }


}

