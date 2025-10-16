package test;
import java.util.Scanner;
public class test01 {
public static final int NUMBER=50;
    public static void main(String[] args){
        Student students = null;
        //ScannerManager scm = new ScannerManager();
        StudentManager sm = new StudentManager();
        int choice=0;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("欢迎使用学生管理系统！");
            System.out.println("请输入对应的功能编号来实现相应的功能：");
            System.out.println("[1]显示所有的学生信息");
            System.out.println("[2]查找学生信息");
            System.out.println("[3]添加学生信息");
            System.out.println("[4]修改学生信息");
            System.out.println("[5]删除学生信息");
            System.out.println("[0]退出程序");
            System.out.println("请输入功能编号：");
           choice=sc.nextInt();
           sc.nextLine();
            //choice=scm.scint();
            switch (choice){
                case 1->sm.display();
                case 2->sm.search(sc);
                case 3->sm.add(sc);
                case 4->sm.update(sc);
                case 5->sm.remove(sc);
                case 0->{
                    System.out.println("退出程序");
                }
                default ->{
                    System.out.println("对不起，请按照功能编号输入");
                }
            }
        }while (choice!=0);
        sc.close();
    }
}