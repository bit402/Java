package test;

public class test01 {

    public static void main(String[] args) {
        XiaoYanZi xiaoYanZi = new XiaoYanZi("小燕子1",2);
        Dog dog = new Dog("旺财",2);
        YingWu yingWu = new YingWu("小武",2);
        xiaoYanZi.eat();
//        xiaoYanZi.fly();
        xiaoYanZi.display();
        dog.eat();
        dog.display();
        yingWu.eat();
        yingWu.display();
//        yingWu.fly();
//        yingWu.speak();
        if(xiaoYanZi instanceof Flyable){
            Flyable flyable =  xiaoYanZi;
            flyable.fly();
        }
        if (xiaoYanZi instanceof Speakable){
            Speakable speakable=(Speakable) xiaoYanZi;
            ((Speakable) xiaoYanZi).speak();
        }
        if(dog instanceof Flyable){
            Flyable flyable=(Flyable) dog;
            flyable.fly();
        }
        if (dog instanceof Speakable){
            Speakable speakable9=(Speakable) dog;
            speakable9.speak();
        }
        if(yingWu instanceof Flyable){
            Flyable flyable=(Flyable) yingWu;
            flyable.fly();
        }
        if(yingWu instanceof Speakable){
            Speakable speakable=(Speakable) yingWu;
            speakable.speak();
        }
    }
}


