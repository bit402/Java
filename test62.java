package test;
//class MyThread extends Thread {
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println(Thread.currentThread().getName()+"-->"+i);
//        }
//    }
//}
//class MyThread extends Thread {
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println(Thread.currentThread().getName()+"-->"+i);
//        }
//    }
//}
//class MyThread extends Thread {
    //    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            if((i%10)==0 && Thread.currentThread().getName().equals("t1")){
//                System.out.println(Thread.currentThread().getName()+"让位了此时的下标是："+i);
//                Thread.yield();
//            }
//            System.out.println(Thread.currentThread().getName()+"-->"+i);
//        }
//    }
//}
//class Account{
//    private String user;
//    private double balance;
//
//    public String getUser() {
//        return user;
//    }
//
//    public void setUser(String user) {
//        user = user;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//    public void withdraw(double amount) {
//        //   this.balance -= amount;
//        System.out.println(Thread.currentThread().getName()+"线程正在取款，当前："+user+"账户余额："+balance);
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        balance -= amount;
//        System.out.println(Thread.currentThread().getName()+"线程取款成功，当前："+user+"账户余额"+balance);
//
//    }
//
//    public Account(String user, double balance) {
//        this.user = user;
//        this.balance = balance;
//    }
//}
//class Withdraw implements Runnable{
//    private Account account;
//    public Withdraw(Account account) {
//        this.account = account;
//    }
//
//    @Override
//    public void run() {
//        account.withdraw(1000);
//    }
//}
public class test01 {

    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.setName("t");
//        myThread.start();
//        System.out.println("main begin");
//        try {
//            //主线程调用的本方法
//            myThread.join(1000*60);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        for (int i = 0; i < 100; i++) {
//            System.out.println(Thread.currentThread().getName()+"-->"+i);
//        }
//        System.out.println("main end");
//        System.out.println("最高优先级"+Thread.MAX_PRIORITY);
//        System.out.println("最低优先级"+Thread.MIN_PRIORITY);
//        System.out.println("默认优先级"+Thread.NORM_PRIORITY);
//        Thread mainThread=Thread.currentThread();
//        System.out.println("主线程的优先级为："+mainThread.getPriority());
//        //设置优先级：
//        mainThread.setPriority(Thread.MAX_PRIORITY);
//        System.out.println("主线程的优先级为："+mainThread.getPriority());
//        MyThread t1=new MyThread();
//        MyThread t2=new MyThread();
//        t1.setName("t1");
//        t2.setName("t2");
//        t1.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);
//        t2.start();
//        t1.start();
//        MyThread t1=new MyThread();
//        MyThread t2=new MyThread();
//        t1.setName("t1");
//        t2.setName("t2");
//        t1.start();
//        t2.start();
//        Account account = new Account("123",10000);
//        Thread t1=new Thread(new Withdraw(account));
//        Thread t2=new Thread(new Withdraw(account));
//        t1.start();
//        t2.start();
        Account account=new Account("1232",10000);
        Thread t1=new Thread(new Withdrawal(account));
        Thread t2=new Thread(new Withdrawal(account));
        t1.start();
        t2.start();
    }
}
class Account{
    private static  Object obj=new Object();
    private String name;
    private double balance;
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) {
        synchronized (obj) {
            double before = balance;
            System.out.println(Thread.currentThread().getName()+"线程正在取款，用户"+name+"账户余额为:"+before);
            balance=(before - amount);
            System.out.println(Thread.currentThread().getName()+"线程取款完成，用户"+name+"账户余额为："+balance);
        }
    }
}
class Withdrawal implements Runnable{
    private Account account;
    public Withdrawal(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.withdraw(1000);
    }
}