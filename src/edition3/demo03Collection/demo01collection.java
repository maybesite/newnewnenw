package edition3.demo03Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*Collection顶层接口常用方法  顶层有 底层也有
* public boolean add(E e):把给定的对象添加到当前集合
* public void clear() 清空集合中所有的元素
* public boolean remove(E e):把给定对象在当前集合中删除
* public boolean contains(E e):判断当前对象是否包含在集合中
* public boolean isEmpty() 判断当前集合是否为空
* public int size() 返回集合元素的个数
* public Object[] toArray():把集合中的元素 存储到数组中*/
public class demo01collection {
    public static void main(String[] args) {
        //创建集合对象 可以是用多态
//        Collection<String> list=new ArrayList<>();
        Collection<String> list=new HashSet<>();
        System.out.println(list);  //重写了toString方法 []
        list.add("hello");          //不再是地址 而是内容
        list.add("world");          //object根类有toString方法 打印地址
        System.out.println(list);
        Object[] arr=  list.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }



    }
}
