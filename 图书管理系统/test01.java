package test;
import java.util.Scanner;
public class test01 {
    public static final int MAX=100;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stock stock = new Stock();
        BookItem bookItem = new BookItem();
        int select=0;
        try {
            do{
                System.out.println("欢迎使用图书管理系统：");
                System.out.println("[1]查看现有书籍：");
                System.out.println("[2]添入新书籍：");
                System.out.println("[3]删除书籍：");
                System.out.println("[4]查找书籍：");
                System.out.println("[5]借书");
                System.out.println("[6]还书");
                System.out.println("[0]退出系统！");
                System.out.println("请选择对应的功能编号：");
                select = sc.nextInt();
                sc.nextLine();
                switch (select){
                    case 1->{
                        stock.display();
                    }
                    case 2->{
                        stock.addBook(sc);
                    }
                    case 3->{
                        stock.deleteBook(sc);
                    }
                    case 4->{
                        stock.searchBook(sc);
                    }
                    case 5->{
                        bookItem.borrowBook(sc,stock);
                    }
                    case 6->{
                        bookItem.returnBook(sc,stock);
                    }
                    case 0->{
                        break;
                    }
                }
            }while(select!=0);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            sc.close();
        }
    }
}