package test;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Date;

public class test01 {

    public static void main(String[] args) {
//        try(BufferedReader br =new BufferedReader(new FileReader("D://lianxi.txt"))) {
//            String line;
//            while((line=br.readLine())!=null){
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try (BufferedReader br = new BufferedReader(new FileReader("D://lianxi.txt"));
//             BufferedWriter bw = new BufferedWriter(new FileWriter("D://lianxi.txt",false))) {
//            bw.write("abcdef");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try (BufferedReader br = new BufferedReader(new FileReader("D://lianxi.txt"))) {
//            System.out.println(br.read());
//            System.out.println(br.read());
//            br.mark(3);
//            System.out.println(br.read());
//            System.out.println(br.read());
//            System.out.println(br.read());
//            System.out.println(br.read());
//            br.reset();
//            System.out.println(br.read());
//            System.out.println(br.read());
//            System.out.println(br.read());
//            System.out.println(br.read());
//            System.out.println(br.read());
//            br.reset();
//            System.out.println(br.read());
//            System.out.println(br.read());
//            System.out.println(br.read());
//            System.out.println(br.read());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try(FileReader fr=new FileReader("D://lianxi.txt")) {
//            char[] chars=new char[1024];
//            int length=0;
//            while((length=fr.read(chars))!=-1) {
//                System.out.print(new String(chars,0,length));
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try(FileWriter fw=new FileWriter("D://lianxi.txt",true)) {
//            fw.write("动力节点");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try(InputStreamReader isr=new InputStreamReader(new FileInputStream("D://lianxi.txt"),"GBK")) {
//            char[] chars=new char[1024];
//            int len=0;
//            while((len=isr.read(chars))!=-1){
//                System.out.print(new String(chars,0,len));
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try(FileReader fr=new FileReader("D://lianxi.txt", Charset.forName("GBK"))) {
//            char[] chars=new char[100];
//            int len=0;
//            while((len=fr.read(chars))!=-1) {
//                System.out.print(new String(chars,0,len));
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try(OutputStreamWriter opw=new OutputStreamWriter(new FileOutputStream("D://lianxi.txt",true),Charset.forName("GBK"))) {
//            opw.write("你好");
//            opw.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try(FileWriter fw=new FileWriter("D://lianxi.txt",Charset.forName("GBK"),true);) {
//            fw.write("你好");
//            fw.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("D://lianxi.txt"))) {
//            byte b=127;
//            short s=32767;
//            int i=2147483647;
//            long l=9223372036854775807L;
//            float f=9223372036854775807f;
//            double d=9223372036854775807d;
//            char c='国';
//            boolean b1=true;
//            String s1="动力节点";
//            dos.writeByte(b);
//            dos.writeShort(s);
//            dos.writeInt(i);
//            dos.writeLong(l);
//            dos.writeFloat(f);
//            dos.writeDouble(d);
//            dos.writeChar(c);
//            dos.writeUTF(s1);
//            dos.writeBoolean(b1);
//            dos.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try(DataInputStream dis=new DataInputStream(new FileInputStream("D://lianxi.txt"))) {
//            byte b=dis.readByte();
//            short s=dis.readShort();
//            int i=dis.readInt();
//            long l=dis.readLong();
//            float f=dis.readFloat();
//            double d=dis.readDouble();
//            char c=dis.readChar();
//            String s1=dis.readUTF();
//            boolean b1=dis.readBoolean();
//            System.out.println(b);
//            System.out.println(s);
//            System.out.println(i);
//            System.out.println(l);
//            System.out.println(f);
//            System.out.println(d);
//            System.out.println(c);
//            System.out.println(s1);
//            System.out.println(b1);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D://lianxi.txt"))) {
//            Date now = new Date();
//            oos.writeObject(now);
//            oos.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D://lianxi.txt"))) {
//            Object o=ois.readObject();
//            System.out.println(o);
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        try(ObjectOutputStream oos=new ObjectOutputStream(""))
    }
}