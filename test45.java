package test;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        User u1=new User("a",18);
        User u2=new User("b",14);
        User u3=new User("c",20);
        User u4=new User("d",22);
        User u5=new User("e",18);
        User[] users={u1,u2,u3,u4,u5};
        Arrays.sort(users);
        System.out.println(Arrays.toString(users));
    }
}
package test;

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
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
    public int compareTo(User o) {
        //return this.age - o.age;
        return this.name.compareTo(o.name);
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

public class Person {
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
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
package test;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }
}
package test;

public class MyLink<E> {
    private  int size;
    private Node<E> head;

    public MyLink() {
    }
    private class Node<E> {
        E data;
        Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }
    public void add(E data) {
        if (head == null) {
            head = new Node<>(data, null);
            size++;
            return;
        }
        Node<E> last=findLast();
        last.next=new Node<E>(data,null);
        size++;
    }
    private Node<E> findLast() {
        if (head == null) {
            return null;
        }
        Node<E> last=head;
        while (last.next != null) {
            last=last.next;
        }
        return last;
    }
    public void add(E data, int index) {
        if (head == null) {
            head = new Node<>(data, null);
            size++;
            return;
        }
    }
}
package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class test01 {

    public static void main(String[] args) {
//        Person p1=new Person("a",18);
//        Person p2=new Person("b",14);
//        Person p3=new Person("c",20);
//        Person p4=new Person("d",22);
//        Person p5=new Person("e",18);
//        Person[] users={p1,p2,p3,p4,p5};
//        List<Person> list=new ArrayList<>();
//        list.add(p1);
//        list.add(p2);
//        list.add(p3);
//        list.add(p4);
//        list.add(p5);
//        //list.sort(new PersonComparator());
//        list.sort(new Comparator<Person>(){
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
//        for(Person p:list){
//            System.out.println(p);
//        }
//        System.out.println("***************");
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.remove(1);
        String ss=list.set(1, "f");
        System.out.println(ss);
        String s = list.get(list.size()-1);
        System.out.println(s);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}