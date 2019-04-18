package edition4.demo02reflect;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //第一种方式

         Class c1=Class.forName("edition4.demo02reflect.Person");
        //第二张方式
        //每个类里面都有class属性
        Class c2 = Person.class;
        //第三种方式
        //通过调用对象上的getClass方法获取Class对象
        Person p=new Person();
        Class c3=p.getClass();
        //使用反射创建类
        Object c=c1.newInstance();
        System.out.println(c);

    }
}
