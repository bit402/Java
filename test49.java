package test;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getAge()-o2.getAge();
    }
}
package test;

import java.util.Objects;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
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
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
package test;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public int compareTo(Person o) {
        //按照年龄排序
        //return age - o.age;
        //按照名字排序：
        //return this.name.compareTo(o.name);
        //先按照名字排序，如果名字一样再按照年龄排序：
//        if(name.equals(o.getName())) {
//            return age - o.getAge();
//        }
//        return name.compareTo(o.getName());
        //先按照年龄排序，如果年龄一样再按照名字排序：
        if(age==o.age){
            return name.compareTo(o.name);
        }
        return age-o.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
package test;

import java.util.Objects;

public class Vip implements Comparable<Vip> {
    private String idCard;
    private String name;
    private int age;

    public Vip(String idCard, String name, int age) {
        this.idCard = idCard;
        this.name = name;
        this.age = age;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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
        return "Vip{" +
                "idCard='" + idCard + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Vip vip = (Vip) object;
        return Objects.equals(idCard, vip.idCard);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idCard);
    }

    @Override
    public int compareTo(Vip o) {
        return this.age - o.age;
    }
}
package test;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

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
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class test01 {

    public static void main(String[] args) {
//        TreeMap<Integer,String> map=new TreeMap<>();
//        map.put(1,"a");
//        map.put(2,"b");
//        map.put(3,"c");
//        map.put(4,"d");
//        map.put(5,"e");
//        Set<Map.Entry<Integer,String>> set=map.entrySet();
//        for(Map.Entry<Integer,String> entry:set){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
//        Map<String,Integer> map = new TreeMap<>();
//        map.put("e",5);
//        map.put("d",4);
//        map.put("c",3);
//        map.put("b",2);
//        map.put("a",1);
//        System.out.println(map);
//        Map<Person, Integer> map = new TreeMap<>();
//        Person p1=new Person("c",180);
//        Person p2=new Person("a",18);
//        Person p3=new Person("b",18);
//        Person p4=new Person("c",18);
//        Person p5=new Person("a",18);
//        map.put(p1,1);
//        map.put(p2,2);
//        map.put(p3,3);
//        map.put(p4,4);
//        map.put(p5,5);
//        System.out.println(map);
//        Map<User, Integer> map = new TreeMap<>(new UserComparator());
//        User user1 = new User("a", 18);
//        User user2 = new User("b", 180);
//        User user3 = new User("c", 20);
//        User user4 = new User("d", 22);
//        User user5 = new User("e", 22);
//        map.put(user1, 1);
//        map.put(user2, 2);
//        map.put(user3, 3);
//        map.put(user4, 4);
//        map.put(user5, 5);
//        System.out.println(map);
//        Map<User, Integer> map = new TreeMap<>(new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
//        User user1 = new User("a", 18);
//        User user2 = new User("b", 180);
//        User user3 = new User("c", 20);
//        User user4 = new User("d", 22);
//        User user5 = new User("e", 22);
//        map.put(user1, 1);
//        map.put(user2, 2);
//        map.put(user3, 3);
//        map.put(user4, 4);
//        map.put(user5, 5);
//        System.out.println(map);
        //Map<Integer,String> map=new TreeMap<>();
//        map.put(1,null);
//        map.put(null,null);
//        Properties pro=new Properties();
//        //pro.setProperty(null,"<UNK>");
//        pro.setProperty("user",null);
//        Set<Integer> set=new HashSet();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(100);
//        set.add(100);
//        set.add(100);
//        set.add(100);
//        System.out.println(set.size());
//        System.out.println(set);
//        Set<String> set=new HashSet<>();
//        set.add("abb");
//        set.add("abc");
//        set.add("acb");
//        System.out.println(set.size());
//        System.out.println(set);
//        Vip v1=new Vip("111","nihao",18);
//        Vip v2=new Vip("111","nihao",18);
//        Vip v3=new Vip("111","nihao",18);
//        Vip v4=new Vip("111","nihao",18);
//        Vip v5=new Vip("111","nihao",18);
//        Set<Vip> vips=new HashSet<>();
//        vips.add(v1);
//        vips.add(v2);
//        vips.add(v3);
//        vips.add(v4);
//        vips.add(v5);
//        System.out.println(vips);
//        Set<Integer> set=new LinkedHashSet<>();
//        set.add(9);
//        set.add(8);
//        set.add(10);
//        System.out.println(set.size());
//        System.out.println(set);
//        for(Integer i:set){
//            System.out.println(i);
//        }
//        Set<Vip> vips=new TreeSet<>();
//        Vip v1=new Vip("1","a",18);
//        Vip v2=new Vip("2","b",1);
//        Vip v3=new Vip("3","c",20);
//        vips.add(v1);
//        vips.add(v2);
//        vips.add(v3);
//        System.out.println(vips);
//        for(Vip vip:vips){
//            System.out.println(vip);
//        }
//        Set<Student> set=new HashSet<>();
//        Student stu=new Student("张三",18);
//        set.add(stu);
//        set.add(new Student("李四",19));
//        System.out.println(set);
//        stu.setName("王五");
//        set.remove(stu);
//        System.out.println(set.size());
//        System.out.println(set);
//        set.add(new Student("王五",18));
//        System.out.println(set);
//        set.add(new Student("张三",18));
//        System.out.println(set);
//        List<Integer> list = new ArrayList<>();
//        list.add(7);
//        list.add(5);
//        list.add(9);
//        list.add(2);
//        list.add(10);
//        Collections.sort(list);
//        System.out.println(list);
//        Person p1=new Person("a",18);
//        Person p2=new Person("b",1);
//        Person p3=new Person("c",20);
//        Person p4=new Person("d",15);
//        List<Person> list=new ArrayList<>();
//        list.add(p1);
//        list.add(p2);
//        list.add(p3);
//        list.add(p4);
////        Collections.sort(list);
////        System.out.println(list);
//        Collections.sort(list,new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
//        System.out.println(list);
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        Collections.shuffle(list);
//        System.out.println(list);
//        List<Integer> list=Arrays.asList(1,2,3,4,5);
//        Collections.reverse(list);
//        System.out.println(list);
//        Collections.fill(list,null);
//        System.out.println(list);
        InputStream in = null;
        try {
             in = new FileInputStream("");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
