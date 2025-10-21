package test;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ArraysTest {
    @Test
    public void testBinarySearch() {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.binarySearch(a,5));
    }
    @Test
    public void testFill(){
        int[] arr=new int[10];
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr,10);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr,1,3,100);
        System.out.println(Arrays.toString(arr));
    }
    @Test
    public void testCopyOf(){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int[] newarr=Arrays.copyOf(arr,3);
        System.out.println(Arrays.toString(newarr));
        int[] newarr2=Arrays.copyOfRange(arr,2,4);
        System.out.println(Arrays.toString(newarr2));
    }
    @Test
    public void testAdList(){
        List list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
package test;

public class IlegalAgeException extends Exception {
    public IlegalAgeException() {

    }
    public IlegalAgeException(String message) {
        super(message);
    }
}
package test;

public class IlegalNameException extends Exception {
    public IlegalNameException() {
    }

    public IlegalNameException(String message) {
        super(message);
    }
}
package test;

public class IllegalRealName extends IlegalNameException{
    public IllegalRealName() {
    }

    public IllegalRealName(String message) {
        super(message);
    }
}
package test;

public class User {
    private String name;
    private int age;

    public User(int age) {
        this.age = age;
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

    public void setAge(int age) throws Exception {
        if (age < 0) {
            throw new Exception("名字不合法！");
        }
        this.age = age;
    }

}
package test;
//import java.util.Scanner;
public class test01 {

    public static void main(String[] args){
//        NullPointerException e=new NullPointerException();
//        //throw e;
//        //合并
//        throw new NullPointerException();
//        Scanner sc = new Scanner(System.in);
//        IlegalAgeException illegalAgeException = new IlegalAgeException();
//        IlegalNameException illegalNameException = new IlegalNameException();
//        System.out.println("请输入您的用户名：");
//        String name = sc.nextLine();
//        System.out.println("请输入您的年龄：");
//        int age = sc.nextInt();
//        sc.close();
//        try{
//            if(age<18){
//                throw illegalAgeException;
//            }
//            else if(name.length()<6 || name.length()>12){
//                throw illegalNameException;
//            }
//        }catch(IlegalAgeException e){
//            System.out.println("年龄不合法");
//        }catch(IlegalNameException e){
//            System.out.println("名字不合法！");
//        }
        User user=new User(18);
//        System.out.println(user.getName());
        try {
            user.setAge(-100);
        } catch (Exception e) {
            String message=e.getMessage();
            System.out.println(message);
            e.printStackTrace();
            System.out.println("年龄设置不合法");
        }
    }
}