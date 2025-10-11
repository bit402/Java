package test;

import org.w3c.dom.ls.LSOutput;

public class Inner {
    private static int a=10;
    private int b=20;
    private static void m1(){
        System.out.println("外部类的静态方法执行了");
    }
    private void m2(){
        System.out.println("外部类的实例方法执行了");
    }
    public static class In{
        public void m3(){
            System.out.println(a);
            //System.out.println(b);
            m1();
            //m2();
        }
    }
}

package test;

public class Shili {
    public class Inner {
        private int a=100;
        private static int b=200;
        private void l1(){
            System.out.println("外部类的实例方法执行了");
        }
        private static void l2(){
            System.out.println("外部类的静态方法执行了");
        }
        public void x(){
            System.out.println(a);
            System.out.println(b);
            l1();
            l2();
        }
    }
}
package test;

public class test01 {

    public static void main(String[] args){
//        Inner.In inner=new Inner.In();
//        inner.m3();
        //Shili.Inner inner=new Shili.Inner();
        Shili shili = new Shili();
        Shili.Inner inner = shili.new Inner();
        inner.x();
    }
}