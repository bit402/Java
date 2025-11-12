package test;

public enum Color {
    BLUE, RED, YELLOW, GREEN
}
package test;

public enum Season {
    SPRING,SUMMER,AUTUMN,WINTER;
}
package test;

import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static java.lang.Math.abs;

public class test01 {
    public static Season get(){
        return Season.SUMMER;
    }
    public static void main(String[] args){
//        long l=System.currentTimeMillis();
//        System.out.println(l);
//        Instant now=Instant.now();
//        System.out.println(now);
//        long epochMilli=now.toEpochMilli();
//        System.out.println(epochMilli);
//        LocalDateTime now1= LocalDateTime.of(2008,8,8,8,8,8);
//        LocalDateTime now2= LocalDateTime.of(2009,9,9,9,9,9);
//        Duration duration = Duration.between(now1,now2);
//        System.out.println(duration.toDays());
//        System.out.println(duration.toHours());
//        LocalDate now1= LocalDate.of(2008,8,8);
//        LocalDate now2=LocalDate.of(2009,9,9);
//        Period between= Period.between(now1,now2);
//        System.out.println(between.getYears());
//        System.out.println(between.getMonths());
//        System.out.println(between.getDays());
//        LocalDateTime now=LocalDateTime.now();
//        System.out.println(now);
//        LocalDateTime a=now.with(TemporalAdjusters.lastDayOfYear());
//        System.out.println(a);
//        LocalDateTime b=now.with(TemporalAdjusters.firstDayOfMonth());
//        System.out.println(b);
//        LocalDateTime c=now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
//        System.out.println(c);
//        Instant instant = Instant.now();
//        System.out.println(instant);
//        LocalDateTime ldt = LocalDateTime.now();
//        System.out.println(ldt);
//        long a=instant.toEpochMilli();
//        System.out.println(a);
//        System.out.println(System.currentTimeMillis());
//        LocalDateTime ldt=LocalDateTime.now();
//        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//       String now=dtf.format(ldt);
//        System.out.println(now);
//        System.out.println(ldt);
//        ldt=LocalDateTime.parse("2008-08-08 08:08:08", dtf);
//        System.out.println(ldt);
//        System.out.println("圆周率："+Math.PI);
//        int a=100;
//        int b=200;
//        System.out.println("a,b相差："+abs(a-b));
//        System.out.println(Math.ceil(1.3));
//        System.out.println(Math.floor(1.999));
//        System.out.println(Math.max(10,20));
//        System.out.println(Math.min(10,20));
//        double a=Math.random();
//        System.out.println(a);
//        int b=Math.abs(-1);
//        System.out.println(b);
//        System.out.println(Math.round(3.4));
//        System.out.println(Math.round(3.5));
//        System.out.println(Math.sqrt(4));
//        System.out.println(Math.pow(2,3));
//        int choice=2;
//        switch(choice){
//            case 1-> System.out.println("春季");
//            case 2-> System.out.println("夏季");
//            case 3-> System.out.println("秋季");
//            case 4-> System.out.println("冬季");
        //}
        Season season = get();
        switch (season){
            case SUMMER-> System.out.println("summer");
            case AUTUMN -> System.out.println("autumn");
            case WINTER -> System.out.println("winter");
            case SPRING -> System.out.println("spring");
        }
        System.out.println(Color.BLUE);
        System.out.println(Color.RED);
        System.out.println(Color.GREEN);
        System.out.println(Color.YELLOW);
    }
}