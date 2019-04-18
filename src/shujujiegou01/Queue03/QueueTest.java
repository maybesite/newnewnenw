package shujujiegou01.Queue03;

public class QueueTest {
    public static void main(String[] args) {
        Demo01 md=new Demo01();
        md.add(1);
        md.add(3);
        md.add(5);
        md.add(6);
        System.out.println(md.pull());
        System.out.println(md.pull());
    }
}
