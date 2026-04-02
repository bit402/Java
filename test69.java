package test;

import java.util.*;

public class test01 {
    //public static boolean isz(int n){
//        if(n==2){
//            return true;
//        }
//        for(int i=2; i*i<=n; i++){
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
//    // 栈里存的东西
//    static class Node {
//        long time;
//        int pos;
//        long val;
//        public Node(long time, int pos, long val) {
//            this.time = time;
//            this.pos = pos;
//            this.val = val;
//        }
//    }
//    static class  Node{
//        long time;
//        long value;
//        int pos;
//
//        public Node(long time, long value, int pos) {
//            this.time = time;
//            this.value = value;
//            this.pos = pos;
//        }
//    }
    public static void main(String[] args)  {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
//        for (int i = 0; i < n; i++) {
//            int k=sc.nextInt();
//            ArrayList<Integer> al=new ArrayList<>();
//            for (int j = 0; j < k; j++) {
//                al.add(sc.nextInt());
//            }
//            //Collections.sort(al);
//            list.add(al);
//        }
//        int q = sc.nextInt();
//        ArrayList<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < q; i++) {
//            int x = sc.nextInt()-1;
//            int y = sc.nextInt()-1;
//            ArrayList<Integer> a = list.get(x);
//            ArrayList<Integer> b = list.get(y);
//            int j=0;
//            int k=0;
//            int count=0;
//            while(j<a.size()&&k<b.size()){
//                // ✅ 修复：拆箱成int再比较
//                int numA = a.get(j);
//                int numB = b.get(k);
//                if(numA == numB){
//                    count++;
//                    k++;
//                    j++;
//                } else if (numA < numB) {
//                    j++;
//                }
//                else{
//                    k++;
//                }
//            }
//            int result=a.size()+b.size()-count;
//            ans.add(result);
//        }
//        for (int i = 0; i < ans.size(); i++) {
//            System.out.println(ans.get(i));
//        }
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        if(n%2==0){
//            int j=3;
//            int count=0;
//            while(count<n){
//                if(isz(j)){
//                    arr[count]=j;
//                    count++;
//                }
//                j+=2;
//            }
//        }
//        else{
//            int j=2;
//            int count=0;
//            while(count<n){
//                if(j==2){
//                    arr[count]=j;
//                    j++;
//                    count++;
//                    continue;
//                } else if (isz(j)) {
//                    arr[count]=j;
//                    count++;
//                }
//                j+=2;
//            }
//        }
//        for(int i=0; i<n; i++){
//            System.out.print(arr[i]+" ");
//        }
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        int count = 0;
//        int j=2;
//        while (count < n) {
//            if(isz(j) && j%5==1){
//                arr[count] = j;
//                count++;
//            }
//            if(j==2){
//                j++;
//            }
//            else {
//                j+=2;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int q = sc.nextInt();
//        long[] arr = new long[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextLong(); // 注意是 nextLong()
//        }
//
//        Deque<Node> st = new ArrayDeque<>(); // 栈
//        long time = 0; // 时间必须 long
//
//        for (int i = 0; i < q; i++) {
//            int op = sc.nextInt();
//
//            if (op == 1) {
//                int l = sc.nextInt();
//                long r = sc.nextLong();
//                long k = sc.nextLong();
//
//                // 👇 核心：修改前先入栈！
//                st.push(new Node(time, l, r));
//
//                arr[l-1] += r;
//                time += k;
//            }
//            else if (op == 2) {
//                long k = sc.nextLong();
//                long newTime = time - k;
//
//                // 👇 核心：回溯 = 弹栈 + 减回去
//                while (!st.isEmpty() && st.peek().time > newTime) {
//                    Node o = st.pop();
//                    arr[o.pos - 1] -= o.val; // 撤销！
//                }
//
//                time = newTime;
//            }
//            else if (op == 3) {
//                int l = sc.nextInt();
//                int r = sc.nextInt();
//                long sum = 0;
//                for (int j = l-1; j <= r-1; j++) {
//                    sum += arr[j];
//                }
//                System.out.println(sum);
//            }
//        }
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int q = sc.nextInt();
//        long[] arr = new long[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextLong();
//        }
//        long time=0L;
//        Deque<Node> deque =new ArrayDeque<Node>();
//        for (int i = 0; i < q; i++) {
//            int choice = sc.nextInt();
//            if (choice == 1) {
//                int l=sc.nextInt();
//                long r=sc.nextLong();
//                long k=sc.nextLong();
//                deque.push(new Node(time,r,l));
//                arr[l-1]+=r;
//                time+=k;
//            }
//            else if (choice == 2) {
//                long k=sc.nextLong();
//                long nt=time-k;
//                while(!deque.isEmpty() && deque.peek().time>nt){
//                    Node node = deque.pop();
//                    arr[(node.pos)-1]-= node.value;
//                }
//                time=nt;
//            }
//            else if (choice == 3) {
//                int l=sc.nextInt();
//                int r=sc.nextInt();
//                long sum=0;
//                for(int j=l;j<=r;j++){
//                    sum+=arr[j-1];
//                }
//                System.out.println(sum);
//            }
//        }
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum=0;
//        int max=0;
//        int min=0;
//        if(a>b){
//            max=a;
//            min=b;
//        }
//        else{
//            min=a;
//            max=b;
//        }
//        while(true){
//            if(max%min==0){
//                int nn=max/min;
//                sum+=nn;
//                break;
//            }
//            int n=max/min;
//            sum+=n;
//            max=max-min*n;
//            int tmp=0;
//            tmp=max;
//            max=min;
//            min=tmp;
//        }
//        System.out.println(sum);
//        sc.close();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            String s=String.valueOf(i);
            char[] ch = s.toCharArray();
            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == '0') {
                    count++;
                } else if (ch[j]=='2') {
                    count++;
                } else if (ch[j]=='1') {
                    count++;
                } else if (ch[j]=='9') {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}