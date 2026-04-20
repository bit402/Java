package test;

public class Customer {
    private String name;
    private int age;

}
package test;

public class UserService {
    public boolean login(String username,String password){
        if("admin".equals(username) && "123456".equals(password)){
            return true;
        }
        return false;
    }
    public void logout(){
        System.out.println("退出登录");
    }
}
package test;

public class Students {
    private String name;
    private int age;

    public Students() {
    }

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void study
}
package test;

import java.lang.reflect.*;

public class test01 {

    public static void main(String[] args) {
//        Class stringClass = String.class;
//        System.out.print(Modifier.toString(stringClass.getModifiers())+" "+"class"+" ");
//        System.out.print(stringClass.getSimpleName()+" extends ");
//        //获取父类名
//        System.out.print(stringClass.getSuperclass().getSimpleName()+" implements ");
//        //获取继承的所有接口的名字：
//        Class[] interfaces=stringClass.getInterfaces();
//        if(interfaces.length>0){
//            for(int i=0;i<interfaces.length;i++){
//                if(i!=interfaces.length-1){
//                    System.out.print(interfaces[i].getSimpleName()+",");
//                }
//                else{
//                    System.out.println(interfaces[i].getSimpleName()+"{");
//                }
//            }
//        }
//        Field[] fields=stringClass.getDeclaredFields();
//        for(Field f:fields){
//            System.out.print(Modifier.toString(f.getModifiers())+" ");
//            System.out.print(f.getType().getSimpleName()+" ");
//            System.out.println(f.getName());
//        }
//        System.out.println("}");
//        Class stringClass = String.class;
//        StringBuilder sb=new StringBuilder();
//        sb.append(Modifier.toString(stringClass.getModifiers()));
//        sb.append(" class "+stringClass.getSimpleName());
//        sb.append(" extends "+stringClass.getSuperclass().getSimpleName());
//        sb.append(" implements ");
//        Class[] interfaces = stringClass.getInterfaces();
//        if(interfaces.length>0){
//            for(int i=0;i<interfaces.length;i++){
//                if(i!=interfaces.length-1){
//                    sb.append(interfaces[i].getSimpleName()+",");
//                }
//                else{
//                    sb.append(interfaces[i].getSimpleName());
//                }
//            }
//        }
//        sb.append(" {\n");
//        Field[] fields = stringClass.getDeclaredFields();
//        for(Field f:fields){
//            sb.append("\t");
//            sb.append(Modifier.toString(f.getModifiers()));
//            sb.append(" ");
//            sb.append(f.getType().getSimpleName());
//            sb.append(" ");
//            sb.append(f.getName());
//            sb.append("\n");
//        }
//        sb.append("}");
//        System.out.println(sb);
        //通过反射机制如何访问Field，如何给属性赋值，如何读取属性的值。
//        Class s1= Customer.class;
//        Customer c1=new Customer();
//        try {
//            //修改属性的值
//            //给对象赋值的三要素：给哪个对象的哪个属性赋什么值
//            Field ageField=s1.getDeclaredField("age");
//            //调用反射的方法，打破封装：
//            ageField.setAccessible(true);
//            ageField.set(c1,20);
//            //读取属性的值
//            System.out.println(ageField.get(c1));
//            Field nameField=s1.getDeclaredField("name");
//            nameField.setAccessible(true);
//            nameField.set(c1,"张三");
//            System.out.println(nameField.get(c1));
//        } catch (NoSuchFieldException | IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
        //通过反射机制获取method
//        Class c1= UserService.class;
//        try {
//            Method method=c1.getMethod("login");
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        }
        //获取所有的方法，包括私有的方法：
//        Class c1= UserService.class;
//        Method[] methods=c1.getDeclaredMethods();
//        System.out.println(methods.length);
//        for(Method method:methods){
//            System.out.print(Modifier.toString(method.getModifiers())+" ");
//            //获取方法的返回值类型：
//            System.out.print(method.getReturnType().getSimpleName()+" ");
//            System.out.print(method.getName()+" ");
//            //获取方法的参数列表：
////            Class[] parameterTypes=method.getParameterTypes();
////            for(Class parameterType:parameterTypes){
////                System.out.print(parameterType.getSimpleName()+" ");
////            }
////            System.out.println();
//            Parameter[] parameters=method.getParameters();
//            System.out.print(" ( ");
////            for(Parameter parameter:parameters){
////                System.out.print(parameter.getType().getSimpleName()+" ");
////                System.out.print(parameter.getName()+" ");
////            }
//            for(int i=0;i<parameters.length;i++){
//                if(i!=parameters.length-1){
//                    System.out.print(parameters[i].getType().getSimpleName()+" ");
//                    System.out.print(parameters[i].getName()+",");
//                }
//                else{
//                    System.out.print(parameters[i].getType().getSimpleName()+" ");
//                    System.out.print(parameters[i].getName());
//                }
//            }
//            System.out.println(" ) ");
//            System.out.println();
//        }
        //反射一个类中所有的方法然后进行拼接字符串
//        StringBuilder sb = new StringBuilder();
//        Class c1 = String.class;
//        sb.append(Modifier.toString(c1.getModifiers()));
//        sb.append(" class ");
//        sb.append(c1.getSimpleName());
//        sb.append(" extends ");
//        sb.append(c1.getSuperclass().getSimpleName());
//        sb.append(" implements ");
//        Class[] interfaces = c1.getInterfaces();
//        for (int i = 0; i < interfaces.length; i++) {
//            if (i != interfaces.length - 1) {
//                sb.append(interfaces[i].getSimpleName());
//                sb.append(",");
//            } else {
//                sb.append(interfaces[i].getSimpleName());
//            }
//        }
//        sb.append(" {\n");
//        Field[] fields = c1.getDeclaredFields();
//        for (Field f : fields) {
//            sb.append("\t");
//            sb.append(Modifier.toString(f.getModifiers()));
//            sb.append(" ");
//            sb.append(f.getType().getSimpleName());
//            sb.append(" ");
//            sb.append(f.getName());
//            sb.append("\n");
//        }
//        Method[] methods = c1.getDeclaredMethods();
//        for (Method m : methods) {
//            sb.append("\t");
//            sb.append(Modifier.toString(m.getModifiers()));
//            sb.append(" ");
//            sb.append(m.getReturnType().getSimpleName());
//            sb.append(" ");
//            sb.append(m.getName());
//            sb.append("(");
//            Parameter[] parameters = m.getParameters();
//            for (int i = 0; i < parameters.length; i++) {
//                if (i != parameters.length - 1) {
//                    sb.append(parameters[i].getType().getSimpleName());
//                    sb.append(" ");
//                    sb.append(parameters[i].getName());
//                    sb.append(",");
//                } else {
//                    sb.append(parameters[i].getType().getSimpleName());
//                    sb.append(" ");
//                    sb.append(parameters[i].getName());
//                }
//            }
//            sb.append(") {}\n");
//        }
//        sb.append("}\n");
//        System.out.println(sb.toString());
        UserService u1 = new UserService();
        boolean flag = u1.login("admin", "123456");
        System.out.println(flag ? "登录成功" : "登录失败");
        u1.logout();
        //调用一个方法需要四要素：1.调用哪个对象  2.调用哪个方法？ 3.传什么参数？ 4.返回什么值
        //通过反射机制调用login方法
        Class c1=UserService.class;
        try {
            //获取login方法
            Method method=c1.getDeclaredMethod("login", String.class, String.class);
            Object result=method.invoke(u1,"admin","123456");
            System.out.println(result);
            //调用logout方法
            Method method1=c1.getDeclaredMethod("logout");
            Object result1=method1.invoke(u1);
            System.out.println(result1);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}