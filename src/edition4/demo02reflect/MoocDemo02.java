package edition4.demo02reflect;
//基本数据类型 void关键字都有类类型
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//获取方法的信息
public class MoocDemo02 {
    public static void printClassMessage(Object obj) {
        //得到obj对象所属类的类类型
        Class c1 = obj.getClass();
        //c1是Class的对象
        //Class类里面有.getName的方法
        System.out.println(c1.getName());
        //一个成员方法 就是Method类的对象
        Method[] ms = c1.getMethods();
        for (int i = 0; i < ms.length; i++) {
            //返回Class对象
            Class returnType = ms[i].getReturnType();
            System.out.print(returnType.getName() + " ");

            //得到方法名称
            System.out.print(ms[i].getName() + "(");
            //获取参数类型 得到的是参数列表的类型的类de类型(返回Class数组对象)
            Class[] paramType = ms[i].getParameterTypes();
            for (Class class1 : paramType) {
                System.out.print(class1.getName() + ",");
            }
            System.out.println(")");
        }
    }

    //获取成员变量信息
        /*成员变量也是对象
         * 是java.lang.reflect.Field
         * Field类封装了关于成员变量的操作
         * getFields()方法获取的是所有的public的成员变量的信息
         * getDeclareFields获取的是该类自己声明的成员变量的信息*/
            //Field[] fs= c1.getFields();
    public static  void printbianliangMessage(Object obj){
        Class c1 = obj.getClass();
        Field[] fs= c1.getDeclaredFields();
        for(Field field:fs){
            //返回Class对象
            Class fileType=field.getType();
            //得到成员变量类型名称
            String typeName=fileType.getName();
            //得到成员变量的名称
            String fieldName=field.getName();
            System.out.println(typeName+"... "+fieldName);
        }

    }
    //获取构造方法信息
     public static void printfgouzaoMessage(Object obj){
            Class c=obj.getClass();
            /*构造函数也是对象
            * java.lang.Constructor中封装了构造函数信息*/
            Constructor[] cs=c.getDeclaredConstructors();
            //构造方法没有返回值类型
            for(Constructor constructor:cs){
                System.out.print(constructor.getName()+"(");
                //获取构造器的参数列表。。得到Class对象
                Class[] paramType=constructor.getParameterTypes();
                for(Class class1:paramType){
                    System.out.print(class1.getName()+",");
                }
                System.out.println(")");
            }

        }
}








class test{
    public static void main(String[] args) {

        String s="hello";
//        MoocDemo02.printClassMessage(s);
//        Integer n=1;
//        MoocDemo02.printClassMessage(n);
        MoocDemo02.printfgouzaoMessage(s);

    }
}
