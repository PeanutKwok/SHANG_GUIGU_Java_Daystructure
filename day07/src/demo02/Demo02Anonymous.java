package demo02;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        //普通使用方式
        // Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();

        //匿名对象的方式
        // int num = new Scanner(System.in).nextInt();
        // System.out.println("输入的是: " + num);
        //使用一般写法
        // Scanner sc = new Scanner(System.in);
        //methodParam(sc);
        //使用匿名对象进行参数传递
        // methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num =sc.nextInt();
        System.out.println("输入的是: "+ num);


    }

    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);

    }

    public static Scanner methodReturn(){
        //  Scanner sc = new Scanner(Sysytem.in);
        //return sc;

        return new Scanner(System.in);

    }
}
