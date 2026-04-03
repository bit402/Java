package test;

import java.util.*;

public class test01 {
    public static void dfs(int n, int[] count,int[] arr,int i) {
        if(!judge(arr)){
            return;
        }
        if(i==n){
            count[0]++;
            return;
        }
        for(int j=1;j<=2;j++){
            arr[i]=j;
            dfs(n,count,arr,i+1);
            arr[i]=0;
        }
    }
    public static boolean judge(int[] arr){
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]==1 && arr[i+1]==1 || arr[i+1]==1 && arr[i+2] ==1 ){
                return false;
            }
            if(arr[i]==2 && arr[i+1]==2 && arr[i+2]==2){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)  {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            String s=String.valueOf(i);
//            char[] ch = s.toCharArray();
//            for (int j = 0; j < ch.length; j++) {
//                if (ch[j] == '0') {
//                    list.add(Integer.valueOf(s));
//                    break;
//                } else if (ch[j]=='2') {
//                    list.add(Integer.valueOf(s));
//                    break;
//                } else if (ch[j]=='1') {
//                    list.add(Integer.valueOf(s));
//                    break;
//                } else if (ch[j]=='9') {
//                    list.add(Integer.valueOf(s));
//                    break;
//                }
//            }
//        }
//        int sum = 0;
//        for (int i = 0; i < list.size(); i++) {
//            sum += list.get(i);
//        }
//        System.out.println(sum);
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum=0;
//        for (int i = 1; i <=n ; i++) {
//            String s=String.valueOf(i);
//            if(s.contains("2") || s.contains("0") || s.contains("1") || s.contains("9")){
//                sum+=i;
//            }
//        }
//        System.out.println(sum);
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int x=sc.nextInt();
//        long sum=0L;
//        int[][] arr=new int[n][2];
//        int pre=0;
//        for(int i=0;i<n;i++){
//            int time=sc.nextInt();
//            int value=sc.nextInt();
//            arr[i][0]=time;
//            arr[i][1]=value;
//        }
//        Arrays.sort(arr,new Comparator<int[]>(){
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0]-o2[0];
//            }
//        });
//        for (int i = arr.length-1; i >=0 ; i--) {
//            sum+=arr[i][1];
//            if(sum>=x){
//                pre=arr[i][0];
//                break;
//            }
//        }
//        System.out.println(pre);
//        sc.close();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long mod=1000000007;
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] count = {0};
            int[] arr = new int[n];
            dfs(n,count,arr,0);
            System.out.println(count[0]);
        }
        sc.close();
    }
}