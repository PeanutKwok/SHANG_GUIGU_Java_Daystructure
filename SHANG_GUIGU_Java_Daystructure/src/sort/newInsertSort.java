package sort;

public class newInsertSort {
    public static void main(String[] args){
        int [] arr = {5,3,2,8,5,9,1,0};

    }
    public static void insertSort(int arr[]){
        //遍历所有数字
        for(int i=1;i<arr.length;i++){
            //如果当前数字比前一个数字小
            if(arr[i]<arr[i-1]){
                //把当前遍历数字存储（找到的较小的数）
                int temp = arr[i];
                /*
                遍历当前数字前面所有的数字
                从前一个j=i-1(arr[i-1])开始
                停止遍历的情况
                 1.遍历到了第一个数字arr[0]
                 2.arr[j]<temp 往前遍历时，遍历到前一个数字比 (找到的较小的数arr[i])
               */
                for(int j=i-1;j>=0&&temp<arr[j];j--){
                    //把前一个数字赋值给后一个数
                    arr[j+1]=arr[i];
                }
                //


            }
        }

    }
}
