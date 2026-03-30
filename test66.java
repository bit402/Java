package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class test01 {
    //    public static long C(long n){
//        return BigInteger.valueOf(n).multiply(BigInteger.valueOf(n-1)).multiply(BigInteger.valueOf(n-2)).divide(BigInteger.valueOf(6)).mod(BigInteger.valueOf(MOD)).longValue();
//    }
    //public static final long MOD = 1000000007L;
//public static boolean judge(String str,String str1){
//    int count=0;
//    String str2=str;
//    while(str2.contains(str1)){
//        count++;
//        str2=str2.replaceFirst(str1,"");
//        if(count>=2){
//            return true;
//        }
//    }
//    return false;
//}
//public static void qj(String str,int k,HashSet<String> set){
//    for(int i=0;i<str.length();i++){
//        str=str.substring(1);
//        if(k<=str.length()){
//            String str1=str.substring(0,k);
//            if(judge(str,str1)){
//                set.add(str1);
//            }
//        }
//        else {
//            return;
//        }
//    }
//}
    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        //Scanner sc = new Scanner(System.in);
////        int n=sc.nextInt();
//        int n = 0;
//        String[] sh;
//        String[] scc;
//        int[] h=null;
//        int[] c=null;
//        try {
//            n = Integer.parseInt(br.readLine());
//            sh=br.readLine().split(" ");
//            scc=br.readLine().split(" ");
//             h = new int[n];
//             c = new int[n];
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        for (int i = 0; i < n; i++) {
//            h[i] = Integer.parseInt(sh[i]);
//        }
//        for (int i = 0; i < n; i++) {
//            c[i] = Integer.parseInt(scc[i]);
//        }
//        long ans = Long.MAX_VALUE;
//        for (int i = 0; i <= 10000; i++) {
//            long sum = 0L;
//            for (int j = 0; j < n; j++) {
//                sum += (long) Math.abs(h[j] - i) * c[j];
//            }
//            ans = Math.min(ans, sum);
//        }
//        System.out.println(ans);
//        int count=0;
//        int[] arr= {2,0,2,6};
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                for(int k=0;k<arr.length;k++){
//                    if((arr[i]+arr[j]+arr[k])%6==0){
//                        count++;
//                    }
//                }
//            }
//        }
//        long ans=count%(1000000000L+7);
//        System.out.println(ans);
        //2:2*2026=4052;
        //0:1*2026=2026;
        //6:1*2026=2026;
        //模6余数0：6+0=4052；
        //余2：4052；
//        long a6=4052;
//        long a0=4052;
//        long ans=(C(a6)+C(a0))%MOD;
//        System.out.println(ans);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k=sc.nextInt();
//        sc.nextLine();
//        String str = sc.nextLine();
//        int ans = 0;
//        HashSet<String> set = new HashSet<String>();
//        int len=str.length();
//        qj(str,k,set);
//        System.out.println(set.size());
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        String str = sc.next();
//        HashSet<String> set = new HashSet<String>();
//        HashSet<String>rset=new HashSet<>();
//        for (int i = 0; i <= str.length()-k; i++) {
//            String s = str.substring(i, i+k);
//            if(set.contains(s)){
//                rset.add(s);
//            }
//            else {
//                set.add(s);
//            }
//        }
//        System.out.println(rset.size());
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        ArrayList<Integer> listl = new ArrayList<>();
//        ArrayList<Integer> listr = new ArrayList<>();
//        ArrayList<Integer> result = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            listl.add(sc.nextInt());
//        }
//        for (int i = 0; i < m; i++) {
//            listr.add(sc.nextInt());
//        }
//        Collections.sort(listl);
//        Collections.sort(listr);
//        if (n <= m) {
//            while (!listl.isEmpty()) {
//                int min = Integer.MAX_VALUE;
//                int index=-1;
//                for (int i = 0; i < listr.size(); i++) {
//                    int value = Math.abs(listl.getFirst() - listr.get(i));
//                    if (value < min) {
//                        min = value;
//                        index = i;
//                    }
//                }
//                result.add(min);
//                listl.removeFirst();
//                listr.remove(index);
//            }
//        } else {
//            while (!listr.isEmpty()) {
//                int min = Integer.MAX_VALUE;
//                int index=-1;
//                for (int i = 0; i < listl.size(); i++) {
//                    int value = Math.abs(listr.getFirst() - listl.get(i));
//                    if (value < min) {
//                        min = value;
//                        index = i;
//                    }
//                }
//                result.add(min);
//                listr.removeFirst();
//                listl.remove(index);
//            }
//        }
//        int max= Collections.max(result);
//        System.out.println(max);
//        sc.close();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
    }
}