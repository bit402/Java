package test;

public class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("鸟儿在飞翔");
    }
    public void sing(){
        System.out.println("鸟儿在唱歌");
    }
}

package test;

public class Animal {
    public void eat() {
        System.out.println("动物在吃东西");
    }
    public void move(){
        System.out.println("动物正在移动");
    }
//    public Object getObj(int a,String b){
//        return null;
//    }

}

package test;

public class Cat extends Animal {
    @Override
    public void move() {
        System.out.println("猫在走猫步");
    }
    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
}

package test;

public class test01 {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat();
        bird.move();
        Animal animal = new Animal();
        animal.eat();
        animal.move();
        Cat cat = new Cat();
        cat.eat();
        cat.move();
        Animal animal2 = new Cat();
        animal2.eat();
        animal2.move();
        //animal2.catchMouse();
        Cat cat2 = (Cat) animal2;
        cat2.catchMouse();
        Bird bird2 = new Bird();
        //Cat cat3 = (Cat)bird2;报错
        Animal x = new Cat();
        //Bird y=(Bird) x;编译通过，运行抛出异常
        if(x instanceof Bird){
            System.out.println("***************************");
            Bird y = (Bird) x;
        }
        System.out.println(x instanceof Animal);
        System.out.println(x instanceof Cat);
        System.out.println(x instanceof Bird);
        Animal animal3 = new Cat();
        //需求：判断动物是猫还是鸟，是猫的话让他抓老鼠，是鸟的话让它唱歌！！！
        if(animal3 instanceof Bird){
            Bird y = (Bird) animal3;
            y.sing();
        }
        else if(animal3 instanceof Cat){
            Cat y = (Cat) animal3;
            y.catchMouse();
        }
    }
}
