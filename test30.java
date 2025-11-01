package test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class test01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        byte[] bs="动力节点".getBytes("GBK");
//        //String s1=new String(bs,"UTF-8");
//        String s1=new String(bs,"GBK");
//        System.out.println(s1);
//        byte[] bs="动力节点".getBytes(Charset.defaultCharset());
//        String s1=new String(bs,Charset.defaultCharset());
//        System.out.println(s1);
//        String s1=new String("动力节点");
//        System.out.println(s1);
        System.out.println("hello");
    }
}
package test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StringMethodTest {
    @Test
    public void testChartAt(){
        char c="动力节点".charAt(2);
        System.out.println(c);
    }
    @Test
    public void testLength(){
        System.out.println("动力节点".length());
    }
    @Test
    public void testIsEmpty(){
        String s="";
        System.out.println(s.isEmpty());
        s="hello";
        System.out.println(s.isEmpty());
    }
    @Test
    public void testEquals(){
        String s1="abc";
        String s2=new String("abc");
        System.out.println(s1.equals(s2));
        String s3="Java";
        String s4="java";
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));
    }
    @Test
    public void testContains(){
        String s1="helloworld.java";
        System.out.println(s1.contains(".java"));
        System.out.println(s1.contains("txt"));
    }
    @Test
    public void testStartsWith(){
        String s1="http://www.baidu.com";
        System.out.println(s1.startsWith("http:"));
        System.out.println(s1.startsWith("www.baidu.com"));
    }
    @Test
    public void testEndsWith(){
        String s1="http://www.baidu.com";
        System.out.println(s1.endsWith(".com"));
        System.out.println(s1.endsWith(".cn"));
    }
    @Test
    public void testCompareTo(){
        System.out.println("a".compareTo("b"));
        System.out.println("a".compareTo("c"));
        System.out.println("b".compareTo("a"));
        System.out.println("a".compareTo("a"));
        System.out.println("A".compareTo("a"));
        System.out.println("A".compareToIgnoreCase("a"));
    }
    @Test
    public void testIndexOf(){
        System.out.println("abcdefjavapythoncghigk".indexOf("java"));
        System.out.println("abcdefjavapythoncghigkjava".indexOf("java",7));
    }
    @Test
    public void testLastIndexOf(){
        System.out.println("abcdefjavapythoncghigkjava".lastIndexOf("java"));
        System.out.println("abcdefjavapythoncghigkjava".lastIndexOf("java",21));
    }
    @Test
    public void testToCharArray(){
        char[] chars="动力节点".toCharArray();
        for(char c:chars){
            System.out.println(c);
        }
    }
    @Test
    public void testLowerUpperCase(){
        System.out.println("AbCdEf".toUpperCase());
        System.out.println("AbCdEf".toLowerCase());
    }
    @Test
    public void testConcat(){
        String s1="test";
        String s2=null;
        String s3=s1+s2;
        System.out.println(s3);
        String s4=s1.concat(s2);
        System.out.println(s4);
    }
    @Test
    public void testSubstring(){
        System.out.println("http://www.baidu.com".substring(7));
        System.out.println("http://www.baidu.com".substring("http://".length()));
        System.out.println("http://www.baidu.com".substring(11,16));
    }
    @Test
    public void testTrim(){
        String s1="            ab  cd            ";
        System.out.println(s1.trim());
        String s2="\u3000\u3000\u3000\u3000\u3000ab cd\u3000\u3000\u3000\u3000\u3000";
        System.out.println(s2.trim());
        String s3=s2.strip();
        System.out.println(s3);
        String s4=s2.stripLeading();
        System.out.println(s4);
        String s5=s2.stripTrailing();
        System.out.println(s5);
    }
    @Test
    public void testToString(){
        String s1="abcd";
        System.out.println(s1);
    }
    @Test
    public void testIntern(){
        byte[] bytes={97,98,99,100};
        String s1=new String(bytes);
        System.out.println(s1);
        String s2=s1.intern();
        System.out.println(s2);
        System.out.println(s1==s2);
        String s3="abcd";
        System.out.println(s3);
        System.out.println(s2==s3);
        System.out.println(s1==s3);
    }
    @Test
    public void testJoin(){
        String str=String.join(",","java","python","c");
        System.out.println(str);
        String year="2025";
        String month="11";
        String day="1";
        System.out.println(String.join(",",year,month,day));
        List list=new ArrayList();
        list.add("java");
        list.add("python");
        list.add("c");
        System.out.println(String.join(",",list));
    }
    @Test
    public void testValueOf(){
        String s1=String.valueOf(1000);
        System.out.println(s1);
        System.out.println(s1 instanceof String);
        int a=100;
        String s2=a+"";
        System.out.println(s2);
        System.out.println(s2 instanceof String);
    }
}
