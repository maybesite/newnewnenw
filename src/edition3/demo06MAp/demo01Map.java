package edition3.demo06MAp;

import java.util.*;

public class demo01Map {
    public static void main(String[] args) {
        Map<String,String> hashmap=new HashMap<>();
        hashmap.put("key1","value1");
        hashmap.put("key2","value2");
        hashmap.put("key3","value3");
        hashmap.put("key4","value4");
        hashmap.put("key5","value5");
        //删除map的元素 通过key的值
        hashmap.remove("key1");
        //通过get(key)方法 得到map中的value
        hashmap.get("key2");
        //通过添加put方法 修改map元素的值
        hashmap.put("key2","修改key2的value");
        //遍历的最简单方式
        for(String key:hashmap.keySet()){
            System.out.println(hashmap.get(key));
        }
        System.out.println(hashmap.size());
        System.out.println(hashmap);
        /*//通过map.values()方法得到map中的value集合
        Collection<Object> value= Collections.singleton(hashmap.values());
        for(Object obj:value){
            System.out.println(obj);
        }
        //通过map.keySet()得到Map的key的集合 然后通过map.get(key)得到value
        Set<String> set=hashmap.keySet();
        for(String str:set){
            Object obj=hashmap.get(str);
            System.out.println(str+"="+obj);
        }*/

    }
}
