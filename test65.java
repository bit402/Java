package test;

public class User {
    static{
        System.out.println("user的静态代码块执行了");
    }
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
        System.out.println("user类的无参构造方法执行了");
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

//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
className=java.util.Datepackage test;

public class Vip {
    public String name;
    private int age;
    protected String birth;
    boolean gender;
    public static String address;
    public static final String GRADE="金牌";
}
package test;

import java.lang.reflect.Field;
import java.util.ResourceBundle;
import java.util.Scanner;

public class test01 {
//    public static int n;
//    public static int m;
//    public static int[][] jx;
//    public static int search(int[][] jx,int maxl,int row,int col){
//        int sum=0;
//        int max=0;
//        for(int i=row;(i-row)+1<=maxl;i++){
//            if(judge(jx,i,row,col)){
//                sum=(i-row)+1;
//                if(sum>max){
//                    max=sum;
//                }
//            }
//            else {
//                break;
//            }
//        }
//        return max;
//    }
//    public static boolean judge(int[][] jx,int a,int row,int col){
//        for(int i=row;i<=a;i++){
//            for(int j=col;j <= col + (a - row);j++){
//                if(jx[i][j]==0){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
    public static void main(String[] args) {
//        Class stringClass = null;
//        try {
//            stringClass=Class.forName("java.lang.String");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        String s1="动力节点";
//        Class stringClass2=s1.getClass();
//        //某种类型的字节码文件在内存中只有一份
//        //stringClass和stringClass2都代表了同一种类型，String类型
//        System.out.println(stringClass2==stringClass);
//        User u1=new User("zhangsan",18);
//        Class u1Class=u1.getClass();
//        Class u1Class2=null;
//        try {
//             u1Class2=Class.forName("test.User");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(u1Class==u1Class2);
        //intClass代表的就是基本数据类型 int类型
//        Class intClass=int.class;
//        Class doubleClass=double.class;
//        Class StringClass=String.class;
//        Class userClass=User.class;
//        Scanner sc = new Scanner(System.in);
//         n=sc.nextInt();
//        m=sc.nextInt();
//         jx=new int[n][m];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                jx[i][j]=sc.nextInt();
//            }
//        }
//         int ans=0;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                if(jx[i][j]==0){
//                    continue;
//                }
//                int maxl=Math.min(n-i,m-j);
//                int tmp=search(jx,maxl,i,j);
//                if(tmp>ans){
//                    ans=tmp;
//                }
//            }
//        }
//        System.out.println(ans);
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int ans=0;
//        int[][] jx=new int[n][m];
//        int[][] dp=new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                jx[i][j]=sc.nextInt();
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            dp[i][0]=jx[i][0];
//            ans=Math.max(ans,dp[i][0]);
//        }
//        for(int j=1;j<m;j++){
//            dp[0][j]=jx[0][j];
//            ans=Math.max(ans,dp[0][j]);
//        }
//        for (int i = 1; i < n; i++) {
//            for (int j = 1; j < m; j++) {
//                if(jx[i][j]==1){
//                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
//                    ans=Math.max(ans,dp[i][j]);
//                }
//            }
//        }
//        System.out.println(ans);
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int ans = 0;
//        int[] dp= new int[n+1];
//        dp[1]=1;
//        dp[2]=2;
//        for(int i=3;i<=n;i++){
//            dp[i]=dp[i-1]+dp[i-2];
//        }
//        System.out.println(dp[n]);
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] a=new int[n];
//        for(int i=0;i<n;i++){
//            a[i]=sc.nextInt();
//        }
//        int maxj=0;
//        int maxo=0;
//        for(int i=0;i<n;i+=2){
//            maxo+=a[i];
//        }
//        for(int j=1;j<n;j+=2){
//            maxj+=a[j];
//        }
//        int max=Math.max(maxj,maxo);
//        System.out.println(max);
//        sc.close();
        //dp[i]+=dp[i-2]
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int[] dp=new int[n+1];
//        dp[1]=arr[0];
//        dp[2]=Math.max(arr[0],arr[1]);
//        for (int i = 3; i <= n; i++) {
//            dp[i]=Math.max(arr[i-1]+dp[i-2],dp[i-1]);
//        }
////        int max=Math.max(dp[n],dp[n-1]);
////        System.out.println(max);
//        System.out.println(dp[n]);
//        sc.close();
//        Class userClass = null;//userClass代表的就是user类型
//        try {
//             userClass =Class.forName("test.User");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        //通过userClass来实例化user对象
//        //底层原理是通过user类的无参构造方法完成了对象的实例化！
//        //如果这个类只提供了有参构造方法没有提供无参构造方法就会出现实例化异常
//        //所以使用这个方法是实例化对象的话一定要要保证这个类里面有无参构造法
//        User user;
//        try {
//             user=(User)userClass.newInstance();
//            System.out.println(user);
//        } catch (InstantiationException | IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
//        User user2;
//        try {
//             user2=(User)userClass.newInstance();
//            System.out.println(user2);
//        } catch (InstantiationException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(user==user2);
        //读取属性配置文件，获取类名，通过反射机制实例化对象
        //资源绑定器
//        ResourceBundle rb=ResourceBundle.getBundle("test.classInfor");
//        //通过key获取value
//        String className=rb.getString("className");
//        //通过反射机制实例化对象
//        try {
//            Class uc=Class.forName(className);
//            System.out.println(uc);
//            //实例化
//            //User u1=(User) uc.newInstance();
//            Object obj=uc.newInstance();
//            System.out.println(obj);
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
        //反射机制中的java.lang.reflect.Field(代表的是一个类中的字段/属性)
        //获取vip类
        Class vc=null;
        try {
             vc=Class.forName("test.Vip");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        //获取vip中的所有的属性以及字段
        Field[] fields=vc.getFields();
        System.out.println(fields.length);
        //遍历数组
        for(Field f:fields){
            System.out.println(f.getName());
        }
    }
}