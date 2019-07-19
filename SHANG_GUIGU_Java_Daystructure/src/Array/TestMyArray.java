package Array;

public class TestMyArray {
    public static void main(String[] args) {
        //创建一个可变的数组
        MyArray ma = new MyArray();
        //获取长度
        int size = ma.size();
        ma.show();
       // System.out.println(size);
        ma.add(96);
        ma.add(97);
        ma.add(98);
        ma.show();
        //ma.delete(1);
        System.out.println(ma.get(0));
       // System.out.println(ma.size());
        ma.insert(2,33);
        ma.show();
        ma.set(1,90);
        ma.show();
    }
}
