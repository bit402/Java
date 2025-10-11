package test;

public abstract class Shape {
    private String color;
    String name;
    public Shape() {

    }
    public Shape(String color, String name) {
        this.color = color;
        this.name = name;
    }
    public abstract void area();
    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Name: " + name);
    }
}

package test;

//final class a{
//
//}
//class b extends a{
//
//}
//class a{
//    public final void f(){
//        System.out.println("a");
//    }
//}
//class b extends a{
//    @Override
//    public final void f(){
//        System.out.println("重写");
//    }
//}
public class test01 {
    //public static final double MATH_PI=3.14159265358979323846;
    public static void main(String[] args) {
//        Teacher teacher = new Teacher();
//        teacher.dosomething();
//        CreditAccount ca=new CreditAccount("act-001",0.0,1);
//        System.out.println("账号："+ca.accountNo);
//        System.out.println("余额："+ca.balance);
//        System.out.println("信用度："+ca.creditLimit);
//        new CreditAccount();
        //final double Π=3.14;
//        int 你=10;
//        System.out.println(你);
//        System.out.println(Π);
//        Π=3.1415926;
//        System.out.println(Π);
//        final int k;
//        k=3;
//        System.out.println(k);
//        //k=2;
//        System.out.println(MATH_PI);
//        final Product p = new Product("bs",10.0);
//        //p=new Product("as",20.0);
//        System.out.println(p.getName());
//        System.out.println(p.getPrice());
//        p.setName("as");
//        p.setPrice(20.0);
//        System.out.println(p.getName());
//        System.out.println(p.getPrice());
//        EnglishPerson person = new EnglishPerson("Jack",18);
//        person.print();
//        person.greet();
//        ChinesePerson person1=new ChinesePerson("小明",18);
//        person1.print();
//        person1.greet();
//        int a=(int)1.3;
//        double b=1;
//        System.out.println(a);
//        System.out.println(b);
//        Person person=new EnglishPerson("jack",18);
//        person.print();
//        person.greet();
//        Person person1=new ChinesePerson("小明",18);
//        person1.print();
//        person1.greet();
        Shape shape = new Rectangle("红色","矩形",2.0,3.0);
        Shape shape1 = new Circle("蓝色","圆形",2.0);
        shape.display();
        shape1.display();
        shape.area();
        shape1.area();
    }
}


package test;

public class Circle extends Shape{
    double radius;

    public Circle(String color, String name, double radius) {
        super(color, name);
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public void area() {
        System.out.println("Circle area of Circle: " + radius * radius * Constance.PI);
    }
}

package test;

public class Rectangle extends Shape{
    double width;
    double height;

    public Rectangle(String color, String name, double width, double height) {
        super(color, name);
        this.width = width;
        this.height = height;
    }

    public Rectangle() {

    }

    @Override
    public void area() {
        System.out.println("Area of Rectangle: " + width + " x " + height+"="+width*height);
    }
}
package test;

public class Constance {
    public static final double PI=3.14;
}

package test;

public abstract class Person {
//    public void dosomething() {
//        System.out.println("人类在做一些事情");
//     }
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void print() {
        System.out.println("姓名：" + name +  "   "  +"年龄：" + age );
    }
    public abstract void greet();
}

package test;

public class EnglishPerson extends Person {
    @Override
    public void greet() {
        System.out.println("Hello");
    }

    public EnglishPerson(String name, int age) {
        super(name, age);
    }

    public EnglishPerson() {
        super();
    }

package test;

public class ChinesePerson extends Person {
    @Override
    public void greet() {
        System.out.println("你好呀");
    }

    public ChinesePerson(String name, int age) {
        super(name, age);
    }

    public ChinesePerson() {
        super();
    }
}

package test;

public class Product {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Product() {

    }
}

package test;

public class User {
    final String name;
    final int age=18;

    public User(String name) {
        this.name = name;
    }
}

package test;

//public class Teacher extends Person {
//    @Override
//    public void dosomething() {
//        System.out.println("dosomething方法执行");
//        super.dosomething();
//        System.out.println("dosomething执行结束");
//}
public class Teacher  {

}

package test;

public class Account {
    String accountNo;
    double balance;

    public Account() {
        System.out.println("Account无参构造方法执行了");
    }
    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }
}

package test;

public class CreditAccount extends Account {
    double creditLimit;

//    public CreditAccount(String accountNo, double balance, double creditLimit) {
//        super(accountNo, balance);
//        this.creditLimit = creditLimit;
//    }

    public CreditAccount(String accountNo, double balance, double creditLimit) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.creditLimit = creditLimit;
    }

    public CreditAccount() {
        System.out.println("CreditAccount无参构造方法执行了");
    }
}
