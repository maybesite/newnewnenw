package edition4.demo02reflect;
/*面对对象编程 一切皆对象  静态的成员属于类 普通的数据类型是包装类
* 类也是对象
* 类是java.lang.Class类的对象*/
public class MoocDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //Foo的实例对象
        Foo foo1=new Foo();

        //Foo这个类 本身也是java.lang.Class的实例对象
        //任何一个类都是Class的实例对象，这个实例对象有3种表示方式
        //任何一个类都有一个隐含的静态成员变量
        Class c1=Foo.class;
        Class c2=foo1.getClass();
        //官网 c1 c2表示了Foo类的类类型  c1 c2是Class的对象
        System.out.println(c1==c2);
        System.out.println(c2);
        Class c3=Class.forName("edition4.demo02reflect.Foo");
        System.out.println(c3);
        //可以通过类的类类型创建该类的对象实例
        Foo foo=(Foo)c1.newInstance();//需要无参数的构造器
        foo.print();


    }
}


class Foo{
    void print(){
        System.out.println("方法");
    }
}
