package shujujiegou01.Shuzu01;

public class Demo03MyArrayTest {
    public static void main(String[] args) {
        Demo03MyArray ma=new Demo03MyArray();
        int s=ma.getsize();
        System.out.println(s);
        ma.show();
        ma.add(2);
        ma.add(3);
        ma.add(4);
        ma.add(5);
        ma.add(6);
        ma.add(7);
        ma.show();

        ma.delete(3);
        ma.show();
        int t=ma.get(0);
        System.out.println(t);
        ma.insert(3,10);
        ma.show();
        ma.set(0,3);
        ma.show();
        System.out.println(ma.look(4));
    }
}
