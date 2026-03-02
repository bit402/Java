package test;

public class Order<T> implements MyComparable<T>{
    @Override
    public int comparableTo(Product o) {
        return 0;
    }
}
package test;

public  class Product implements MyComparable<Product>{
    @Override
    public int comparableTo(Product o) {
        return this.price-o.price;
    }
    private int price;

    public Product() {
    }

    public Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public static void main(String[] args) {
        Product p1 = new Product(3);
        Product p2 = new Product(2);
        System.out.println(p1.comparableTo(p2));
    }
}
package test;

public interface MyComparable <T>{
    int comparableTo(Product o);
}
package test;

public class Customer <t>{
    public static <t>void shopping(t type){
        System.out.println(type+"shopping!");
    }
    public static <E>void print(E[] elmt){
        for(E e:elmt){
            System.out.println(e);
        }
    }
    private t name;

    public Customer() {
    }

    public Customer(t name) {
        this.name = name;
    }

    public t getName() {
        return name;
    }

    public void setName(t name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Customer<String> c1 = new Customer<String>("renji");
        String[] s={"zhangsan","lisi","wangwu"};
        String name="nihao";
        Customer.print(s);
        Customer.shopping(name);
        System.out.println(c1.getName());
        c1.shopping(c1.getName());
    }
}
package test;

public class Vip <nameType,ageType>{
    private nameType name;
    private ageType age;

    public Vip(nameType name, ageType age) {
        this.name = name;
        this.age = age;
    }

    public Vip() {
    }

    public nameType getName() {
        return name;
    }

    public void setName(nameType name) {
        this.name = name;
    }

    public ageType getAge() {
        return age;
    }

    public void setAge(ageType age) {
        this.age = age;
    }
    public static void main(String[] args) {
        Vip<String,Integer> vip = new Vip<String,Integer>("zhangsan", 18);
        String name = vip.getName();
        Integer age = vip.getAge();
        System.out.println(name);
        System.out.println(age);
    }
}
package test;

public class MyClass <t>{
    private t name;

    public MyClass(t name) {
        this.name = name;
    }

    public MyClass() {
    }

    public t getName() {
        return name;
    }

    public void setName(t name) {
        this.name = name;
    }
    public static void main(String[] args) {
        MyClass<String> myClass = new MyClass<String>("<UNK>");
        //MyClass<String> myClass2 = new MyClass<String>(123);
    }
}
package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class test01 {

    public static void main(String[] args) {
        Collection<String> strs=new ArrayList<String>();
        strs.add("jack");
        strs.add("tom");
        strs.add("lucy");
        Iterator<String> iter=strs.iterator();
        while(iter.hasNext()){
            String str=iter.next();
            System.out.println(str.charAt(1));
        }
    }
}