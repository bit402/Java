 package test;

import java.io.*;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class test01 {
    public static void main(String[] args) {
//        try {
//            //获取本机的ip地址和主机名的封装对象：InetAddress
//
//            InetAddress ia=InetAddress.getLocalHost();
////            System.out.println(ip.getHostAddress());
//            //获取本机的ip地址
//            String ip=ia.getHostAddress();
//            //获取本机的主机名
//            String hostname=ia.getHostName();
//            System.out.println(ip);
//            System.out.println(hostname);
//            InetAddress ia2=InetAddress.getByName("www.baidu.com");
//            String ip2=ia2.getHostAddress();
//            String name = ia2.getHostName();
//            System.out.println(ip2);
//            System.out.println(name);
//        } catch (UnknownHostException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            //创建url类的对象
//            URL url = new URL("http://www.baidu.com:8888/oa/index.html?name=zhangsan&password=123#tip");
//            //获取url中的信息：
//            String protocal = url.getProtocol();
//            System.out.println("协议："+protocal);
//            //获取资源路径
//            String path = url.getPath();
//            System.out.println("资源路径："+path);
//            //获取默认端口（HTTP的默认端口为80）
//            int md=url.getDefaultPort();
//            System.out.println("默认端口为："+md);
//            //获取当前端口
//            int dk=url.getPort();
//            System.out.println("指定的端口"+dk);
//            //获取url中的主机地址：
//            String host = url.getHost();
//            System.out.println("主机地址："+host);
//            //获取URL准备传送的数据
//            String query = url.getQuery();
//            System.out.println("需要提交给服务器的数据："+query);
//            //获取锚点
//            String ref = url.getRef();
//            System.out.println("传送锚点："+ref);
//            //获取资源路径＋数据：
//            String file=url.getFile();
//            System.out.println("资源路径+数据"+file);
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        }
        try {
            URL url=new URL("https://tianqi.qq.com/");
            InputStream fis=url.openStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(fis));
            String line=null;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}