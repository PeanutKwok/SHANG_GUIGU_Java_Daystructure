package Array;

public class TestArray {
    public static void main(String[] args) {
        //创建一个数组
        int[] arr1 = new int[3];
        //获取数组长度
        int length1 = arr1.length;
        System.out.println(length1);
        //访问数组中的元素:数组名[下标]
        //arr1[0]
        //遍历数组
        for(int i=0;i< arr1.length;i++){
            System.out.println(arr1[i]);
        }
        //创建数组的同时为数组赋值
        int[] arr2 = new int[]{90,80,70,60,50};
        //获取数组的长度

    }
   /// public int get(int index){
    ///    return elements;
    //}

}
