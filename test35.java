package test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test01 {

    public static void main(String[] args) throws ParseException {
//        Integer i1=new Integer(1000);
//        Integer i2 =new Integer(1000);
//        System.out.println(i1==i2);
//        System.out.println(i1.equals(i2));
//        Integer i=1000;
//        System.out.println(i);
//        int x=i;
//        System.out.println(x);
//        Integer a=127;
//        Integer b=127;
//        System.out.println(a==b);
//        Integer c=128;
//        Integer d=128;
//        System.out.println(c==d);
//        long a=999999999999999999l;
//        int c=999999999;
//        //long b=999999999999999999;
//        BigInteger b=new BigInteger("99999999999999999999999999999999999999999999999999");
//        System.out.println(b);
//        BigInteger d=new BigInteger("1");
//        System.out.println(d);
//        BigInteger result1=b.add(d);
//        System.out.println(result1);
//        BigInteger result2=b.subtract(d);
//        System.out.println(result2);
//        BigInteger result3=b.multiply(d);
//        System.out.println(result3);
//        BigInteger result4=b.divide(d);
//        System.out.println(result4);
//        BigInteger a = new BigInteger("2");
//        BigInteger b=a.pow(3);
//        System.out.println(b);
//        BigInteger a=new BigInteger("9");
//        BigInteger b=a.sqrt();
//        System.out.println(b);
//        BigDecimal a=new BigDecimal("10");
//        BigDecimal b=new BigDecimal("2");
//        BigDecimal result1=a.add(b);
//        System.out.println(result1);
//        BigDecimal result2=a.subtract(b);
//        System.out.println(result2);
//        BigDecimal result3=a.multiply(b);
//        System.out.println(result3);
//        BigDecimal result4=a.divide(b);
//        System.out.println(result4);
//        BigDecimal a = new BigDecimal("123456789.123456789");
//        BigDecimal result1=a.movePointLeft(5);
//        System.out.println(result1);
//        BigDecimal result2=a.movePointRight(5);
//        System.out.println(result2);
//        DecimalFormat df = new DecimalFormat("###,###.##");
//        String s=df.format(12345678.127);
//        System.out.println(s);
//        DecimalFormat df = new DecimalFormat("###,###.0000");
//        String s=df.format(12345678.127);
//        System.out.println(s);
//        Date date = new Date();
//        System.out.println(date);
//        Date date1 = new Date(1000);
//        System.out.println(date1);
//        Date date2 = new Date(System.currentTimeMillis());
//        System.out.println(date2);
//        //获取系统当前时间的前10分钟的时间
        Date date3 = new Date(System.currentTimeMillis()-1000*60*10);
        System.out.println(date3);
        DateFormat df = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss SSS");
        Date now = new Date();
        String date = df.format(now);
        System.out.println(date);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
//        String d="2025-01-01 02:03:05 888";
//        Date date=sdf.parse(d);
//        System.out.println(date);
    }
}