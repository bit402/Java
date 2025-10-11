package test;

public class Worker {
   String name;
   String idcard;
   static String country="中国";

   public Worker() {
   }

   public Worker(String name, String idcard) {
      this.name = name;
      this.idcard = idcard;
      //display();
   }
   public void display(){
      System.out.println("姓名："+name);
      System.out.println("身份证号："+idcard);
      System.out.println("国籍："+country);
   }
}

package test;

public class test01 {
//    public static void te()
//    {
//        System.out.println("<UNK>");
//    }
    static int a = 1;
    static{
        System.out.println("静态代码块执行了");
        System.out.println(a);
        //System.out.println(b);
        //System.out.println(c);
        test();
}
static int b = 2;
    public static void main(String[] args) {
//        Worker worker = new Worker("张三","888");
//        Worker worker2 = new Worker("李四","999");
//        worker.display();
//        worker2.display();
//        System.out.println("国籍："+Worker.country);
//        System.out.println("引用来访问静态变量："+worker2.country);
//        worker=null;
//        System.out.println(worker.country);
//        //worker.te();
//        te();
        System.out.println("hello");
        test();
    }
    public static void test(){
        System.out.println("1");
        System.out.println(c);
    }
    static int c=5;
}
