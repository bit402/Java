package test;

import java.io.Serial;
import java.io.Serializable;

public class Address implements Serializable {
    @Serial
    private static final long serialVersionUID = 2L;
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
package test;

import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private Address address;

    public User(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
package test;

import java.io.*;
import java.util.Scanner;

//class MyThread extends Thread {
//    //Thread本身就是一个线程所以继承了Thread的类Mythread也是一个线程
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Mythread-->"+i);
//        }
//    }
//}
//严格来说这个不是一个线程类，她只是一个普通的类只不过它实现了Runnable接口（可运行的接口）
class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyThread---> " + i);
        }
    }
}
public class test01 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[] s = new int[n];
//        int[] a = new int[n];
//        boolean[] used = new boolean[n]; // 标记是否已选中
//
//        for (int i = 0; i < n; i++) s[i] = sc.nextInt();
//        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
//
//        long ans = 0;
//        int maxS = 0; // 当前最远距离
//
//        // 循环 X 次，每次选一个最合适的
//        for (int x = 1; x <= n; x++) {
//            long best = -1;
//            int bestIdx = -1;
//
//            // 情况1：在 s < maxS 里选 A 最大 (用于后续步骤)
//            for (int i = 0; i < n; i++) {
//                if (!used[i] && s[i] <= maxS) {
//                    if (a[i] > best) {
//                        best = a[i];
//                        bestIdx = i;
//                    }
//                }
//            }
//
//            // 情况2：在 s > maxS 里选 (2*s + a) 最大 (用于首次及扩展最远)
//            for (int i = 0; i < n; i++) {
//                if (!used[i] && s[i] > maxS) {
//                    long val = 2L * (s[i]-maxS) + a[i];
//                    if (val > best) {
//                        best = val;
//                        bestIdx = i;
//                    }
//                }
//            }
//
//            // 第一次必须选 2*s + a 最大 (覆盖之前的逻辑)
//            if (x == 1) {
//                best = -1;
//                bestIdx = -1;
//                for (int i = 0; i < n; i++) {
//                    long val = 2L * s[i] + a[i];
//                    if (val > best) {
//                        best = val;
//                        bestIdx = i;
//                    }
//                }
//            }
//
//            // 选中当前最优项，累计答案
//            ans += best;
//            used[bestIdx] = true;
//            maxS = Math.max(maxS, s[bestIdx]); // 更新最远距离
//
//            // 【关键修改】每一步循环结束后，立即输出当前累计的最大值
//            System.out.println(ans);
//        }
//
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] s = new int[n];
//        int[] a = new int[n];
//        boolean[] b = new boolean[n];
//        for (int i = 0; i < n; i++) {
//            s[i] = sc.nextInt();
//            b[i]=false;
//        }
//        for(int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        long sum = 0L;
//        int maxIndex=0;
//        for(int i = 0; i < n; i++){
//            int index=-1;
//            int max=-1;
//            if(i==0){
//                max=-1;
//                for(int j=0;j<n;j++){
//                    if(2*s[j]+a[j]>max){
//                        max=2*s[j]+a[j];
//                        maxIndex=j;
//                    }
//                }
//                b[maxIndex]=true;
//                sum+=max;
//                System.out.println(sum);
//                continue;
//            }
//            //情况1
//            for(int j=0;j<n;j++){
//                if(!b[j] && s[j]<=s[maxIndex] && a[j]>max){
//                    max=a[j];
//                    index=j;
//                }
//            }
//            //情况2
//            for(int j=0;j<n;j++){
//                if(!b[j] && (s[j]>s[maxIndex]) && (2*(s[j]-s[maxIndex])+a[j])>max){
//                    max=2*(s[j]-s[maxIndex])+a[j];
//                    index=j;
//                }
//            }
//            if(index!=-1){
//                b[index]=true;
//                if(s[index]>s[maxIndex]){
//                    maxIndex=index;
//                }
//            }
//            sum+=max;
//            System.out.println(sum);
//        }
//        sc.close();
        //总结犯下的所有错误：
        //下标错用为距离
//1的情况出现标记错误
//存入的是最大体力值的下标而非最远距离下表
//        Address address = new Address("朝阳","北京");
//        User user = new User("zhangsan",18,address);
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        try(ObjectOutputStream oos = new ObjectOutputStream(baos)) {
//            oos.writeObject(user);
//            oos.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
//        try(ObjectInputStream ois = new ObjectInputStream(bais)) {
//            User user2=(User) ois.readObject();
//            System.out.println(user);
//            System.out.println(user2);
//            user2.getAddress().setCity("上海");
//            System.out.println(user);
//            System.out.println(user2);
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        MyThread myThread=new MyThread();
//        //myThread.start();
//        myThread.run();
//        for(int i=0;i<100;i++){
//            System.out.println("main-->"+i);
//        }
        Thread thread=new Thread(new MyThread());
        //thread.start();
        thread.run();
        for (int i = 0; i < 100; i++) {
            System.out.println("main---> " + i);
        }
    }
}
