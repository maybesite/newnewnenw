package edition3.demo06MAp;

import java.util.HashSet;
/*HashSet存储自定义类型元素
* 要求：同年龄同名字的人 只能存储一次
* 那么必须重写hasCode equals方法*/
public class Demo02 {
    public static void main(String[] args) {
        HashSet<Person> person=new HashSet<>();
        Person one=new Person("aaa",10);
        Person two=new Person("aaa",10);
        Person three=new Person("bbb",11);
        person.add(one);
        person.add(two);
        person.add(three);
        System.out.println(person);
    }
}
