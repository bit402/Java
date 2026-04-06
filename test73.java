package test;

import java.util.*;

public class test01 {
    //    public static int[][] jz={
//            {11, 8, 3, 27, 24, 1},
//            {2, 21, 16, 35, 17, 4},
//            {9, 29, 20, 30, 5, 10},
//            {36, 33, 13, 6, 23, 7},
//            {31, 14, 15, 28, 12, 25},
//            {34, 19, 18, 37, 22, 39}
//    };
//    public static  List<int[][]> list = new LinkedList<>();
//    public static void sx(){
//        for(int row=0;row<6;row++){
//            for(int col=0;col<5;col++){
//                if((jz[row][col]+jz[row][col+1])%2==1){
//                    list.add(new int[][]{{row,col},{row,col+1}});
//                }
//            }
//        }
//        for(int col=0;col<6;col++){
//            for(int row=0;row<5;row++){
//                if((jz[row][col]+jz[row+1][col])%2==1){
//                    list.add(new int[][]{{row,col},{row+1,col}});
//                }
//            }
//        }
//    }
//    public static int da(){
//        int sum=0;
//        int total=list.size();
//        for(int i=0;i<total;i++){
//            for(int j=i+1;j<total;j++){
//                if(pd(list.get(i),list.get(j))) {
//                    for (int k = j + 1; k < total; k++) {
//                        if (pd(list.get(i), list.get(k)) && pd(list.get(j), list.get(k))) {
//                            sum++;
//                        }
//                    }
//                }
//            }
//        }
//        return sum;
//    }
//    public static boolean pd(int[][] f,int[][] s){
//        int x1=f[0][0];
//        int y1=f[0][1];
//        int x2=f[1][0];
//        int y2=f[1][1];
//        int a1=s[0][0];
//        int b1=s[0][1];
//        int a2=s[1][0];
//        int b2=s[1][1];
//        if(((x1==a1) && (y1==b1)) || ((x2==a2) && (y2==b2))
//        || ((x2==a1) && (y2==b1)) || ((x1==a2) && (y1==b2))){
//            return false;
//        }
//        return true;
//    }
    public static void main(String[] args) {
//        sx();
//        int ans=0;
//        ans=da();
//        System.out.println(ans);
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = sc.nextInt();
//            int m = sc.nextInt();
//            char[] chars = new char[m];
//            int[] arr = new int[n];
//            for(int j=0;j<n;j++){
//                arr[j] = sc.nextInt();
//            }
//            int point=0;
//            for(int j=0;j<m;j++){
//                chars[j] = sc.next().charAt(0);
//                if(chars[j]=='L'){
//                    if(point==0){
//                        continue;
//                    }
//                    point--;
//                }
//                else if(chars[j]=='R'){
//                    if(point== (arr.length-1)){
//                        continue;
//                    }
//                    point++;
//                }
//                else if(chars[j]=='U'){
//                    if(arr[point]==9){
//                        arr[point]=0;
//                        continue;
//                    }
//                    arr[point]++;
//                }
//                else if(chars[j]=='D'){
//                    if(arr[point]==0){
//                        arr[point]=9;
//                        continue;
//                    }
//                    arr[point]--;
//                }
//            }
//            for(int j=0;j<n;j++){
//                System.out.print(arr[j]+" ");
//            }
//        }
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = sc.nextInt();
//            int m = sc.nextInt();
//            String sn = sc.next();
//            String sm = sc.next();
//            char[] csn = sn.toCharArray();
//            char[] csm = sm.toCharArray();
//            int point=0;
//            for(int j=0;j<csm.length;j++){
//                if(csm[j]=='L'){
//                    if(point==0){
//                        continue;
//                    }
//                    point--;
//                }
//                else if(csm[j]=='R'){
//                    if(point==(csn.length-1)){
//                        continue;
//                    }
//                    point++;
//                }
//                else if(csm[j]=='U'){
//                    if(csn[point]=='9'){
//                        csn[point]='0';
//                        continue;
//                    }
//                    csn[point]++;
//                }
//                else if(csm[j]=='D'){
//                    if(csn[point]=='0'){
//                        csn[point]='9';
//                        continue;
//                    }
//                    csn[point]--;
//                }
//            }
//            System.out.println(new String(csn));
//        }
//        sc.close();
        //5张卡牌的情况
//11111-> 1:2111  ->2:221 -> 3:41 ben
//6张卡牌的情况
//111111-> 1:21111 -> 2:2211 ->3:4:11 4->:42 ben
//7张卡牌的情况
//1111111 ->1:211111 -> 2: 22111 -> 3:2221 -> 4:421 ben
//8张卡牌的时候
//11111111 ->1：2111111 ->2:221111 ->3:22211 ->4:2222 ->5:422 ->6: 44-> 7:8 fang
//        Scanner sc = new Scanner(System.in);
//        //2 4 8 16 32
//        int t=sc.nextInt();
//        for(int i=0;i<t;i++){
//            int n=sc.nextInt();
//            boolean flag=false;
////            if((n & (n-1))==0){
////                flag=true;
////            }
//            int cnt=1;
//            while(cnt<n){
//                cnt*=2;
//            }
//            if(cnt==n){
//                flag=true;
//            }
//            if(flag){
//                System.out.println("Fang");
//            }
//            else{
//                System.out.println("Ben");
//            }
//        }
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//            List<Integer> list = new LinkedList<>();
//            for (int j = 0; j < n; j++) {
//                list.add(sc.nextInt());
//            }
//            for(int j = 0; j < k; j++) {
//                int a = list.get(0);
//                int b = list.get(1);
//                if(a>b){
//                    list.remove(1);
//                    list.add(b);
//                }
//                else if(a<b){
//                    list.remove(0);
//                    list.add(a);
//                }
//            }
////            for(int j = 0; j < list.size(); j++) {
////                System.out.print(list.get(j)+" ");
////            }
//            boolean flag = true;
//            for(int j: list){
//                if(flag){
//                    System.out.print(j);
//                    flag = false;
//                }else {
//                    System.out.print(" "+j);
//                }
//            }
//            System.out.println();
//        }
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = sc.nextInt();
//            int k=sc.nextInt();
//            Deque<Integer> dq = new ArrayDeque<>();
//            int max=Integer.MIN_VALUE;
//            for (int j = 0; j < n; j++) {
//                int num=sc.nextInt();
//                dq.add(num);
//                max=Math.max(max,num);
//            }
//            int count=0;
//            for(int j=0;j<k;j++){
//                int a=dq.pollFirst();
//                int b=dq.pollFirst();
//                if(a>b){
//                    dq.offerFirst(a);
//                    dq.offerLast(b);
//                }
//                else{
//                    dq.offerFirst(b);
//                    dq.offerLast(a);
//                }
//                count++;
//                if(dq.peek()==max){
//                    break;
//                }
//            }
//            int sy=k-count;
//            sy=sy%(n-1);
//            int frist=dq.pollFirst();
//            for(int j=0;j<sy;j++){
//                int num=dq.pollFirst();
//                dq.offerLast(num);
//            }
//            dq.offerFirst(frist);
//            boolean first=true;
//            for(int a:dq){
//                if(first){
//                    System.out.print(a);
//                    first=false;
//                }
//                else{
//                    System.out.print(" "+a);
//                }
//            }
//            System.out.println();
//        }
//        sc.close();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int count=0;
            for(int j = 0; j < n; j++) {
                int max=arr[j];
                int len=max;
                if(j+len)
            }
        }
        sc.close();
    }
}
//1 2 3 4 5
//0 1 2 3 4