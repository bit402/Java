package test;

public class test01 {

    public static void main(String[] args){
        //int[][] a={{1,2,3,8},{4,5,6},{7,8,9,10}};
//        System.out.println(a[0][0]);
//        System.out.println(a[1][0]);
//        System.out.println(a[0][1]);
//        System.out.println();
//        System.out.println(a.length);
//        System.out.println(a[0].length);
//        System.out.println(a[1].length);
//        System.out.println(a[2].length);
//        System.out.println("最后一个一维数组中的最后一个元素是："+a[a.length-1][a[a.length-1].length-1]);
//        System.out.println("第一个一维数组中的第二个元素是："+a[0][1]);
        //int[][] arr=new int[3][4];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
//        for (int i = 0; i <= arr.length - 1; i++) {
//            for(int j = 0; j <= arr[i].length - 1; j++) {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println("hello");
        int[][] arr=new int[3][];
        arr[0]=new int[]{1,2,3,4,5,6,7,8,9};
        arr[1]=new int[]{4,5,6,2,3};
        arr[2]=new int[]{7,8,9,1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}