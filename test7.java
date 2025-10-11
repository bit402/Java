package test;

public class Vehicle {
    private double speed;
    private double size;
    public void move(){
        System.out.println("开始行走,速度为："+speed);
    }
    public void speedUP(double speed)
    {
        this.speed+=speed;
        System.out.println("加速后的速度为："+this.speed);
    }
    public void speedDown(double speed)
    {
        this.speed-=speed;
        System.out.println("减速后的速度为："+this.speed);
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public Vehicle(double speed, double size) {
        System.out.println("有参构造方法执行！");
        this.speed = speed;
        this.size = size;
    }
}

package test;

public class Number {
    private double n1;
    private double n2;
    public Number(double n1, double n2) {
        System.out.println("有参构造方法执行");
        this.n1 = n1;
        this.n2 = n2;
    }
    public Number() {
        System.out.println("无参构造方法执行！");
        this.n1=10;
        this.n2=20;
    }
    public double add() {
        return n1+n2;
    }
    public double sub(){
        return n1-n2;
    }
    public double mul()
    {
        return n1*n2;
    }
    public double div()
    {
        return n1/n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
}

package test;

public class User {
    private String id;
    private String password;
    private String emali;
    public User(String id, String password, String emali) {
        this.id = id;
        this.password = password;
        this.emali = emali;
    }
    public User(String id, String password) {
        this.id = id;
        this.password = password;
        this.emali = (id + "@powernode.com");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmali() {
        return emali;
    }

    public void setEmali(String emali) {
        this.emali = emali;
    }
}

package test;

public class vip {
    private String name;
     private int age;
     private String address;
     private String phone;
     private String email;
     private boolean sex;
    public  void shopping(){
        System.out.println(this.name+"正在购物");
        System.out.println("shopping-->"+this);
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public vip() {
    }

    public vip(String name, int age, String address, String phone, String email, boolean sex) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.sex = sex;
    }
    public static void dooo()
    {
//        System.out.println(this.name);
//        this.shopping();
//        shopping()
//        System.out.println(name);
//        //全报错
    vip.test2();
     test2();
     vip v02 = new vip("王五");
     v02.shopping();
     //this.shopping();报错
    }
    public static void test2(){
        System.out.println("test2");
    }

    public vip(String name) {
        this.name = name;
    }
}

package test;

public class Worker {
   String name;
   String idcard;
   static String country="中国";

   public Worker() {
   }

   public Worker(String name, String idcard) {
      this.name = name;
      this.idcard = idcard;
   }
   public void display(){
      System.out.println("姓名："+name);
      System.out.println("身份证号："+idcard);
      System.out.println("国籍："+country);
   }
}

package test;

public class Data {
    private int year;
    private int month;
    private int day;

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
    public Data() {
//        year=1970;
//        month=1;
//        day=1;
        this(1970, 1, 1);
    }

    public Data(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void display() {
        System.out.println("当前时间为：" + year + "年" + month + "月" + day + "日");
    }
}

package test;

public class test01 {
//    int age=10;
//    public void main(String s)
//    {
//        System.out.println(this);
//        System.out.println(this.age);
//        System.out.println(age);
//    }
    public static void main(String[] args) {
//        Vehicle v1=new Vehicle(10.0,5.5);
//        System.out.println("汽车的体积为："+v1.getSize()+"立方米");
//        System.out.println("汽车的速度为："+v1.getSpeed()+"km/h");
//        v1.move();
//        v1.speedUP(10.0);
//        v1.speedDown(20.0);
//        Number n1 = new Number();
//        System.out.println("n1="+n1.getN1());
//        System.out.println("n2="+n1.getN2());
//        System.out.println("n1+n2="+n1.add());
//        System.out.println("n1-n2="+n1.sub());
//        System.out.println("n1*n2="+n1.mul());
//        System.out.println("n1/n2="+n1.div());
//        User u1 = new User("ysj", "88888888", "ysj@888.com");
//        System.out.println("Email="+u1.getEmali());
//        System.out.println("id="+u1.getId());
//        System.out.println("password="+u1.getPassword());
//        User u2 = new User("ysj", "88888888");
//        System.out.println("Email="+u2.getEmali());
//        System.out.println("id="+u2.getId());
//        System.out.println("password="+u2.getPassword());
//        vip v1 = new vip();
//        v1.setName("张三");
//        System.out.println("名字：" + v1.getName());
//        System.out.println("main-->"+v1);
//        v1.shopping();
//        vip v2 = new vip();
//        v2.setName("李四");
//        System.out.println("名字：" + v2.getName());
//        System.out.println("main-->"+v2);
//        v2.shopping();
//        System.out.println(this.age);
//        System.out.println(this);
//        System.out.println(age);全都报错
//        test01 t1 = new test01();
//        t1.main("hello");
//        Data d1 = new Data();
//        d1.display();
//        Data d2 = new Data(2025,7,21);
//        d2.display();
        Worker worker = new Worker("张三","888");
        Worker worker2 = new Worker("李四","999");
        worker.display();
        worker2.display();
    }

}
