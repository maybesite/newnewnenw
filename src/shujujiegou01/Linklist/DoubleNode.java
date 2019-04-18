package shujujiegou01.Linklist;
//双向循环链表
public class DoubleNode {
    //上一个节点
    DoubleNode pre=this;
    //下一个节点
    DoubleNode next=this;
    //节点数据
    int data;
    public DoubleNode(int data){
        this.data=data;
    }
    //添加节点
    public void after(DoubleNode node ){
        //原来的下一个节点
        DoubleNode nextNext=this.next;
        //把新节点作为当前节点的下一个节点
        this.next=node;
        //把当前节点做节点前的前一个节点
        node.pre=this;
        //让原来的下一个节点做新节点的下一个节点
        node.next=nextNext;
        //让原来的下一个节点的上一个节点为新节点
        nextNext.pre=node;
    }
    //下一个节点
    public DoubleNode next(){
        return this.next;
    }
    //上一个节点
    public DoubleNode pre(){
        return this.pre;
    }
    //获得数据
    public int getData(){
        return this.data;
    }
}
