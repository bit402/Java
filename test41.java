package test;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date() {
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
    public boolean equals(Object object){
        if(object==null){
            return false;
        }
        if(this == object){
            return true;
        }
        if(object instanceof Date){
            if(this.year==((Date)object).getYear() && this.month==((Date)object).getMonth() && this.day==((Date)object).getDay()){
                return true;
            }
        }
        return false;
    }
}

package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class test01 {

    public static void main(String[] args){
//        Collection collection = new ArrayList();
//        collection.add(1);
//        collection.add("你好");
//        collection.add(3.14);
//        collection.add(true);
//        System.out.println(collection);
//        //遍历
//        Iterator iterator=collection.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        Collection collection=new ArrayList();
        collection.add(100);
        collection.add(3.14);
        collection.add(true);
        collection.add("jack");
        collection.add(new Object());
//        System.out.println("查看集合中的元素个数："+collection.size());
//        Collection collection2=new ArrayList();
//        collection2.add("zhangsan");
//        collection2.add("lisi");
//        collection2.add("wangwu");
//        collection.addAll(collection2);
//        System.out.println("现在元素个数为："+collection.size());
//        //判断集合中是否包含某个元素：
//        System.out.println(collection.contains(100));
//        System.out.println(collection.contains(101));
//        System.out.println(collection.contains("zhangsan"));
//        String s2=new String("zhangsan");
//        System.out.println(collection.contains(s2));
//        System.out.println("***********************");
//        Date d1=new Date(2008,8,8);
//        collection.add(d1);
//        System.out.println(collection.contains(d1));
//        Date d2=new Date(2008,8,8);
//        System.out.println(collection.contains(d2));
//        System.out.println(collection.size());
//        collection.remove(d2);
//        System.out.println(collection.contains(d2));
//        System.out.println(collection.size());
//        System.out.println(collection.isEmpty());
//        //清空集合
//        collection.clear();
//        System.out.println(collection.isEmpty());
//        System.out.println(collection.size());
        Object[] objects=collection.toArray();
        for(Object obj:objects){
            System.out.println(obj);
        }
    }
}
