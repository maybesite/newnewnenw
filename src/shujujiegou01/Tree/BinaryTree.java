package shujujiegou01.Tree;
//二叉树
public class BinaryTree {
    TreeNode root;
    //设置根节点
    public void setRoot(TreeNode root){
        this.root=root;
    }
    //获取根节点
    public TreeNode getRoot(){
        return root;
    }
    //前序遍历
    public void frontShow(){
        root.frontShow();
    }
    //中序遍历
    public void midShow(){
        root.midShow();
    }
    //后续遍历
    public void afterShow(){
        root.afterShow();
    }
}
