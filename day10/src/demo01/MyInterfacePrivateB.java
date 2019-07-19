package demo01;


public interface MyInterfacePrivateB {
    public static void methodDefault1(){
        System.out.println("静态方法1");
       // methodStaticCommon();
        //System.out.println("AAA");
        //System.out.println("BBB");
        //System.out.println("CCC");

    }
    public default void methodDefault2(){
        System.out.println("静态方法2");
        //methodStaticCommon();
        //System.out.println("AAA");
        //System.out.println("BBB");
        //System.out.println("CCC");

    }
   /* private static void methodStaticCommon() { Java9中新添加的内容
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
    */
}
