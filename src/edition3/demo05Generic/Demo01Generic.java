package edition3.demo05Generic;

import java.util.ArrayList;
import java.util.Iterator;

//泛型 集合存储统一的数据类型
public class  Demo01Generic {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("hello");
        list.add(111);
        //迭代器
        Iterator one=list.iterator();
//        类型转换错误
//        while(one.hasNext()){
//            String s= (String) one.next();
//            System.out.println(s);
//        }
        ArrayList<String> list1=new ArrayList<>();
        list1.add("hello");
        list1.add("world");
        Iterator<String> two=list1.iterator();
        while(two.hasNext()){
            System.out.println(two.next());
        }
    }
}
