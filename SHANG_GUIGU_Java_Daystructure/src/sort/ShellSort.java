
/*for(initialization; Boolean_expression; update)
        {
        //Statements
        }
        下面是一个for循环的控制流程：

        初始化步骤首先被执行，并且仅一次。这个步骤可声明和初始化任何循环控制变量。不需要把一个声明放在这里，只需要一个分号出现。

        接下来，布尔表达式求值。如果是 true，则执行循环体。如果是false，则循环体不执行, 并且流程控制的跳转到经过for循环的下一个语句。

        之后循环体在for循环执行时，控制流程跳转备份到更新语句。该语句允许更新任何循环控制变量。这个语句可以留空，只要一个分号出现在布尔表达式之后。

        布尔表达式现在再次评估计算。如果是true，循环执行，并重复这个过程（循环体，然后更新的步骤，然后布尔表达式）。之后，布尔表达式为 false，则循环终止。package sort;*/

package sort;
import java.util.Arrays;


//希尔排序：
public class ShellSort {
    public static void main(String[] args){
        int[] arr = {8,9,1,7,2,3,5,4,6,0};//要求从小到大排列
        shellSort(arr);
    }
    //使用逐步推导的方式来编写
    public static void shellSort(int[] arr){

        //希尔排序第一轮
        //因为第一轮排序，是将10个数据分成5组 每组2个数  10/2=5
        for(int i =5;i < arr.length;i++){
            //遍历各组中所有的元素（共5组,每组2个元素），步长5 j-=5
            for(int j = i - 5;j >= 0;j=j-5){//执行完第一次 j=0,j=j-5=-5跳出循环
                //如果当前元素大于加上步长后的那个元素，说明交换
                if(arr[j] > arr[j + 5]){
                    int temp = arr[j];
                    arr[j] = arr[j+5];
                    arr[j+5]=temp;
                }
            }
        }
        System.out.println("第一轮希尔排序之后 = " + Arrays.toString(arr));//


        //希尔排序第二轮
        //因为第二轮排序，是将10个数据分成5/2 = 2组 每组5个数 插入排序
        for(int i =2;i < arr.length;i++){
            for(int j = i - 2;j >= 0;j=j-2){//执行完第一次 j=0,j=j-2=-2跳出循环

                if(arr[j] > arr[j + 2]){
                    int temp = arr[j];
                    arr[j] = arr[j+2];
                    arr[j+2]=temp;
                }
            }
        }
        System.out.println("第二轮希尔排序之后 = " + Arrays.toString(arr));//

    }


}
