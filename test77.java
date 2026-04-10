package test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class test01 {
//    public static long C(int n){
//        return BigInteger.valueOf(n).multiply(BigInteger.valueOf(n-1)).multiply(BigInteger.valueOf(n-2)).divide(BigInteger.valueOf(6)).mod(BigInteger.valueOf(mo)).longValue();
//    }
//    public static long mo=1000000007L;
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int a=0;
//        int b=0;
//        if(x==y){
//            System.out.println(-1);
//            return;
//        }
//        else if(y==0){
//            a=b=x;
//        }
//        else if(y==1){
//            if(x!=0){
//                System.out.println(-1);
//                return;
//            }
//            else{
//                a=b=x;
//            }
//        }
//        else if(y==2){
//            if(x!=0){
//                System.out.println(-1);
//                return;
//            }
//            else{
//                a=x;
//                b=1;
//            }
//        }
//        else {
//            System.out.println(-1);
//            return;
//        }
//        System.out.println(a+" "+b);
//        sc.close();
//        int a=4052;
//        int b=4052;
//        long ans=(C(a)+C(b))%mo;
//        System.out.println(ans);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tq=new int[n];
        int max=0;
        int index=-1;
        int[][] zui={{0,0}};
        for (int i = 0; i < n; i++) {
            tq[i]=sc.nextInt();
            if(max<tq[i]){
                max=tq[i];
            }
        }
        int ans=0;
        int yc=1;
        int time=0;
        //boolean flag=false;
        int[][] ls=new int[max+1][2];
        for (int i = 0; i < n; i++) {
            time++;
            if(ls[tq[i]][0]==0){
                ls[tq[i]][0]=time;
            }
            ls[tq[i]][1]++;
            if(ls[tq[i]][1]>zui[0][1]){
                zui[0][1]=ls[tq[i]][1];
                zui[0][0]=ls[tq[i]][0];
                index=tq[i];
            }
            else if(ls[tq[i]][1]==zui[0][1]){
                if(ls[tq[i]][0]>zui[0][0]){
                    zui[0][1]=ls[tq[i]][1];
                    zui[0][0]=ls[tq[i]][0];
                    index=tq[i];
                }
            }
            if(tq[i]==yc){
                ans++;
            }
            else{
                yc=index;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}