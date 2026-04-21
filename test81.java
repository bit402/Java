package test;

public class Order {
    private String no;
    private double price;
    private String state;

    public Order() {
    }

    public Order(String no, double price) {
        this.no = no;
        this.price = price;
    }

    public Order(String no, double price, String state) {
        this.no = no;
        this.price = price;
        this.state = state;
    }

    public Order(String no) {
        this.no = no;
    }


    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Order{" +
                "no='" + no + '\'' +
                ", price=" + price +
                ", state='" + state + '\'' +
                '}';
    }
}
className=test.UserService
methodName=login
parameterType=java.lang.String,java.lang.String
parameterValue=admin,123456package test;

public class UserService {
    public boolean login (String username,String password){
        return "admin".equals(username) && "123456".equals(password);
    }
    public void logout (){
        System.out.println("系统已安全退出");
    }
    public String pj(String a,String b,String c){
        return a+b+c;
    }
}
package test;
//注：下面的那三个泛型都是针对Animal来说的
public class Cat extends Animal <String,Integer,Double>{

}
package test;

public class Animal <X,Y,Z>{
    //在类上定义泛型
}
package test;

public class Mouse implements Flyable<String,Integer>,Comparable<Mouse>{
    @Override
    public int compareTo(Mouse o) {
        return 0;
    }
}
package test;

public interface Flyable <X,Y>{
}
package test;

import java.util.Map;

public class User {
    Map<Integer,String> map;
}
package test;

import java.util.List;

public class MyClass {
    public void m(List<String> list) {

    }
}
package test;

import java.lang.reflect.*;
import java.util.List;
import java.util.ResourceBundle;

public class test01 {

