package test;

public class Course {
    private String idcourse;
    private String name;
    private String teacher;
    private String school;
    private double score;

    public String getIdcourse() {
        return idcourse;
    }

    public void setIdcourse(String idcourse) {
        this.idcourse = idcourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Course(String idcourse, String name, String teacher, String school, double score) {
        this.idcourse = idcourse;
        this.name = name;
        this.teacher = teacher;
        this.school = school;
        this.score = score;
    }

    public Course() {

    }
    public void print() {
        System.out.println("课程号: " + idcourse);
        System.out.println("课程名称: " + name);
        System.out.println("教师: " + teacher);
        System.out.println("学院: " + school);
        System.out.println("学分: " + score);
    }
}
