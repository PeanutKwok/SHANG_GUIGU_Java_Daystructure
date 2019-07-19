package Search;

public class BinarySearch {
    public static void main(String[] args) {
        //目标数组是有序数组，采用二分查找法比较合适
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        //目标元素
        int target = 8;
        //记录开始位置
        int begin = 0;
        //记录结束位置
        int end = arr.length - 1;
        //记录中间的位置
        int mid = (begin + end) / 2;
        //记录目标位置
        int index = -1;
        //循环查找
        while (true) {
            //判断中间的这个元素是不是要查找的元素
            if (arr[mid] == target) {
                index = mid;
                break;
            } else {
                //判断中间这个元素是不是比目标元素大
                if (arr[mid] > target) {
                    //把结束位置调整到中间位置之前一个
                    end = mid - 1;
                } else {
                    //中间元素比目标元素小
                    //把开始位置调整到中间位置的后一个位置
                    begin = mid + 1;
                }
                mid = (begin + end) / 2;
            }

        }

        System.out.println("index:" + index);
    }
}
