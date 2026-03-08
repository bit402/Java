package test;

import java.util.Arrays;

public class MyHashMap<K,V> {
    private Node<K,V>[] table;
    private int size;

    public MyHashMap() {
        table = new Node[16];
    }

    static class Node<K,V>{
        int hash;
        K key;
        V value;
        Node<K,V> next;

        public Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "hash=" + hash +
                    ", key=" + key +
                    ", value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
    public V put(K key,V value){
        if(key==null){
            return putKeyNull(value);
        }
        int hash = Math.abs(key.hashCode());
        int index = hash % table.length;
        if(table[index]==null){
            table[index] = new Node<>(hash,key,value,null);
            size++;
            return null;
        }
        Node<K,V> node = table[index];
        Node<K,V> prev = null;
        while(node!=null){
            if(node.key.equals(key)){
                V oldValue = node.value;
                node.value = value;
                return oldValue;
            }
            prev = node;
            node = node.next;
        }
        prev.next=new Node<>(hash,key,value,null);
        size++;
        return null;
    }
    private V putKeyNull(V value){
        if(table[0]==null){
            table[0]=new Node<>(0,null,value,null);
            size++;
            return null;
        }
        Node<K,V> node=table[0];
        // 合并检查逻辑：循环条件改为node!=null，一次遍历所有节点
        Node<K,V> prev=null;
//        while(node != null){
//            if(node.key==null){
//                V oldValue=node.value;
//                node.value=value;
//                return oldValue;
//            }
//            // 只有还有下一个节点时才移动，避免node变成null
//            if(node.next == null) break;
//            node=node.next;
//        }
        while (node!=null){
            if(node.key==null){
                V oldValue=node.value;
                node.value=value;
                return oldValue;
            }
            prev=node;
            node=node.next;
        }
        prev.next=new Node<>(0,null,value,null);
        size++;
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<table.length; i++){
            Node<K,V> node = table[i];
            while(node!=null){
                sb.append(node);
                sb.append("\n");
                node = node.next;
            }
        }
        return sb.toString();
    }

    public int getSize() {
        return size;
    }
    public V get(K key){
        if(key==null){
            Node<K,V> node = table[0];
            while(node!=null){
                if(node.key==null){
                    return node.value;
                }
                node = node.next;
            }
            return null;
        }
        int hash = Math.abs(key.hashCode());
        int index = hash % table.length;
        Node<K,V> node = table[index];
        while(node!=null){
            if(node.key.equals(key)){
                return node.value;
            }
            node = node.next;
        }
        return null;
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
}
package test;

import java.util.*;

public class test01 {

    public static void main(String[] args) {
//        MyHashMap<String,String> map = new MyHashMap<>();
//        map.put("001","a");
//        map.put("002","b");
//        map.put("003","c");
//        map.put("004","d");
//        map.put("005","e");
//        map.put("003","f");
//        map.put(null,"g");
//        map.put(null,"h");
//        System.out.println(map);
//        System.out.println(map.getSize());
//        System.out.println(map.get("001"));
//        System.out.println(map.get("003"));
//        System.out.println(map.get(null));
//        User u1=new User("001",1);
//        User u2=new User("002",2);
//        User u3=new User("003",3);
//        User u4=new User("003",3);
//        MyHashMap<User,String> map1 = new MyHashMap<>();
//        map1.put(u1,"a");
//        map1.put(u2,"b");
//        map1.put(u3,"c");
//        map1.put(u4,"d");
//        System.out.println(map1);
//        Map<String,String> map=new HashMap<String,String>(50);
//        int length=(int)Math.pow(3,11);
//        System.out.println(length);
//        int hash="张三".hashCode();
//        int index=hash%length;
//        System.out.println(index);
//        int index2=hash&(length-1);
//        System.out.println(index2);
//        Map<Integer,String> map=new LinkedHashMap<Integer,String>();
//        map.put(1,"a");
//        map.put(20,"b");
//        map.put(300,"c");
//        map.put(4000,"d");
//        map.put(50000,"e");
//        map.put(1,"E");
//        map.put(null,null);
//        Set<Map.Entry<Integer,String>> set=map.entrySet();
//        for(Map.Entry<Integer,String> entry:set){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
//        Map<Integer,String> map1=new HashMap<>();
//        map1.put(null,null);
//        System.out.println(map1.size());
//        Map<Integer,String> map2=new Hashtable<>();
//        //map2.put(null,"zhangsan");
//        //map2.put(1,null);
//        map2.put(null,null);
//        Map<Integer,String> map=new Hashtable<>();
//        map.put(1,"a");
//        map.put(2,"b");
//        map.put(3,"c");
//        map.put(4,"d");
//        map.put(5,"e");
//        Set<Map.Entry<Integer,String>> set=map.entrySet();
//        for(Map.Entry<Integer,String> entry:set){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
//        Hashtable<Integer,String> map = new Hashtable<>();
//        map.put(1,"a");
//        map.put(2,"b");
//        map.put(3,"c");
//        map.put(4,"d");
//        map.put(5,"e");
//        Enumeration<Integer> e = map.keys();
//        while(e.hasMoreElements()){
//            Integer key = (Integer)e.nextElement();
//            System.out.println(key);
////            String value = map.get(key);
////            System.out.println(value);
//        }
//        Enumeration<String> e2=map.elements();
//        while(e2.hasMoreElements()){
//            String s = (String)e2.nextElement();
//            System.out.println(s);
//        }
        Properties pro = new Properties();
//        pro.put("name", "<UNK>");
//        pro.setProperty("name", "<UNK>333");
//        System.out.println(pro.getProperty("name"));
//        System.out.println(pro.get("name"));
        pro.setProperty("user", "root");
        pro.setProperty("password", "123456");
        pro.setProperty("host", "127.0.0.1");
        pro.setProperty("port", "8888");
        pro.setProperty("database", "mysql");
        pro.setProperty("driver", "com.mysql.jdbc.Driver");
        pro.setProperty("user", "root233");
        pro.setProperty("password", "1234566666666666");
        System.out.println(pro.getProperty("user"));
        System.out.println(pro.getProperty("password"));
        System.out.println(pro.getProperty("host"));
        Enumeration<?> en=pro.propertyNames();
        while(en.hasMoreElements()){
                String key=(String)en.nextElement();
                String value=(String)pro.getProperty(key);
                System.out.println(key+"="+value);
        }
    }
}
