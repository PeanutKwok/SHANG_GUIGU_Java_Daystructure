package demo03;

/*
题目要求
定义一个方法，来判断两个数字是否相同
 */

public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(sameOrNot(10,20));
        System.out.println(sameOrNot(10,10));
        System.out.println(sameOrNot(20,20));



    }


    /*
    三要素:
    返回值类型:boolean
    方法名称:sameOrNot
    参数列表:int a,int b
    */

    public static boolean sameOrNot(int a,int b){
        boolean same;

       /* if (a==b) {
            same = true;
        } else{
            same = false;
        }*/

        //same =a==b?true:false;

        //boolean same = a==b;

        return a==b;



    }
}
