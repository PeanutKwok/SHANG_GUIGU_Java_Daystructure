package demo03;
/*
day07_08
 */

import java.util.Random;

public class Demo02Random {

    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10);//范围0~9
            System.out.println(num);


        }
    }
}
