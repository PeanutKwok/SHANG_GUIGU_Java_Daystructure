/*
    关于java编程中运算符之:算术运算符
    +   求和
    -   相减
    *   乘积
    /   商
    %   求余数(取模)
    ++  自加1
    --  自减1

  注意:
      一个表达式当中有多个运算符，运算符有优先级，优先级不确定的加小括号。
  */

      单目运算符:
      int a = 100;
      int b = a ++;//先赋值，再自增
      System.out.println(a);//101
      System.out.println(b);//100

      ++出现在变量之前，先做自增加，再做赋值运算。

      int e = 100;
      System.out.println(e ++);//100
      System.out.println(e);//101

      int s = 100;
      System.out.println(++s);//101
      System.out.println(s);//101

      关系运算符
        >
        >=
        <
        <=
        ==
        !=

        = 是赋值运算符
        ==是关系运算符

        关系运算符的运算结果一定是布尔类型: true/false

        关系运算符的运算原理:
        int a = 10;
        int b = 10；
        a > b比较:比较a中保存的10这个值和b中保存的10这个值的大小关系。

    *逻辑运算符
      &  逻辑与 (两边算子都是 true,结果才为ture)
      |  逻辑或 (两边只要有一个是 true,结果ture)
      !  逻辑非 (取反，!false就是true，是单目运算符)
      ^  逻辑异或(两边算子只要不一样，结果为true)

      &&  短路与
      ||  短路或

        1.逻辑运算符要求两边的算子都是布尔类型，并且逻辑运算符最终的运算结果也是一个布尔类型。

        2.什么情况下发生短路现象？

        public class OpeatorTest
        {
          public static void main(String[] args){

            System.out.println();
          }
        }
        int x = 10;
        int y = 8;
        System.out.println(x < y & ++x < y);
        System.out.println(x);//x = 11 右侧运算了

        int x = 10;
        int y = 8;
        System.out.println(x < y && ++x < y);
        System.out.println(x);//x=10 第一个表达式已经false，后面表达式不走了。

        //某种角度来说，短路与更智能。由于后面表达式可能不执行，所以效率较高。在实际开发中使用的多。


49课运算符
  *赋值运算符
