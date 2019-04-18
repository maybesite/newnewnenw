package edition3.demo05Generic;
//泛型方法 传递什么类型 泛型就是什么类型
public class Demo03GenericMethod {
    public <E> void method(E e){
        System.out.println(e);
    }
    public static <M> void method1(M e){
        System.out.println(e);
    }

    public static void main(String[] args) {
        Demo03GenericMethod s=new Demo03GenericMethod();
        s.method("aaa");
        s.method(1111);
        Demo03GenericMethod.method1("ewfwf");
        Demo03GenericMethod.method1(2222);

    }
}
