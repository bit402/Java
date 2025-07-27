package test;

public class Teacher extends Person {
    double salary;
    public void teach() {
        System.out.println(this.name + " is teaching");
    }
}

package test;

public class Person {
    String name;
    int age;
    String sex;
    public void eat(){
        System.out.println(this.name+"正在吃");
    }
    public void run(){
        System.out.println(this.name+"正在跑步，锻炼身体");
    }
}

package test;

class A{
    public void a(){
        System.out.println("A方法执行了");
    }
}
class B extends A{
    public void b(){
        System.out.println("B方法执行了");
    }
}
class C extends B{
    public void c(){
        System.out.println("C方法执行了");
    }
}
public class test01 {

    public static void main(String[] args) {
//        Person person = new Person();
//        person.name="张三";
//        person.eat();
//        person.run();
//        Teacher teacher = new Teacher();
//        teacher.name="李四";
//        teacher.eat();
//        teacher.run();
//        teacher.teach();
//        C c = new C();
//        c.a();
//        c.b();
//        c.c();
        A a = new A();
        System.out.println(a);
        String a1="nihao";
        System.out.println(a1);
    }
}
