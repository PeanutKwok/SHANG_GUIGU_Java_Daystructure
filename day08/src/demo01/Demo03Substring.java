package demo01;

/*
字符串的截取方法：
public String substring(int index);
截取从参数位置一致到字符串末尾，返回新字符串

public String substring(int begin,int end);
从begin开始，一直到end结束，中间的字符串
备注:[begin，end) 包含左边，不包含右边
 */

public class Demo03Substring {
    public static void main(String[] args) {
        String str1 = "HelloWorld!";
        String str2 = str1.substring(5);
        System.out.println(str1);//字符串不能发生改变
        System.out.println(str2);//World!
        System.out.println("============================");

        String str3 = str1.substring(4,7);
        System.out.println(str3);//oWo

        System.out.println("============================");

        //下面这种写法，字符串的内容没有改变
        //下面有两个字符串，"Hello","Java"
        //strA当中保存的是地址值
        //本来是Hello的0x666
        //变成了Java的0x999

        String strA = "Hello";
        System.out.println(strA);
        strA = "Java";
        System.out.println(strA);//
    }
}
