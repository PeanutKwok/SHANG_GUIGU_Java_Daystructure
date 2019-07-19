package Node;



//一个节点
public class Node {
    //节点内容
    int data;
    //下一个节点
    Node next;

    public Node(int data){//构造方法
        this.data = data;
    }

    //为节点追加节点
    public void append(Node node){
        ///this.next =node;
        //当前节点
        Node currentNode =this;//啥意思
        while(true){
            //取出下一个节点
            Node nextNode =currentNode.next;
            //如果下一个节点为null，当前节点已经是最后一个节点
            if(nextNode ==null){
                break;
            }
            //赋给当前节点
            currentNode =nextNode;
            //
        }
        //把需要追回的节点追加为找到的当前节点的下一个节点
        currentNode.next = node;
    }
    //插入一个节点作为当前节点的下一个节点
    public void after(Node node){
        //去除下一个节点，作为下下一个节点
        Node nextNext=next;
        //把新节点作为当前节点的下一个节点
        this.next = node;
        //把下下一个节点设置为新节点的下一个节点
        node.next = nextNext;

    }
    //显示所有节点信息
    public void show(){
        Node currentNode =this;
        while(true){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
            //如果是最后一个节点
            if(currentNode==null){
                break;
            }

        }
    }
    //删除下一个节点
    public void removeNext(){
        //先取出下下一个节点
        Node newNext=next.next;
        //把下下一个节点设置为当前节点的下一个节点
        this.next = newNext;

    }
    //获取下一个节点
    public Node next(){
        return this.next;
    }

    //获取节点中的数据
    public int getData(){
        return this.data;
    }



}