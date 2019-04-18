package edition3.demo01;
/*StringBuilder与String的不同：StringBuilder具有可变性*/
public class demo04StringBuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("你好");
        str.append("iooc ");
        System.out.println(str);
        System.out.println(str.append("im").append("ooc"));
        System.out.println(str.delete(4,6).insert(4,"fff"));
        System.out.println(str.replace(4,6,"fff"));
        System.out.println(str.substring(0,2));
        System.out.println("======");
        StringBuilder s=new StringBuilder("ddddd");
        //将StringBuilder对象转换成String对象
        System.out.println(s.toString());
    }
}
