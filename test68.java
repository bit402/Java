package test;

import java.util.*;

public class test01 {
//    public static int tj(int[] cx,int[] last){
//        int max=-1;
//        int index=-1;
//        for(int i=0;i<cx.length;i++){
//            if(cx[i]==0){
//                continue;
//            }
//            if(cx[i]>max){
//                max=cx[i];
//                index=i;
//            }
//            if(cx[i]==max && last[i]>last[index]){
//                //max=cx[i];
//                index=i;
//            }
//        }
//        return (index+1);
//    }
    public static void main(String[] args)  {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] reality = new int[n];
//        int max=0;
//        for (int i = 0; i < n; i++) {
//            reality[i] = sc.nextInt();
//            if (reality[i] > max) {
//                max = reality[i];
//            }
//        }
//        int[] cx = new int[max];
//        int count=0;
//        boolean flag=false;
//        int tmp=0;
//        int last[]=new int[max];
//        int time=1;
//        for (int i = 0; i < n; i++) {
//            if(i==0){
//                tmp=1;
//            }
//            else if(flag){
//                tmp=reality[i-1];
//            }
//            else {
//                tmp=tj(cx,last);
//            }
//            if(tmp==reality[i]){
//                flag=true;
//                count++;
//            }
//            else{
//                flag=false;
//            }
//            cx[(reality[i]-1)]++;
//            if(last[reality[i]-1] == 0) {  // 0代表未出现过
//                last[(reality[i]-1)] = time;
//            }
//            time++;
//        }
//        System.out.println(count);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] reality=new int[n];
//        int max=0;
//        for (int i = 0; i < n; i++) {
//            reality[i]=sc.nextInt();
//            if(reality[i]>max){
//                max=reality[i];
//            }
//        }
//        int[] cx=new int[max];
//        int[] last=new int[max];
//        int best=0;
//        int bestIndex=-1;
//        int tmp=0;
//        boolean flag=false;
//        int count=0;
//        int f=1;
//        for (int i = 0; i < n; i++) {
//            if(i==0){
//                tmp=1;
//            }
//            else if(flag){
//                tmp=reality[i-1];
//            }
//            else{
//                tmp=bestIndex+1;
//            }
//            if(tmp==reality[i]){
//                flag=true;
//                count++;
//            }
//            else{
//                flag=false;
//            }
//            if(cx[reality[i]-1]==0){
//                last[reality[i]-1]=f;
//                f++;
//            }
//            cx[reality[i]-1]++;
//            if(cx[reality[i]-1]>best){
//                best=cx[reality[i]-1];
//                bestIndex=reality[i]-1;
//            }
//            else if(cx[reality[i]-1]==best){
//                if(last[reality[i]-1]>last[bestIndex]){
//                    bestIndex=reality[i]-1;
//                }
//            }
//        }
//        System.out.println(count);
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        String[] str = new String[T];
//        for (int i = 0; i < T; i++) {
//            str[i] = sc.next();
//        }
//        for (int i = 0; i < T; i++) {
//            char[] chars = str[i].toCharArray();
//            StringBuilder sb=new StringBuilder();
//            for (int j = 0; j < chars.length; j++) {
//                switch(chars[j]){
//                    case '0':{
//                        sb.append('0');
//                        break;
//                    }
//                    case '1':{
//                        sb.append('9');
//                        break;
//                    }
//                    case '2':{
//                        sb.append('8');
//                        break;
//                    }
//                    case '3':{
//                        sb.append('L');
//                        break;
//                    }
//                    case '4':{
//                        sb.append('6');
//                        break;
//                    }
//                    case '5':{
//                        sb.append('5');
//                        break;
//                    }
//                    case '6':{
//                        sb.append('4');
//                        break;
//                    }
//                    case '7':{
//                        sb.append('3');
//                        break;
//                    }
//                    case '8':{
//                        sb.append('2');
//                        break;
//                    }
//                    case '9':{
//                        sb.append('1');
//                        break;
//                    }
//                }
//            }
//            System.out.println(sb);
//        }
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        List<TreeSet<Integer>> list = new ArrayList<TreeSet<Integer>>();
//        for (int i = 0; i < n; i++) {
//            int k = sc.nextInt();
//            TreeSet<Integer> t=new TreeSet<>();
//            for (int j = 0; j < k; j++) {
//                t.add(sc.nextInt());
//            }
//            list.add(t);
//        }
//        int q = sc.nextInt();
//        int[] ans = new int[q];
//        for (int i = 0; i < q; i++) {
//            int x=sc.nextInt();
//            int y=sc.nextInt();
//            x--;
//            y--;
//            TreeSet<Integer> nt=new TreeSet<>(list.get(x));
//            nt.addAll(list.get(y));
//            ans[i]=nt.size();
//        }
//        for (int i = 0; i < q; i++) {
//            System.out.println(ans[i]);
//        }
//        sc.close();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<k;j++){
                 l.add(sc.nextInt());
            }
            Collections.sort(l);
            list.add(l);
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            
        }
    }
}