package test;

public class test01 {
    public static void main(String[] args){
//        String s1="hello";
//        String s2="hello";
//        System.out.println(s1 == s2);
//        String s3="test";
//        String s4=new String("test");
//        System.out.println(s3 == s4);
//        System.out.println(s4);
//        System.out.println(s3.equals(s4));
//        String s1 = "abc";
//        String s2="def";
//        String s3=s1+s2;
//        String s4="abcdef";
//        System.out.println(s3);
//        System.out.println(s4);
//        System.out.println(s3==s4);
//        System.out.println(s3.equals(s4));
//        String s1="java"+"test";
//        String s2="javatest";
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1);
//        System.out.println(s2);
//        String s1="abc";
//        String s2="def";
//        String s3=s1+s2;
//        String s4="abcdef";
//        System.out.println(s3==s4);
//        String s5=s3.intern();
//        System.out.println(s5==s4);
//        String s1="m";
//        String s2=s1+"e";
//        String str=s2.intern();
//        System.out.println(str);
//        System.out.println(s2==str);
//        char[] chars=new char[]{'动','力','节','点'};
//        String str=new String(chars);
//        System.out.println(str);
//        String s1=new String(chars,0,2);
//        System.out.println(s1);
        byte[] bytes={97,98,99};
        System.out.println(new String(bytes));
        String s4=new String(bytes,0,2);
        System.out.println(s4);
    }
}