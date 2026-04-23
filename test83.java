package test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD,ElementType.FIELD})
public @interface Annotation2 {
    String email() default "";
    double price() default 0.0;
}
package test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface Annotation1 {
    String name() default "";
    int age() default 0;
}
package test;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnocation {
}
package test;
@MyAnnocation
public class Animal {
}
package test;

@Annotation1(name = "nihaoya", age = 18)
@Annotation2(email = "qq.com", price = 99.9)
public class Cat extends Animal {
    @Annotation1(name = "nihaoya", age = 18)
    @Annotation2(email = "qq.com", price = 99.9)
    String name;
    @Annotation1(name = "nihaoya", age = 18)
    @Annotation2(email = "qq.com", price = 99.9)
    public void eat() {
        System.out.println("吃");
    }
}
package test;

public @interface Authors {
    Author[] value();
}
package test;

import java.lang.annotation.Repeatable;

@Repeatable(Authors.class)
public @interface Author {
    String name();
}
package test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Table {
    String value();
}
package test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Column {
    String name() ;
    String type() default "varchar";
}
package test;
@Table("t_user")
public class User {
    @Column(name="uid")
    private String userid;
    @Column(name="uname")
    private String username;
    @Column(name="pwd")
    private String password;
    @Column(name="age",type = "int")
    private int age;
    private String email;
}
package b;

import test.Column;
import test.Table;

@Table("t_customer")
public class Customer {
    @Column(name="cid")
    private String cid;
    @Column(name="name")
    private String name;
    @Column(name="addr")
    private String address;
    @Column(name="age",type = "int")
    private int age;
}
package test.a;

import test.Column;
import test.Table;

@Table("t_vip")
public class Vip {
    @Column(name="id")
    private String id;
    @Column(name="name")
    private String name;
    @Column(name="grade")
    private String grade;
}
package test;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URISyntaxException;

public class test01 {
//    public static String spath;
//    public static StringBuilder sb=new StringBuilder();
//    public static void digui(File file) {
//        if(file.isFile()){
//            String className = file.getAbsolutePath();
//            if(className.endsWith(".class")){
//                className=className.substring(spath.length()-1,className.length()-".class".length()).replace('\\','.');
////                System.out.println(className);
//                try {
//                    Class c1=Class.forName(className);
//                    if(c1.isAnnotationPresent(Table.class)){
//                        Table annotation= (Table) c1.getAnnotation(Table.class);
//                        String tn=annotation.value();
//                        sb.append("create table "+tn+"(\n");
//                        Field[] fields=c1.getDeclaredFields();
//                        for(Field f:fields){
//                            if(f.isAnnotationPresent(Column.class)){
//                                Column column=f.getAnnotation(Column.class);
//                                sb.append("\t"+column.name()+" "+column.type()+",\n");
//                            }
//                        }
//                        sb.deleteCharAt(sb.length()-1);
//                        sb.deleteCharAt(sb.length()-1);
//                        sb.append("\n);\n");
//                    }
//                } catch (ClassNotFoundException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            return;
//        }
//        File[] files = file.listFiles();
//        for (File f : files) {
//            digui(f);
//        }
//    }
//    @MyAnnocation
    public static void main(String[] args) {
//        @Author(name = "nihao")
//        @Author(name = "ya")
//        Class c1 = Cat.class;
//        Annotation mat = c1.getAnnotation(MyAnnocation.class);
//        System.out.println(mat);
//        Class c1= Cat.class;
//        Annotation[] annotations = c1.getAnnotations();
//        for (Annotation annotation : annotations) {
//            System.out.println(annotation);
//        }
//        if(c1.isAnnotationPresent(Annotation1.class)){
//            Annotation a1= c1.getAnnotation(Annotation1.class);
//            System.out.println(a1);
//        }
//        if(c1.isAnnotationPresent(Annotation2.class)){
//            Annotation a2= c1.getAnnotation(Annotation2.class);
//            System.out.println(a2);
//        }
//        Method[] methods=c1.getDeclaredMethods();
//        for(Method method:methods){
//            if(method.isAnnotationPresent(Annotation1.class)){
//                Annotation1 a1=method.getAnnotation(Annotation1.class);
//                System.out.println(a1.name());
//                System.out.println(a1.age());
//                System.out.println(a1);
//            }
//            if(method.isAnnotationPresent(Annotation2.class)){
//                Annotation2 a2=method.getAnnotation(Annotation2.class);
//                System.out.println(a2.email());
//                System.out.println(a2.price());
//                System.out.println(a2);
//            }
//        }
//        Field[] fields=c1.getDeclaredFields();
//        for(Field f:fields){
//            if(f.isAnnotationPresent(Annotation1.class)){
//                Annotation a1=f.getAnnotation(Annotation1.class);
//                System.out.println(a1);
//            }
//            if(f.isAnnotationPresent(Annotation2.class)){
//                Annotation2 a2=f.getAnnotation(Annotation2.class);
//                System.out.println(a2);
//            }
//        }
        //扫描所有的类路径当中的文件，找到所有的.class结尾的文件
        //通过.class文件的路径找到对应的全限定类名（带包名）
//        try {
//             spath=Thread.currentThread().getContextClassLoader().getResource(".").toURI().getPath();
////            System.out.println(spath);
////            System.out.println("test.test01");
//            File file=new File(spath);
//            digui(file);
//            System.out.println(sb);
//        } catch (URISyntaxException e) {
//            throw new RuntimeException(e);
//        }
        try {
             cpath=Thread.currentThread().getContextClassLoader().getResource(".").toURI().getPath();
//            System.out.println(cpath);
            File file=new File(cpath);
//            System.out.println(file.getAbsolutePath());
            digui(file);
            System.out.println(sb);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
    public static StringBuilder sb=new StringBuilder();
    public static String cpath;
    public static void digui(File file) {
        if(file.isFile()){
//            System.out.println(file.getAbsolutePath());
           if(file.getName().endsWith(".class")){
               String path=file.getAbsolutePath();
               path=path.substring(cpath.length()-1,path.length()-".class".length());
//               System.out.println(path);
               path=path.replace('\\','.');
//               System.out.println(path);
               try {
                   Class c1=Class.forName(path);
                   if(c1.isAnnotationPresent(Table.class)){
                       Table table= (Table) c1.getAnnotation(Table.class);
                       sb.append("create table "+table.value()+"(\n");
                       Field[] fields=c1.getDeclaredFields();
                       for(Field f:fields){
                           if(f.isAnnotationPresent(Column.class)){
                               Column column=f.getAnnotation(Column.class);
                               sb.append("\t"+column.name()+" "+column.type()+",\n");
                           }
                       }
                       sb.deleteCharAt(sb.length()-2);
                       sb.append(");\n");
                   }
               } catch (ClassNotFoundException e) {
                   throw new RuntimeException(e);
               }
           }
            return;
        }
        File[] files=file.listFiles();
        for(File f:files){
            digui(f);
        }
    }
}