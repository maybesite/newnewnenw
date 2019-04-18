package shujujiegou01.Stack02;

public class StackTest {
    public static void main(String[] args) {
        Demo01 ma=new Demo01();
        ma.push(2);
        ma.push(3);
        ma.push(4);
        ma.push(5);
        int a=ma.pop();
        System.out.println(a);
        System.out.println(ma.peek());
        System.out.println(ma.isempty());
    }
}
