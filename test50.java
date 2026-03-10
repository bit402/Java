package test;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class test01 {
    //    static int N ;
//    static int K ;
//    static int[][] arr;
//    public static boolean check(int mid){
//        int sum=0;
//        for(int i=0;i<N;i++){
//            sum+=(arr[i][0]/mid)*(arr[i][1]/mid);
//        }
//        if(sum>=K){
//            return true;
//        }
//        return false;
//    }
//    static int M;
//    static int K;
//    static int[] arr;
//    public static boolean check(int mid){
//        long sum = 0L;
//        for(int i=0;i<M;i++){
//            sum+= (long) (arr[i] / mid);
//        }
//        if(sum>=K){
//            return true;
//        }
//        return false;
//    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        N = sc.nextInt();
//        K = sc.nextInt();
//        arr = new int[N][2];
//        for (int i = 0; i < N; i++) {
//            arr[i][0]=sc.nextInt();
//            arr[i][1]=sc.nextInt();
//        }
//        int l=1;
//        int r=10000;
//        int ans=0;
//        while(l<=r){
//            int mid=(l+r)/2;
//            if(check(mid)){
//                ans=mid;
//                l=mid+1;
//            }
//            else {
//                r=mid-1;
//            }
//        }
//        sc.close();
//        System.out.println(ans);
//        Scanner sc = new Scanner(System.in);
//        M = sc.nextInt();
//        K = sc.nextInt();
//        arr = new int[M];
//        for (int i = 0; i < M; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int ans = 0;
//        int l=1;
//        int r=100000;
//        while(l<=r){
//            int mid = (l+r)/2;
//            if(check(mid)){
//                ans=mid;
//                l=mid+1;
//            }
//            else{
//                r=mid-1;
//            }
//        }
//        sc.close();
//        System.out.println(ans*ans);
//        InputStream in = null;
//        try {
//             in=new FileInputStream("D:\\lianxi.txt");
//             int red=in.read();
//            System.out.println("第一次读到的字节："+red);
//            red=in.read();
//            System.out.println("2:"+red);
//            red=in.read();
//            System.out.println("3:"+red);
//            red=in.read();
//            System.out.println("4:"+red);
//            red=in.read();
//            System.out.println("5:"+red);
//            red=in.read();
//            System.out.println("6:"+red);
//            red=in.read();
//            System.out.println("7:"+red);
//            int ans=in.read();
//            while(ans!=-1){
//                System.out.println(ans);
//                ans=in.read();
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }finally {
//            if(in!=null){
//                try {
//                    in.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//        InputStream in=null;
//        try {
//            in=new FileInputStream("D:\\lianxi.txt");
//            byte[] b=new byte[4];
//            int num=in.read(b);
//            System.out.println("第一次读到："+num);
//            String s1=new String(b,0,4);
//            System.out.println(s1);
//            num=in.read(b);
//            System.out.println("2:"+num);
//            String s2=new String(b,0,2);
//            System.out.println(s2);
//            num=in.read(b);
//            System.out.println("3:"+num);
//            int length=in.read(b);
//            while (length>0){
//                System.out.println(new String(b,0,length));
//                length=in.read(b);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally{
//            if(in!=null){
//                try {
//                    in.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        InputStream fis = null;
//        try {
//            fis=new FileInputStream("D:\\lianxi.txt");
//            byte[] bytes = new byte[10];
//            int length=fis.read(bytes,2,5);
//            System.out.println(length);
//            for(byte b:bytes){
//                System.out.println(b);
//            }
//            int readByte=fis.read();
//            System.out.println(readByte);
//            fis.skip(2);
//            readByte=fis.read();
//            System.out.println(readByte);
//            System.out.println(fis.available());
//            byte[] b=new byte[fis.available()];
//            int length=fis.read(b);
//            System.out.println(new String(b,0,length));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally{
//            if(fis!=null){
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//        OutputStream fos=null;
//        try {
//            fos=new FileOutputStream("D:\\lianxi.txt",false);
//            fos.write(97);
//            fos.write(98);
//            fos.write(99);
//            fos.write(97);
//            byte[] b={97,98,99,100};
//            fos.write(b);
//            fos.write(b,0,2);
//            byte[] bytes="动力节点，一家只教授Java的机构！".getBytes();
//            fos.write(bytes);
//            fos.flush();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if(fos!=null){
//                try {
//                    fos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        InputStream fis=null;
//        OutputStream fos=null;
//        try {
//            fis=new FileInputStream("D:\\百度网盘下载地址\\03-最新Java零基础600集全套资料+视频+面试题等\\视频\\001-课程概述.mp4");
//            fos=new FileOutputStream("D:\\练习输入输出流\\课程概述.mp4");
//            byte[] b=new byte[1024];
//            int len;
//            while((len=fis.read(b))!=-1){
//                fos.write(b,0,len);
//            }
//            fos.flush();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally{
//            if(fis!=null){
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            if(fos!=null){
//                try {
//                    fos.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//        InputStream fis=null;
//        OutputStream fos=null;
//        try {
//            fis=new FileInputStream("D:\\lianxi.txt");
//            fos=new FileOutputStream("D:\\练习输入输出流\\lll.txt");
//            byte[] b=new byte[1024];
//            int len;
//            while((len=fis.read(b))!=-1){
//                fos.write(b,0,len);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }finally{
//            if(fis!=null){
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if(fos!=null){
//                try {
//                    fos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        FileInputStream fis2=null;
//        try(FileInputStream fis=new FileInputStream("D:\\lianxi.txt");
//        FileOutputStream fos=new FileOutputStream("D:\\练习输入输出流\\lll.txt");){
//            fis2=fis;
//            byte[] b=new byte[1024];
//            int len;
//            while((len=fis.read(b))!=-1){
//                fos.write(b,0,len);
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            System.out.println(fis2.read());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try(FileReader fr=new FileReader("D:\\lianxi.txt")){
//            char[] chars=new char[3];
//            int length=0;
//            while((length=fr.read(chars))!=-1){
//                System.out.print(new String(chars,0,length));
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try(FileWriter fw=new FileWriter("D:\\lianxi.txt",false);) {
//            fw.write("hello,world");
//            fw.write("\n");
//            fw.write("你好呀".toCharArray());
//            fw.write("abcdefg".toCharArray(),2,2);
//            fw.write("hello,world,hello,world",2,2);
//            fw.append("\n");
//            fw.append("abcdefg");
//            fw.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try (FileReader fr = new FileReader("D:\\\\lianxi.txt");
             FileWriter fw = new FileWriter("D:\\练习输入输出流\\lll.txt")) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}