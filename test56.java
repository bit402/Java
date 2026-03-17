package test;

public class Birld implements Flayable{
    @Override
    public void flay() {
        System.out.println("Birld flay");
    }
}
package test;

public class Cat implements Flayable{
    @Override
    public void flay() {
        System.out.println("cat flay");
    }
}
package test;

public interface Flayable {
    void flay();
}
package test;

public class CatSon extends Cat {
    @Override
    public void flay() {
        long pre=System.currentTimeMillis();
        super.flay();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long now=System.currentTimeMillis();
        System.out.println("方法执行的时间差为："+(now-pre)+"毫秒");
    }
}
package test;

public class FlayableDecorator implements Flayable {
    private Flayable flayable;
    public FlayableDecorator(Flayable flayable) {
        this.flayable = flayable;
    }

    @Override
    public void flay() {
        long begin=System.currentTimeMillis();
        flayable.flay();
        long end=System.currentTimeMillis();
        System.out.println("耗时"+(end-begin)+"ms");
    }
}
package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogDecorator implements Flayable{
    private Flayable flayable;
    public LogDecorator(Flayable flayable) {
        this.flayable = flayable;
    }

    @Override
    public void flay() {
        Date now = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:dd:ss SSS");
        System.out.println(sdf.format(now)+"起飞前的准备");
        flayable.flay();
        now=new Date();
        System.out.println(sdf.format(now)+"成功降落");
    }
}
package test;

import java.io.*;
import java.util.*;

public class test01 {
//    public static void copy(File file1, File file2) {
//        if (!file1.exists()) {
//            System.out.println("file1不存在");
//            return;
//        }
//        if (!file2.exists()) {
//            System.out.printf("file2不存在");
//            return;
//        }
//        if (file1.isFile()) {
//            File file=new File(file2.getAbsolutePath()+file1.getAbsolutePath().substring(2));
//            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file1));
//                 BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file))) {
//                byte[] bytes = new byte[1024];
//                int length;
//                while ((length = bis.read(bytes)) != -1) {
//                    bos.write(bytes, 0, length);
//                }
//                bos.flush();
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            return;
//        }
//        File newfile = new File(file2.getAbsolutePath() + file1.getAbsolutePath().substring(2));
//        if (!newfile.exists()) {
//            newfile.mkdirs();
//        }
//        File[] files = file1.listFiles();
//        for (File file : files) {
//            copy(file, file2);
//        }
//    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        int n=sc.nextInt();
//       // System.out.println("n输入完毕");
//        for(int i=0;i<n;i++){
//            list.add(sc.nextInt());
//        }
//        //System.out.println("高度输入完毕");
//        long sum=0L;
//        int now=0;
//        int future=0;
//        boolean flag=true;
//        while(!list.isEmpty()){
//            if(flag){
//                future= Collections.max(list);
//            }
//            else{
//                future= Collections.min(list);
//            }
//            sum+= (long) (now - future) *(now-future);
//            if(now!=0){
//                list.remove(Integer.valueOf(now));
//            }
//            now=future;
//            flag=!flag;
//        }
//        sc.close();
//        System.out.println(sum);
//        File file1 = new File("D:\\c代码");
//        File file2 = new File("D:\\练习输入输出流");
//        copy(file1, file2);
//        Properties pro=new Properties();
//        //String path=Thread.currentThread().getContextClassLoader().getResource("jdbc.properties").getPath();
//        String path="src/jdbc.properties";
//        try(FileReader fr=new FileReader(path)) {
//            pro.load(fr);
//            Enumeration<?> en=pro.propertyNames();
//            while (en.hasMoreElements()) {
//                String key=(String)en.nextElement();
//                String value=pro.getProperty(key);
//                System.out.println(key+"="+value);
//            }
//            //通过key来获取value
//            String url=pro.getProperty("url");
//            String username=pro.getProperty("username");
//            String password=pro.getProperty("password");
//            String driver=pro.getProperty("driver");
//            System.out.println("url="+url
//            +",username="+username
//            +",password="+password
//            +",driver="+driver);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        File file=new File("src/jdbc.properties");
//        File file2=new File("src/test/jdbc.properties");
////        System.out.println(file.exists());
////        System.out.println(file2.exists());
//        file.renameTo(file2);
//        ResourceBundle rb=ResourceBundle.getBundle("test.jdbc");
//        String url = rb.getString("url");
//        //String username = rb.getString("username");
//        String password = rb.getString("password");
//        String driver = rb.getString("driver");
//        String user=rb.getString("user");
//        System.out.println(url);
//        //System.out.println(username);
//        System.out.println(password);
//        System.out.println(driver);
//        System.out.println(user);
//        Birld birld = new Birld();
//        birld.flay();
//        Cat cat = new Cat();
//        cat.flay();
//        CatSon catSon = new CatSon();
//        catSon.flay();
//        Flyable flyable1=new Bird();
//        flayable1.flay();
//        Flayable flayable2=new Cat();
//        flayable2.flay();
//        Flayable flayable=new FlayableDecorator(new Cat());
//        flayable.flay();
//        Flayable flayable3=new FlayableDecorator(new Birld());
//        flayable3.flay();
//        System.out.println(flayable instanceof FlayableDecorator);
        Flayable flayable=new LogDecorator(new Cat());
        flayable.flay();
        Flayable flayable1=new LogDecorator(new Birld());
        flayable1.flay();
    }
}# connect mysql database info
driver=com.mysql.cj.jdbc.Driver
url=jdbc:mysql://localhost:3306/powernode
user=root
password=root123
