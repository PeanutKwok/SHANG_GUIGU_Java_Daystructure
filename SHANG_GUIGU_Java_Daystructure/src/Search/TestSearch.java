package Search;

public class TestSearch {
    public static void main(String[] args) {
        //目标数组
        int[] arr =new int[] {2,3,5,6,8,4,9,0};
        //目标元素
        int target = 10;
        //目标元素所在的下标
        int index =-1;//如果没找到 返回下标-1
        //遍历数组
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index =i;
                break;
            }
        }
        System.out.println("index: "+index);
    }
}
