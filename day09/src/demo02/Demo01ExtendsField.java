package demo02;


    /*
在父子类的继承关系当中，如果成员变量重名，则创建子类对象是，访问有两种方式

1.直接通过子类对象访问成员变量
    等号左边是谁，就优先用谁，没有向上找。(由子向父)

2.间接通过成员方法访问成员变量
    该方法属于谁,就优先用谁，没有则向上找。

 */




    public class Demo01ExtendsField {
        public static void main(String[] args) {
            Fu fu = new Fu();//创建父类对象
            System.out.println(fu.numFu);
            System.out.println("==================");

            Zi zi = new Zi();
            System.out.println(zi.numFu);//10
            System.out.println(zi.numZi);//20
            System.out.println("==================");

            //等号左边是谁，就优先用谁 Zi zi = new Zi(); 所以优先用子类
            System.out.println(zi.num);
            //System.out.println(zi.abc);//子类没有，找父类，父类也没有，编译报错
            System.out.println("==================");

            //这个方法是子类的，优先用子类的，没有再向上（父类）找
            zi.methodZi();//200

            //这个方法是在父类当中定义的
            zi.methodFu();//100


        }




    }

