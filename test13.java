package test;

public class Animal {
    public static void move(){
        System.out.println("Animal move");
    }
}

package test;

public class Cat extends Animal {
    //@Override
    public static void move(){
        System.out.println("cat move");
    }
}

package test;

public  class Person {
//    String name;
//    int age;
//    public void isAdult(){
//        if(age >= 18){
//            System.out.println("成年");
//        }
//        else{
//            System.out.println("未成年");
//        }
//    }
//    public String name;
//    public int age;
//    public void print() {
//    }
//    String name;
//
//    public Person(String name) {
//        this.name = name;
//    }
//
//    public Person() {
//    }
//    public abstract void greet();
    String name;
    int age;
    String address;
    String email;

    public Person() {
    }
}

package test;

//public class Student extends Person {
//    private double score = 0;
//
//    public double getScore() {
//        System.out.println(score);
//        return score;
//    }
//
//    public void setScore(double score) {
//        this.score = score;
//    }
//
//    public Student(double score) {
//        this.score = score;
//    }
//    public Student(String name, int age, double score) {
//        this.name = name;
//        this.age = age;
//        this.score = score;
//    }
//
//    public Student() {
//
//    }
//
//}
public class Student {

}

package test;

public class Teacher extends Person {
//    private int salary;
//
//    public Teacher(int salary) {
//        this.salary = salary;
//    }
//    public Teacher(int salary, String name, int age) {
//        this.salary = salary;
//        this.name = name;
//        this.age = age;
//    }
//
//    public Teacher() {
//    }
//
//    public int getSalary() {
//        System.out.println(salary);
//        return salary;
//    }
//
//    @Override
//    public void print() {
//        System.out.println("姓名" + name);
//        System.out.println("年龄" + age);
//        System.out.println("薪资" + salary);
//    }
    double salary;
    String name;
    public Teacher() {
    }

    public Teacher(String name,String address,String email,int age,double salary) {
        this.salary = salary;
        this.name=name;
        this.address=address;
        this.email=email;
        this.age=age;
    }
    public void print(){
        System.out.println("姓名："+name);
        System.out.println("年龄:"+age);
        System.out.println("住址："+address);
        System.out.println("邮件："+email);
        System.out.println("工资："+salary);
    }
//public void print(){
//    System.out.println("姓名："+super.name);
//    System.out.println("年龄:"+super.age);
//    System.out.println("住址："+super.address);
//    System.out.println("邮件："+super.email);
//    System.out.println("工资："+this.salary);
//}
//public void print(){
//    System.out.println("姓名："+this.name);
//    System.out.println("年龄:"+this.age);
//    System.out.println("住址："+this.address);
//    System.out.println("邮件："+this.email);
//    System.out.println("工资："+this.salary);
//}
}

package test;
//import java.util.Scanner;
//class A{
//    String name="张三";
//}
//class B extends A{
//    String name="李四";
//}
public class test01 {
    public static void main(String[] args) {
        //System.out.println("你好呀");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数：");
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {//for循环，出口是i大于n
//            sum += i;
//        }
//        System.out.println("1-"+n+"之和为："+sum);
//        sc.close();
//        Student s1 = new Student("张三",18,100);
//        s1.isAdult();
//        s1.getScore();
//        System.out.println(s1.name);
//        System.out.println(s1.age);
//        Teacher teacher = new Teacher(8000,"张三",28);
//        teacher.getSalary();
//        teacher.print();
//        Animal animal = new Animal();
//        animal.move();
//        Cat cat = new Cat();
//        cat.move();
//        Animal animal2 = new Cat();
//        animal2.move();
//        A a =new B();
//        B b=new B();
//        System.out.println(a.name);
        Teacher teacher = new Teacher("张三","北京","123@qq.com",28,10000);
        teacher.print();
    }
}

