package edition4.demo01;


import java.io.File;
import java.io.IOException;

public class FilreDemo01 {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\Fileio\\javaio");
//        System.out.println(file.exists());
        if(!file.exists())
            file.mkdir();   //mkdirs可以创建多级目录
        else
            file.delete();
        //判断是否是一个目录 不是目录或目录不存在 返回false
        System.out.println(file.isDirectory());
        //判读是否是一个文件
        System.out.println(file.isFile());

        File file2=new File("D:\\\\Fileio\\\\Java设计.txt");
        if(!file2.exists())
            file2.createNewFile();
        else
            file2.delete();
        //常用的File对象的API
        System.out.println(file2);//file.toString()的内容
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
    }
}
