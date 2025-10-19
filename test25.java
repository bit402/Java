package test;

public class Math {
    public Math() {
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static double mul(double a,double b){
        return a*b;
    }
    public static double div(double a,double b){
        return a/b;
    }
}
package test;

import org.junit.jupiter.api.*;

public class MathTest {
    @BeforeAll
    public static void befor(){
        System.out.println("单元测试开始执行");
    }
    @AfterAll
    public static void after(){
        System.out.println("单元测试执行结束");
    }
    @BeforeEach
    public void before(){
        System.out.println("开始测试");
    }
    @AfterEach
    public void aftereach(){
        System.out.println("测试结束");
    }
    @Test
    public void testAdd() {
        System.out.println("testAdd");
        int actul=Math.add(20,10);
        int expected=30;
        Assertions.assertEquals(expected,actul);
    }
    @Test
    public void testSub() {
        System.out.println("testSub");
        int actul=Math.sub(20,10);
        int expected=10;
        Assertions.assertEquals(expected,actul);
    }
    @Test
    public void testMul() {
        System.out.println("testMul");
        double actul=Math.mul(20,10);
        double expected=200;
        Assertions.assertEquals(expected,actul);
    }
    @Test
    public void testDiv() {
        System.out.println("testDiv");
        double actul=Math.div(20,10);
        double expected=2;
        Assertions.assertEquals(expected,actul);
    }
}
package test;

public class test01 {

    public static void main(String[] args){
        int[] arr={3,2,7,6,1};
        //冒泡
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length-1-i; j++) {
//                if(arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
        //优化
//                for (int i = 0; i < arr.length-1; i++) {
//                    boolean flag=true;
//            for (int j = 0; j < arr.length-1-i; j++) {
//                if(arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                    flag=false;
//                }
//            }
//            if(flag){
//                break;
//            }
//        }
        //选择
        for (int i = 0; i < arr.length; i++) {
            int max = arr[0];
            int index=0;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>max){
                    max=arr[j];
                    index=j;
                }
            }
            arr[index]=arr[arr.length-1-i];
            arr[arr.length-1-i]=max;
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}