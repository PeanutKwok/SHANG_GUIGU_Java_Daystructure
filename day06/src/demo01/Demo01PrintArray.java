package demo01;

import java.util.Arrays;


/*
面向过程:当需要实现一个功能的时候，每一个具体步骤都要亲力亲为，详细处理每一个细节
面向对象:当需要实现一个功能的时候，不关心具体的步骤，找一个具有该功能的人，帮我做事。
 */
    public class Demo01PrintArray {
        public static void main(String[] args) {
            int[] array={10,20,30,40,50};
            //要求打印格式为[10,20,30,40,50]
            //面向过程的编程思路，每一个步骤亲力亲为
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                if(i==array.length-1){
                    System.out.println(array[i]+"]");

                }
                else {

                    System.out.print(array[i] + ", ");
                }



            }
            System.out.println("=============");
            //找jdk提供给我们的Arrays类
            //其中有一个toString方法，直接能把数组变成想要的格式的字符串
            System.out.println(Arrays.toString(array));//使用面向对象的思路

        }
    }

