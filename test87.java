package test;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String gender;

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(gender, student.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

//    @Override
//    public boolean equals(Object object) {
//        if (object == null || getClass() != object.getClass()) return false;
//        Student student = (Student) object;
//        return age == student.age;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(age);
//    }
}
package test;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public static List<Student> getStudent(){
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("aaa",18,"男"));
        list.add(new Student("baaaaa",20,"男"));
        list.add(new Student("ca",22,"女"));
        list.add(new Student("daaaaa",20,"男"));
        list.add(new Student("eaaaaaaa",19,"女"));
        list.add(new Student("eaaaaaaa",19,"女"));
        list.add(new Student("eaaaaaaa",19,"女"));
        return list;
    }
}
package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class test01 {

    public static void main(String[] args) {
//        //获取stream流对象的第一种方式：通过collection接口的stream()方法来获取stream对象
//        List<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        Stream<Integer> stream=list.stream();
//        stream.forEach(System.out::println);
//        //注：这个流属于顺序流，本质是单线程的，如果数据量不是很大的话考虑这种方式。
//        System.out.println(stream);
//        //通过stream中的元素可以对集合中的对象进行计算
//        //parallelStream默认是多线程，程序员不需要去干涉（这是一个并行流）
//        //在计算的时候会自动启动多线程去运算
//        //数据量非常庞大的时候才会去考虑并行流parallelStream
//        Stream<Integer> parallelStream=list.parallelStream();
//        System.out.println(parallelStream);
//        String[] str={"nihao","zao","haha"};
//        Stream<String> stream1= Arrays.stream(str);
//        System.out.println(stream1);
//        int[] nums={1,2,3,4,5};
//        IntStream intStream=Arrays.stream(nums);
//        System.out.println(intStream);
//        long[] nums2 = {1,2,3,4,5};
//        LongStream longStream=Arrays.stream(nums2);
//        System.out.println(longStream);
        //获取stream对象的第三种方式：使用stream接口本身的of（可变长度参数）的方法
//        Stream<String> stream = Stream.of("a", "b", "c");
//        System.out.println(stream);
//        System.out.println(stream.isParallel());
//        Stream parallel=stream.parallel();
//        System.out.println(parallel);
//        System.out.println(parallel.isParallel());
//        System.out.println(parallel==stream);
//        Stream<Integer> stream1 = Stream.of(1, 2, 3);
//        System.out.println(stream1);
//        List<Student> list=StudentService.getStudent();
//        Stream<Student> stream=list.stream();
//        Stream<Student> ns=stream.filter(new Predicate<Student>() {
//            @Override
//            public boolean test(Student student) {
//                return student.getAge()>=20;
//            }
//        });
//        ns.forEach(System.out::println);
//        Stream<Student> ns1=stream.filter(student -> student.getAge()>=20);
//        ns1.forEach(System.out::println);
//        //报错的核心原因是；流是一次性用品
//        List<Student> list=StudentService.getStudent();
//        Stream<Student> stream=list.stream();
//        stream.filter(student->student.getAge()>=20).forEach(System.out::println);
//        //筛选出字符串长度大于3的
//        Stream<String> stream = Stream.of("nihao", "zao", "chifanlema");
//        stream.filter(s->s.length()>3).forEach(System.out::println);
//        //要求筛选出学生名字长度大于4的学生：
//        List<Student> list=StudentService.getStudent();
//        Stream<Student> stream=list.stream();
//        stream.filter(s->s.getName().length()>4).forEach(System.out::println);
        //map指的是映射操作，本质上是转换操作：
//        Stream.of("abc","def","xyz").map(new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return s.toUpperCase();
//            }
//        }).forEach(System.out::println);
//        Stream.of("abc","def","ghi","jkl","mno","pqr","tuv","wxyz")
//                .map(String::toUpperCase).forEach(System.out::println);
//        //获取集合中所有学生的名字：
//        StudentService.getStudent().stream().map(Student::getName).forEach(System.out::println);
//        //获取集合中性别为男的学生的名字：
//        StudentService.getStudent().stream().filter(s->s.getGender().equals("男"))
//                .map(Student::getName).forEach(System.out::println);
//        //多个集合中的数据合并到一个Stream流中
//        List<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        List<Integer> list2=new ArrayList<>();
//        list2.add(7);
//        list2.add(7);
//        list2.add(7);
//        list2.add(7);
//        list2.add(7);
//        //匿名内部类的方式：
//        Stream.of(list,list2).flatMap(new Function<List<Integer>,Stream<Integer>>() {
//            @Override
//            public Stream<Integer> apply(List<Integer> integers) {
//                return integers.stream();
//            }
//        }).forEach(System.out::println);
//        System.out.println("==============");
//        //lambda表达式的方式：
//        Stream.of(list,list2).flatMap(a->a.stream()).forEach(System.out::println);
//        System.out.println("=============");
//        //函数引用：
//        Stream.of(list,list2).flatMap(List::stream).forEach(System.out::println);
//        //distinct:去重，去除重复的记录
//        //去除重复的记录依赖于hashcod和equals方法，记得重写
//        StudentService.getStudent().stream().distinct().forEach(System.out::println);
        //去除年龄相同的学生：(输出除重后的学生的年龄)：
//        StudentService.getStudent().stream().distinct().map(Student::getAge).forEach(System.out::println);
        //Stream中间操作之-排序：sorted():
//        Stream.of(5,-1,0,6,8,2,3,1).sorted().forEach(System.out::println);
//        Stream.of("aaa","aab","abb","b","d","c").sorted().forEach(System.out::println);
        //需求：按照学生的年龄进行升序排序（排序后输出学生对象）
        //StudentService.getStudent().stream().distinct().sorted((a,b)->a.getAge()-b.getAge()).forEach(System.out::println);
        //需求：按照学生的年龄进行升序排序，拍好之后输出学生的年龄：
//        StudentService.getStudent().stream().distinct().map(Student::getAge).sorted().forEach(System.out::println);
        //要求使用比较器进行排序：
//        Stream.of(10,20,5,6,2,3,8,1).sorted(Integer::compare).forEach(System.out::println);
        //要求按照学生的年龄进行”降序排序“（排序后输出学生对象）
//        StudentService.getStudent().stream().sorted((a,b)->b.getAge()-a.getAge()).forEach(System.out::println);
        //按照学生的年龄进行降序排序，输出排序之后的学生的年龄：
//        StudentService.getStudent().stream().map(Student::getAge).sorted((o1,o2)->o2-o1).forEach(System.out::println);
        //stream中间操作-concat（合并）
//        Stream<Integer> stream1=Stream.of(1,2,3,4);
//        Stream<Integer> stream2=Stream.of(2,3,4);
//        Stream.concat(stream1,stream2).forEach(System.out::println);
        //stream中间操作-skip和limit:skip是跳过，limit是截取
//         Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).skip(3).limit(3).forEach(System.out::println);
        //匹配就是判断stream流中是否存在某一个元素
        //stream操作中的终止操作-match（匹配）
//        //匹配集合中的元素是否都是3
//        System.out.println(Stream.of(1, 2, 3, 4).allMatch(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer.equals(3);
//            }
//        }));
//        //lambda表达式的实现方式：
//        System.out.println(Stream.of(3,3,3,3).allMatch(a->a.equals(3)));
//        //匹配集合中的元素是否包含3：
//        System.out.println(Stream.of(1,2,3,4,5).anyMatch(a->a.equals(3)));
//        //匹配集合中的元素是否不包含3：
//        System.out.println(Stream.of(1,2,3,4,5).noneMatch(a->a.equals(3)));
        //注：allmatch是匹配所有的，anymatch是匹配上一个就算，nonematch是判断是否不包含
//        //获取流中的第一个元素：findOptional:返回值类型是一个optional对象
//        Optional<Integer>optionalI=Stream.of(1,2,3,4,5).findFirst();
//        System.out.println(optionalI.get());
//        System.out.println(Stream.of(1,2,3,4,5).findFirst().get());
//        //匹配学生的名称是否都是张三：
//        System.out.println(StudentService.getStudent().stream().allMatch(student -> student.getName().equals("aaa")));
//        System.out.println(StudentService.getStudent().stream().noneMatch(student -> student.getName().equals("zhangsan")));
//        //匹配学生的姓名是否至少有一个aaa：
//        System.out.println(StudentService.getStudent().stream().anyMatch(s->s.getName().equals("aaa")));
//        //获得第一个学生：
//        System.out.println(StudentService.getStudent().stream().findFirst().get());
//        Optional<Student> optional=StudentService.getStudent().stream().findFirst();
//        optional.ifPresent(System.out::println);
        //获得第四个学生：
        System.out.println(StudentService.getStudent().stream().skip(3).findFirst().get());
    }
}