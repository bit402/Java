package test;

public class Vip {
    public String name;
    private int age;
    protected String birthday;
    boolean gender;
    public static String address="北京海淀";
    public static final String GRADE="金牌";

}
package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class test01 {
//    public static boolean check(int mid,int[] l,int[] r,int min){
//        int count=0;
//        int i=0;
//        int j=0;
//        while(i<l.length && j<r.length){
//            if(Math.abs(l[i]-r[j])<=mid){
//                count++;
//                j++;
//                i++;
//            }
//            else if(l[i]<r[j]){
//                i++;
//            }
//            else{
//                j++;
//            }
//        }
//        if(count>=min){
//            return true;
//        }
//        return false;
//    }
//public static int C(int n,int i){
//    return jc(n)/jc(i)/jc(n-i);
//}
//    public static int jc(int n){
//        int ans=1;
//        for(int i=1;i<=n;i++){
//            ans*=i;
//        }
//        return ans;
//    }
//public static void dfs(int count,int n,int[] qz,int[] ans,boolean[] flag,int target,int sum) {
//    if(ok){
//        return;
//    }
//    if(count==n){
//        if(sum==target){
//            ok=true;
//            return;
//        }
//    }
//    if(sum>target){
//        return;
//    }
//    for(int i=1;i<=n;i++){
//        if(!flag[i-1]){
//            ans[count]=i;
//            flag[i-1]=true;
//            //sum+=qz[count]*i;
//            //dfs(count+1,n,qz,ans,flag,target,sum);
//            dfs(count+1,n,qz,ans,flag,target, sum + qz[count] * i);
//            if(ok){
//                return;
//            }
//            flag[i-1]=false;
//            //sum-=qz[count]*i;
//        }
//    }
//}
//    public static int C(int n, int i){
//        return jc(n)/jc(i)/jc(n-i);
//    }
//    public static int jc(int n){
//        int sum=1;
//        for(int i=1;i<=n;i++){
//            sum*=i;
//        }
//        return sum;
//    }
//    public static boolean ok=false;
//public static void dfs(int count,int[] ans,int target,int n,boolean[] flag,int[] qz,int sum) {
//    if(ok){
//        return;
//    }
//    if(count==n){
//        if(sum==target){
//            ok=true;
//            return;
//        }
//    }
//    if(sum>target){
//        return;
//    }
//    for(int i=1;i<=n;i++){
//        if(!flag[i-1]){
//            ans[count]=i;
//            flag[i-1]=true;
//            dfs(count+1,ans,target,n,flag,qz,sum+i*qz[count]);
//            if(ok){
//                return;
//            }
//            flag[i-1]=false;
//        }
//    }
//}
//    public static int C(int n,int k){
//        return jc(n)/jc(k)/jc(n-k);
//    }
//    public static int jc(int n){
//        int sum=1;
//        for(int i=1;i<=n;i++){
//            sum*=i;
//        }
//        return sum;
//    }
//    public static boolean ok=false;
    public static void main(String[] args)  {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] ss=br.readLine().split(" ");
//        int n=Integer.parseInt(ss[0]);
//        int m=Integer.parseInt(ss[1]);
//        int[] l=new int[n];
//        int[] r=new int[m];
//        int min=Math.min(n,m);
//        ss=br.readLine().split(" ");
//        for(int i=0;i<n;i++){
//           l[i]=Integer.parseInt(ss[i]);
//        }
//        ss=br.readLine().split(" ");
//        for(int i=0;i<m;i++){
//            r[i]=Integer.parseInt(ss[i]);
//        }
//        Arrays.sort(l);
//        Arrays.sort(r);
//        int left=0,right=1000000000;
//        int ans=right;
//        while(left<=right){
//             int mid=(left+right)/2;
//            if(check(mid,l,r,min)){
//                right=mid-1;
//                ans=mid;
//            }
//            else {
//                left=mid+1;
//            }
//        }
//        System.out.println(ans);
//        int ans1=C(3,0);
//        int ans2=C(3,1);
//        int ans3=C(3,2);
//        int ans4=C(3,3);
//        System.out.println(ans1);
//        System.out.println(ans2);
//        System.out.println(ans3);
//        System.out.println(ans4);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int target = sc.nextInt();
//        int count=0;
//        int[] qz=new int[n];
//        int ans[]=new int[n];
//        boolean[] flag = new boolean[n];
//        int sum=0;
//        for (int i = 0; i < n; i++) {
//            qz[i]=C(n-1,i);
//        }
//        dfs(count,n,qz,ans,flag,target,sum);
//        for (int i = 0; i < n; i++) {
//            System.out.print(ans[i]+" ");
//        }
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int target = sc.nextInt();
//        int[] ans = new int[n];
//        int count=0;
//        int sum=0;
//        int[] qz=new int[n];
//        for(int i=0;i<n;i++){
//            qz[i]=C(n-1,i);
//        }
//        boolean[] flag = new boolean[n];
//        dfs(count,ans,target,n,flag,qz,sum);
//        for (int i = 0; i < n; i++) {
//            System.out.print(ans[i]+" ");
//        }
//        Class sc="动力节点".getClass();
//        //获取类型名
//        System.out.println(sc.getName());
//        //获取不带包名的简短类型名
//        System.out.println(sc.getSimpleName());
//        Class vc=null;
//        try {
//            //获取vip类
//             vc=Class.forName("test.Vip");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        //获取vip类中的所有public修饰的属性/字段
//        Field[] fields=vc.getFields();
//        System.out.println(fields.length);
//        for(Field f:fields){
//            System.out.println(f.getName());
//        }
//        System.out.println("***************************");
//        //获取vip类中所有的属性/字段，包括私有的
//        Field[] fields1=vc.getDeclaredFields();
//        for(Field f:fields1){
//            System.out.println(f.getName());
//            //获取属性的类型：
//            Class fieldType=f.getType();
//            System.out.println(fieldType.getName());
//            System.out.println(fieldType.getSimpleName());
//            //获取属性的修饰符
//            System.out.println(f.getModifiers());
//            //将int类型转为字符串来输出
//            System.out.println(Modifier.toString(f.getModifiers()));
//        }
//        System.out.println(fields1.length);
//        System.out.println(Modifier.toString(1));
        Class sc=String.class;
        Field[] fields=sc.getDeclaredFields();
        String s= Modifier.toString(sc.getModifiers());
        String ss=sc.getName();
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        sb.append(" ");
        sb.append(ss);
        //输出类名：
        System.out.println(sb.toString());
        for(Field f:fields){
            //输出属性的修饰符类型
            System.out.print(Modifier.toString(f.getModifiers())+" ");
            //输出属性的类型
            System.out.print(f.getType().getName()+" ");
            //输出属性的名字：
            System.out.print(f.getName());
            System.out.println();
        }
    }
}