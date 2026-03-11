package test;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;

public class test01 {

    public static void main(String[] args) {
//        try(FileReader fr=new FileReader("D:\\lianxi.txt");
//            FileWriter fw=new FileWriter("D:\\练习输入输出流\\lll.txt")) {
//            char[] chars=new char[512];
//            int length=0;
//            while((length=fr.read(chars))!=-1){
//                fw.write(chars,0,length);
//            }
//            fw.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try(FileInputStream fis=new FileInputStream("src/lianxi")){
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        //String path=Thread.currentThread().getContextClassLoader().getResource("自动从类路径当中加载资源").getPath();
//        URI uri=null;
//        String path=null;
//        try {
//             uri=Thread.currentThread().getContextClassLoader().getResource("lianxi").toURI();
//             path=uri.getPath();
//            System.out.println(path);
//        } catch (URISyntaxException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(path);
//        try(FileInputStream fis=new FileInputStream(path)){
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream("lianxi"))) {
//            byte[] b=new byte[bis.available()];
//            int len=0;
//            while((len=bis.read(b))!=-1){
//                System.out.println(new String(b,0,len));
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try(BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("lianxi"))) {
//            char[] chars=new char[1024];
//            bos.write("动力节点".getBytes());
//            bos.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        long begin=System.currentTimeMillis();
//        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\百度网盘下载地址\\03-最新Java零基础600集全套资料+视频+面试题等\\视频\\001-课程概述.mp4"));
//             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\练习输入输出流\\lianxi.mp4"))) {
//            byte[] bytes = new byte[1024];
//            int len;
//            while((len=bis.read(bytes))!=-1){
//                bos.write(bytes,0,len);
//            }
//            bos.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        long end=System.currentTimeMillis();
//        System.out.println("总耗时："+(end-begin)+"ms");
        long begin = System.currentTimeMillis();
        try (FileInputStream fis = new FileInputStream("D:\\百度网盘下载地址\\03-最新Java零基础600集全套资料+视频+面试题等\\视频\\001-课程概述.mp4");
             FileOutputStream fos = new FileOutputStream("D:\\练习输入输出流\\lianxi.mp4")) {
            byte[] bytes=new byte[2048];
            int len;
            while((len=fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
            fos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long end=System.currentTimeMillis();
        System.out.println("总耗时"+(end-begin)+"ms");
    }
}
//001-课程概述.mp4
//D:\百度网盘下载地址\03-最新Java零基础600集全套资料+视频+面试题等\视频
//D:\练习输入输出流
//215
//709    //469