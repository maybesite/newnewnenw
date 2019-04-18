package edition4.demo01;

import java.io.File;
import java.io.IOException;

//列出File的一些常用操作比如过滤 遍历
public class FileDemo02 {
    //列出指定目录下(包括其子目录)的所有文件
    public static void listDirectory(File dir) throws IOException {
//        if(!dir.exists()){
//            throw new IllegalArgumentException("目录"+dir+"不存在");
//        }
//        if(!dir.isDirectory()){
//            throw new IllegalArgumentException(dir+"不是目录");
//        }
//        String [] a=dir.list();
//        for(String s:a){
//            System.out.println(dir+s);
//        }
        //如果要遍历子目录下的内容 需要构造File对象做递归操作，File提供了直接返回File对象的API
        File[] files=dir.listFiles();
        if(files!=null&&files.length>0){
            for(File file:files){
                if(file.isDirectory()){
                    //递归
                    listDirectory(file);
                }else{
                    System.out.println(file);
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            listDirectory(new File("D:\\"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
