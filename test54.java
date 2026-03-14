package test;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private transient int age;
    private static final long serialVersionUID=1234566L;
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
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

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
package test;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class test01 {

    public static void main(String[] args)  {
//        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("lianxi"))) {
//            Date date1=new Date();
//            Date date2=new Date();
//            Date date3=new Date();
//            Date date4=new Date();
//            Date date5=new Date();
//            List<Date> list=new ArrayList<>();
//            list.add(date1);
//            list.add(date2);
//            list.add(date3);
//            list.add(date4);
//            list.add(date5);
//            oos.writeObject(list);
//            oos.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("lianxi"))) {
//            List<Date> list=(List<Date>)ois.readObject();
//            for(Date d:list){
//                System.out.println(d);
//            }
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("lianxi"))) {
//            Student s=new Student();
//            oos.writeObject(s);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("lianxi"))) {
//            System.out.println(ois.readObject());
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("lianxi"))) {
//            Student s=new Student("zhangsan",18,"男");
//            oos.writeObject(s);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("lianxi"))) {
//            System.out.println(ois.readObject());
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("lianxi"))) {
//            Student s=new Student("zhangsan",18);
//            oos.writeObject(s);
//            oos.flush();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("lianxi"))) {
//            System.out.println(ois.readObject());
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        try(PrintStream ps=new PrintStream("lianxi")) {
//            ps.print(100);
//            ps.println(true);
//            ps.println(3.14);
//            ps.println(3.14f);
//            ps.println('n');
//            ps.println("nihao");
//            ps.println(2L);
//            ps.println("\"hello,world\"");
//            String name="张三";
//            double score=95.5;
//            ps.printf("%s的考试成绩为：%.2f",name,score);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        try(PrintWriter pw=new PrintWriter(new FileOutputStream("lianxi"))) {
//            pw.println("hello,world");
//            pw.flush();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        try(PrintWriter pr=new PrintWriter(new FileWriter("lianxi",true),true)) {
//            pr.println("你好呀");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        InputStream in = System.in;
//        byte[] bytes = new byte[1024];
//        int length = 0;
////        while((length=in.read(bytes))!=-1){
////            System.out.println(new String(bytes,0,length));
////        }
//        length=in.read(bytes);
//        for(int i=0;i<length;i++){
//            System.out.print(bytes[i]);
//        }
//        System.setIn(new FileInputStream("lianxi"));
//        InputStream in = System.in;
//        byte[] bytes = new byte[1024];
//        int length=0;
//        while((length=in.read(bytes))!=-1){
//            System.out.println(new String(bytes,0,length));
//        }
//        try(BufferedReader br =new BufferedReader(new InputStreamReader(System.in))){
//            String s = null;
//            while ((s=br.readLine())!=null){
//                System.out.println(s);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try(PrintStream ps=System.out){
//            ps.println("hello,world");
//            ps.println("hello,world");
//            ps.println("hello,world");
//            System.setOut(new PrintStream("lianxi"));
//            ps.println("hello,lianxi");
//            System.out.println("hello,lianxi");
//            //rizhiwenjian
//            Date now = new Date();
//            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
//            String date = sdf.format(now);
//            System.out.println(date);
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        File file=new File("D:\\练习输入输出流\\file.txt");
//        System.out.println(file.exists()?"存在":"不存在");
//        if(!file.exists()){
        //如果不存再则以新文件的形式创建出来
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
        //如果不存在则以目录的形式创建出来
//        if(!file.exists()){
//            file.mkdir();
//        }
        File file=new File("D:\\练习输入输出流\\a\\b\\c");
        System.out.println(file.exists()?"存在":"不存在");
        if(!file.exists()){
            file.mkdirs();
        }
    }
}