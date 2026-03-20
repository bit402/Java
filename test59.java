package test;

//class MyThread implements Runnable {
//    @Override
//    public void run() {
//        for(int i = 0; i < 100; i++) {
//            System.out.println("MyThread-->"+i);
//        }
//    }
//}
//class MyThread extends Thread {
//    public MyThread() {
//
//    }
//
//    public MyThread(String name) {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        System.out.println("分支线程的名字："+Thread.currentThread().getName());
//    }
//}
public class test01 {

    public static void main(String[] args) {
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    System.out.println("MyThread-->" + i);
//                }
//            }
//        });
//        t1.start();
//        for (int i = 0; i < 100; i++) {
//            System.out.println("main-->" + i);
//        }
//        Thread t1=Thread.currentThread();
//        System.out.println("主线程的名字:"+t1.getName());
//        t1.setName("<UNK>");
//        System.out.println("主线程的名字:"+t1.getName());
//        MyThread t2=new MyThread();
//        t2.start();
//        System.out.println(t2.getName());
//        Thread t3=new MyThread();
//        t3.start();
//        Thread t=Thread.currentThread();
//        System.out.println("当前线程的名字："+t.getName());
//        MyThread t1=new MyThread("t1");
//        t1.start();
//        t1.setName("t0");
//        t1.start();
//        try {
//            Thread.sleep(1000*5);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        for(int i=0;i<100;i++){
//            System.out.println(Thread.currentThread().getName()+"-->"+i);
//        }
        Runnable
    }
    class MyRunnable implements Runnable{
        @Override
        public void run() {
            for(int i=0;i<100;i++){
                System.out.println((Thread.currentThread().getName())+"->"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
