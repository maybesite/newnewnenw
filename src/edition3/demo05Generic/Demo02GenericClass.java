package edition3.demo05Generic;
/*定义一个含有泛型的类，模拟ArrayList集合
* 泛型是一个未知的数据类型，当我们不确定是什么数据类型的时候，可以使用泛型类*/
public class Demo02GenericClass<E> {
    public E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public Demo02GenericClass(E name) {
        this.name = name;
    }

    public Demo02GenericClass() {
    }

    public static void main(String[] args) {
        //不写泛型 默认为object类型
        Demo02GenericClass gc=new Demo02GenericClass();
        gc.setName("可能是字符串");
        System.out.println(gc.getName());
        //使用Integer类型
        Demo02GenericClass<Integer> gc1=new Demo02GenericClass<>();
        gc1.setName(20);
        System.out.println(gc1.getName());
        //使用String类型
        Demo02GenericClass<String> gc2=new Demo02GenericClass<>();
        gc2.setName("sss");
        System.out.println(gc2.getName());
    }
}
