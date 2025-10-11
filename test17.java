package test;

public interface Character {
    String getName();
    double getHealthy();
    double Attack(double md,double mh);
    double Defense(double ma);
    double getAttack();
    double getDefense();
}
package test;

public interface Monster extends Character{
    String getReward();
}
package test;

public class Hero implements Character {
    private String name;
    private double health;
    private double attack;
    private double defense;

    public Hero() {
    }

    public Hero(String name, double health, double attack, double defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getHealthy() {
        return this.health;
    }

    @Override
    public double Attack(double md,double mh) {
        if (this.attack>md){
            this.health=mh-(this.attack-md);
            return mh-(this.attack-md);
        }
        else {
            return mh;
        }
    }

    @Override
    public double Defense(double ma) {
        if (this.defense < ma) {
            this.health =health-(ma-this.defense);
            return this.health;
        }
        else{
            return this.health;
        }
    }

    @Override
    public double getAttack() {
        return this.attack;
    }

    @Override
    public double getDefense() {
        return this.defense;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

}
package test;

public class MonsterIMPI implements Monster{
    private String name;
    private double health;
    private double ma;
    private double md;
    private String reward;
    private boolean flag=false;
    private double initialHealth;
    public MonsterIMPI() {
    }

    public MonsterIMPI(String name, double health, double ma, double md, String reward,double initialHealth) {
        this.name = name;
        this.health = health;
        this.ma = ma;
        this.md = md;
        this.reward = reward;
        this.initialHealth = initialHealth;
    }

    @Override
    public String getReward() {
        return this.reward;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getHealthy() {
        return this.health;
    }

    @Override
    public double Attack(double hd,double hh) {
        if(this.ma>hd){
            this.health=hh-(this.ma-hd);
            return hh-(this.ma-hd);
        }
        else{
            return hh;
        }
    }

    @Override
    public double Defense(double ha) {
        if(this.md<ha){
            this.health=this.health-(ha-this.md);
            return this.health;
        }
        else{
            return this.health;
        }
    }

    @Override
    public double getAttack() {
        return this.ma;
    }

    @Override
    public double getDefense() {
        return this.md;
    }
    public void check(){
        if(flag==false && this.health<=initialHealth*0.2){
            System.out.println("怪物触发愤怒效果，攻击力翻倍！");
            this.ma=this.ma*2;
            this.flag=true;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setMa(double ma) {
        this.ma = ma;
    }

    public void setMd(double md) {
        this.md = md;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void setInitialHealth(double initialHealth) {
        this.initialHealth = initialHealth;
    }

    public boolean isFlag() {
        return flag;
    }

    public double getInitialHealth() {
        return initialHealth;
    }
}
package test;

public class test01 {

    public static void main(String[] args) {
        Hero hero = new Hero("剑士",30,3,2);
        System.out.println("英雄的信息：");
        System.out.println("名称："+hero.getName());
        System.out.println("攻击力："+hero.getAttack());
        System.out.println("防御值："+hero.getDefense());
        System.out.println("生命值："+hero.getHealthy());
        MonsterIMPI monster =new MonsterIMPI("骷髅王",20,4,1,"100金币",20);
        System.out.println();
        System.out.println("怪物信息：");
        System.out.println("怪兽名称："+monster.getName());
        System.out.println("攻击力："+monster.getAttack());
        System.out.println("防御值："+monster.getDefense());
        System.out.println("生命值："+monster.getHealthy());
        System.out.println("击败奖励："+monster.getReward());
        System.out.println();
        System.out.println("剑士和骷髅王相遇，展开决斗！");
        while(!(monster.getHealthy()<=0 || hero.getHealthy()<=0) ){
            System.out.println("剑士进攻：");
            double hp1=monster.Defense(hero.getAttack());
            if(hp1<=0){
                System.out.println("骷髅王死亡，剑士获胜！");
                System.out.println("剑士获得："+monster.getReward());
                break;
            }
            System.out.println("骷髅王抵御攻击，生命值还有："+hp1);
            monster.check();
            System.out.println("骷髅王进攻：");
            double hp2=hero.Defense(monster.getAttack());
            if(hp2<=0){
                System.out.println("剑士死亡，骷髅王获胜！");
                break;
            }
            System.out.println("战士抵御攻击，生命值还有"+hp2);
        }
    }
}