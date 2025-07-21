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
}

package test;

public class Car {
    public String brand;
    public String color;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price>50 || price<20)
        {
            System.out.println("对不起价格修改有误！");
            return;
        }
        this.price = price;
    }
}

package test;

public class BankAccount {
    String user;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("余额不合法！");
            return;
        }
        this.balance = balance;
    }
    public void withdraw(double amount) {
        if(balance<0)
        {
            System.out.println("对不起，余额不合法！");
        }
        else if (balance < amount) {
            System.out.println("对不起，余额不足！");
        }

        else
        {
            balance -= amount;
        }
    }
}

package test;

public class Student {
    private String name;
    private int age;
    private boolean gender;
    private String address;
    public Student()
    {
        System.out.println("无参构造方法执行了！");
    }
    public Student(String name, int age, boolean gender, String address)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        System.out.println("有参构造方法执行了");
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

package test;

public class test01 {

    public static void main(String[] args) {
//        vip vip1 = new vip();
//        System.out.println(vip1.age);
//        vip1.age = 18;
//        System.out.println(vip1.age);
//        vip1.age = -100;
//        System.out.println(vip1.age);
//        User u1 = new User();
//        System.out.println(u1.getter());
//        u1.setter(18);
//        System.out.println(u1.getter());
//        u1.setter(-100);
//        System.out.println(u1.getter());
//        vip vip1 = new vip();
//        vip1.setAge(18);
//        vip1.setName("张鹏伟");
//        vip1.setAddress("北京");
//        vip1.setEmail("88888888@88888888.com");
//        vip1.setPhone("123456789");
//        vip1.setSex(true);
//        System.out.println("姓名："+vip1.getName());
//        System.out.println("年龄："+vip1.getAge());
//        System.out.println("住址："+vip1.getAddress());
//        System.out.println("邮箱："+vip1.getEmail());
//        System.out.println("电话："+vip1.getPhone());
//        System.out.println("性别："+(vip1.isSex()?"男":'女'));
//        Car car = new Car();
//        car.color = "blue";
//        car.brand="兰博基尼";
//        car.setPrice(20);
//        System.out.println("颜色："+car.color);
//        System.out.println("品牌："+car.brand);
//        System.out.println("价格："+car.getPrice()+"万");
//        BankAccount account = new BankAccount();
//        account.user="ysj";
//        account.setBalance(88888.88);
//        System.out.println("账户为："+account.user);
//        System.out.println("余额为："+account.getBalance());
//        account.withdraw(88888);
//        System.out.println("余额为："+account.getBalance());
//        account.withdraw(100);
//        System.out.println("余额为："+account.getBalance());
//        Worker worker = new Worker();
//        worker.name="张三";
//        worker.age=18;
//        worker.setSalary(8000);
//        System.out.println("姓名："+worker.name);
//        System.out.println("年龄："+worker.age);
//        System.out.println("工资："+worker.getSalary());
//        worker.raiseSalary(2000);
//        worker.raiseSalary(3000);
//        Customer customer = new Customer();
//        customer.setName("张丽");
//        customer.setBirthday("2012-12-25");
//        customer.setPhone("88888888");
//        System.out.println("姓名："+customer.getName());
//        System.out.println("生日："+customer.getBirthday());
//        System.out.println("电话："+customer.getPhone());
//        customer.shopping();
        Student s1 = new Student();
        s1.setAddress("北京朝阳");
        s1.setName("小明");
        s1.setAge(20);
        s1.setGender(true);
        System.out.println("姓名："+ s1.getName());
        System.out.println("年龄："+s1.getAge());
        System.out.println("住址："+s1.getAddress());
        System.out.println("性别："+(s1.isGender()?'男':'女'));
        Student s2 = new Student("小红",18,false,"上海");
        System.out.println("姓名："+ s2.getName());
        System.out.println("年龄："+s2.getAge());
        System.out.println("住址："+s2.getAddress());
        System.out.println("性别："+(s2.isGender()?'男':'女'));

    }

}
