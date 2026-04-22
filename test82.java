package test;

import java.util.List;
import java.util.Map;
@Deprecated(since = "9",forRemoval = true)
@Table(
        //如果属性名为value的话，在使用注解的时候，该属性名可以省略。
        //如果属性是一个数组并且数组中的元素只有一个的时候，{}可以省略不写
        {"nihao","d"}
)
public class MyClass {
    public Map<String,Integer> m(List<String> list , List<String> list2) {
        return null;
    }
    @Deprecated(since = "9", forRemoval = true)
    public int a=50;
    @Deprecated
    public void mm(){
        System.out.println("mm方法被调用");
    }
}
package test;

import java.util.Map;
@MyAnnotation
public class User {
    @MyAnnotation
    public User(@MyAnnotation Map<Integer,String> map) {
    }
    @DataBaseInfo(
            driver = "xxx.mysql.cj.jdbc.Driver",
            url="jdbc:mysql://localhost:3306/powernode",
            user="root",
            password="123456",
            s1={"zhangsan","lisi"}
    )
    public void connDB(){

    }
    @DataBaseInfo(
            driver = "123",
            s1={"nihao"}
    )
    public void test(){

    }
}
package test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)//MyAnnotation注解保留在源码中
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface MyAnnotation {
}
package test;

public @interface DataBaseInfo {
    String driver() default "com.mysql.jdbc.Driver";
    String url() default "jdbc:mysql://localhost:3306/test";
    String user() default "root";
    String password() default "root";
    byte b() default 1;
    short s() default 2;
    int i() default 3;
    long l() default 4;
    float f() default 5;
    double d() default 6;
    boolean bool() default true;
    char ch() default 'A';
    Class clazz() default Object.class;
    Season season() default Season.SPRING;
    MyAnnotation myAnnotation() default @MyAnnotation;
    String[] s1() ;
}
//注解的属性类型必须是以上类型当中的，或者是这几种类型的一维数组，不能是其他的类型package test;

public enum Season {
    SPRING,SUMMER,AUTUMN,WINTER;
}
package test;

public @interface Table {
    String[] value() ;
}
package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@MyAnnotation//这个注解会保存到字节码文件中，并且在运行的时候可以被反射
public class test01 {
//    @FunctionalInterface
//    interface Flyable{
//        void fly();
//        //void eat();
//        default void sleep(){
//            System.out.println("默认方法执行了！");
//        }
//        private static void doSomething(){
//            System.out.println("静态方法执行了");
//        }
//    }
    @MyAnnotation
    public static void main(String[] args) {
//        //获取方法上的参数的泛型信息
//        Class c1=MyClass.class;
//        try {
//            Method method1=c1.getDeclaredMethod("m", List.class, List.class);
//            Type[] t1=method1.getGenericParameterTypes();
//            for (Type t : t1) {
//                if(t instanceof ParameterizedType){
//                    ParameterizedType p=(ParameterizedType)t;
//                    Type[] p1=p.getActualTypeArguments();
//                    for (Type t2 : p1) {
//                        System.out.println(t2);
//                    }
//                }
//            }
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        }
//        Class c1=MyClass.class;
//        try {
//            Method method1=c1.getDeclaredMethod("m", List.class, List.class);
////            Type[] types=method1.getGenericParameterTypes();
//            Type types=method1.getGenericReturnType();
//            if (types instanceof ParameterizedType) {
//                ParameterizedType parameterizedType=(ParameterizedType)types;
//                Type[] types1=parameterizedType.getActualTypeArguments();
//                for (Type type : types1) {
//                    System.out.println(type);
//                }
//            }
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        }
//        Class c1=User.class;
//        try {
//            Constructor con= c1.getDeclaredConstructor(Map.class);
//            Type[] t1=con.getGenericParameterTypes();
//            for(Type t:t1){
//                if(t instanceof ParameterizedType){
//                    ParameterizedType p=(ParameterizedType)t;
//                    Type[] t2=p.getActualTypeArguments();
//                    for (Type t3 : t2) {
//                        System.out.println(t3);
//                    }
//                }
//            }
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        }
        //注解可以做到在不改变代码逻辑的前提下在代码中嵌入补充信息
        //注释：给程序员看，编译器编译时会忽略注释
        //注解：给编译器看，或给其他程序看，程序根据有没有这个注解来决定不同的处理方式
        //框架是如何实现的？框架＝反射＋注解+设计模式
