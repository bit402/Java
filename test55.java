package test;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test01 {
    //    public static String digui(int n){
//        if(n==0){
//            return "0";
//        }
//        if(n==1){
//            return "2(0)";
//        }
//        if(n==2){
//            return "2";
//        }
//        int k=14;
//        while(1<<k>n){
//            k--;
//        }
//        int pow=1<<k;
//        int ret=n-pow;
//        StringBuilder sb=new StringBuilder();
//        if (k == 1) {
//            sb.append("2");
//        } else {
//            // 修复点1：递归分解幂次k，而不是数值pow
//            sb.append("2(").append(digui(k)).append(")");
//        }
//
//        // 剩余部分>0时拼接+和剩余部分
//        if (ret > 0) {
//            sb.append("+").append(digui(ret));
//        }
//        return sb.toString();
//    }
    public static void main(String[] args) {
//        File file1=new File("D:\\练习输入输出流\\a\\b\\c\\d");
//        System.out.println(file1.exists()?"存在":"不存在");
//        if(!file1.exists()){
//            try {
//                file1.createNewFile();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        if(!file1.exists()){
//            file1.mkdirs();
//        }
        //判断文件是否存在，存在则删除
//       File file2=new File("D:\\练习输入输出流\\a\\b\\c");
////        file2.delete();
//        File file=new File("lianxi");
//        System.out.println(file.exists()?"存在":"不存在");
//        if(!file.exists()){
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        //获取一个文件的绝对路径
//        String path=file.getAbsolutePath();
//        System.out.println("lianxi的绝对路径为：:"+path);
//        //获取一个文件的名字
//        System.out.println(file.getName());
//        System.out.println(file2.getName());
//        //获取一个文件的父路径，不关心文件的路径是否为真。
//        System.out.println(file2.getParent());
//        //判断路径是否为绝对路径
//        System.out.println(file2.isAbsolute()?"是绝对路径":"不是绝对路径");
//        System.out.println(file.isAbsolute()?"是绝对路径":"不是绝对路径");
//        //判断某个file是目录还是文件
//        System.out.println(file.isDirectory()?"是目录":"是文件");
//        //这里输出是目录是因为文件不存在返回了false进而走了三元表达式的fasle分支
//        System.out.println(file2.isFile()?"是文件":"是目录");
//        File file=new File("D:\\练习输入输出流\\lll.txt");
//        System.out.println(file.exists()?"存":"不");
//        System.out.println(file.isHidden()?"隐藏文件":"非隐藏文件");
//        long l=file.lastModified();
//        Date date=new Date(l);
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
//        String str=sdf.format(date);
//        System.out.println("文件最后修改的时间是："+str);
//        //获取文件的总字节数
//        System.out.println(file.getName()+"文件的总字节数为:"+file.length());
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(digui(n));
//        sc.close();
//        File file=new File("D:\\练习输入输出流\\lll.txt");
//        //重命名(重命名的同时带着剪切效果)
//        File file2=new File("lll.txt");
//        file.renameTo(file2);
//        File file=new File("D:\\github专用仓库\\Java");
//        //获取所有的子文件包括子目录
//        File[] files=file.listFiles();
//        for(File f:files){
//            System.out.println(f.getName());
//        }
//        File file =new File("D:\\github专用仓库\\Java");
//        File[] files=file.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                if(name.endsWith(".md")){
//                    return true;
//                }
//                return false;
//            }
//        });
//        for(File f:files){
//            System.out.println(f.getName());
//        }
        String path=null;
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\练习输入输出流"))) {
            File file =new File("D:\\c代码");
            File[] files=file.listFiles();
            for(File f:files){
                if(f.isFile()){
                    path = f.getAbsolutePath();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}//D:\c代码
//D:\练习输入输出流