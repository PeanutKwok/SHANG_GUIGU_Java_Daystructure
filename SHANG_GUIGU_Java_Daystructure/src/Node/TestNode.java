package Node;
/*1.链表是以节点的方式来存储，是链式存储
2.每个节点包含data域，next域：指向下一个节点
3.如图，发现链表的各个节点不一定是连续存储

4.链表分带头节点的链表和不带头节点的链表*/

public class TestNode {
    public static void main(String[] args) {
        //创建节点
        Node n1 =new Node(1);
        Node n2 =new Node(2);
        Node n3 =new Node(3);
        //追加节点
        n1.append(n2);
        n1.append(n3);
        //取出下一个节点的数据
        System.out.println(n1.next().getData());
        System.out.println(n2.next());
        System.out.println(n3.next());
        n1.show();
        //删除一个节点
        n1.next().removeNext();
        n1.show();
        //插入一个新节点
        Node node =new Node(5);
    }
}
