package test;

public class test01 {
//    public static void add(vip vi){
//        vi.age++;
//        System.out.println(vi.age);
//    }
    public static void main(String[] args) {
//            vip vip1 = new vip();
//            vip vip2 = new vip();
//            vip1.age=18;
//            vip2.age=18;
//            vip1.name="ysj";
//            vip2.name="laodu";
//            System.out.println("name="+vip1.name);
//        System.out.println("age="+vip1.age);
//        System.out.println("age="+vip2.age);
//        System.out.println("name="+vip2.name);
//        vip1.shopping();
//        vip2.shopping();
//        ChongWu chongwu1 = new ChongWu();
//        chongwu1.name="喵喵";
//        chongwu1.date="2025.7.17";
//        chongwu1.sex="公";
//        System.out.println(chongwu1.name);
//        System.out.println(chongwu1.date);
//        System.out.println(chongwu1.sex);
//        chongwu1.eat();
//        chongwu1.run();
//        ChongWu chongwu2 = new ChongWu();
//        chongwu2.name="汪汪";
//        chongwu2.date="2025.7.17";
//        chongwu2.sex="公";
//        System.out.println(chongwu2.name);
//        System.out.println(chongwu2.date);
//        System.out.println(chongwu2.sex);
//        chongwu2.eat();
//        chongwu2.run();
//        chongwu2=null;
//        System.out.println(chongwu2.name);
//        vip vip1 = new vip();
//        vip1.age=18;
//        vip1.name="张三";
//        System.out.println(vip1.age);
//        add(vip1);
//        System.out.println(vip1.age);
        vip vip1 = new vip();
        vip vip2 = new vip();
        vip1.name = "张三";
        vip2.name = "李四";
        vip1.age = 18;
        vip2.age = 18;
        System.out.println(vip1.name);
        System.out.println(vip1.age);
        vip1.shopping();
        System.out.println(vip2.name);
        System.out.println(vip2.age);
        vip2.shopping();
    }

}


package test;

public class vip {
    String name;
    int age;
    public  void shopping(){
        System.out.println(this.name+"正在购物");
    }
}
