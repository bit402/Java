package test;

import java.util.Scanner;

public class BookItem implements Lendable{
    @Override
    public void borrowBook(Scanner sc,Stock stock) {
        System.out.println("请输入您要借的图书编号：");
        String ISBN = sc.nextLine();
        for (int i = 0; i <stock.count ; i++) {
            if(stock.books[i].getIsbn().equals(ISBN)){
                if(!stock.books[i].isStatus()){
                    stock.books[i].setStatus(true);
                    System.out.println("借书登记成功，请取走此书，并按时归还！");
                    return;
                }
                else if(stock.books[i].isStatus()){
                    System.out.println("对不起，此书已经被借走！");
                    return;
                }
            }
        }
        System.out.println("对不起没有找到编号为"+ISBN+"的书");
    }

    @Override
    public void returnBook(Scanner sc,Stock stock) {
        System.out.println("请输入您要还的书的编号：");
        String ISBN = sc.nextLine();
        for (int i = 0; i <stock.count ; i++) {
            if(stock.books[i].getIsbn().equals(ISBN)){
                stock.books[i].setStatus(false);
                System.out.println("还书成功！");
                return;
            }
        }
        System.out.println("对不起系统中没有找到编号为"+ISBN+"的书，请您仔细检查编号是否有误！");
    }
}
