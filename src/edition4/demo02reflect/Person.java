package edition4.demo02reflect;

public class Person implements Myinterface {
    private  int id;
    private  String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(int id) {
        this.id = id;
    }

    public Person() {
        System.out.println("构造方法运行");
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public static void staticmethod(){
        System.out.println("静态方法");
    }
    @Override
    public void interfaceMethod() {
        System.out.println("接口方法");
    }
}
