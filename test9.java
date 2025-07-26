package test;

public class Student {
    private String name;
    private int age;
    private String gender;

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
        if(age<0 || age>120)
        {
            System.out.println("年龄不合法");
            return;
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}

package test;

public class Car {
    private String name;
    private double price;
    private int number;
    public Car(String name, double price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }
    public Car(){

    }
    public double sumPrice(){
        return price * number;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }
}

package test;

public class Worker {
   private String name;
   private int age;
   private String gender;
   private static int count=0;
   public Worker(){
      count++;
      System.out.println("Worker count:"+count);
   }
}

package test;

public class test01 {

    public static void main(String[] args) {
//        Student s1 = new Student();
//        Student s2 = new Student();
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1==s2);
//        int a=10;
//        int b=10;
//        System.out.println(a==b);
//        Singleton s1 = new Singleton();
//        Singleton s2 = new Singleton();
//        System.out.println(s1 == s2);
//        Singleton s1=Singleton.get();
//        Singleton s2=Singleton.get();
//        System.out.println(s1==s2);
//        Student s1 = new Student();
//        s1.setName("张三");
//        s1.setAge(18);
//        s1.setGender("男");
//        System.out.println(s1.getName());
//        System.out.println(s1.getAge());
//        System.out.println(s1.getGender());
//        Car car = new Car("苹果",8.8,5);
//        System.out.println("名字："+car.getName());
//        System.out.println("价格："+car.getPrice());
//        System.out.println("数量："+car.getNumber());
//        double sum=car.sumPrice();
//        System.out.println("总价为："+sum);
        Worker worker = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();
        Worker worker4 = new Worker();
        Worker worker5 = new Worker();
        Worker worker6 = new Worker();
        Worker worker7 = new Worker();
        Worker worker8 = new Worker();
        BankAccount b1=new BankAccount("张三","88888888",88888.88);
        System.out.println("姓名："+b1.getName());
        System.out.println("卡号："+b1.getId());
        System.out.println("余额"+b1.getBalance());
        b1.deposit(100);
        b1.withdraw(200);
        b1.print();
    }
}
