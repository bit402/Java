package test;

import java.io.FileNotFoundException;

public class Cat extends Pet{
    @Override
    public void run() throws Exception, RuntimeException, FileNotFoundException {
        super.run();
    }
}

package test;

public class Pet {
    public void run()throws Exception,RuntimeException{

    }
}
package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test01 {
//public static int m1(){
//    int i=100;
//    try{
//        return i;
//    }finally{
//        i++;
//    }
//}
    public static void main(String[] args) {
//        String str=null;
//        try{
//            System.out.println(str);
//            str.toString();
//        }finally{
//            System.out.println("finally语句块中的代码执行了。");
//        }
//        FileInputStream fis = null;
//        try {
//            fis=new FileInputStream("D:\\test.txt");
//            byte[] buf = new byte[1024];//一次读取1kb
//            int readCount = 0;
//            while((readCount=fis.read(buf))!=-1){
//                System.out.println(new String(buf,0,readCount));
//            }
//        }catch(FileNotFoundException fne){
//            fne.printStackTrace();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//        finally {
//            if (fis != null) {
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    //throw new RuntimeException(e);
//                    e.printStackTrace();
//                }
//            }
//        }
//        try{
//            System.out.println("try...");
//            return;
//        }finally{
//            System.out.println("finally...");
//        }
//        try{
//            System.out.println("try...");
//            System.exit(0);
//        }finally{
//            System.out.println("finally...");
//        }
//        int result=m1();
//        System.out.println(result);

    }
}