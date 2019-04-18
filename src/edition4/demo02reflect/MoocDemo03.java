package edition4.demo02reflect;
//方法反射的操作
public class MoocDemo03 {
    public static void main(String[] args) {
        //要获取print(int ,int)方法
    }
}

class A{
    public void print(int a,int b){
        System.out.println(a+b);
    }
    public void print(String a,String b){
        System.out.println(a.toUpperCase()+" "+b.toLowerCase());
    }
}