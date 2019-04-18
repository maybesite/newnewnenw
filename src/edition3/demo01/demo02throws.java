package edition3.demo01;
/*当子类重写父类抛出异常的方法时，声明的异常必须是父类方法所声明异常的同类或子类*/
import java.util.InputMismatchException;
import java.util.Scanner;
/*throws声明可能的异常 并通过调用try catch解决
* 1.throws后面接多个异常类型，中间用逗号分隔
* 2.throws后面接Exception*/
public class demo02throws {
    public static void main(String[] args)  {
        try{ int x=test();
            System.out.println(x);
        }catch(ArithmeticException e){
            System.out.println("分母为0");
        }
        catch(Exception e){
            System.out.println("抛出异常");
        }finally {
            System.out.println("结束");
        }

    }


//    public static int test() throws Exception{
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        return a/b;
//    }
            public static int test() throws ArithmeticException, InputMismatchException {
           Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            return a/b;
   }
}
