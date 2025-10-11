package test;

public class Employee {
    String name;
    String department;
    int salary;
    public int getsalary() {
        return salary;
    }

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Employee() {
    }
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

package test;

public class HourlyEmployee extends Employee{
    int hours;
    int hourSalary;

    @Override
    public int getsalary() {
        return hourSalary*hours;
    }

    public HourlyEmployee(String name, String department, int salary, int hours, int hourSalary) {
        super(name, department, salary);
        this.hours = hours;
        this.hourSalary = hourSalary;
    }

    public HourlyEmployee(int hours, int hourSalary) {
        this.hours = hours;
        this.hourSalary = hourSalary;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getsalary());
    }
}

package test;

public class SalariedEmployee extends Employee{
    int workingDay;
    int monthlySalary;

    public SalariedEmployee(String name, String department, int salary, int workingDay, int monthlySalary) {
        super(name, department, salary);
        this.workingDay = workingDay;
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(int workingDay, int monthlySalary) {
        this.workingDay = workingDay;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public int getsalary() {
        return monthlySalary;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + monthlySalary);
    }
}

package test;

public class CmmissionedEmployee extends Employee{
    int salesAmount;
    double commissionRate;

    public CmmissionedEmployee(String name, String department, int salary, int salesAmount, double commissionRate) {
        super(name, department, salary);
        this.salesAmount = salesAmount;
        this.commissionRate = commissionRate;
    }

    public CmmissionedEmployee(int salesAmount, double commissionRate) {
        this.salesAmount = salesAmount;
        this.commissionRate = commissionRate;
    }


    public double getsalary(double commissionRate) {
        return salesAmount*commissionRate;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getsalary(commissionRate));
    }
}

package test;

public class Animal {
    public void move(){

    }
}

package test;

//public class Cat extends Pet{
//    @Override
//    public void eat() {
//        System.out.println("cat eat fish");
//    }
//}
public class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("小猫在跑");
    }
}

package test;

public class ChinesePerson extends Person {
    @Override
    public void greet() {
        System.out.println("你好呀");
    }
}

package test;

public class Dog extends Pet{
    @Override
    public void eat() {
        System.out.println("狗狗吃东西");
    }
}

package test;

public class EnglishPerson extends Person {
    @Override
    public void greet() {
        System.out.println("Hello");
    }
}

package test;

public class Fish extends Animal {
    @Override
    public void move() {
        System.out.println("小鱼在游泳");
    }
}

package test;

public class Master {
//    public void feed(Cat cat){
//        cat.eat();
//    }
//    public void feed(Dog dog){
//        dog.eat();
//    }
    public void feed(Pet pet){
        pet.eat();
    }
}

package test;

public class Person {
    public void greet(){

    }
}

package test;

public class Pet {
    public void eat(){

    }
}

package test;

public class Rectangle extends Shape {
    public double width;
    public double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void getArea() {
        System.out.println("Area of Rectangle: " + this.width * this.length);
    }
}

package test;

public class Shape {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void getArea() {

    }


}

package test;

public class Snake extends Pet {
    public void eat() {
        System.out.println("蛇吞象");
    }
}

package test;

public class Square extends Shape {
    private double length;
    private double width;
    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public void getArea() {
        System.out.println("Area of Square is " + this.length * this.width);
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}

package test;

public class test01 {

    public static void main(String[] args) {
//        Master master = new Master();
//        Cat cat = new Cat();
//        master.feed(cat);
//        Dog dog = new Dog();
//        master.feed(dog);
//        Snake snake = new Snake();
//        master.feed(snake);
//        Square square=new Square(5,5);
//        Shape shape1=new Square(5,5);
//        Rectangle rectangle=new Rectangle(5,6);
//        Shape shape2=new Rectangle(5,6);
//        shape2.getArea();
//        shape1.getArea();
//        Person[] people={new ChinesePerson(),new EnglishPerson()};
//        for(Person p:people){
//            p.greet();
//        }
//        Animal animal = new Cat();
//        Animal animal2 = new Fish();
//        animal.move();
//        animal2.move();
//        Animal animal = new Animal();
//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        Fish fish = new Fish();
//        animal=cat;
//        animal.move();
//        animal=fish;
//        animal.move();
        Employee emp = new Employee("张三","销售部",8000);
        emp.print();
        System.out.println("*****************************************");
        HourlyEmployee hemp=new HourlyEmployee(8,12);
        hemp.print();
        hemp.name="小明";
        hemp.department="人事";
        hemp.print();
        System.out.println("*****************************************");
        SalariedEmployee semp=new SalariedEmployee(20,8000);
        semp.print();
        semp.name="小红";
        semp.department="管理部";
        semp.print();
        System.out.println("*****************************************");
        CmmissionedEmployee cmp=new CmmissionedEmployee(80000,0.1);
        cmp.name="小帅";
        cmp.department="外来雇佣";
        cmp.print();
    }
}
