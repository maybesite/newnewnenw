package edition4.demo01;

import edition.demo12Multi.demo04Usb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputstreamDemo03 {


    public static void main(String[] args)  {
            FileInputStream fis=null;
        try {
             fis=new FileInputStream("D:\\crossfire");
            try {
                System.out.println(fis.read());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
