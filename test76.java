package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class test01 {
//    public static int sqz(int p,int q,int m){
//        return ((m*p)+q-1)/q;
//    }
//public static boolean pd(int j){
//    if(j<2){
//        return false;
//    }
//    if(j==2){
//        return true;
//    }
//    if(j%2==0){
//        return false;
//    }
//    for(int i=3;i*i<=j;i+=2){
//        if(j%i==0){
//            return false;
//        }
//    }
//    return true;
//}
//public static boolean[] pd=new boolean[1000001];
//    public static void csh(){
//        Arrays.fill(pd,true);
//        pd[0]=false;
//        pd[1]=false;
//        for(int i=2;i<1000001;i++){
//            if(pd[i]){
//                for(int j=2*i;j<1000001;j+=i){
//                    pd[j]=false;
//                }
//            }
//        }
//    }
//public static final int mo=1000000007;
//    public static int[] dpx=new int[100001];
//    public static int[] dpj=new int[100001];
//    public static int[] sum=new int[100001];
//    public static void csh(){
//        dpx[1]=1;
//        dpj[1]=1;
//        sum[1]=(dpx[1]+dpj[1])%mo;
//        dpx[2]=dpj[1];
//        dpj[2]=(dpx[1]+dpj[1])%mo;
//        sum[2]=(dpx[2]+dpj[2])%mo;
//        for(int i=3;i<=100000;i++){
//            dpx[i]=dpj[i-1];
//            dpj[i]=(dpx[i-1]+dpx[i-2])%mo;
//            sum[i]=(dpx[i]+dpj[i])%mo;
//        }
//    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int[] jg=new int[n-1];
//        long sum=0L;
//        for (int i = 0; i < n-1; i++) {
//            jg[i]=arr[i+1]-arr[i];
//            sum+=jg[i];
//        }
//        Arrays.sort(jg);//此时最大的间隔的下标是：n-2;
//        for(int k=1;k<=n;k++){
//            if(k==1){
//                System.out.print(sum+" ");
//            }
//            else{
//                sum-=jg[n-k];
//                System.out.print(sum+" ");
//            }
//        }
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            int p=sc.nextInt();
//            int q=sc.nextInt();
//            int w=sc.nextInt();
//            int need=sqz(p,q,m);
//            if(w<need){
//                sum+=(need-w);
//            }
//        }
//        System.out.println(sum);
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int x = sc.nextInt();
//        int[][] arr = new int[n][2];
//        for (int i = 0; i < n; i++) {
//            arr[i][0] = sc.nextInt();
//            arr[i][1] = sc.nextInt();
//        }
//        int time=0;
//        int sum=0;
//        Arrays.sort(arr,new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0]-o2[0];
//            }
//        });
//        boolean flag=false;
//        for(int i=n-1;i>=0;i--){
//            time=arr[i][0];
//            sum+=arr[i][1];
//            if(sum>=x){
//                flag=true;
//                break;
//            }
//        }
//        if(flag){
//            System.out.println(time);
//        }
//        else{
//            System.out.println("0");
//        }
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        csh();
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        int j=2;
//        for (int i = 0; i < n; i++) {
//            while(true){
//                if((j%5==1) && pd[j]){
//                    arr[i]=j;
//                    j++;
//                    break;
//                }
//                j++;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            String s = sc.next();
//            char[] ch = s.toCharArray();
//            for (int j = 0; j < ch.length; j++) {
//                if(ch[j]=='0'){
//                    ch[j]='0';
//                }
//                else if(ch[j]=='3'){
//                    ch[j]='L';
//                }
//                else {
//                    ch[j]=(char)((10-(ch[j]-'0')+'0'));
//                }
//            }
//            String ans=new String(ch);
//            System.out.println(ans);
//        }
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        csh();
//        for (int i = 0; i < t; i++) {
//            int n = sc.nextInt();
//            System.out.println(sum[n]);
//        }
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            int k=sc.nextInt();
//            ArrayList<Integer> list1 = new ArrayList<>();
//            for (int j = 0; j < k; j++) {
//                int a = sc.nextInt();
//                list1.add(a);
//            }
//            list.add(list1);
//        }
//        int q = sc.nextInt();
//        for (int i = 0; i < q; i++) {
//            int x = (sc.nextInt()-1);
//            int y = (sc.nextInt()-1);
//            ArrayList<Integer> a = list.get(x);
//            ArrayList<Integer> b = list.get(y);
//            int pa=0;
//            int pb=0;
//            int count=0;
//            while(pa<a.size() && pb<b.size()){
//                int numa=a.get(pa);
//                int numb=b.get(pb);
//                if(numa==numb){
//                    count++;
//                    pa++;
//                    pb++;
//                }
//                else if(a.get(pa)<b.get(pb)){
//                    pa++;
//                }
//                else{
//                    pb++;
//                }
//            }
//            int ans=a.size()+b.size()-count;
//            System.out.println(ans);
//        }
//        sc.close();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a;
        int b;
        if(x==y){
            System.out.println(-1);
            return;
        }
        if(y>2){
            System.out.println(-1);
            return;
        }
        if(y==2){
            a=0;
            b=1;
        }
        else{
            a=b=x;
        }
        System.out.println(a+" "+b);
        sc.close();
    }
}