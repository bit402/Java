package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class LogTask extends TimerTask {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    int count = 0;
    @Override
    public void run() {
        Date now = new Date();
        String nowStr = sdf.format(now);
        System.out.println(nowStr+":"+count);
    }
}
package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//class MyRunnable implements Runnable {
//    boolean flag=true;
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            if(flag) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println(Thread.currentThread().getName()+"-->"+i);
//            }
//            else return;
//        }
//    }
//}
//class MyThread extends Thread {
//    @Override
//    public void run() {
//        int i=0;
//        while(true){
//            System.out.println(Thread.currentThread().getName()+":"+(++i));
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
public class test01 {

    public static void main(String[] args) {
//        MyRunnable mr=new MyRunnable();
//        Thread t1=new Thread(mr);
//        t1.start();
//        try {
//            Thread.sleep(1000*5);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        mr.flag=false;
//        MyThread t1 = new MyThread();
//        t1.setDaemon(true);
//        t1.start();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName()+":"+i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
        Timer timer = new Timer(true);
        Date date ;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
             date=sdf.parse("2026-03-23 19:06:00");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        //timer.schedule(new LogTask(), date, 1000);
        timer.schedule(new TimerTask() {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            int count = 0;
            @Override
            public void run() {
                Date now = new Date();
                String nowStr = sdf.format(now);
                System.out.println(nowStr+":"+count);
            }
        },date,1000);
        for(int i = 0; i<10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
