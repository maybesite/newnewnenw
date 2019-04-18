package edition3.demo02list;

import java.util.List;
import java.util.ArrayList;
//list 列表
public class Demo01List {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Java");
        list.add("python");
        list.add("c++");
        list.add(2222);

        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        list.remove(2);
        System.out.println(list.size());

        System.out.println(list.size());
    }
}
