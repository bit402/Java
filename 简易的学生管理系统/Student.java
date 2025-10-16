package test;
import java.util.Scanner;
import java.util.Arrays;

public class Student {
    private String name;
    private String birth;
    private String sno;
    private String gender;
    private String phone;
    //private Student[] students;

    public Student() {
        //students=new Student[test01.NUMBER];
    }

    public Student(String name, String birth, String sno, String gender, String phone) {
        this.name = name;
        this.birth = birth;
        this.sno = sno;
        this.gender = gender;
        this.phone = phone;
    }
    //    public Student(String name, String birth, String sno, String gender, String phone, Student[] students) {
//        this.name = name;
//        this.birth = birth;
//        this.sno = sno;
//        this.gender = gender;
//        this.phone = phone;
//        this.students = students;
//        students=new Student[test01.NUMBER];
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //public Student[] getStudents() {
//        return students;
//    }

   // public void setStudents(Student[] students) {
//        this.students = students;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", sno='" + sno + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
//                ", students=" + Arrays.toString(students) +
                '}';
    }
//    public void display() {
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] != null) {
//                System.out.println(students[i].toString());
//            }
//            else {
//                System.out.print("null");
//            }
//        }
//    }
//    public void search(Scanner sc) {
//        //Scanner sc=new Scanner(System.in);
//        System.out.println("请输入要查询的学生的学号：");
//        String sno=sc.nextLine();
//        //sc.close();
//        for (int i = 0; i < students.length; i++) {
//            if(students[i]!=null){
//                if(students[i].getSno().equals(sno)){
//                    System.out.println("找到了，该学生的信息如下：");
//                    System.out.println(students[i].toString());
//                    return;
//                }
//            }
//        }
//        System.out.println("很抱歉，没有找到该学生的信息。");
//    }
//    public void add(Scanner sc){
//        //Scanner sc=new Scanner(System.in);
//        System.out.println("请输入要添加的学生姓名：");
//        String name=sc.nextLine();
//        System.out.println("请输入学生的出生日期：");
//        String birth=sc.nextLine();
//        System.out.println("请输入学生的学号：");
//        String sno=sc.nextLine();
//        System.out.println("请输入学生的性别：");
//        String gender=sc.nextLine();
//        System.out.println("请输入学生的电话：");
//        String phone=sc.nextLine();
//        //sc.close();
//        for (int i = 0; i < students.length; i++) {
//            if(students[i]=null){
//                students[i]=new Student();
//                students[i].name=name;
//                students[i].birth=birth;
//                students[i].sno=sno;
//                students[i].gender=gender;
//                students[i].phone=phone;
//                return;
//            }
//        }
//        System.out.println("对不起学生人数已满！");
//    }
//    public void remove(Scanner sc){
//        //Scanner sc=new Scanner(System.in);
//        System.out.println("请输入要删除的学生的学号：");
//        String sno=sc.nextLine();
//        //sc.close();
//        for (int i = 0; i < students.length; i++) {
//            if (students[i]!=null){
//                if(students[i].getSno().equals(sno)){
//                    students[i]=null;
//                    return;
//                }
//            }
//        }
//        System.out.println("对不起没有找到该学生，学号输入有误或者该学生已被删除！");
//    }
//    public void update(Scanner sc){
//        //Scanner sc=new Scanner(System.in);
//        System.out.println("请输入你要修改的学生的学号：");
//        String sno=sc.nextLine();
//        //sc.close();
//        int choice=0;
//        for (int i = 0; i < students.length; i++) {
//            if (students[i]!=null){
//                if(students[i].getSno().equals(sno)){
//                    //Scanner sc=new Scanner(System.in);
//                    do {
//                        System.out.println("[1]修改姓名：");
//                        System.out.println("[2]修改出生日期");
//                        System.out.println("[3]修改学号");
//                        System.out.println("[4]性别");
//                        System.out.println("[5]电话");
//                        System.out.println("[0]修改完毕，退出修改");
//                        System.out.println("请输入你要修改的内容：");
//                        choice=sc.nextInt();
//                        switch (choice) {
//                            case 1->{
//                                System.out.println("请输入修改后的名字：");
//                                String name=sc.nextLine();
//                                students[i].setName(name);
//                                System.out.println("修改成功！");
//                            }
//                            case 2->{
//                                System.out.println("请输入修改后的出生日期：");
//                                String birth=sc.nextLine();
//                                students[i].setBirth(birth);
//                                System.out.println("修改成功！");
//                            }
//                            case 3->{
//                                System.out.println("请输入修改后的学号：");
//                                String sno2=sc.nextLine();
//                                students[i].setSno(sno2);
//                                System.out.println("修改成功！");
//                            }
//                            case 4->{
//                                System.out.println("请输入修改后的性别：");
//                                String gender=sc.nextLine();
//                                students[i].setGender(gender);
//                                System.out.println("修改成功！");
//                            }
//                            case 5->{
//                                System.out.println("请输入修改后的电话：");
//                                String phone=sc.nextLine();
//                                students[i].setPhone(phone);
//                                System.out.println("修改成功！");
//                            }
//                            case 0->{
//                                System.out.println("退出修改！");
//                                return;
//                            }
//                            default ->{
//                                System.out.println("对不起，请按照功能编号输入");
//                            }
//                        }
//                    }while (choice!=0);
//                }
//            }
//        }
//        System.out.println("对不起没查找到该学生信息");
//    }
}
