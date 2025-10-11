package test;

public interface FoodMenu {
    void yuXiangRouSi();
    void xiHongShiChaoDan();
    void youPoMian();
}

package test;

public class Cooker implements FoodMenu{
    private String name;

    public Cooker(String name) {
        this.name = name;
    }

    public Cooker() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void yuXiangRouSi() {
        System.out.println(name+"做的鱼香肉丝");
    }

    @Override
    public void xiHongShiChaoDan() {
        System.out.println(name+"做的西红柿炒鸡蛋");
    }

    @Override
    public void youPoMian() {
        System.out.println(name+"做的油泼面");
    }
}

package test;

public class Customer{
    public void order(FoodMenu foodMenu){
        foodMenu.xiHongShiChaoDan();
        foodMenu.youPoMian();
        foodMenu.yuXiangRouSi();
    }
}

package test;

public class Keyboard implements Usb{
    @Override
    public void read() {
        System.out.println("键盘接收数据");
    }

    @Override
    public void write() {
        System.out.println("键盘开始写数据");
    }
}

package test;

public interface Usb {
    void read();
    void write();
}

package test;

//public class Printer {
//    public void print() {
//        System.out.println("打印机开始打印数据");
//    }
//    public void read(){
//        System.out.println("打印机开始写数据");
//    }
//}

public class Printer implements Usb{
    @Override
    public void read() {
        System.out.println("打印机开始读数据");
    }

    @Override
    public void write() {
        System.out.println("打印机开始写数据");
    }
}
package test;

//public class Computer {
//    public void connect(HardDrive hardDrive) {
//        System.out.println("电脑连接硬盘");
//        hardDrive.read();
//        hardDrive.write();
//    }
//    public void connect(Printer printer) {
//        System.out.println("连接打印机成功");
//        printer.read();
//        printer.print();
//    }
//}
public class Computer {
    public void connect(Usb usb){
        System.out.println("设备连接成功");
        usb.read();
        usb.write();
    }
}

package test;

//public class HardDrive {
//    public void read(){
//        System.out.println("硬盘开始读数据");
//    }
//    public void write(){
//        System.out.println("硬盘开始写数据");
//    }
//}
public class HardDrive implements Usb{
    @Override
    public void read() {
        System.out.println("硬盘开始读数据");
    }

    @Override
    public void write() {
        System.out.println("硬盘开始写数据");
    }
}

package test;

public interface MyInterface {
    public static final int a=1;
    int b=2;
    public abstract void m1();
    void m2();
    default void de(){
        System.out.println("de<UNK>");
        mt();
    }
    private static void psm(){
        System.out.println("接口中私有的静态方法执行了");
    }
    static void sm(){
        System.out.println("接口中的静态方法执行了");
        psm();
    }
    private void mt(){
        System.out.println("接口中私有的实例方法执行了");
    }
}
interface a {
    void a();
}
interface b {
    void b();
}
interface c extends a,b {
    void c();
}
class d implements MyInterface,c{
    @Override
    public void m1() {
        System.out.println("m1执行了");
    }

    @Override
    public void m2() {
        System.out.println("m2执行了");
    }

    @Override
    public void c() {
        System.out.println("c执行了");
    }

    @Override
    public void a() {
        System.out.println("a执行了");
    }

    @Override
    public void b() {
        System.out.println("b执行了");
    }

    @Override
    public void de() {
        MyInterface.super.de();
        System.out.println("d重写后的默认方法执行了");
    }
}

package test;

public class test01 {

    public static void main(String[] args) {
//        System.out.println(MyInterface.a);
//        System.out.println(MyInterface.b);
//        //MyInterface.a=5;
////        d d = new d();
////        d.a();
////        d.b();
////        d.c();
////        d.m1();
////        d.m2();
//        MyInterface my=new d();
//        my.m1();
//        my.m2();
////        my.a();
////        my.b();
////        my.c();
//        my.de();
//        MyInterface.sm();
//        Computer computer = new Computer();
//        HardDrive hardDrive = new HardDrive();
//        computer.connect(hardDrive);
//        Printer printer = new Printer();
//        computer.connect(printer);
//        Computer computer = new Computer();
//        Printer printer = new Printer();
//        computer.connect(printer);
//        Usb usb=new HardDrive();
//        computer.connect(usb);
//        Keyboard keyboard = new Keyboard();
//        computer.connect(keyboard);
        Customer customer = new Customer();
        Cooker cooker = new Cooker("张三");
        customer.order(cooker);
        Cooker cooker2 = new Cooker("李四");
        customer.order(cooker2);
    }
}


