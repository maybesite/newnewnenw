package shujujiegou01.Linklist;

public class NodeTest {
    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);

        n1.append(n2).append(n3).append(new Node(4));
        Node n4=new Node(5);
        n1.after(n4);


        n1.show();


//        n1.append(n3);
//        System.out.println(n1.getData());
//        System.out.println(n1.next().getData());
//        System.out.println(n1.next().getData());
//        System.out.println(n1.next().next().getData());

    }
}
