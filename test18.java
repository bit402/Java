package test;

public class Date {
    public int year;
    public int month;
    public int day;
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date() {
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        else if (this==obj){
            return true;
        }
        else if (obj instanceof Date) {
            Date d = (Date)obj;
            int year1 = this.year;
            int year2 = d.year;
            int month1 = this.month;
            int month2 = d.month;
            int day1 = this.day;
            int day2 = d.day;
            if(year1==year2&&month1==month2&&day1==day2){
                return true;
            }
        }
        return false;
    }
}
package test;

public class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}
package test;

public class test01 {

    public static void main(String[] args) {
        Student s1 = new Student("张三",18);
        System.out.println(s1);
        int a=10;
        int b=10;
        System.out.println(a==b);
        int c=20;
        System.out.println(c==a);
        Date d1 = new Date(2012,1,1);
        System.out.println(d1);
        Date d2 = new Date(2018,1,1);
        System.out.println(d2);
        System.out.println(d1.equals(d2));
        System.out.println(d1==d2);
        Date d3 = new Date(2018,1,1);
        System.out.println(d3);
        System.out.println(d2==d3);
        System.out.println(d2.equals(d3));
    }
}