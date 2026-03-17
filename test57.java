package test;

public interface Flyable {
    void fly();
}
package test;

import java.io.Serializable;

public class Cat implements Flyable , Serializable {
    @Override
    public void fly() {
        System.out.println("cat fly");
    }
}
package test;

public class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Bird fly");
    }
}
package test;

public abstract class FlyableDecorator implements Flyable {
    private Flyable flyable;
    public FlyableDecorator(Flyable flyable) {
        this.flyable = flyable;
    }
    @Override
    public void fly() {
        flyable.fly();
    }
}
package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogDecorator extends FlyableDecorator{
    public LogDecorator(Flyable flyable) {
        super(flyable);
    }

    @Override
    public void fly() {
        Date now = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String time=sdf.format(now);
        System.out.println("起飞前的准备："+time);
        super.fly();
        now=new Date();
        time=sdf.format(now);
        System.out.println("安全降落时间："+time);
    }
}
package test;

public class TimeDecorator extends FlyableDecorator{
    public TimeDecorator(Flyable flyable) {
        super(flyable);
    }
    @Override
    public void fly() {
        long begin=System.currentTimeMillis();
        super.fly();
        long end=System.currentTimeMillis();
        System.out.println("总耗时："+(end-begin)+"ms");
    }
}
package test;

public class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public Address() {
    }
    
}
package test;

public class User {
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
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class test01 {

    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.fly();
//        Bird bird = new Bird();
//        bird.fly();
//        TimeDecorator cat=new TimeDecorator(new Cat());
//        cat.fly();
//        TimeDecorator bird=new TimeDecorator(new Bird());
//        bird.fly();
//        LogDecorator cat=new LogDecorator(new Cat());
//        cat.fly();
//        LogDecorator bird=new LogDecorator(new Bird());
//        bird.fly();
//        Flyable cat=new LogDecorator(new TimeDecorator(new Cat()));
//        cat.fly();
//        Flyable bird=new LogDecorator(new TimeDecorator(new Bird()));
//        bird.fly();
//        FlyableDecorator cat=new TimeDecorator(new Cat());
//        cat.fly();
//        FlyableDecorator bird=new TimeDecorator(new Bird());
//        bird.fly();
//        FlyableDecorator cat2=new LogDecorator(new Cat());
//        cat2.fly();
//        FlyableDecorator bird2=new LogDecorator(new Bird());
//        bird2.fly();
//        System.out.println("******************************************");
//        FlyableDecorator cat3=new LogDecorator(new TimeDecorator(new Cat()));
//        cat3.fly();
//        FlyableDecorator bird3=new LogDecorator(new TimeDecorator(new Bird()));
//        bird3.fly();
//        InputStream in = System.in;
//        try(FileWriter fw=new FileWriter("D:\\练习输入输出流\\lianxi.txt");
//            InputStreamReader isr=new InputStreamReader(in);) {
//            int len=0;
//            char[] chars=new char[1024];
//            while((len=isr.read(chars))!=-1){
//                fw.write(chars,0,len);
//            }
//            fw.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try(FileInputStream fis=new FileInputStream("D:\\练习输入输出流\\lianxi.txt");
//            GZIPOutputStream gos=new GZIPOutputStream(new FileOutputStream("D:\\练习输入输出流\\lianxi.txt.gz"))) {
//            byte[] bytes = new byte[1024];
//            int len;
//            while((len=fis.read(bytes))!=-1){
//                gos.write(bytes,0,len);
//            }
//            gos.finish();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try (GZIPInputStream gis = new GZIPInputStream(new FileInputStream("D:\\练习输入输出流\\lianxi.txt.gz"));
//             FileOutputStream fos = new FileOutputStream("D:\\练习输入输出流\\lianxi.txt");) {
//            byte[] bytes = new byte[1024];
//            int len;
//            while ((len = gis.read(bytes)) != -1) {
//                fos.write(bytes, 0, len);
//            }
//            fos.flush();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        baos.write(1);
//        baos.write(2);
//        baos.write(3);
//        byte[] bytes=baos.toByteArray();
//        for(byte b:bytes){
//            System.out.println(b);
//        }
//        System.out.println(bytes);
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        byte[] bytes;
//        try(ObjectOutputStream oos=new ObjectOutputStream(baos);) {
//            oos.writeObject(1);
//            oos.writeObject(new Cat());
//            oos.writeObject(3.14);
//            oos.writeInt(1);
//            oos.writeBoolean(true);
//            oos.writeFloat(3.14f);
//            oos.writeDouble(3.14);
//            oos.writeLong(1L);
//            oos.writeByte(1);
//            oos.writeChar('c');
//            oos.writeUTF("<UNK>");
//            oos.flush();
//            bytes = baos.toByteArray();
////            for(byte b:bytes){
////                System.out.println(b);
////            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
//        try(ObjectInputStream ois=new ObjectInputStream(bais)) {
//            System.out.println(ois.readObject());
//            System.out.println(ois.readObject());
//            System.out.println(ois.readObject());
//            System.out.println(ois.readInt());
//            System.out.println(ois.readBoolean());
//            System.out.println(ois.readFloat());
//            System.out.println(ois.readDouble());
//            System.out.println(ois.readLong());
//            System.out.println(ois.readByte());
//            System.out.println(ois.readChar());
//            System.out.println(ois.readUTF());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        int[] a = new int[n];
        boolean[] b = new boolean[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
            a[i] = sc.nextInt();
            b[i]=false;
        }
        long sum = 0L;
        int maxIndex=-1;
        for(int i = 0; i < n; i++){
            int index=-1;
            int max=-1;
            if(i==0){
                for(int j=0;j<n;j++){
                    if(2*s[j]+a[j]>max){
                        max=2*s[j]+a[j];
                        maxIndex=j;
                        b[j]=true;
                    }
                }
            }
            //情况1
            for(int j=0;j<n;j++){
                if(!b[j] && s[j]<=maxIndex && a[j]>max){
                    max=a[j];
                }
            }
            //情况2
            for(int j=0;j<n;j++){
                if(!b[j] && s[j]>maxIndex && 2*(s[j]-maxIndex)+a[j]>max){
                    max=2*(s[j]-maxIndex)+a[j];
                    index=j;
                }
            }
            if(index!=-1){
                maxIndex=index;
            }
            sum+=max;
            System.out.println(sum);
        }
        sc.close();
    }
}