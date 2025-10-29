package test;

import java.util.Scanner;

public interface Lendable {
    public void returnBook(Scanner sc, Stock stock);
    public void borrowBook(Scanner sc,Stock stock);
}
