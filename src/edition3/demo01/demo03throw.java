package edition3.demo01;

import java.util.Scanner;
/*throw抛出异常对象的处理方案
* 1.通过try catch包含throw语句 自己抛自己处理
* 2.通过throws在 方法声明处抛出异常 谁调用谁处理
* 调用者可以自己处理 也可以继续往上抛 可以抛出父类或本身的异常*/
public class demo03throw {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int age=sc.nextInt();
//        if(age<18||age>80){
//            try {
//                throw new Exception("禁止");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        else{
//            System.out.println("666");
//        }
        try { test();

        }catch (Exception e){
            System.out.println("错误");
        }
    }




    public static void test() throws Exception {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        if(age<18||age>80){

            throw new Exception("禁止");

        }
        else{
            System.out.println("666");

        }

    }
}