package shujujiegou01.Tree;

public class TestBinaryTree {
    public static void main(String[] args) {
        //创建一颗树
        BinaryTree binTree=new BinaryTree();
        //创建一个根节点
        TreeNode root=new TreeNode(1);
        //把根节点赋给树
        binTree.setRoot(root);
        //创建2个节点
        TreeNode leftnode=new TreeNode(2);
        TreeNode rightnode=new TreeNode(3);
        //把新创建的节点设置为根节点的子节点
        root.setlNode(leftnode);
        root.setrNode(rightnode);
        //给左节点第二层创建2个节点
        leftnode.setlNode(new TreeNode(4));
        leftnode.setrNode(new TreeNode(5));
        //给右节点第二层创建两个子节点
        rightnode.setlNode(new TreeNode(6));
        rightnode.setrNode(new TreeNode(7));
        //前序遍历
        binTree.frontShow();
        System.out.println("=======");
        binTree.midShow();
        System.out.println("=======");
        binTree.afterShow();
        System.out.println("=======");
        System.out.println(root.Frontsearch(66));

    }
}
