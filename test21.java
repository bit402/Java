package test;

public class Animal {
}
package test;

public class test01 {

    public static void main(String[] args){
        int[] arr=new int[]{100,200,300};
        String[] name=new String[]{"jack","queen","king"};
        int[] num={100,200,500};
        String[] city={"北京","上海","天津"};
//        Animal animal=new Animal();
//        Animal animal1=new Animal();
//        Animal animal2=new Animal();
//        Animal[] animals={animal,animal1,animal2};
        int i=0;
        while(i<num.length){
            System.out.println(num[i]);
            i++;
        }
        System.out.println(name.length);
        num[0]=666;
        num[1]=888;
        num[2]=999;
        for (int k : num) {
            System.out.println(k);
        }
        for(String k: city){
            System.out.println(k);
        }
        for(int j=city.length-1;j>=0;j--){
            System.out.println(city[j]);
        }
    }
}