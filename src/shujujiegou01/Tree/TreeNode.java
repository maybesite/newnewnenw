package shujujiegou01.Tree;
//节点
public class TreeNode {
    //节点的权
    int value;
    //左儿子
    TreeNode lNode;
    //右儿子
    TreeNode rNode;
    public TreeNode(int value) {
        this.value = value;
    }
    //设置左儿子
    public void setlNode(TreeNode lNode){
        this.lNode=lNode;
    }
    //设置右儿子
    public void setrNode(TreeNode rNode){
        this.rNode=rNode;
    }
    //前序遍历
    public void frontShow() {
        System.out.println(this.value);
        if(this.lNode!=null){
            this.lNode.frontShow();
        }
        if(this.rNode!=null){
            this.rNode.frontShow();
        }

    }
    //中序遍历
    public void midShow(){
        if(this.lNode!=null){
            lNode.midShow();
        }
        System.out.println(value);
        if(rNode!=null){
            rNode.midShow();
        }
    }
    //后序遍历
    public void afterShow(){
        if(lNode!=null){
            lNode.afterShow();
        }
        if(rNode!=null){
            rNode.afterShow();
        }
        System.out.println(value);
    }
    //前序查找
    public TreeNode Frontsearch(int i){
        TreeNode target=null;
        if(value==i){
            target=this;
            return this;
        }else{
            if(lNode!=null){
                lNode.Frontsearch(i);
            }
            if(rNode!=null){
                rNode.Frontsearch(i);
            }
        }
        return target;
    }
}
