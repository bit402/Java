package test;

import java.util.Scanner;

public class test01 {
//    public static final long mod=1000000007L;
//    public static final int MAX=100001;
//    public static long[] dp1=new long[MAX];
//    public static long[] dp2=new long[MAX];
//    public static long[] ans=new long[MAX];
//    static {
//        dp1[1]=1;
//        dp2[1]=1;
//        ans[1]=2;
//        dp1[2]=dp2[1];
//        dp2[2]=(dp1[1]+dp2[1])%mod;
//        ans[2]=(dp1[2]+dp2[2])%mod;
//        for (int i = 3; i <MAX ; i++) {
//            dp1[i]=dp2[i-1]%mod;
//            dp2[i]=(dp1[i-1]+dp1[i-2])%mod;
//            ans[i]=(dp1[i]+dp2[i])%mod;
//        }
//    }
    public static void main(String[] args)  {
//        Scanner sc=new Scanner(System.in);
//        int T=sc.nextInt();
//        for (int i = 0; i < T; i++) {
//            int n=sc.nextInt();
//            System.out.println(ans[n]);
//        }
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int x=sc.nextInt();
//        int y=sc.nextInt();
//        int a=x;
//        int b=-1;
//        boolean flag=false;
//        if(y==0 && x!=0){
//            b=a;
//            flag=true;
//        }
//        else if(y==1 && x==0){
//            b=0;
//            flag=true;
//        }
//        else if(y==2 && x==0){
//            b=1;
//            flag=true;
//        }
//        if(flag){
//            System.out.println(a+" "+b);
//        }
//        else{
//            System.out.println(-1);
//        }
//        sc.close();
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            String s1 = sc.next();
            String s2 = sc.next();
            String s3 = sc.next();
            StringBuilder sb1=new StringBuilder(s3);
            StringBuilder sb2=new StringBuilder();
            while(sb1.length()>0){
                if(s1.contains(sb1)){
                    break;
                }
                sb2.append(sb1.charAt(sb1.length()-1));
                sb1=sb1.deleteCharAt(sb1.length() - 1);
            }
            sb2=sb2.reverse();
            if(s2.contains(sb2)){
                System.out.println("qiang");
            }
            else {
                System.out.println("ruo");
            }
        }
        sc.close();
    }
}