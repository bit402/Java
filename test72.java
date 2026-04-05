package test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test01 {
//    public static int rs(int p,int q,int m){
//        return ((m*p)+q-1)/q;
//    }
//public static boolean[] isPrime=new boolean[10000];
//    public static void sieve(){
//        Arrays.fill(isPrime,true);
//        isPrime[0]=false;
//        isPrime[1]=false;
//        for(int i=2;i<10000;i++){
//            if(isPrime[i]){
//                for(int j=i*2;j<10000;j+=i){
//                    isPrime[j]=false;
//                }
//            }
//        }
//    }
//    public static int bfs(int a,int b){
//        if(a==b){
//            return 0;
//        }
//        Queue<Integer> q=new LinkedList<>();
//        q.add(a);
//        int[] bs=new int[10000];
//        Arrays.fill(bs,-1);
//        bs[a]=0;
//        int[] qz={1000,100,10,1};
//        while(!q.isEmpty()){
//            int now=q.poll();
//            int[] ndi=new int[4];
//            ndi[0]=now/1000;
//            ndi[1]=(now/100)%10;
//            ndi[2]=(now/10)%10;
//            ndi[3]=now%10;
//            for(int i=0;i<4;i++){
//                for(int j=0;j<=9;j++){
//                    if(j==ndi[i]){
//                        continue;
//                    }
//                    int future=now-ndi[i]*qz[i]+j*qz[i];
//                    if(future>=2 && isPrime[future] && bs[future]==-1){
//                        bs[future]=bs[now]+1;
//                        if(future==b){
//                            return bs[future];
//                        }
//                        q.add(future);
//                    }
//                }
//            }
//        }
//        return -1;
//    }
    public static void main(String[] args)  {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int sum=0;
//        for (int i = 0; i < n; i++) {
//            int p = sc.nextInt();
//            int q = sc.nextInt();
//            int w = sc.nextInt();
//            int tg=rs(p,q,m);
//            if(w-tg>=0){
//                continue;
//            }
//            else {
//                sum+=(tg-w);
//            }
//        }
//        System.out.println(sum);
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        sieve();
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            System.out.println(bfs(a,b));
//        }
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n+1];
//        int max=0;
//        int min=Integer.MAX_VALUE;
//        for (int i = 1; i <= n; i++) {
//            arr[i] = sc.nextInt();
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        int result=max-min;
//        System.out.println(1+" "+n+" "+result);
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        if(n==1){
//            System.out.println(0);
//            return;
//        }
//        int[] jx = new int[n-1];
//        for (int i = 0; i < n-1; i++) {
//            //jx的最长下表可以到n-2
//            jx[i]=arr[i+1]-arr[i];
//        }
//        Arrays.sort(jx);
//        long total=arr[n-1]-arr[0];
//        long[] pre=new long[n];
//        for(int i=1;i<n;i++){
//            pre[i]=pre[i-1]+jx[(n-1)-i];
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(total-pre[i]+" ");
//        }
//
////        int index=n-2;
////        for (int i = 0; i < n; i++) {
////            int sum=0;
////            for(int j=index;j>=0;j--){
////                sum+=jx[j];
////            }
////            index--;
////            System.out.print(sum+" ");
////        }
//        sc.close();
        
    }
}