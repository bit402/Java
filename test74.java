package test;

import java.util.*;

public class test01 {
    //1 2 3 4 5
//0 1 2 3 4

    //2 6 3 5 4 1
//0 1 2 3 4 5
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = sc.nextInt();
////            ArrayDeque<Integer> ad = new ArrayDeque<>();
//            int[] arr = new int[n];
//            for (int j = 0; j < n; j++) {
//                arr[j] = sc.nextInt();
//            }
//            int sum = 0;
//            for (int j = 0; j < n; j++) {
//                int l = 0;
//                int r = 0;
//                if (j >= arr[j] - 1) {
//                    l = j - (arr[j] - 1);//j-(arr[j]-1)>=0
//                } else {
//                    l = 0;
//                }
//                if (j <= ((arr.length - 1) - (arr[j] - 1))) {
//                    r = j + (arr[j] - 1);//j+(arr[j]-1)<=arr.length-1
//                } else {
//                    r = arr.length - 1;
//                }
//                //ArrayDeque<Integer> ad = new ArrayDeque<>();
//                //List<Integer> ad=new ArrayList<>();
//                int max = Integer.MIN_VALUE;
//                int len = 0;
//                for (int k = l; k <= r; k++) {
//                    if (arr[k] > max) {
//                        max = arr[k];
//                    }
//                    if (max > arr[j]) {
//                        //ad.clear();
//                        len = 0;
//                        max = Integer.MIN_VALUE;
//                        continue;
//                    }
//                    //ad.addLast(arr[k]);
//                    len++;
//                    if (len >= arr[j]) {
//                        sum++;
//                        break;
//                    }
//                }
//            }
//            System.out.println(sum);
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
             int[] left=new int[n];
             int[] right=new int[n];
             Deque<Integer> stack = new ArrayDeque<>();
             Arrays.fill(left,-1);
             for(int j=0;j<n;j++){
                 while(stack.size()!=0 && arr[stack.peek()]<=arr[j]){
                     stack.pop();
                 }
                 if(stack.size()!=0){
                     left[j]=stack.peek();
                 }
                 stack.push(j);
             }
             stack.clear();
             Arrays.fill(right,n);
             for(int j=n-1;j>=0;j--){
                 while(stack.size()!=0 && arr[stack.peek()]<=arr[j]){
                     stack.pop();
                 }
                 if(stack.size()!=0){
                     right[j]=stack.peek();
                 }
                 stack.push(j);
             }
             int sum=0;
             for(int j=0;j<n;j++){
                 int k=arr[j];
                 int l=Math.max(j-(arr[j]-1),0);
                 int mm=Math.max(l,left[j]+1);
                 int r=j;
                 int aa=Math.min(r,right[j]-k);
                 aa = Math.min(aa, n - k);
                 if(mm<=aa){
                     sum++;
                 }
             }
             System.out.println(sum);
         }
         sc.close();
    }
}