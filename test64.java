package test;

import java.util.concurrent.locks.ReentrantLock;

public class Singleton {
    private static Singleton instance;
    private Singleton() {
        System.out.println("构造方法执行了！");
    }
//    public static synchronized Singleton getSingleton(){
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        if(instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }
    private static final ReentrantLock lock = new ReentrantLock();
    public static Singleton getSingleton(){
        if(instance == null){
            //加锁
            try {
                lock.lock();
                if(instance == null){
                    instance = new Singleton();
                }
            } finally {
                //解锁
                lock.unlock();
            }
        }
        return instance;
    }
}
package test;

public class User {
    static{
        System.out.println("User类中的静态代码块执行了！");
    }
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
}
package test;

import java.util.concurrent.*;

public class test01 {
//    public static Singleton s1;
//    public static Singleton s2;
    public static void main(String[] args) {
//        Thread t1 = new Thread(new Runnable() {
//            public void run() {
//                s1=Singleton.getSingleton();
//            }
//        });
//        Thread t2 = new Thread(new Runnable() {
//            public void run() {
//                s2=Singleton.getSingleton();
//            }
//        });
//        t1.start();
//        t2.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1==s2);
//        FutureTask<Integer> task=new FutureTask<>(new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                Thread.sleep(1000*5);
//                return 1;
//            }
//        });
//        Thread t1=new Thread(task);
//        t1.setName("t1");
//        t1.start();
//        Integer i;
//        try {
//             i=task.get();//会阻塞当前线程，因为想要拿到最终结果就必须等待线程（task）执行完毕
//        } catch (InterruptedException | ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(i);
//        ExecutorService executor= Executors.newFixedThreadPool(3);
//        executor.submit(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println(Thread.currentThread().getName()+"-->"+i);
//                }
//            }
//        });
//        executor.shutdown();
        //c1代表String类型
        //c1就代表硬盘上的String.class文件
        try {
            Class c1=Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            Class c2=Class.forName("test.User");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}