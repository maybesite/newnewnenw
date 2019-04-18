package edition3.demo04Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*Iterator接口：迭代器(对集合进行遍历)
* 有个常用方法
* public boolean hasNext() 如果仍有元素可以迭代 则返回true
*     判断集合中还有没有下一个元素 有就返回true 没有就返回false
* public E next() 返回迭代的下一个元素。
*     取出集合中下一个元素
* 迭代器Interator是一个接口 无法直接使用 需要接口实现类
*  Collection接口有一个方法 叫iterator() 这个方法返回的就是迭代器的实现类对象
*  Iterator<E> iterator() 返回在此collection的元素上进行迭代的迭代器
*  迭代器使用步骤：
*  1.使用集合中的方法iterator()获取迭代器的实现类对象 使用Iterator接口接收(多态)
*  Interator<E>接口也是有泛型的 迭代器的泛型跟着集合走 集合什么泛型 迭代器什么泛型
*  2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
*  3.使用Iterator接口中的方法next取出集合中的下一个元素*/
public class Demo01Iterator {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("hello");
        list.add("bbb");
        list.add("ddd");
        list.add("eee");
        list.add("rrr");
        Iterator<String> it=list.iterator();
//        boolean x=it.hasNext();
//        System.out.println(x);
//        String s=it.next();
//        System.out.println(s);
        /* 使用迭代器遍历
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
        //使用for each循环遍历 for each底层也是迭代器
        for(String s:list){
            System.out.println(s);
        }


    }

}
