package demo01;

public class MyInterfacePrivateAImpl implements MyInterfacePrivateA {

   public void methodAnother(){
        //直接访问到了接口中的默认方法，这样是错误的，只能被methodDefault1/2使用，不应该能被实现类用
       // methodCommon();
    }
}
