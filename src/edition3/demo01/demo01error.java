package edition3.demo01;

import java.util.Scanner;

public class demo01error {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("计算2个数的商");
            int num=s.nextInt();
            int num1=s.nextInt();
            System.out.println(num/num1);

        }catch(Exception e){
            //终止finally的执行
            System.exit(1);
//            e.printStackTrace();
            System.out.println(e);
        }finally {
            //慎重使用return语句
            System.out.println("结束");
        }
    }

}
