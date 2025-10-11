package test;
import java.util.Scanner;
import java.util.Random;
public class test01 {
//    public static void display(int[] arr){
//        for(int i:arr){
//            System.out.println(i);
//        }
//    }
//    public static int searchMax(int[] arr) {
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//    public static int xiaBiao(int[] arr){
//        int max= searchMax(arr);
//        int j=0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]==max){
//                j=i;
//            }
//            else if(i==arr.length) {
//                j=-1;
//                System.out.println("没找到下标");
//            }
//        }
//        return j;
//    }
    public static int findIdex(int[] arr, int n) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                index = i;
                break;
            }
            else if (i==arr.length-1) {
                System.out.println("没找到：");
                return -1;
            }
        }
        return index;
    }
    public static void main(String[] args){
//        int[] arr={100,200,300};
//        String[] names={"jack","lucy","tom"};
//        for(int i:arr){
//            System.out.println(i);
//        }
//        for(String s:names){
//            System.out.println(s);
//        }
//        Scanner sc = new Scanner(System.in);
//        int[] scores = new int[10];
//        int sum = 0;
//        double avg = 0;
//        for (int i = 0; i < 10; i++) {
//            System.out.println("请输入第" + (i+1) + "个学生的成绩:");
//            scores[i] = sc.nextInt();
//            sum += scores[i];
//        }
//        avg = sum / 10;
//        System.out.println("遍历学生的成绩：");
//        for (int k: scores) {
//            System.out.println(k);
//        }
//        System.out.println("成绩总和为："+sum);
//        System.out.println("平均成绩为："+avg);
//        sc.close();
//        int[] arr = new int[10];
//        for(int i:arr){
//            System.out.println(i);
//        }
//        String[] strArr = new String[10];
//        for(String str:strArr){
//            System.out.println(str);
//        }
//        System.out.println("==========================================");
//        Object[] objArr = new Object[10];
//        for (Object obj:objArr){
//            System.out.println(obj);
//        }
//        System.out.println("第三个位置上放对象：");
//        objArr[2]=new Object();
//        for(Object obj:objArr){
//            System.out.println(obj);
//        }
//        double[] doubleArr = new double[10];
//        for (int i = 0; i < doubleArr.length; i++) {
//            doubleArr[i] = new Random().nextDouble();
//        }
//        System.out.println("遍历数组：");
//        for (double d:doubleArr){
//            System.out.println(d);
//        }
//        int[] arr={1,2,3,4,5};
//        display(arr);
//        display(new int[]{1,2,3,4,5});
//        display(new int[5]);
//        Cat cat = new Cat();
//        Bird bird = new Bird();
//        Animal[] animals = {cat, bird,new Cat(),new Bird()};
//        for (Animal animal : animals){
//            if(animal instanceof Cat){
//                Cat c = (Cat)animal;
//                c.catchMouse();
//            }
//            else if(animal instanceof Bird){
//                Bird b = (Bird)animal;
//                b.fly();
//            }
        //}
//        int[] arr={5,2,1,8,6};
//        System.out.println("数组中的最大值为："+searchMax(arr)+"下标为："+xiaBiao(arr));
        int[] arr = new int[]{5,2,1,8,6};
        System.out.println("数组中的元素8的下标是："+findIdex(arr, 8));
        System.out.println("数组中元素7的下标是："+findIdex(arr, 7));
    }
}