package shujujiegou01.Linklist;

public class LoopNode {
    //节点内容
    int data;
    //下一个节点
    LoopNode next=this;

    public LoopNode(int data){
        this.data=data;
    }
    public int getData(){
        return this.data;
    }
    public void remove(){
        //取出下下节点
        LoopNode newNext=this.next.next;
        //把下一个节点设置为当前节点的下一个节点
        this.next=this.next.next;
    }

    //插入一个节点 作为当前节点的下一个节点
    public void after(LoopNode node){
        //取出下一个节点 作为下下节点
        LoopNode nextNext=this.next;
        this.next=node;
        node.next=nextNext;
    }
    //获得下一个节点
    public LoopNode next(){
        return this.next;
    }

}
