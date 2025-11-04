package test;

import org.junit.jupiter.api.Test;

public class StringBuilderTest {
    @Test
    public void testAppend(){
        StringBuilder sb=new StringBuilder();
        sb.append("abc");
        sb.append(8);
        sb.append('a');
        sb.append(8.8);
        sb.append(true);
        sb.append(new Object());
        System.out.println(sb.toString());
    }
    @Test
    public void testDelete(){
        StringBuilder sb=new StringBuilder();
        sb.append("abc");
        sb.append(8);
        sb.append('a');
        sb.append(8.8);
        sb.append(true);
        sb.append(new Object());
        System.out.println(sb.toString());
        sb.delete(1,3);
        System.out.println(sb.toString());
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
    @Test
    public void testInsert(){
        StringBuilder sb=new StringBuilder();
        sb.append("abc");
        sb.append(8);
        System.out.println(sb);
        sb.insert(2,"hello,world");
        System.out.println(sb.toString());
    }
    @Test
    public void testReplace(){
        StringBuilder sb=new StringBuilder();
        sb.append("0123456789");
        System.out.println(sb);
        sb.replace(1,3,"");
        System.out.println(sb.toString());
    }
    @Test
    public void testReverse(){
        StringBuilder sb=new StringBuilder();
        sb.append("0123456789");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb.toString());
    }
    @Test
    public void testSetCharAt(){
        StringBuilder sb=new StringBuilder();
        sb.append(10);
        System.out.println(sb);
        sb.setCharAt(1,'b');
        System.out.println(sb.toString());
    }
    @Test
    public void testSetLength(){
        StringBuilder sb=new StringBuilder();
        sb.append("abc11111111111111111111111111111111111");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.setLength(3);
        System.out.println(sb.toString());
        System.out.println(sb.length());
        StringBuilder sb2=new StringBuilder();
        sb2.append("012345");
        System.out.println(sb2);
        sb2.setLength(10);
        System.out.println(sb2.toString());
    }
}
package test;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public MyInteger() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyInteger{" +
                "value=" + value +
                '}';
    }
}
package test;

import java.sql.SQLOutput;

public class test01 {
//    public static void m(Object object){
//        System.out.println(object.toString());
//    }
    public static void main(String[] args) {
//        String a = "abbbbbbbbbc";
//        String b=a.replace("b", "h");
//        System.out.println(a);
//        System.out.println(b);
//        long startTime=System.currentTimeMillis();
//        String s="";
//        for(int i=0;i<100000;i++){
//            s+=i;
//        }
//        long endTime=System.currentTimeMillis();
//        System.out.println("总耗时"+(endTime-startTime)+"毫秒");//2344
//        long startTime=System.currentTimeMillis();
//        StringBuilder sb=new StringBuilder(100000);
//        for(int i=0;i<100000;i++){
//            sb.append(i);
//        }
//        long endTime=System.currentTimeMillis();
//        System.out.println("总耗时"+(endTime-startTime)+"毫秒");//3
//        int value=10;
//        MyInteger myInteger=new MyInteger(value);
//        m(myInteger);
//        System.out.println("int类型的最大值："+Integer.MAX_VALUE);
//        System.out.println("int类型的最小值"+Integer.MIN_VALUE);
//        System.out.println("byte类型的最大值："+Byte.MAX_VALUE);
//        System.out.println("byte类型的最小值:"+Byte.MIN_VALUE);
        int i=100;
        Integer i1=new Integer(i);
        System.out.println(i1);
        Integer i2=new Integer("100");
        System.out.println(i2);
        Integer i3=new Integer("abc");
        System.out.println(i3);
    }
}