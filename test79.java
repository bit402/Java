package test;

public class User {
    static {
        System.out.println("user类的静态代码块执行了");
    }
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
#className=test.User
className=java.util.Datepackage test;

public class Vip {
    public String name;
    private int age;
    protected String birthday;
    boolean gender;
    public static String address="北京海淀";
    public static final String GRADE = "金牌";
}
package test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ResourceBundle;

public class test01 {

    public static void main(String[] args) {
//        try {
//            Class s1=Class.forName("java.lang.String");
//            String ss="abc";
//            Class stringClass=ss.getClass();
//            System.out.println(stringClass==s1);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            Class s2=Class.forName("test.User");
//            User user=new User("张三",18);
//            //Class s3=s2.getClass();
//            Class s3=user.getClass();
//            System.out.println(s3==s2);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        Class s1=int.class;
//        Class s2=int[].class;
//        Class s3=int[][].class;
//        System.out.println(s1==s2);
//        System.out.println(s2==s3);
//        Class s1=int.class;
//        Class s2=double.class;
//        Class s3=String.class;
//        Class s4=User.class;
//        try {
//            Class s5=Class.forName("java.lang.String");
//            System.out.println(s3==s5);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        Class userClass;
//        try {
//            userClass=Class.forName("test.User");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        //通过userClass来实例化User类型得对象
//        //底层是调用了user类的无参构造方法
//        //要想使用这个方法的话必须保证user类中有无参构造方法，假设没有无参构造方法，这个类就会出现异常（实例化异常）
//        //实例化出来的都是object类型需要自己手动来强制类型转化
//        try {
//            User user=(User) userClass.newInstance();
//            User sss=(User)userClass.newInstance();
//            System.out.println(user);
//            System.out.println(user==sss);
//        } catch (InstantiationException | IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
        //通过属性配置文件货物类名，然后再通过反射机制实例化对象
//        ResourceBundle rb = ResourceBundle.getBundle("test.classInfo");
//        //通过key获取value
//        String className=rb.getString("className");
//        //通过反射机制实例化对象
//        try {
//            Class classobj=Class.forName(className);
//            Object obj=classobj.newInstance();
//            System.out.println(obj);
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
//                throw new RuntimeException(e);
//        }
//        Class vipClass=Vip.class;
//        //获取vip类中所有的属性或者说是字段
//        //此处获取的是public修饰的属性
//        Field[] fields=vipClass.getFields();
//        System.out.println(fields.length);
//        for(Field f:fields){
//            System.out.println(f.getName());
//        }
        //获取vip中所有的属性字段包括私有的
        //declared:公开，声明，宣战
//        Class vipClass=Vip.class;
//        Field[] fields=vipClass.getDeclaredFields();
//        System.out.println(fields.length);
//        for(Field f:fields){
//            //获取所有的属性名
//            System.out.print(f.getName()+" ");
//            //获取所有的属性类型：
//            System.out.print(f.getType()+" ");
//            //获取属性类型的简单名称：
//            System.out.print(f.getType().getSimpleName()+" ");
//            //获取属性的修饰符
//            System.out.print(f.getModifiers()+" ");
//            //将修饰符从Int类型转为String类型：
//            System.out.println(Modifier.toString(f.getModifiers()));
//        }
        //获取String类
        Class stringClass = String.class;
        //获取String类中的所有的属性/字段
        Field[] fields=stringClass.getDeclaredFields();
        System.out.print(Modifier.toString(stringClass.getModifiers())+" " +"class "+" ");
        System.out.println(stringClass.getSimpleName());//打印类的名字
        for(Field f:fields){
            System.out.print(Modifier.toString(f.getModifiers()) + " ");//打印修饰符
            System.out.print(f.getType().getSimpleName()+" ");//打印类型
            System.out.println(f.getName());//打印属性/字段的名字
        }
    }
}