package test;

public class test01 {
//    class My_Runnable implements Runnable{
//        @Override
//        public void run() {
//            for(int i=0; i<100; i++){
//                System.out.println(Thread.currentThread().getName()+"-->"+i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//    }
//class MyThread extends Thread {
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println(Thread.currentThread().getName()+"-->"+i);
//        }
//    }
//}
    public static void main(String[] args) {
//        try {
//            Thread.sleep(1000*5);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        for(int i=0; i<100;i++){
//            System.out.println(Thread.currentThread().getName()+"-->"+i);
//        }
//        Thread t1=new Thread(new My_Runnable());
//        t1.start();
//        MyThread myThread = new MyThread();
//        myThread.setName("t1");
//        myThread.start();
//        try {
//            //当前线程并不是让t1线程休眠
//            //当前线程是main()线程
//            myThread.sleep(1000*5);//等同于Thread.sleep(1000*5);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        for(int i=0;i<100;i++){
//            System.out.println(Thread.currentThread().getName()+"-->"+i);
//        }
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"-->begin");
                try {
                    //让线程睡眠一年
                    Thread.sleep(1000*60*60*24*365);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //睡眠一年后开始工作
                System.out.println(Thread.currentThread().getName()+"-->do some");
            }
        });
        t1.start();
        try {
            //要求5秒之后Thread0线程起来干活
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //终止t线程的睡眠
        //interrupt是一个实例方法
        //这个方法的实现原理是利用了异常处理机制
        //. 场景 1：线程处于非阻塞状态（没有 sleep/wait/join 等）通俗理解：相当于
        // 给线程递了一张「中断通知条」，但线程仍在正常干活，直到它主动去看这张通知条（检查中断状态），才会决定是否停止。
        // 场景 2：线程处于阻塞状态（sleep/wait/join 等可中断方法）
        //通俗理解：线程在 “睡觉”（阻塞）时收到中断信号，会被 “叫醒” 并报错，此时需要在 catch 块中处理中断逻辑。
        t1.interrupt();
    }
}


