package test;
import java.util.Scanner;
public class Student {
    private String name;
    private String id;
    private Course course;
    private Scanner scanf;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    public Student(String name, String id, Scanner scanf) {
        this.name = name;
        this.id = id;
        this.scanf = scanf;
    }
    public Student() {

    }
    public void menu(){
        System.out.println("**********************************");
        System.out.println("***********数学：00001*************");
        System.out.println("***********英语：00002*************");
        System.out.println("***********c语言：00003************");
        System.out.println("***********语文：00004*************");
        System.out.println("***********Java：00005************");
        System.out.println("**********************************");
    }
    public void sc(){
        Course math=new Course("00001","数学","张三","华夏大学",1.5);
        Course english=new Course("00002","英语","李四","华夏大学",2.0);
        Course c=new Course("00003","c语言","小明","华夏大学",2.0);
        Course china=new Course("00004","语文","小红","华夏大学",2.0);
        Course Java=new Course("00005","Java","小丽","华夏大学",2.0);
        menu();
        System.out.println("请输入要选的课程号：");
        String choice=scanf.next();
        switch(choice){
            case "00001" ->this.course=math;
            case "00002" ->this.course=english;
            case "00003" ->this.course=c;
            case "00004" ->this.course=china;
            case "00005" ->this.course=Java;
            default -> System.out.println("没有该课程！！！");
        }
        if(this.course!=null)
        {
            System.out.println("选课成功,课程信息为：");
            course.print();
        }
        else {
            System.out.println("没有选课信息");
        }
    }
    public void delc(){
        this.course=null;
        System.out.println("退课成功！");
    }
    public void print(){
        System.out.println("学生的个人信息为：");
        System.out.println("姓名："+name);
        System.out.println("学号："+id);
        System.out.println("选课信息：");
        if(course!=null)
        {
            course.print();
        }
        else {
            System.out.println("暂无选课信息");
        }
    }
}

