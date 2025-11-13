package test;

public enum Color {
    RED, BLUE, GREEN, YELLOW, ORANGE
}
package test;

public enum Season implements EatAble {
    SPRING("春季","春意盎然"){
        @Override
        public void eat() {
            System.out.println("春季吃苹果");
            super.eat();
        }
    }
    ,SUMMER("夏季","盛夏"),AUTUMN("秋季","丰收"),WINTER("冬季","银装素裹");
//    static{
//        System.out.println("枚举类型中的静态代码块执行了");
//    }
//    {
//        System.out.println("构造代码块执行了");
//    }
//    public static int a=10;
//    private int b=20;
//    public static void m1(){
//        System.out.println("静态方法执行了");
//    }
//    public void m2(){
//        System.out.println("枚举类型中的实例方法执行了");
//    }
    private final String name;
    private final String desc;
    private Season(String name,String descript){
        this.name=name;
        this.desc=descript;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public void eat() {
        System.out.println("吃啥呢？给我来一口");
    }
}
package test;

public interface EatAble {
    public void eat();
}
package test;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class test01 {
//    public static Season get(){
//        return Season.SUMMER;
//    }
    public static void main(String[] args){
//        Color[] colors=Color.values();
//        for(Color color:colors){
//            System.out.println(color);
//        }
//        Season season = get();
//        switch (season){
//            case SUMMER->
//                System.out.println(Season.SUMMER.getDesc());
//            case SPRING -> System.out.println(Season.SPRING.getDesc());
//            case AUTUMN -> System.out.println(Season.AUTUMN.getDesc());
//            case WINTER -> System.out.println(Season.WINTER.getDesc());
//        }
//        for(Season season2 : Season.values()){
//            System.out.println("name:"+season2.getName()+" desc:"+season2.getDesc());
//            season2.eat();
//        }
//        Random rand = new Random();
//        for(int i=1;i<=10;i++){
//            int num=rand.nextInt();
//            System.out.println(num);
//        }
//        System.out.println("******************************");
//        for(int i=1;i<=10;i++){
//            int num=rand.nextInt(101);
//            System.out.println(num);
//        }
//        System.out.println("-----------------------------");
//        for(int i=1;i<=10;i++){
//            double num=rand.nextDouble();
//            System.out.println(num);
//        }
//        int[] arr= {-1,-1,-1,-1,-1};
//        int j=0;
//        for(int i=0;i<arr.length;i++){
//            boolean flag=true;
//            int n= rand.nextInt(5);
//            for(j=0;j<=i;j++){
//                if(arr[j]==n){
//                    flag=false;
//                    break;
//                }
//            }
//            if(flag){
//                arr[i]=n;
//            }
//            else{
//                i--;
//            }
//        }
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
//        System.out.println("hello");
//        PrintStream printf = System.out;
//        printf.println("hello");
//        printf.println(123);
//        printf.println(true);
//        printf.println(1.1);
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
        InputStream scanf = System.in;
        Scanner sc2=new Scanner(scanf);
        System.out.println(sc2.next());
        sc2.close();
        sc.close();
    }
}