//        MyClass myClass = new MyClass();
//        System.out.println(myClass.a);
//        myClass.mm();
        //suppressWarings：的主要作用是抑制警告
//        @SuppressWarnings("rawtypes")
//        List list = new ArrayList();
//        try {
//            @SuppressWarnings("resource")
//            FileInputStream fis = new FileInputStream(" ");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        @SuppressWarnings("deprecation")
//        MyClass m1=new MyClass();
        //注解中也可以定义属性，只不过属性名后面必须加一个（）
        //如果这个注解中有属性。那么在使用的过程中必须进行赋值，否则会报错，除非定义注解的时候给属性指定了默认值
//        Class c1=test01.class;
//        Annotation a1=c1.getAnnotation(MyAnnotation.class);
//        System.out.println(a1);
//        //所有自定义的注解它的父类都是java.lang.annotation.Annotation
//        //java.lang.annotation.Annotation是所有注解的老祖宗

    }
}package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@MyAnnotation//这个注解会保存到字节码文件中，并且在运行的时候可以被反射
public class test01 {
//    @FunctionalInterface
//    interface Flyable{
//        void fly();
//        //void eat();
//        default void sleep(){
//            System.out.println("默认方法执行了！");
//        }
//        private static void doSomething(){
//            System.out.println("静态方法执行了");
//        }
//    }
    @MyAnnotation
    public static void main(String[] args) {
//        //获取方法上的参数的泛型信息
//        Class c1=MyClass.class;
//        try {
//            Method method1=c1.getDeclaredMethod("m", List.class, List.class);
//            Type[] t1=method1.getGenericParameterTypes();
//            for (Type t : t1) {
//                if(t instanceof ParameterizedType){
//                    ParameterizedType p=(ParameterizedType)t;
//                    Type[] p1=p.getActualTypeArguments();
//                    for (Type t2 : p1) {
//                        System.out.println(t2);
//                    }
//                }
//            }
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        }
//        Class c1=MyClass.class;
//        try {
//            Method method1=c1.getDeclaredMethod("m", List.class, List.class);
////            Type[] types=method1.getGenericParameterTypes();
//            Type types=method1.getGenericReturnType();
//            if (types instanceof ParameterizedType) {
//                ParameterizedType parameterizedType=(ParameterizedType)types;
//                Type[] types1=parameterizedType.getActualTypeArguments();
//                for (Type type : types1) {
//                    System.out.println(type);
//                }
//            }
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        }
//        Class c1=User.class;
//        try {
//            Constructor con= c1.getDeclaredConstructor(Map.class);
//            Type[] t1=con.getGenericParameterTypes();
//            for(Type t:t1){
//                if(t instanceof ParameterizedType){
//                    ParameterizedType p=(ParameterizedType)t;
//                    Type[] t2=p.getActualTypeArguments();
//                    for (Type t3 : t2) {
//                        System.out.println(t3);
//                    }
//                }
//            }
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        }
        //注解可以做到在不改变代码逻辑的前提下在代码中嵌入补充信息
        //注释：给程序员看，编译器编译时会忽略注释
        //注解：给编译器看，或给其他程序看，程序根据有没有这个注解来决定不同的处理方式
        //框架是如何实现的？框架＝反射＋注解+设计模式
//        MyClass myClass = new MyClass();
//        System.out.println(myClass.a);
//        myClass.mm();
        //suppressWarings：的主要作用是抑制警告
//        @SuppressWarnings("rawtypes")
//        List list = new ArrayList();
//        try {
//            @SuppressWarnings("resource")
//            FileInputStream fis = new FileInputStream(" ");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        @SuppressWarnings("deprecation")
//        MyClass m1=new MyClass();
        //注解中也可以定义属性，只不过属性名后面必须加一个（）
        //如果这个注解中有属性。那么在使用的过程中必须进行赋值，否则会报错，除非定义注解的时候给属性指定了默认值
//        Class c1=test01.class;
//        Annotation a1=c1.getAnnotation(MyAnnotation.class);
//        System.out.println(a1);
//        //所有自定义的注解它的父类都是java.lang.annotation.Annotation
//        //java.lang.annotation.Annotation是所有注解的老祖宗

    }
}