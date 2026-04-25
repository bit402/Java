package test;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
//        int port = 8888;
//        System.out.println("服务器端启动成功，正在等待客户端的连接...");
//        try(ServerSocket serversocket=new ServerSocket(8888);
//            BufferedReader br=new BufferedReader(new InputStreamReader(serversocket.accept().getInputStream()))) {
////            serversocket.accept();
//            String line;
//            while((line=br.readLine())!=null){
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try(ServerSocket serverSocket=new ServerSocket(8888)) {
//            System.out.println("服务端启动成功，正在等待客户端连接...");
//            try(Socket clientSocket=serverSocket.accept();
//                BufferedInputStream bis=new BufferedInputStream(clientSocket.getInputStream());
//                BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\练习输入输出流\\b\\dog.jpg"));) {
//                byte[] buffer=new byte[1024];
//                int len;
//                while((len=bis.read(buffer))!=-1) {
//                    bos.write(buffer,0,len);
//                }
//                bos.flush();
//                //服务器端在收到了图片之后给客户端回个话
//                try(BufferedWriter bw=new BufferedWriter((new OutputStreamWriter(clientSocket.getOutputStream())))){
//                    bw.write("谢谢你，我收到图片了，真可爱");
//                    bw.flush();
//                }
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        try (DatagramSocket ds = new DatagramSocket(8888)) {
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, 1024);
            ds.receive(dp);
            String msg = new String(bytes, 0, dp.getLength());
            System.out.println(msg);
            //接收方接收到发送方的消息之后回个信息：

            byte[] bytes2 = "谢谢你，我已经收到消息了".getBytes();
            DatagramPacket dp2 = new DatagramPacket(bytes2, bytes2.length, dp.getAddress(), dp.getPort());
            ds.send(dp2);

        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
package test;

public class User {
    private int age;

    public User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }
}
package test;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
//        try(Socket clientsocket =new Socket(InetAddress.getLocalHost(),8888);
//            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(clientsocket.getOutputStream()));
//            Scanner sc=new Scanner(System.in)){
//            System.out.println("客户端服务器启动成功");
////            bw.write("你好");
////            bw.newLine();
////            bw.write("收到消息了吗？");
////            bw.flush();
//            boolean flag=true;
//            while(flag){
//                String msg=sc.next();
//                bw.write(msg);
//                bw.newLine();
//                //缓冲流要记得刷新
//                bw.flush();
//                if(msg.equals("exit")){
//                    flag=false;
//                    break;
//                }
//            }
//        } catch (IOException e) {
//            throw new RuntimeException("客户端连接异常"+e);
//        }
//        try(Socket clientSocket=new Socket(InetAddress.getLocalHost(),8888)) {
//            try(BufferedOutputStream bos=new BufferedOutputStream(clientSocket.getOutputStream());
//                BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\练习输入输出流\\a\\dog.jpg"))){
//                byte[] buf=new byte[1024];
//                int len;
//                while((len=bis.read(buf))!=-1){
//                    bos.write(buf, 0, len);
//                }
//                bos.flush();
//                //关闭输出（输出结束）
//                clientSocket.shutdownOutput();
//                //接收服务器响应回来的消息
//                try(BufferedReader br=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))){
//                    String line;
//                    while((line= br.readLine())!=null){
//                        System.out.println(line);
//                    }
//                }
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        try (DatagramSocket ds = new DatagramSocket()) {
            byte[] bytes = "动力节点".getBytes();
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 8888);
            ds.send(dp);
            //接收被接收方的回信：

            byte[] bytes2 = new byte[1024];
            DatagramPacket dp2 = new DatagramPacket(bytes2, bytes2.length);
            ds.receive(dp2);
            String msg2 = new String(bytes2, 0, dp2.getLength());
            System.out.println(msg2);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
package test;

public abstract class Animal {
    public abstract void run();
}
package test;

public interface Flyable {
    public void fly();
    public void eat();
}
package test;
@FunctionalInterface
public interface NoParameterNoReturn {
    void test();
}
package test;

import java.util.*;

public class test01 {
//    public static void test(Animal a) {
//        a.run();
//    }
//public static void fly(Flyable flyable) {
//    flyable.fly();
//    flyable.eat();
//}
    public static void main(String[] args) {
//        TreeSet<User> users = new TreeSet<>(new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
//        TreeSet<User> users1=new TreeSet<>((o1,o2)->o1.getAge()-o2.getAge());
//        User u1=new User(2);
//        User u2=new User(3);
//        User u3=new User(4);
//        User u4=new User(1);
//        users.add(u1);
//        users.add(u2);
//        users.add(u3);
//        users.add(u4);
//        System.out.println(users);
//        users1.add(u1);
//        users1.add(u2);
//        users1.add(u3);
//        users1.add(u4);
//        System.out.println(users1);
//        test01.test(new Animal() {
//            @Override
//            public void run() {
//                System.out.println("动物正在跑");
//            }
//        });
//        test01.fly(new Flyable() {
//            @Override
//            public void fly() {
//                System.out.println("正在飞翔...");
//            }
//
//            @Override
//            public void eat() {
//                System.out.println("正在吃东西...");
//            }
//        });
//        List<Integer> list= Arrays.asList(100,200,300,250);
//        //Collections.sort(list);
////        //匿名内部类的形式：
////        Collections.sort(list,new Comparator<Integer>() {
////            @Override
////            public int compare(Integer o1, Integer o2) {
////                //降序排序
////                return o2-o1;
////            }
////        });
//        //lambada表达式的形式：
////        Collections.sort(list,((o1, o2) -> o2 - o1));
//        Comparator<Integer> comparator= (o1, o2)->o2-o1;
//        Collections.sort(list,comparator);
//        System.out.println(list);
        //lambda表达式，无返回值无参数的情况：
        //匿名内部类的方式：
        NoParameterNoReturn npnr=new NoParameterNoReturn() {
            @Override
            public void test() {
                System.out.println("无返回值，无参数的test方法执行了");
            }
        };
        npnr.test();
        //lambada表达式的形式：
        NoParameterNoReturn npnr1=()->System.out.println("无返回值，无参数的test执行了");
        npnr1.test();
    }
}