package test;

import java.util.Scanner;

public class test01 {

    public static void main(String[] args){
//        int age1=1;
//        for( age1=1;age1<=100;age1++){
//            int age2=2*age1;
//            if((age1+20)*1.5==(age2+20)){
//                System.out.println(age1+20);
//                break;
//            }
//        }
//        System.out.println(40);
        //******************************************
        Scanner sc = new Scanner(System.in);
        //System.out.println("请输入迷宫行数:");
        int N = sc.nextInt();
        //System.out.println("请输每行有多少个数:");
        int M = sc.nextInt();
        //System.out.println("请输入有多少个密钥：");
        int Q = sc.nextInt();
        int[][] arr=new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int l=0;
        int r=0;
        int sum=0;
        //起点
        int a=arr[l][r];
        sum+=a;
        while(true){
            if(l==N-1 && r==M-1){
                System.out.println(sum);
                break;
            }
            if(l==N-1){
                if((arr[l][r]%arr[l][r+1]==0)||(arr[l][r+1]%arr[l][r]==0)){
                    Q=Q-1;
                }
                sum=sum+arr[l][r+1];
                r=r+1;
            }
            else if(r==M-1){
                if((arr[l][r]%arr[l+1][r]==0)||(arr[l+1][r]%arr[l][r]==0)){
                    Q=Q-1;
                }
                sum=sum+arr[l+1][r];
                l=l+1;
            }
            else if(arr[l+1][r]>arr[l][r+1]){
                if((arr[l][r]%arr[l+1][r]==0)||(arr[l+1][r]%arr[l][r]==0)){
                    Q=Q-1;
                }
                sum=sum+arr[l+1][r];
                l=l+1;
            }
            else if(arr[l][r+1]>arr[l+1][r]){
                if((arr[l][r]%arr[l][r+1]==0)||(arr[l][r+1]%arr[l][r]==0)){
                    Q=Q-1;
                }
                sum=sum+arr[l][r+1];
                r=r+1;
            }
            if(Q<0){
                System.out.println(-1);
                break;
            }
        }
        sc.close();
        //****************************************
//        Scanner scan = new Scanner(System.in);
//        int t=scan.nextInt();
//        int[][] arr = new int[t][2];
//        for(int i=0;i<t;i++){
//            for(int j=0;j<2;j++){
//                arr[i][j]=scan.nextInt();
//            }
//        }
//        for(int i=0;i<t;i++){
//            System.out.println(Q(arr[i][0],arr[i][1]));
//        }
//    }
//    public static int J(int a){
//        int sum=1;
//        for(int i=1;i<=a;i++){
//            sum=sum*i;
//        }
//        return sum;
//    }
//    public static int Q(int a,int b){
//        int result=J(a)/J(a-b)/J(b);
//        return result;
        //************************************
//        int a=2025;
//        int count=0;
//        int h=0;
//        while(true){
//            h=h+1;
//            a=a-5;
//            if(h%2==1){
//                a=a-15;
//            }
//            else if(h%2==0){
//                a=a-2;
//            }
//            if(h%3==1){
//                a=a-2;
//            }
//            else if(h%3==2){
//                a=a-10;
//            }
//            else if(h%3==0){
//                a=a-7;
//            }
//            count++;
//            if(a<=0){
//                break;
//            }
//        }
//        System.out.println(count);
        //************************************
//        Scanner scan = new Scanner(System.in);
//        long n = scan.nextLong();
//        long sum=0L;
//        for(long i=n; i<=(n+24);i++){
//            sum+=i;
//        }
//        System.out.println(sum);
//        scan.close();
        //*******************************\
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
//        char[] ch = str.toCharArray();
//        for (int i = 0; i < ch.length; i++) {
//            if(ch[i] >='a' && ch[i] <='z'){
//                ch[i]='L';
//            }
//            else if(ch[i]>='0' && ch[i] <='9'){
//                ch[i]='Q';
//            }
//        }
//        for (int i = 0; i < ch.length; i++) {
//            System.out.print(ch[i]);
//        }
//        scan.close();
        //*********************************************
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//        if(a+b<c || a+c<b || b+c<a){
//            System.out.println(-1);
//            return;
//        }
//        int s=(a+b+c)/2;
//        int area=(int)Math.sqrt(s*(s-a)*(s-b)*(s-c));
//        System.out.println(area*area);
//        scan.close();
        //****************************************
//        Scanner scan = new Scanner(System.in);
//        long a=scan.nextLong();
//        long b=scan.nextLong();
//        long n=scan.nextLong();
//        long count=0L;
//        long week=0L;
//        week=a*5+b*2;
//        long yu=n%week;
//        count=n/week*7;
//        if(yu<=a){
//            count++;
//        }
//        else if(yu<=2*a){
//            count=count+2;
//        }
//        else if(yu<=3*a){
//            count=count+3;
//        }
//        else if(yu<=4*a){
//            count=count+4;
//        }
//        else if(yu<=5*a){
//            count=count+5;
//        }
//        else if(yu>=5*a && yu<=(5*a+b)){
//            count=count+6;
//        }
//        else {
//            count=count+7;
//        }
//        System.out.println(count);
//        scan.close();
        //**************************************
//        Scanner scan = new Scanner(System.in);
//        int p=scan.nextInt();
//        if(p%3==0){
//            System.out.println("low");
//        }
//        else if(p%3==1){
//            System.out.println("mid");
//        }
//        else if(p%3==2){
//            System.out.println("high");
//        }
//        scan.close();
        //1-中 2-高 3-低 4-中 5-高 6-低 7-中 8-高 9-低 10-中 11-高
        //中：1，4，7，10
        //高：2，5，8，11
        //低：3，6，9
        //*********************************

  }
}