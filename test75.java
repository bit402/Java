package test;

import java.util.*;

public class test01 {
//    public static boolean pd(int i,int j,List<int[][]> list,int[][] jx){
//        int[][] ju=list.get(i);
//        int[][] ju2=list.get(j);
//        int x1=ju[0][0];
//        int y1=ju[0][1];
//        int x2=ju[1][0];
//        int y2=ju[1][1];
//        int a1=ju2[0][0];
//        int b1=ju2[0][1];
//        int a2=ju2[1][0];
//        int b2=ju2[1][1];
//        if(((x1==a1) && (y1==b1)) || ((x2==a2) && (y2==b2)) ||((x1==a2) && (y1==b2)) || ((x2==a1) && (y2==b1))) {
//            return false;
//        }
//        return true;
//    }
//public static boolean[] zsj=new boolean[10000];
//    public static void ass(){
//        Arrays.fill(zsj,true);
//        zsj[0]=false;
//        zsj[1]=false;
//        for(int i=2;i<zsj.length;i++){
//            if(zsj[i]){
//                for(int j=2*i;j<zsj.length;j+=i){
//                    zsj[j]=false;
//                }
//            }
//        }
//    }
//    public static int bfs(int a,int b){
//        if(a==b){
//            return 0;
//        }
//        Queue<Integer> queue=new LinkedList<>();
//        int[] bs=new int[10000];
//        Arrays.fill(bs,-1);
//        bs[a]=0;
//        queue.add(a);
//        //int[] qz={1,10,100,1000};
//        while(!queue.isEmpty()){
//            int num=queue.poll();
//            int[] qz={1000,100,10,1};
//            int[] now=new int[4];
//            now[0]=num/1000;
//            now[1]=(num/100)%10;
//            now[2]=(num/10)%10;
//            now[3]=num%10;
//            for(int i=0;i<now.length;i++){
//                for(int j=0;j<=9;j++){
//                    if(j==now[i]){
//                        continue;
//                    }
//                    int xs=num-(now[i]*qz[i])+j*qz[i];
//                    if(xs>=2 && zsj[xs] && bs[xs]==-1){
//                        bs[xs]=bs[num]+1;
//                        if(xs==b){
//                            return bs[xs];
//                        }
//                        queue.add(xs);
//                    }
//                }
//            }
//        }
//        return -1;
//    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = sc.nextInt();
//            int[] arr = new int[n];
//            for (int j = 0; j < n; j++) {
//                arr[j] = sc.nextInt();
//            }
//            Deque<Integer> stack = new ArrayDeque<>();
//            int[] left = new int[n];
//            int[] right = new int[n];
//            Arrays.fill(left, -1);
//            for (int j = 0; j < n; j++) {
//                while (!stack.isEmpty() && arr[stack.peek()] <= arr[j]) {
//                    stack.pop();
//                }
//                if(!stack.isEmpty()){
//                    left[j] = stack.peek();
//                }
//                stack.push(j);
//            }
//            Arrays.fill(right, n);
//            stack.clear();
//            for (int j = n-1; j >=0; j--) {
//                while (!stack.isEmpty() && arr[stack.peek()] <= arr[j]) {
//                    stack.pop();
//                }
//                if(!stack.isEmpty()){
//                    right[j] = stack.peek();
//                }
//                stack.push(j);
//            }
//            int sum = 0;
//            for (int j = 0; j < n; j++) {
//                int k=arr[j];
//                // 2 1 3 4 6 5
//                // 0 1 2 3 4 5
//                int l=Math.max(j-(k-1),0);
//                int r=Math.min(j+(k-1),n);
//                int a=Math.max(l,left[j]+1);
//                int b=Math.min(j,right[j]-k);
//                if(a<=b){
//                    sum++;
//                }
//            }
//            System.out.println(sum);
//        }
//        sc.close();
// 7 3:1   4:3
//4 1 3 2 ||  7: 4 3 2 1
//3:1  4 3 2 1
//4:3  4 1 3 2
//7和3 不带第一个元素来循环
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//            Deque<Integer> deque=new ArrayDeque<>();
//            int max=0;
//            for (int j = 0; j < n; j++) {
//                int num=sc.nextInt();
//                if(num>max){
//                    max=num;
//                }
//                deque.addLast(num);
//            }
//            int count=0;
//            for (int j = 0; j < k; j++) {
//                int a=deque.pollFirst();
//                int b=deque.pollFirst();
//                if(a>b){
//                    deque.addLast(b);
//                    deque.addFirst(a);
//                }
//                else {
//                    deque.addLast(a);
//                    deque.addFirst(b);
//                }
//                count++;
//                if(deque.peek()==max){
//                    break;
//                }
//            }
//            int first=deque.pollFirst();
//            int sy=(k-count)%(deque.size());
//            for(int j=sy;j>0;j--){
//                int a=deque.pollFirst();
//                deque.addLast(a);
//            }
//            deque.addFirst(first);
//            boolean flag=true;
//            for(int j:deque){
//                if(flag){
//                    flag=false;
//                    System.out.print(j);
//                }
//                else {
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
//            if((n&(n-1))==0){
//                System.out.println("Fang");
//            }
//            else {
//                System.out.println("Ben");
//            }
//        }
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int t=sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = sc.nextInt();
//            int m = sc.nextInt();
//            String sn = sc.next();
//            String sm= sc.next();
//            char[] cn = sn.toCharArray();
//            char[] cm = sm.toCharArray();
//            int point=0;
//            for(int j=0;j<m;j++){
//                switch(cm[j]){
//                    case 'L':{
//                        if(point==0){
//                            continue;
//                        }
//                        else {
//                            point--;
//                            break;
//                        }
//                    }
//                    case 'R':{
//                        if(point==cn.length-1){
//                            continue;
//                        }
//                        else {
//                            point++;
//                            break;
//                        }
//                    }
//                    case 'U':{
//                        if(cn[point]=='9'){
//                            cn[point]='0';
//                            continue;
//                        }
//                        else {
//                            cn[point]++;
//                            break;
//                        }
//                    }
//                    case 'D':{
//                        if(cn[point]=='0'){
//                            cn[point]='9';
//                            continue;
//                        }
//                        else {
//                            cn[point]--;
//                            break;
//                        }
//                    }
//                }
//            }
//            String ans=String.valueOf(cn);
//            System.out.println(ans);
//        }
//        sc.close();
//        int[][] jx = {{11, 8, 3, 27, 24, 1}, {2, 21, 16, 35, 17, 4}, {9, 29, 20, 30, 5, 10},
//                {36, 33, 13, 6, 23, 7}, {31, 14, 15, 28, 12, 25}, {34,19,18,37,22,39}};
//        List<int[][]> list = new ArrayList<>();
//        for (int row = 0; row < 6; row++) {
//            for (int col = 0; col < 5; col++) {
//                if ((jx[row][col] + jx[row][col + 1]) % 2 != 0) {
//                    list.add(new int[][]{{row, col}, {row, col + 1}});
//                }
//            }
//        }
//        for (int col = 0; col < 6; col++) {
//            for (int row = 0; row < 5; row++) {
//                if ((jx[row][col] + jx[row + 1][col]) % 2 != 0) {
//                    list.add(new int[][]{{row, col}, {row + 1, col}});
//                }
//            }
//        }
//        int sum=0;
//        for(int i=0;i<list.size();i++){
//            for(int j=i+1;j<list.size();j++){
//                if(!pd(i,j,list,jx)){
//                    continue;
//                }
//                for(int k=j+1;k<list.size();k++){
//                    if(pd(i,k,list,jx) && pd(j,k,list,jx)){
//                        sum++;
//                    }
//                }
//            }
//        }
//        System.out.println(sum);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        int max=Integer.MIN_VALUE;
//        int min=Integer.MAX_VALUE;
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        System.out.println(0+" "+(arr.length-1)+" "+(max-min));
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        ass();
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            System.out.println(bfs(a,b));
//        }
//        sc.close();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] jg=new int[n-1];
        int sum=0;
        for (int i = 0; i < n-1; i++) {
            jg[i]=arr[i+1]-arr[i];
            sum+=jg[i];
        }
        Arrays.sort(jg);
        for (int i = 0; i < n; i++) {
            if(i==0){
                System.out.print(sum+" ");
            }
            else{
                System.out.println(sum-jg[n-i]+" ");
            }
        }
    }
}