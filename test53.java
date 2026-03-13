package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test01 {
    public static double fx(double a, double b,double c,double d,double x) {
        return a*x*x*x+b*x*x+c*x+d;
    }
    public static double find(double l,double r,double a,double b,double c,double d){
        double mid=0;
       while(r-l>1e-4){
           mid=(l+r)/2;
           if(Math.abs(fx(a,b,c,d,mid))<1e-8){
               return mid;
           }
           else if(fx(a,b,c,d,l)*fx(a,b,c,d,mid)<0){
               r=mid;
           }
           else{
               l=mid;
           }
       }
        return (l+r)/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        List<Double> list=new ArrayList<>();
        for(int i=-100;i<100;i++) {
            double x1=i;
            double x2=i+1;
            if(fx(a,b,c,d,i)*fx(a,b,c,d,i+1)>0){
                continue;
            }
            if(Math.abs(fx(a,b,c,d,x1)) < 1e-8){
                list.add(x1);
                continue;
            }
            if(fx(a,b,c,d,i)*fx(a,b,c,d,i+1)<0){
                list.add(find(x1,x2,a,b,c,d));
            }
            if(list.size()==3){
                break;
            }
        }
        System.out.printf("%.2f %.2f %.2f\n", list.get(0), list.get(1), list.get(2));
        sc.close();
    }
}