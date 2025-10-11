package test;
public class test01 {
//    public static void reverse(int[] arr){
//        int[] arr2=new int[arr.length];
//        for(int i=0; i<arr.length;i++){
//            arr2[i]=arr[arr.length-i-1];
//        }
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=arr2[i];
//        }
//    }
//    public static void reverse(int[] arr){
//        int temp;
//        for(int i=0; i<arr.length/2; i++){
//            temp = arr[i];
//            arr[i] = arr[arr.length-i-1];
//            arr[arr.length-i-1] = temp;
//        }
//    }
//    public static void m1(int... nums){
//        System.out.println(nums.length);
//        System.out.println("m1方法执行了");
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//    }
//    public static void m2(String... nums){
//        for(String num : nums){
//            System.out.println(num);
//        }
//    }
//    public static void m3(Object... objects){
//        for(Object object : objects){
//            System.out.println(object);
//        }
//    }
    public static void main(String[] args){
//        int[] arr={1,2,3,4,5};
//        reverse(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        m1();
//        m1(1);
//        m1(2,3);
//        m1(new int[]{1,2,3,4,5,6,7,8,9});
//        m2(new String[]{"1","2","3","4","5","6"});
//        m2("nihao","ni","hao");
//        m1(1,2,3,4,5,6,7,8,9);
// m3(new Object(), new Object(), new Object(), new Object());
        int[] src={1,2,3,4,5};
        int[] dest=new int[src.length*2];
        System.arraycopy(src,0,dest,0,src.length);
        for(int i:dest){
            System.out.print(i);
        }
        System.out.println();
        System.arraycopy(src,1,dest,3,src.length-1);
        for(int i:dest){
            System.out.print(i);
        }


    }
}