package test;

public class Data {
    private int year;
    private int month;
    private int day;

    public Data(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }


    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null) return false;
        if(this == obj) return true;
        if(!(obj instanceof Data)) return false;
        Data data = (Data)obj;
        return year == data.year && month == data.month && day == data.day;
    }
}
package test;

import java.util.*;

public class test01 {

    public static void main(String[] args){
//        System.err.println("这是一个错误信息！");
//        int a=2;
//        int b=0;
//        try{
//            int c=a/b;
//        }catch(ArithmeticException e){
//            System.err.println("除数不能为0");
//        }
//        long l=System.currentTimeMillis();
//        System.out.println(l);
//        long l2=System.nanoTime();
//        System.out.println(l2);
//        Map<String,String> map=System.getenv();
//        System.out.println(map);
//        System.out.println(map.get("Path"));
//        Properties p=System.getProperties();
//        System.out.println(p);
//        String vmName=System.getProperty("java.vm.name");
//        System.out.println(vmName);
//        UUID uuid = UUID.randomUUID();
//        String uuidStr = uuid.toString();
//        System.out.println(uuidStr);
//        String s=uuidStr.replaceAll("-","").toUpperCase();
//        System.out.println(s);
//        Collection collection = new ArrayList();
//        collection.add(1);
//        collection.add("abc");
//        collection.add(new Object());
//        Iterator iterator = collection.iterator();
//        while(iterator.hasNext()){
//            Object obj = iterator.next();
//            System.out.println(obj);
//        }
        Collection collection = new ArrayList();
        collection.add("a");
        collection.add(100);
        collection.add(3.14);
        System.out.println("集合中元素的个数"+collection.size());
        Collection collection1 = new ArrayList();
        collection1.add("zhangsan");
        collection1.add("lisi");
        collection1.add("wangwu");
        collection.addAll(collection1);
        System.out.println("集合添加"+collection.size());
        System.out.println(collection.contains("zhangsan"));
        System.out.println(collection.contains("100"));
        System.out.println(collection.contains(100));
        String s="zhangsan";
        System.out.println(collection.contains(s));
        Data data=new Data(1990,10,1);
        Data data1=new Data(1990,10,1);
        System.out.println(data.equals(data1));
        collection.add(data);
        System.out.println("*********************** ");
        System.out.println(collection.contains(data1));
        System.out.println(collection.size());
        System.out.println("############################");
        Object[] objects=collection.toArray();
        for(Object obj:objects){
            System.out.println(obj);
        }
        System.out.println("############################");
        collection.remove(data1);
        System.out.println("<UNK>"+collection.size());
        System.out.println(collection.isEmpty());
        collection.clear();
        System.out.println("<UNK>"+collection.size());
        System.out.println(collection.isEmpty());
    }
}