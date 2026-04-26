package test;
@FunctionalInterface
public interface NoParameterNoReturn {
    //注：此接口虽然命名为了无参数无返回值，但不想创建多个不同情况的接口了，就复用这个了
//    void test(Integer a, Integer b,String s);
    Integer test(Integer a,Integer b);
}

package test;

public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
package test;

public class Vip {
    private String vipName;

    public Vip(String vipName) {
        this.vipName = vipName;
    }

    public String getVipName() {
        return vipName;
    }

    public void setVipName(String vipName) {
        this.vipName = vipName;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "vipName='" + vipName + '\'' +
                '}';
    }
}
package test;

public class Bird {
    @Override
    public String toString() {
        return "Bird对象创建成功";
    }
}
package test;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.function.*;

public class test01 {

    public static void main(String[] args) {
//        //匿名内部类的方式：
//        NoParameterNoReturn npnr=new NoParameterNoReturn() {
//            @Override
//            public void test() {
//                System.out.println("test方法执行了");
//            }
//        };
//        npnr.test();
//        //使用lambada表达式的方法：
//        NoParameterNoReturn npnr1=()-> System.out.println("test方法执行了");
//        npnr1.test();
//        //无返回值一个参数的情况：匿名内部类的方式：
//        NoParameterNoReturn npnr=new NoParameterNoReturn() {
//            @Override
//            public void test(Integer a) {
//                System.out.println(a+"匿名内部类的方式");
//            }
//        };
//        npnr.test(1);
//        //无返回值一个参数的情况：lambda表达式的情况：
//        NoParameterNoReturn npnr1=(a)-> System.out.println(a+"lambda表达式的方式");
//        npnr1.test(1);
//        //无返回值多个参数的情况：匿名内部类的实现方式：
//        NoParameterNoReturn npnr=new NoParameterNoReturn() {
//            @Override
//            public void test(Integer a, Integer b, String s) {
//                System.out.println(a+b+s);
//            }
//        };
//        npnr.test(1,2,"test");
//        //无返回值多个参数：lambda表达式实现方式：
//        NoParameterNoReturn npnr1=(a,b,s)-> System.out.println(a+b+s);
//        npnr1.test(1,2,"test");
//        //有返回值无参数：匿名内部类的实现方式：
//        NoParameterNoReturn npnr=new NoParameterNoReturn() {
//            @Override
//            public Integer test() {
//                return 0;
//            }
//        };
//        System.out.println("匿名内部类的实现方式："+npnr.test());
//        //有返回值无参数：lambda表达式的实现方式：
//        NoParameterNoReturn npnr1=()->0;
//        System.out.println("lambda表达式的实现方式:"+npnr1.test());
//        //有返回值一个参数：匿名内部类的实现方式：
//        NoParameterNoReturn npnr=new NoParameterNoReturn() {
//            @Override
//            public Integer test(Integer a) {
//                return a;
//            }
//        };
//        System.out.println("匿名内部类的实现方式："+npnr.test(50));
//        //有返回值一个参数：lambda表达式的实现方式：
//        NoParameterNoReturn npnr1=(a)->a;
//        System.out.println("lambda表达式的实现方式"+npnr1.test(500));
        //有返回值多个参数：匿名内部类的实现方式：
//        NoParameterNoReturn npnr=new NoParameterNoReturn() {
//            @Override
//            public Integer test(Integer a, Integer b) {
//                return a+b;
//            }
//        };
//        System.out.println(npnr.test(2,3));
//        //有返回值，多个参数：lambda表达式的实现方式：
//        NoParameterNoReturn npnr1=(a,b)->{a=a*2;b=b+5;return a+b;};
//        System.out.println(npnr1.test(2,3));
//        //使用生产型接口supplier
//        //使用匿名内部类的方式：
//        Teacher teacher=new Teacher("老杜");
//        Supplier<String> supplier=new Supplier<String>() {
//            @Override
//            public String get() {
//                return teacher.getName();
//            }
//        };
//        System.out.println(supplier.get());
//        //使用lambda表达式：
//        Supplier<String> supplier1=()->teacher.getName();
//        System.out.println(supplier1.get());
//        //使用实例方法引用精简lambda表达式：
//        Supplier<String> supplier2=teacher::getName;
//        System.out.println(supplier2.get());
//        Consumer<String> consumer=new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println("匿名内部类的形式："+s);
//            }
//        };
//        consumer.accept("nihaoya");
//        Consumer<String> consumer1=(s)-> System.out.println("lambda:"+s);
//        consumer1.accept("nihaoya");
//        //使用实例方法引用精简lambda表达式
//        Consumer<String> consumer2=System.out::println;
//        consumer2.accept("nihaoya");
//        Function<Double,Long> function=new Function<Double, Long>() {
//            @Override
//            public Long apply(Double aDouble) {
//                return Math.round(aDouble);
//            }
//        };
//        System.out.println(function.apply(2.4));
//        Function<Double,Long>function1=aDouble -> Math.round(aDouble);
//        System.out.println(function1.apply(2.4));
//        Function<Double,Long>function2=Math::round;
//        System.out.println(function2.apply(2.4));
//        Comparator<Double> cmp=new Comparator<Double>() {
//            @Override
//            public int compare(Double o1, Double o2) {
//                return o1.compareTo(o2);
//            }
//        };
//        System.out.println(cmp.compare(3.14,5.6));
//        Comparator<Double> cmp1=(o1,o2)->o1.compareTo(o2);
//        System.out.println(cmp1.compare(5.6,3.14));
//        Comparator<Double> cmp2=Double::compareTo;
//        System.out.println(cmp2.compare(3.14,5.6));
//        Vip vip=new Vip("nihao");
//        Function<Vip,String> function=new Function<Vip,String>() {
//            @Override
//            public String apply(Vip vip) {
//                return vip.getVipName();
//            }
//        };
//        System.out.println(function.apply(vip));
//        Function<Vip,String> function1=vip1-> vip1.getVipName();
//        System.out.println(function1.apply(vip));
//        Function<Vip,String> vip2=Vip::getVipName;
//        System.out.println(vip2.apply(vip));
//        Supplier<Bird> s1=new Supplier<Bird>() {
//            @Override
//            public Bird get() {
//                return new Bird();
//            }
//        };
//        System.out.println(s1.get());
//        Supplier<Bird> s2=()->new Bird();
//        System.out.println(s2.get());
//        Supplier<Bird> s3=Bird::new;
//        System.out.println(s3.get());
//        Function<String,Person> function=new Function<String,Person>() {
//            @Override
//            public Person apply(String s) {
//                return new Person(s);
//            }
//        };
//        System.out.println(function.apply("<UNK>"));
//        Function<String,Person> function1=(s)->new Person(s);
//        System.out.println(function1.apply("<UNK>"));
//        Function<String,Person> function2=Person::new;
//        System.out.println(function2.apply("<UNK>"));
//        //数组引用：匿名内部类的实现方式：
//        Function<Integer,int[]> function=new Function<Integer,int[]>() {
//            @Override
//            public int[] apply(Integer integer) {
//                return new int[integer];
//            }
//        };
//        System.out.println(Arrays.toString(function.apply(10)));
//        //数组引用：lambda表达式的实现方式：
//        Function<Integer,int[]> function1=integer->new int[(int) integer];
//        System.out.println(Arrays.toString(function1.apply(10)));
//        Function<Integer,int[]> function2=int[]::new;
//        System.out.println(Arrays.toString(function2.apply(10)));
        //使用匿名内部类的方式遍历集合中的元素
//        List<Integer> list=Arrays.asList(1,8,5,2,3,1,4,6,9,2,1,7,5);
//        list.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                //integer就是集合中的每个元素
//                System.out.print(integer+" ");
//            }
//        });
//        System.out.println();
//        //使用lambda表达式来遍历集合中的元素
//        list.forEach(integer->System.out.print(integer+" "));
//        System.out.println();
//        //使用函数引用来遍历集合中的元素：
//        list.forEach(System.out::print);
//        TreeSet<Integer> treeSet=new TreeSet<>();
//        treeSet.add(100);
//        treeSet.add(200);
//        treeSet.add(300);
//        treeSet.add(400);
//        treeSet.add(5);
//        treeSet.add(100);
//        //使用函数引用来遍历集合：
//        treeSet.forEach(System.out::println);
//        //使用lambda表达式来遍历集合：
//        treeSet.forEach(a->System.out.print(a+" "));
//        System.out.println();
//        //使用匿名内部类的方式来遍历集合：
//        treeSet.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.print(integer+" ");
//            }
//        });
//        System.out.println();
//        Map<Integer,String> map = new HashMap<>();
//        map.put(1,"a");
//        map.put(2,"b");
//        map.put(3,"c");
//        map.put(4,"d");
//        map.put(5,"e");
//        //使用匿名内部类的方式：
//        map.forEach(new BiConsumer<Integer, String>() {
//            @Override
//            public void accept(Integer key, String value) {
//                System.out.println(key+":"+value);
//            }
//        });
//        System.out.println("==================");
//        //使用lambda表达式的形式:
//        map.forEach((key,value)-> System.out.println(key+":"+value));
        //删除集合中满足条件的元素：
        //使用匿名内部类的方式：
//        List<String> list = new ArrayList<>();
//        list.add("aa");
//        list.add("bb");
//        list.add("cc");
//        list.add("dd");
//        list.add("ee");
//        list.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.equals("cc");
//            }
//        });
//        list.forEach(System.out::println);
//        //使用lambda表达式的形式：
//        List<String> list = new ArrayList<>();
//        list.add("aa");
//        list.add("bb");
//        list.add("cc");
//        list.add("dd");
//        list.add("ee");
//        list.removeIf(s->s.equals("cc"));
//        list.forEach(System.out::println);
//        //使用函数引用的形式：
//        List<String> list = new ArrayList<>();
//        list.add("aa");
//        list.add("bb");
//        list.add("cc");
//        list.add("dd");
//        list.add("ee");
//        list.removeIf("cc"::equals);
//        list.forEach(System.out::println);
        //set集合在遍历的过程中删除符合条件的元素：
        Set<String> set=new HashSet<>();
        set.add("100");
        set.add("200");
        set.add("300");
        set.add("400");
        set.add("500");
        set.add("600");
        set.removeIf("100"::equals);
        set.forEach(System.out::println);
    }
}