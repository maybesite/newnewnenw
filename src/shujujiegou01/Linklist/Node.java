package shujujiegou01.Linklist;

public class Node {
    //节点内容
    int data;
    //下一个节点
    Node next;

    public Node(int data){
         this.data=data;
    }

    //末尾添加下一个节点
    public Node append (Node node){
        //当前节点
        Node currentNode=this;
        //循环向后
        while(true){
            //如果下一个节点为null 当前节点已经是最后一个节点
            if(currentNode.next==null){
                break;
            }
            //复制给当前节点
            currentNode=currentNode.next;
        }
        //把需要追回的节点加到找到的当前节点的下一个节点
        currentNode.next=node;
//        this.next=node;
        return currentNode.next;
    }

    //获取下一个节点
    public Node next(){
        return this.next;
    }
    //获取当前节点的数据
    public int getData(){
        return this.data;
    }
    //删除下一个节点
    public void remove(){
        //取出下下节点
        Node newNext=this.next.next;
        //把下一个节点设置为当前节点的下一个节点
        this.next=this.next.next;
    }
    //显示所有节点信息
    public void show(){
        Node currentnode=this;
        while(currentnode!=null){
            System.out.println(currentnode.data);
            currentnode=currentnode.next;
        }
    }
    //插入一个节点 作为当前节点的下一个节点
    public void after(Node node){
        //取出下一个节点 作为下下节点
        Node nextNext=this.next;
        this.next=node;
        node.next=nextNext;
    }

}
