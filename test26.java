package test;

public class Person implements Comparable{
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Person person = (Person) o;
        return age - person.age;
    }
}
package test;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import java.util.Random;
public class ArraysTest {
    @Test
    public void testToString() {
        int[] arr={1,2,3,34,54};
        System.out.println(arr);
        System.out.println(arr.toString());
        System.out.println(Arrays.toString(arr));
        String[] arr2={"a","b","c"};
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2.toString());
        System.out.println(arr2);
    }
    @Test
    public void testDeepToString() {
        //适合于二维数组以及多维数组
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);
        System.out.println(arr.toString());
        System.out.println(Arrays.deepToString(arr));
    }
    @Test
    public void testEquals() {
        int[] arr={1,8,3,34,54};
        int[] arr2={1,2,3,34,54};
        System.out.println(Arrays.equals(arr,arr2));
        String[] arr3={"a","b","c"};
        String[] arr4={"a","b","c"};
        System.out.println(Arrays.equals(arr3,arr4));
    }
    @Test
    public void testSort(){
        int[] arr={1,8,6,3,4,7,6,9,10,2};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        String[] arr2={"a","c","b","ac","aa"};
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        Person person1=new Person(18);
        Person person2=new Person(16);
        Person person3=new Person(20);
        Person person4=new Person(30);
        Person person5=new Person(25);
        Person[] persons={person1,person2,person3,person4,person5};
        System.out.println(Arrays.toString(persons));
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
    }
    @Test
    public void testParallelSort(){
        Random random=new Random();
        int n=random.nextInt(100000000);
        int[] arr=new int[100000000];
        for(int i=0;i<n;i++){
            arr[i]=random.nextInt(100000000);
        }
        //System.out.println(Arrays.toString(arr));
        long start=System.currentTimeMillis();
        //Arrays.parallelSort(arr);
        Arrays.sort(arr);
        long end=System.currentTimeMillis();
        //System.out.println(Arrays.toString(arr));
        System.out.println("共耗时："+(end-start)+"毫秒");
    }
}
package test;

public class test01 {

    public static void main(String[] args){
//        int[] arr={88,5,6,1,3,99,6};
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]==6){
//                System.out.println(arr[i]+"的下标是(第一次出现)："+i);
//                break;
//            }
//        }
//        int[] arr={1,2,3,4,5,6,7,8,9};
//        int left=0,right=arr.length-1;
//        int n=9;
//        while(left<=right){
//            int mid=(left+right)/2;
//            if(arr[mid]<n){
//                left=mid+1;
//            }
//            else if(arr[mid]>n){
//                right=mid-1;
//            }
//            else if(arr[mid]==n){
//                System.out.println("找到了，"+n+"的下表是："+mid);
//                break;
//            }
//        }
//        if(left>right){
//            System.out.println("很抱歉，没有找到"+n+"的下标");
//        }

    }
}