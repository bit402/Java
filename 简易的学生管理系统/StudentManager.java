package test;

import java.util.Scanner;

public class StudentManager {
    private Student[] students;
    private int count;
    public StudentManager() {
        students = new Student[test01.NUMBER];
        count = 0;
    }
    public void display() {
        if (count == 0) {
            System.out.println("暂无学生信息");
            return;
        }
        System.out.println("所有学生的信息如下：");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].toString());
        }
    }
    public void search(Scanner sc) {
        System.out.println("请输入要查找学生的学号：");
        String sno=sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (students[i].getSno().equals(sno)) {
                System.out.println("找到了该学生的信息如下：");
                System.out.println(students[i].toString());
                return;
            }
        }
        System.out.println("很抱歉没有找到该学生的信息。");
    }
    public void add(Scanner sc){
        if(count>=students.length){
            System.out.println("对不起，学生人数已满。");
            return;
        }
        System.out.println("请输入要添加的学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生的出生日期：");
        String birth = sc.nextLine();
        System.out.println("请输入学生的学号：");
        String sno = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (students[i].getSno().equals(sno)) {
                System.out.println("该学号已存在，无法添加。");
                return;
            }
        }
        System.out.println("请输入学生的性别：");
        String gender = sc.nextLine();
        System.out.println("请输入学生的电话：");
        String phone = sc.nextLine();
        students[count]=new Student(name,birth,sno,gender,phone);
        count++;
        System.out.println("学生信息添加成功。");
    }
    public void remove(Scanner sc){
        System.out.println("请输入要删除的学生的学号：");
        String sno=sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (students[i].getSno().equals(sno)) {
                students[i]=students[count-1];
                count--;
                System.out.println("该学生的信息已成功删除。");
                return;
            }
        }
        System.out.println("对不起，没有找到该学生，学号输入有误或者该学生已被删除.");
    }
    public void update(Scanner sc){
        System.out.println("请输入要修改学生的学号：");
        String sno=sc.nextLine();
        int choice=0;
        for (int i = 0; i < count; i++) {
            if (students[i].getSno().equals(sno)) {
                do {
                    System.out.println("[1]修改姓名");
                    System.out.println("[2]修改出生日期");
                    System.out.println("[3]修改学号");
                    System.out.println("[4]修改性别");
                    System.out.println("[5]修改电话");
                    System.out.println("[0]修改完毕，退出修改");
                    System.out.println("请输入你要修改的内容：");
                    choice=sc.nextInt();
                    sc.nextLine();

//                    // 处理输入问题
//                    while (!sc.hasNextInt()) {
//                        System.out.println("请输入有效的数字！");
//                        sc.next();
//                    }
//                    choice = sc.nextInt();
//                    sc.nextLine(); // 消耗换行符

                    switch (choice) {
                        case 1:
                            System.out.println("请输入修改后的名字：");
                            String name = sc.nextLine();
                            students[i].setName(name);
                            System.out.println("修改成功！");
                            break;
                        case 2:
                            System.out.println("请输入修改后的出生日期：");
                            String birth = sc.nextLine();
                            students[i].setBirth(birth);
                            System.out.println("修改成功！");
                            break;
                        case 3:
                            System.out.println("请输入修改后的学号：");
                            String newSno = sc.nextLine();
                            for (int j = 0; j < count; j++) {
                                if (students[j].getSno().equals(newSno)) {
                                    System.out.println("该学号已存在，无法添加。");
                                    return;
                                }
                            }
                            students[i].setSno(newSno);
                            System.out.println("修改成功！");
                            break;
                        case 4:
                            System.out.println("请输入修改后的性别：");
                            String gender = sc.nextLine();
                            students[i].setGender(gender);
                            System.out.println("修改成功！");
                            break;
                        case 5:
                            System.out.println("请输入修改后的电话：");
                            String phone = sc.nextLine();
                            students[i].setPhone(phone);
                            System.out.println("修改成功！");
                            break;
                        case 0:
                            System.out.println("退出修改！");
                            return;
                        default:
                            System.out.println("对不起，请按照功能编号输入");
                    }
                } while (choice != 0);
            }
        }
        System.out.println("对不起，没有找到该学生的信息");
    }
}
