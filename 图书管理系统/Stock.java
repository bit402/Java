package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Stock {
    Book[] books;
    int count=0;
    public static final int MAX = 100;
    public Stock() {
        books = new Book[MAX];
    }

    public void addBook(Scanner sc){
        System.out.println("请输入要添加的图书名：");
        String bookName = sc.nextLine();
        System.out.println("请输入要添加的图书的作者：");
        String author = sc.nextLine();
        double price=0;
        boolean priceValid = false;
        boolean priceV=false;
        while(!priceValid && !priceV) {
            try {
                System.out.println("请输入图书的价格：");
                price = sc.nextDouble();
                if(price <= 0){
                    throw new IllegalArgumentException("价格必须大于0");
                }
                priceValid = true;
                priceV = true;
            } catch(InputMismatchException e){
                sc.nextLine();
                System.out.println("输入不合法，请重新输入：");
            }catch (IllegalArgumentException e){
                sc.nextLine();
                System.out.println(e.getMessage()+"请重新输入：");
            }
        }
        sc.nextLine();
        System.out.println("请输入图书的ISBN：");
        String ISBN = sc.nextLine();
//        books[count] = new Book(bookName, author, price, ISBN);
//        count++;
        System.out.println("该书籍的类型是：");
        System.out.println("[1]小说类（FictionBook）");
        System.out.println("[2]非小说类（NonFictionBook）");
        int type = sc.nextInt();
        sc.nextLine();
        if(type == 1){
            System.out.println("请输入小说受众年龄段（如幼儿、青少年）：");
            String level = sc.nextLine();
            books[count] = new FictionBook(bookName, author, price, ISBN, level);
        }
        else if(type == 2){
            System.out.println("请输入非小说主题（如历史、科学）：");
            String topic = sc.nextLine();
            books[count]=new NotFictionBook(bookName, author, price, ISBN, topic);
        }
        else{
            System.out.println("类型选择错误，本次添加失败，请重新选择！");
            return;
        }
        count++;
    }
    public void deleteBook(Scanner sc){
        System.out.println("请输入要删除的图书的ISBN：");
        String ISBN = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if(books[i].getIsbn().equals(ISBN)){
                books[i] = books[count-1];
                count--;
                return;
            }
        }
    }
    public void searchBook(Scanner sc){
        int choice=0;
        do{
            System.out.println("[1]按图书名来查找对应的图书信息：");
            System.out.println("[2]按照图书的ISBN来查找对应的图书信息（推荐使用）：");
            System.out.println("[0]退出查找！");
            System.out.println("请按照对应的功能编号选择相应的功能：");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1->{
                    System.out.println("请输入要查找的图书名：");
                    String bookName = sc.nextLine();
                    for (int i = 0; i < count; i++) {
                        if(books[i].getName().equals(bookName)){
                            System.out.println("找到了，该图书的信息如下：");
                            System.out.println(books[i].toString());
                            return;
                        }
                    }
                    System.out.println("对不起，没要找到名为"+bookName+"的图书");
                }
                case 2->{
                    System.out.println("请输入要查找的图书的ISBN：");
                    String ISBN = sc.nextLine();
                    for (int i = 0; i < count; i++) {
                        if(books[i].getIsbn().equals(ISBN)){
                            System.out.println("找到了，该图书的信息如下：");
                            System.out.println(books[i].toString());
                            return;
                        }
                    }
                    System.out.println("对不起，没有找到编号为"+ISBN+"的图书！");
                }
                case 0->{
                    System.out.println("退出查找功能！");
                    return;
                }
                default -> {
                    System.out.println("对不起，请按照对应的功能编号输入：");
                }
            }
        }while(choice != 0);
    }
    public void display(){
        if(count==0){
            System.out.println("对不起，现在没有任何图书的信息！");
            return;
        }
        System.out.println("找到了，该书的信息如下：");
        for(int i=0;i<count;i++){
            System.out.println(books[i].toString());
        }
    }
}
