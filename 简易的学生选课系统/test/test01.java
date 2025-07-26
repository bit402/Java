package test;
import java.util.Scanner;
public class test01 {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Student s1 = new Student("小帅","20250001",scanf);
        Student s2 = new Student("小美","20250002",scanf);
        System.out.println("姓名："+s1.getName());
        System.out.println("学号："+s1.getId());
        System.out.println("选课信息："+s1.getCourse());
        s1.sc();
        s1.print();
        s1.delc();
        s1.print();
        System.out.println("姓名："+s2.getName());
        System.out.println("学号："+s2.getId());
        System.out.println("选课信息："+s2.getCourse());
        s2.sc();
        s2.print();
        scanf.close();
    }
}
