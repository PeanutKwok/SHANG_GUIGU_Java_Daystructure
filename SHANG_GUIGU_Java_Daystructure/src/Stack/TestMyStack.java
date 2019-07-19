package Stack;

public class TestMyStack {
    public static void main(String[] args) {
        //先创建一个栈
        MyStack ms = new MyStack();
        //压入数据
        ms.push(9);
        ms.push(8);
        ms.push(7);
        //去除栈顶元素
      System.out.println(ms.pop());
      System.out.println(ms.pop());
        System.out.println(ms.pop());
        //查看栈顶元素
        //System.out.println(ms.peek());
        System.out.println(ms.isEmpty());
    }
}
