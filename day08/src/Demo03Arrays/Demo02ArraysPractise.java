package Demo03Arrays;

import java.util.Arrays;

/*
题目：
使用Arrays相关的API，将一个随机字符串中的所有字符串升序排列，并倒序打印
 */
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str = "wqjdqidhfejaesfdhsjdfhasdjfhaifewhigfh";

        //升序排列:sort
        //必须是一个数组，才能用Arrays.sort方法
        //String --> 数组，用toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        //需要倒序遍历 chars.forr
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
    
}
