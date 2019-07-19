package demo02;





/*
    单独调用:方法名称(参数）

//打印调用System.out.println(方法名(参数))
//赋值调用:数据类型 变量名称=方法名称(参数）;
1.找到方法
2.参数传递
3.执行方法体
4.带着返回值回到方法的调用处，谁调用我，就把结果还给谁

注意：此前学习的方法，返回值类型固定写成void
这种方法只能够单独调用，不能进行打印调用或者复制调用

//import com.sun.org.apache.xpath.internal.SourceTree;
*/

    public class Demo02MethodDefine {
        public static void main(String[] args) {
            sum(10,20);//单独调用
            //单独调用:方法名称(参数）
            System.out.println("============");
            //打印调用System.out.println(方法名(参数))
            System.out.println(sum(10,20));
            //赋值调用:数据类型 变量名称=方法名称(参数）;
            System.out.println("============");
            int number = sum(15,25);
            System.out.println("变量的值" + number);



        }


        public static int sum(int a, int b) {
            System.out.println("方法执行啦");
            int result = a + b;
            return result;
        }
    }

