package test;

import org.junit.jupiter.api.Test;

public class IntegerTest {
    @Test
    public void testCompare() {
        int result=Integer.compare(1,2);
        System.out.println(result);
        result=Integer.compare(2,2);
        System.out.println(result);
        result=Integer.compare(3,2);
        System.out.println(result);
    }
    @Test
    public void testMaxAndMin() {
        int result=Integer.max(2,3);
        System.out.println(result);
        result=Integer.min(2,3);
        System.out.println(result);
    }
    @Test
    public void testParseInt() {
        int numb1=Integer.parseInt("123");
        double numb2=Double.parseDouble("3.14");
        long numb3=Long.parseLong("520");
        System.out.println(numb1);
        System.out.println(numb2);
        System.out.println(numb3);
        System.out.println(numb1+1);
        System.out.println(numb2+1);
        System.out.println(numb3+1);
    }
    @Test
    public void testToHexStringAndOctalStringAndBinaryString() {
        int a=20;
        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toBinaryString(a));
    }
    @Test
    public void testEqualsAndToString() {
        Integer a=new Integer(20);
        Integer b=new Integer(20);
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a);
        System.out.println(a.toString());
        System.out.println(b);
        System.out.println(b.toString());
    }
    @Test
    public void testBoxing(){
        Integer a=new Integer(20);
        int result=a.intValue();
        System.out.println(result+1);
    }
    @Test
    public void testToString(){
        String a=Integer.toString(100);
        System.out.println(a);
        int b=100;
        String s=b+"";
        System.out.println(s);
        System.out.println(a==s);
        System.out.println(a.equals(s));
    }
    @Test
    public void testBoxing2(){
        Integer i1=Integer.valueOf(100);
        Integer i2=Integer.valueOf("100");
        System.out.println(i1==i2);
        System.out.println(i1+1);
        System.out.println(i2);
        //Integer i3=Integer.valueOf("abc");
    }
}
package test;

public class test01 {

    public static void main(String[] args) {
//        StringBuilder sb=new StringBuilder();
//        sb.append(10);
//        System.out.println(sb.toString());
//        sb.setCharAt(1,'b');
//        System.out.println(sb.toString());
//        String s1="123456";
//        int i=Integer.parseInt(s1);
//        System.out.println(i);
//        int a=123456;
//        String s1=String.valueOf(a);
//        System.out.println(s1+1);
//        String s2=Integer.toString(a);
//        System.out.println(s2+1);
//        String s3=a+"";
//        System.out.println(s3+1);
//        String a = "123456";
//        Integer b=Integer.valueOf(a);
//        System.out.println(b);
//        Integer a=Integer.valueOf(1);
//        String s1=a+"1";
//        System.out.println(s1+1);
//        String s2=String.valueOf(a);
//        System.out.println(s2+1);
//        String s3=Integer.toString(a);
//        System.out.println(s3+1);
        int a=123456;
        Integer b=Integer.valueOf(a);
        System.out.println(b);
    }
}