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
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj)
//            return true;
//        else if(obj instanceof User) {
//            User user = (User) obj;
//            return name.equals(user.getName()) && age == user.getAge();
//        }
//        else if(obj==null)
//            return false;
//        return false;
//    }

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
//        Map<Integer,String> map = new HashMap<>();
//        map.put(1,"nihao");
//        map.put(2,"2026");
//        map.put(3,"liuyuanze");
//        System.out.println("键值对的个数："+map.size());
//        String s1 = map.get(1);
//        System.out.println(s1);
//        String s2=map.get(5);
//        System.out.println(s2);
//        map.clear();
//        System.out.println("<UNK>"+map.size());
//        Map<Integer,String> map2=new HashMap<>();
//        map2.putAll(map);
//        map2.put(8,"2018");
//        System.out.println("键值对的个数："+map2.size());
//        System.out.println(map2.containsKey(8));
//        System.out.println(map2.containsKey(10));
//        System.out.println(map2.containsValue("2018"));
//        System.out.println(map2.containsValue("n"));
//        map2.remove(8);
//        System.out.println(map2.isEmpty());
//        Map<Integer,String> map = new HashMap<>();
//        map.put(1,"<a>");
//        map.put(2,"<b>");
//        map.put(3,"<c>");
//        map.put(4,"<d>");
//        map.put(5,"<e>");
//        Collection<String> collection=map.values();
//        System.out.println(collection);
//        for(String s:collection){
//            System.out.println(s);
//        }
//        Map map=Map.of(1,"a",2,"b",3,"c",4,"d",5,"e");
//        System.out.println(map.size());
//        Map<Integer,String> map = new HashMap<>();
//        map.put(1,"a");
//        map.put(2,"b");
//        map.put(3,"c");
//        map.put(4,"d");
//        map.put(5,"e");
//        Set<Integer> set = map.keySet();
//        Iterator<Integer> iterator = set.iterator();
//        while(iterator.hasNext()){
//            Integer key = iterator.next();
//            String value = map.get(key);
//            System.out.println(key+"="+value);
//        }
//        Collection<String> collection = map.values();
//        for(String s : collection){
//            System.out.println(s);
//        }
//        for(Integer key : set){
//            System.out.println(key+"="+map.get(key));
//        }
//        Map<Integer,String> map=new HashMap<>();
//        map.put(1,"a");
//        map.put(2,"b");
//        map.put(3,"c");
//        map.put(4,"d");
//        map.put(5,"e");
//        Set<Map.Entry<Integer,String>> set=map.entrySet();
//        Iterator<Map.Entry<Integer,String>> iterator=set.iterator();
//        while(iterator.hasNext()){
//            Map.Entry<Integer,String> entry=iterator.next();
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
//        for(Map.Entry<Integer,String> entry:set){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
//        Map<String,String> map=new HashMap<>();
//        map.put("000000000001","a");
//        map.put("000000000002","b");
//        map.put("000000000003","c");
//        map.put("000000000004","d");
//        map.put("000000000005","e");
//        Set<Map.Entry<String,String>> set=map.entrySet();
//        for(Map.Entry<String,String> entry:set){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
//        User u1=new User("a",18);
//        User u2=new User("b",19);
//        User u3=new User("c",20);
//        User u4=new User("d",21);
//        User u5=new User("e",22);
//        Map<Integer,User> map=new HashMap<>();
//        map.put(1,u1);
//        map.put(2,u2);
//        map.put(3,u3);
//        map.put(4,u4);
//        map.put(5,u5);
//        Set<Map.Entry<Integer,User>> set=map.entrySet();
//        for(Map.Entry<Integer,User> entry:set){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
//        User u1 = new User("a", 18);
//        User u2 = new User("b", 19);
//        User u3 = new User("c", 20);
//        User u4 = new User("d", 21);
//        User u5 = new User("e", 22);
//        User u6 = new User("e", 22);
//        Map<User, Integer> map = new HashMap<>();
//        map.put(u1, 1);
//        map.put(u2, 2);
//        map.put(u3, 3);
//        map.put(u4, 4);
//        map.put(u5, 5);
//        map.put(u6, 6);
//        System.out.println(u6.hashCode()%9);
//        System.out.println(u5.hashCode()%9);
//        System.out.println(u5.equals(u6));
//        Set<Map.Entry<User, Integer>> set = map.entrySet();
//        for (Map.Entry<User, Integer> entry : set) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
        Map<String,String> map=new HashMap<>();
        map.put(null,"a");
        map.put(null,"b");
        map.put(null,"c");
        map.put(null,"d");
        map.put(null,"e");
        System.out.println(map.size());
        System.out.println(map.get(null));
        Collection<String> values=map.values();
        System.out.println(values);
        Set<Map.Entry<String,String>> set=map.entrySet();
        System.out.println(set);
        for(Map.Entry<String,String> entry:set){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
