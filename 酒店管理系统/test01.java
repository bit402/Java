package test;
import java.util.Scanner;
public class test01 {

    public static void main(String[] args){
        Hotel hotel = new Hotel();
        Room[][] rooms = new Room[6][10];
//        for (int i = 0; i < rooms.length; i++) {
//            for (int j = 0; j < rooms[i].length; j++) {
//                if(i==0){
//                    rooms[i][j] = new Room((i+1+100+j),"单人间",false);
//                }
//                else if(i==1){
//                    rooms[i][j] = new Room((i+200+j),"单人间",false);
//                }
//                else if(i==2){
//                    rooms[i][j] = new Room((i+300-1+j),"标准间",false);
//                }
//                else if(i==3){
//                    rooms[i][j] = new Room((i+400-2+j),"标准间",false);
//                }
//                else if(i==4){
//                    rooms[i][j] = new Room((i+500-3+j),"豪华间",false);
//                }
//                else if(i==5){
//                    rooms[i][j] = new Room((i+600-4+j),"豪华间",false);
//                }
//                else{
//                    System.out.println("系统故障");
//                    return;
//                }
//            }
//        }
        //优化：
//        for (int i = 0; i < rooms.length; i++) {
//            for (int j = 0; j < rooms[i].length; j++) {
//                int floor=i+1;
//                int roomNo=floor*100+(j+1);
//                String type;
//                if(floor<=2){
//                    type="单人间";
//                }
//                else if(floor<=4){
//                    type="标准间";
//                }
//                else{
//                    type="豪华间";
//                }
//                rooms[i][j]=new Room(roomNo,type,false);
//            }
//        }
        //hotel.display(rooms);
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("欢迎使用酒店管理系统！");
            System.out.println("请输入不同的数字来选择对应的功能：");
            System.out.println("[1]查看所有房间的状态");
            System.out.println("[2]预定房间");
            System.out.println("[3]退房");
            System.out.println("[0]退出系统");
            System.out.println("请输入功能编号：");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> hotel.display();
                case 2 -> {
                    System.out.println("请输入要预定的房间号：");
                    int roomNo = sc.nextInt();
                    hotel.order(roomNo);
                }
                case 3 -> {
                    System.out.println("请输入要退房的房间号：");
                    int roomNo = sc.nextInt();
                    hotel.exit(roomNo);
                }
                case 0 -> {
                    System.out.println("退出系统！");
                }
                default -> System.out.println("请输入正确的功能编号！");
            }
        }while (choice !=0);
        sc.close();
    }
}