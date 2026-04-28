package test;

import java.io.*;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test01 {

    public static void main(String[] args) {
        //归约：将所有元素按照指定规则合并成一个结果，常用的归约方式如下：
        //Stream终止操作之：reduce(归约/归纳/总结)作用：将流中的所有数据，按照指定的规则最终计算出一个结果（多对一）
//        //将集合中所有的数字求和：
//        System.out.println(Stream.of(1, 2, 3, 4, 5).reduce(new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer, Integer integer2) {
//                return integer + integer2;
//            }
//        }).get());
//        //lambda表达式的形式：
//        Stream.of(1,2,3,4,5).reduce(Integer::sum).ifPresent(System.out::println);
//        //获得集合中元素相乘的结果：
//        Stream.of(1,2,3,4,5).reduce((a,b)->a*b).ifPresent(System.out::println);
//        //获得最大长度的元素：
//        Stream.of("ni","hao","nihaoya").reduce(new BinaryOperator<String>() {
//            @Override
//            public String apply(String s, String s2) {
//                if(s.length()>s2.length()){
//                    return s;
//                }
//                return s2;
//            }
//        }).ifPresent(System.out::println);
//        //lambda表达式的形式：
//        Stream.of("ni","hao","nihaoya").reduce((s1,s2)->{if(s1.length()>s2.length()){
//            return s1;
//        }
//        return s2;}).ifPresent(System.out::println);
//        //获得10和集合中所有元素“相加之后的结果”
//        System.out.println(Stream.of(1, 2, 3, 4, 5).reduce(10, (a, b) -> a + b));
        //Stream终止操作-reduce
        //Stream对象中的count()、max()、min()方法等底层都是调用的reduce()方法
//        //这里是为了编程方便又专门提供了一些API
//        //获取元素的个数：
//        System.out.println(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).count());
        //Stream终止操作：收集：collect,归集：tolist\toSet\toMap
        //将Stream流中的数据全部收集到一个集合当中
//        //收集为List集合（集体是那种List集合，在这里是不知道的）
//        List<String> list=Stream.of("zhangsan","lisi","wangwu").collect(Collectors.toList());
//        System.out.println(list);
//        //收集为Set集合（具体是哪种Set在这里是不知道的）
//        Set<String> set = Stream.of("zhangsan","lisi","wangwu").collect(Collectors.toSet());
//        //(具体是哪种Set集合在这里是不知道的)
//        System.out.println(set);
//        String s="nihao:ya";
//        String[] ss=s.split(":");
//        System.out.println(ss.length);
//        System.out.println(ss[0]);
//        System.out.println(ss[1]);
//        //收集为Map集合
//        //lambda表达式的形式：
//        Map<String,String>map=Stream.of("1:zhangsan","2:lisi","3:wangwu").collect(Collectors.toMap( key->{String[] ss=key.split(":");
//        return ss[0];},value->{return value.split(":")[1];}));
//        System.out.println(map);
//        //注：这里的forEach方法不是Stream流中的而是集合都继承了Iterator接口是来源于这个接口中的默认方法
//        map.forEach((k,v)->System.out.println(k+":"+v));
        //Stream终止操作之：收集collect
        //归集：toCollection,以指定的集合类型来收集
//        //以ArrayList集合进行收集
//        ArrayList<Integer> arrayList=Stream.of(1,2,3,4,5).collect(Collectors.toCollection(ArrayList::new));
//        System.out.println(arrayList);
//        //以LinkedList集合进行收集
//        LinkedList<String> linkedList=Stream.of("a","b","c").collect(Collectors.toCollection(LinkedList::new));
//        System.out.println(linkedList);
//        //以HashSet集合收集
//        HashSet<Integer> hashSet=Stream.of(1,2,3,4,5).collect(Collectors.toCollection(HashSet::new));
//        System.out.println(hashSet);
//        //以TreeSet集合收集
//        TreeSet<String> treeSet=Stream.of("b","a","c").collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(treeSet);
//        //归集：转为数组的形式：
//        //没有指定数组的类型的时候默认是Object类型
//        Object[] array = Stream.of(1, 2, 3, 4, 5).toArray();
//        System.out.println(Arrays.toString(array));
//        //转换为指定类型的数组：
//        String[] array2=Stream.of("a", "b", "c").toArray(String[]::new);
//        System.out.println(Arrays.toString(array2));
//        Integer[] array3=Stream.of(1, 2, 3, 4, 5).toArray(Integer[]::new);
//        System.out.println(Arrays.toString(array3));
//        //获得元素的个数：
//        //使用reduce：
//        long count = Stream.of(1, 2, 3, 4, 5).count();
//        System.out.println(count);
//        //使用collect:
//        Long collect = Stream.of(1, 2, 3, 4, 5).collect(Collectors.counting());
//        System.out.println(collect);
//        //获取平均值：
//        Double collect1 = Stream.of(1, 2, 3, 4, 5).collect(Collectors.averagingDouble(Double::valueOf));
//        System.out.println(collect1);
//        //获取最大值：
//        Optional<Integer> collect2 = Stream.of(1, 2, 3, 4, 5).collect(Collectors.maxBy((a, b) -> a - b));
//        System.out.println(collect2.get());
//        //获取最小值：
//        Optional<Integer> collect3 = Stream.of(1, 2, 3, 4, 5).collect(Collectors.minBy((a, b) -> a - b));
//        System.out.println(collect3.get());
//        //获得所有的数值之和：
//        Integer collect4 = Stream.of(1, 2, 3, 4, 5).collect(Collectors.summingInt(Integer::intValue));
//        System.out.println(collect4);
//        //获得集合中的元素的所有的信息：
//        DoubleSummaryStatistics collect5 = Stream.of(1, 2, 3, 4, 5).collect(Collectors.summarizingDouble(Double::valueOf));
//        System.out.println(collect5);
//        System.out.println(collect5.getAverage());
//        System.out.println(collect5.getCount());
//        System.out.println(collect5.getMin());
//        System.out.println(collect5.getMax());
//        System.out.println(collect5.getSum());
//        //将下列所有字符串的内容拼接在一起：
//        String s=Stream.of("ni","hao","nihaoya").collect(Collectors.joining());
//        System.out.println(s);
        try(BufferedReader br=new BufferedReader(new FileReader("lll.txt"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\练习输入输出流\\lianxi.txt"));) {
            char[] chars=new char[1024];
            int len;
            while ((len=br.read(chars))!=-1) {
                bw.write(chars, 0, len);
            }
            bw.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}