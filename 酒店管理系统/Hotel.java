package test;

//public class Hotel {
//    public void order(int roomNo,Room[][] rooms) {
//        for (int i = 0; i < rooms.length; i++) {
//            for (int j = 0; j < rooms[i].length; j++) {
//                if (rooms[i][j].getRoomNo() == roomNo) {
//                    if(rooms[i][j].isState()){
//                        System.out.println("对不起，房间已被预订/已入住！");
//                        return;
//                    }
//                    rooms[i][j].setState(true);
//                    System.out.println("订房成功！");
//                    return;
//                }
//                //if((rooms[i][j]==rooms[rooms.length-1][rooms[rooms.length-1].length-1]) && rooms[i][j].getRoomNo() != roomNo) {
//                    //System.out.println("对不起，没有该房间");
//                //}
//            }
//        }
//        System.out.println("对不起，没有该房间！");
//        return;
//    }
//    public void exit(int roomNo,Room[][] rooms) {
//        for (int i = 0; i < rooms.length; i++) {
//            for (int j = 0; j < rooms[i].length; j++) {
//                if (rooms[i][j].getRoomNo() == roomNo) {
//                    if(!rooms[i][j].isState()){
//                        System.out.println("该房间处于空闲状态，无需退房！");
//                        return;
//                    }
//                    rooms[i][j].setState(false);
//                    System.out.println("退房成功！");
//                    return;
//                }
//            }
//        }
//        System.out.println("对不起，该房间不存在，请重新操作！");
//    }
//    public void display(Room[][] rooms) {
//        for (int i = 0; i < rooms.length; i++) {
//            for (int j = 0; j < rooms[i].length; j++) {
//                if (rooms[i][j] != null) {
//                    System.out.println(rooms[i][j].toString());
//                }
//                else {
//                    System.out.println("第"+(i+1)+"楼的第"+(j+1)+"号房间不存在");
//                }
//            }
//        }
//    }
//
//    public Hotel() {
//    }
//重构：
public class Hotel {
    private Room[][] rooms;

    public Hotel() {
        rooms=new Room[6][10];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                int floor=i+1;
                int roomNo=floor*100+(j+1);
                String type=(floor<=2)? "单人间":(floor<=4)? "标准间":"豪华间";
                rooms[i][j]=new Room(roomNo,type,false);
            }
        }
    }
    public void order(int roomNo) {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j].getRoomNo() == roomNo) {
                    if(rooms[i][j].isState()){
                        System.out.println("对不起，房间已被预订/已入住！");
                        return;
                    }
                    rooms[i][j].setState(true);
                    System.out.println("订房成功！");
                    return;
                }
                //if((rooms[i][j]==rooms[rooms.length-1][rooms[rooms.length-1].length-1]) && rooms[i][j].getRoomNo() != roomNo) {
                    //System.out.println("对不起，没有该房间");
                //}
            }
        }
        System.out.println("对不起，没有该房间！");
        return;
    }
    public void exit(int roomNo) {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j].getRoomNo() == roomNo) {
                    if(!rooms[i][j].isState()){
                        System.out.println("该房间处于空闲状态，无需退房！");
                        return;
                    }
                    rooms[i][j].setState(false);
                    System.out.println("退房成功！");
                    return;
                }
            }
        }
        System.out.println("对不起，该房间不存在，请重新操作！");
    }
    public void display() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j] != null) {
                    System.out.println(rooms[i][j].toString());
                }
                else {
                    System.out.println("第"+(i+1)+"楼的第"+(j+1)+"号房间不存在");
                }
            }
        }
    }
}
