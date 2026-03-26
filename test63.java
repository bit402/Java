package test;

public class Singleton {
//    private static Singleton instance=new Singleton();
//    private Singleton() {
//
//    }
//    public static Singleton getSingleton(){
//        return instance;
//    }
    private static Singleton instance;
    private Singleton() {

    }
    public static Singleton getSingleton(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
package test;

//class MyRunnable2 implements Runnable {
//    private Object o1;
//    private Object o2;
//    public MyRunnable2(Object o1, Object o2) {
//        this.o1 = o1;
//        this.o2 = o2;
//    }
//
//    @Override
//    public void run() {
//        synchronized (o2) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            synchronized (o1){
//            }
//        }
//    }
//}
//class MyRunnable1 implements Runnable {
//    private Object o1;
//    private Object o2;
//
//    public MyRunnable1(Object o1, Object o2) {
//        this.o1 = o1;
//        this.o2 = o2;
//    }
//
//    @Override
//    public void run() {
//        if(Thread.currentThread().getName().equals("t1")){
//            synchronized (o1) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                synchronized (o2){
//                }
//            }
//        }
//        if(Thread.currentThread().getName().equals("t2")){
//            synchronized (o2) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                synchronized (o1) {
//                }
//            }
//        }
//    }
//}
//class MyRunnable implements Runnable {
//    private int ticketTotal=100;
//
//    public int getTicketTotal() {
//        return ticketTotal;
//    }
//
//    public void setTicketTotal(int ticketTotal) {
//        this.ticketTotal = ticketTotal;
//    }
//
//    @Override
//    public void run() {
//        while(true){
//            synchronized (this) {
//                if (ticketTotal <= 0) {
//                    System.out.println("对不起，票已售完！");
//                    break;
//                }
//                ticketTotal--;
//                System.out.println(Thread.currentThread().getName()+"买到一张票，还有"+ticketTotal+"张票");
//            }
//        }
//    }
//}
//class MyRunnable implements Runnable {
//    private int num=1;
//    @Override
//    public void run() {
//        while(num<=100){
//            if(num%2!=0 && Thread.currentThread().getName().equals("t1")){
//                System.out.println(Thread.currentThread().getName()+"-->"+num);
//                num++;
//            }
//            if(num%2==0 && Thread.currentThread().getName().equals("t2")){
//                System.out.println(Thread.currentThread().getName()+"-->"+num);
//                num++;
//            }
//        }
//    }
//}
//class MyRunnable implements Runnable {
//    private int num = 1;
//
//    @Override
//    public void run() {
//        while (num<=100) {
//            synchronized (this) {
//                if (num % 2 != 0 && Thread.currentThread().getName().equals("t1")) {
//                    System.out.println(Thread.currentThread().getName() + "-->" + num);
//                    num++;
//                }
//                if (num % 2 == 0 && Thread.currentThread().getName().equals("t2")) {
//                    System.out.println(Thread.currentThread().getName() + "-->" + num);
//                    num++;
//                }
//            }
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//class MyRunnable implements Runnable {
//    private int num=1;
//
//    @Override
//    public void run() {
//        while (num<=100) {
//            synchronized (this) {
//                if(Thread.currentThread().getName().equals("t1")) {
//                    if(num%2!=0){
//                        System.out.println(Thread.currentThread().getName()+"-->"+num);
//                        num++;
//                        notify();
//                    }
//                    else {
//                        try {
//                            wait();
//                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
//                        }
//                    }
//                }
//                else if(Thread.currentThread().getName().equals("t2")) {
//                    if(num%2==0){
//                        System.out.println(Thread.currentThread().getName()+"-->"+num);
//                        num++;
//                        notify();
//                    }
//                    else {
//                        try {
//                            wait();
//                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
//                        }
//                    }
//                }
//            }
//        }
//    }
//}
//class MyRunnable implements Runnable {
//    private int num = 1;
//    private Object obj = new Object();
//    @Override
//    public void run() {
//        while(num<=100){
//            synchronized (obj) {
//                obj.notify();
//                System.out.println(Thread.currentThread().getName() + "-->" + num);
//                num++;
//                if(num<=100){
//                    try {
//                        obj.wait();
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        }
//    }
//}
//class MyRunnable implements Runnable {
//    private int num=0;
//    //private char[] chars={'A','B','C'};
//    private int count=0;
//    @Override
//    public void run() {
//        while(count<10){
//            synchronized(this){
//                num%=3;
//                if(num==0 && Thread.currentThread().getName().equals("t1")){
//                    if(count<10){
//                        System.out.println(Thread.currentThread().getName()+":"+"A");
//                        num++;
//                        this.notifyAll();
//                    }
//                }
//                else if(num==1 && Thread.currentThread().getName().equals("t2")){
//                    System.out.println(Thread.currentThread().getName()+":"+"B");
//                    num++;
//                    this.notifyAll();
//                }
//                else if(num==2 && Thread.currentThread().getName().equals("t3")){
//                    System.out.println(Thread.currentThread().getName()+":"+"C");
//                    num++;
//                    this.notifyAll();
//                    count++;
//                }
//                else{
//                    try {
//                        this.wait();
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        }
//    }
//}
public class test01 {

    public static void main(String[] args) {
//        Object o1=new Object();
//        Object o2=new Object();
//        Thread t1=new Thread(new MyRunnable1(o1,o2));
//        Thread t2=new Thread(new MyRunnable2(o1,o2));
//        t1.start();
//        t2.start();
//        Object o1 = new Object();
//        Object o2 = new Object();
//        Thread t1=new Thread(new MyRunnable1(o1,o2));
//        Thread t2=new Thread(new MyRunnable1(o1,o2));
//        t1.setName("t1");
//        t2.setName("t2");
//        t1.start();
//        t2.start();
//        MyRunnable mr = new MyRunnable();
//        Thread t1=new Thread(mr);
//        Thread t2=new Thread(mr);
//        Thread t3=new Thread(mr);
//        t1.setName("t1");
//        t2.setName("t2");
//        t3.setName("t3");
//        t1.start();
//        t2.start();
//        t3.start();
//        MyRunnable mr = new MyRunnable();
//        Thread t1 = new Thread(mr);
//        Thread t2 = new Thread(mr);
//        t1.setName("t1");
//        t2.setName("t2");
//        t1.start();
//        t2.start();
//        MyRunnable mr=new MyRunnable();
//        Thread A=new Thread(mr);
//        Thread B=new Thread(mr);
//        Thread C=new Thread(mr);
//        A.setName("t1");
//        B.setName("t2");
//        C.setName("t3");
//        A.start();
//        B.start();
//        C.start();
        Singleton s1=Singleton.getSingleton();
        Singleton s2=Singleton.getSingleton();
        System.out.println(s1==s2);
    }
}