    public static void main(String[] args) {
//        //通过反射机制获取一个类中所有的构造方法：
//        StringBuilder sb =new StringBuilder();
//        //获取类
//        Class c1=String.class;
//        sb.append(Modifier.toString(c1.getModifiers()));
//        sb.append(" class ");
//        sb.append(c1.getSimpleName());
//        sb.append(" extends ");
//        sb.append(c1.getSuperclass().getSimpleName());
//        Class[] interfaces=c1.getInterfaces();
//        if(interfaces.length>0){
//            sb.append(" implements ");
//        }
//        for(int i=0;i<interfaces.length;i++){
//            if(i!=interfaces.length-1){
//                sb.append(interfaces[i].getSimpleName());
//                sb.append(",");
//            }
//            else{
//                sb.append(interfaces[i].getSimpleName());
//            }
//        }
//        sb.append(" {\n");
//        Constructor[] constructors=c1.getConstructors();
//        for(Constructor c:constructors){
//            sb.append("\t");
//            sb.append(Modifier.toString(c.getModifiers()));
//            sb.append(" ");
//            sb.append(c.getName());
//            sb.append("(");
//            Parameter[] parameters=c.getParameters();
//            for(int i=0;i<parameters.length;i++){
//                if(i!=parameters.length-1){
//                    sb.append(parameters[i].getType().getSimpleName());
//                    sb.append(" ");
//                    sb.append(parameters[i].getName());
//                    sb.append(",");
//                }
//                else{
//                    sb.append(parameters[i].getType().getSimpleName());
//                    sb.append(" ");
//                    sb.append(parameters[i].getName());
//                }
//            }
//            sb.append(")");
//            sb.append("{}");
//            sb.append("\n");
//        }
//        sb.append("}");
//        System.out.println(sb);
        //通过反射机制来调用构造方法，创建对象，
        //不使用反射机制来创建对象：
//        Order o1=new Order();
//        System.out.println(o1);
//        //通过反射机制来实例化对象：
//        Class c1=Order.class;
//        try {
//            //注：这里是通过的无参构造方法
//            Object o2=c1.newInstance();
//            System.out.println(o2);
//        } catch (InstantiationException | IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
//        //获取order中的无参构造方法：
//        try {
//            Constructor constructor= c1.getDeclaredConstructor();
//            //调用无参构造来实例化一个对象：
//            Object o2=constructor.newInstance();
//            System.out.println(o2);
//            //使用有参的构造方法：
//            Constructor constructor2=c1.getDeclaredConstructor(String.class);
//            Object o3=constructor2.newInstance("test");
//            System.out.println(o3);
//            Constructor constructor3=c1.getDeclaredConstructor(String.class,double.class,String.class);
//            Object o4=constructor3.newInstance("test",18.0,"nihao");
//            System.out.println(o4);
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        } catch (InvocationTargetException e) {
//            throw new RuntimeException(e);
//        } catch (InstantiationException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
        //模拟框架的部分代码，通过读取属性配置文件，获取类信息，方法信息，通过反射机制来调用方法
        //读取属性配置文件：
//        ResourceBundle rb = ResourceBundle.getBundle("test.config");
//        String className = rb.getString("className");
//        String methodName = rb.getString("methodName");
//        String parameterType = rb.getString("parameterType");
//        String parameterValue = rb.getString("parameterValue");
//        try {
//            Class<?> c1=Class.forName(className);
//            Constructor<?> def=c1.getDeclaredConstructor();
//            Object o1=def.newInstance();
//            String[] ss=parameterType.split(",");
//            Class[] cc=new Class[ss.length];
//            for(int i=0;i<ss.length;i++){
//                cc[i]=Class.forName(ss[i]);
//            }
//            Method m1=c1.getMethod(methodName,cc);
//            String[] values=parameterValue.split(",");
//            Object result=m1.invoke(o1,values);
//            System.out.println(result);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        } catch (InvocationTargetException e) {
//            throw new RuntimeException(e);
//        } catch (InstantiationException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
        //获取Class的第四种方式：
        //获取的是系统类加载器（应用类加载器）
//        ClassLoader loader = ClassLoader.getSystemClassLoader();
//        System.out.println(loader);
//        //这个类加载器是负责加载classpath中的字节码文件的
//        try {
//            //加载类：这个加载过程只完成了类加载的前两部，第三部初始化没做
//            //什么时候初始化？在这个类真正被使用的时候
//            Class<?> aClass=loader.loadClass("test.UserService");
//            System.out.println(aClass.newInstance());
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (InstantiationException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
        //通过自定义的类获取的类加载器是：应用类加载器
//        ClassLoader appClassLoader=test01.class.getClassLoader();
//        System.out.println("应用类加载器"+appClassLoader);
//        //获取应用类加载器
//        ClassLoader systemClassLoader=ClassLoader.getSystemClassLoader();
//        System.out.println(systemClassLoader);
//        //获取应用类加载器：
//        ClassLoader appClassLoader3=Thread.currentThread().getContextClassLoader();
//        System.out.println(appClassLoader3);
//        //通过getParent()可以获取当前类加载器的 父 类加载器
//        //获取平台类加载器：
//        System.out.println("平台类加载器："+appClassLoader.getParent());
//        //启动类加载器：
//        //注：启动类加载器负责加载的是JDK的核心类库，这个类加载器的名字看不到，直接输出的时候结果是null
//        System.out.println("启动类加载器："+appClassLoader.getParent().getParent());
        //获取父类的泛型信息：
//        Class<Cat> c1=Cat.class;
//        Type t1=c1.getGenericSuperclass();
//        System.out.println(t1);
//        System.out.println(t1 instanceof Class);
//        System.out.println(t1 instanceof ParameterizedType);
//        //如果父类使用了泛型
//        if(t1 instanceof ParameterizedType) {
//            ParameterizedType pt = (ParameterizedType)t1;
//            //获取泛型数组
//            Type[] tt=pt.getActualTypeArguments();
//            //遍历泛型数组
//            for(Type t:tt) {
//                //获取泛型的具体类型名
//                System.out.println(t);
//            }
//        }
//        Class<Mouse> c1=Mouse.class;
//        Type[] t1=c1.getGenericInterfaces();
//        for (Type t : t1) {
//            if (t instanceof ParameterizedType) {
//                ParameterizedType pt = (ParameterizedType) t;
//                Type[] t2=pt.getActualTypeArguments();
//                for (Type t3 : t2) {
//                    System.out.println(t3);
//                }
//            }
//        }
        //获取属性上的繁星，需要先获取属性
//        Class<User> c1=User.class;
//        try {
//            Field field= c1.getDeclaredField("map");
//            Type type = field.getGenericType();
//            if(type instanceof ParameterizedType){
//                ParameterizedType pt = (ParameterizedType)type;
//                Type[] actualTypeArguments = pt.getActualTypeArguments();
//                for (Type actualTypeArgument : actualTypeArguments) {
//                    System.out.println(actualTypeArgument);
//                }
//            }
//        } catch (NoSuchFieldException e) {
//            throw new RuntimeException(e);
//        }
        Class<MyClass> c1=MyClass.class;
        try {
            Constructor<MyClass> cs=c1.getDeclaredConstructor();
            Object o1=cs.newInstance();
            Method method=c1.getDeclaredMethod("o1", List.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}