package demo01;


    /*
直接打印数组名称，得到的是数组对应的内存地址的哈希值 [I@4554617c
访问数组元素的格式：数组名称[索引值]
索引值从0开始一直到数组长度减1为止

*/

    public class Demo04ArrayUse {
        public static void main(String[] args) {
            int [] array = {10,20,30};
            System.out.println(array);
            System.out.println(array[0]);//直接打印数组元素的内容

            int num= array[1];//单个元素赋值交给变量
            System.out.println(num);


            //直接打印数组名称，得到的是数组对应的内存地址的哈希值 [I@4554617c
        }
    }


