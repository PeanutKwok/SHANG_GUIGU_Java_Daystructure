package demo05;

/*
集合也可以作为方法的参数，接受到的是地址值
定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{ }括起集合，使用@分隔每个元素
格式参照 {元素@元素@元素}

System.out.println(list); {10,20,30}
printArrayList(List); {10@20@30}
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("布拉格");
        list.add("慕尼黑");
        list.add("斯图加特");
        list.add("卢塞恩");
        list.add("苏黎世");
        //System.out.println(list);
        printArrayList(list);
    }



    /*
    定义方法三要素
    1.方法名称
    2.方法参数:ArrayList
    3.返回值类型:指示进行打印，不需要返回，void
     */
    public static void printArrayList(ArrayList<String> list){

        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);


            if (i==list.size() -1){
                System.out.println(name + "}");
            }else{
                System.out.print(name + "@");
            }


        }
    }
}
