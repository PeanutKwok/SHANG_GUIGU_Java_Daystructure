package demo01;
/*
==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法

public boolean equals(Object obj);
参数可以是任何对象，
只有参数是一个字符串并且内容相同的才会给ture
否则false

注意事项：
1.任何对象都能用Object进行接受
2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样
3.如果比较双方一个常量一个变量，推荐吧常量字符写在前面。
推荐"abc".equals(str) 不推荐str.equals("abc")

public boolean equalsIgnoreCase(String str)：忽略大小写进行内容比较

 */

public class Demo01Equals {
    public static void main(String[] args) {
        String str1 ="Hello";
        String str2 ="Hello";
        char[] charArray={'H','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));

        String str4 = "hello";
        System.out.println(str1.equals(str4));
        System.out.println("=====================================");

        String str5 = null;//null
        System.out.println("abc".equals(str5));//推荐写法，给false值
        //不推荐写法，报错，出现空指针异常NullPointerException
        //System.out.println(str5.equals("abc"));//


        System.out.println("==========================");
        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));
        System.out.println(strA.equalsIgnoreCase(strB));//忽略大小写


        //注意：只有英文字母区分
        System.out.println("abc一123".equalsIgnoreCase("abc二123"));

    }
}
