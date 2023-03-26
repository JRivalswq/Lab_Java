import java.util.Scanner;

public class Book {
    String author, name;
    int year, pages;
    Book () {
        author = "Вербер";
        name = "Звёздная бабочка";
        year = 1999;
        pages = 345;
    }
    Book (String a, String b, int c, int d) {
        author = a;
        name = b;
        year = c;
        pages = d;
    }
    void change_author(String a) {
        author = a;
    }
    void change_name(String a) {
        name = a;
    }
    void change_year(int a) {
        year = a;
    }
    void change_pages(int a) {
        pages = a;
    }
    void change_author(Scanner sc) {
        System.out.println("Введите фамилию автора: ");
        author = sc.nextLine();
    }
    void change_name(Scanner sc) {
        System.out.println("Введите название книги: ");
        name = sc.nextLine();
    }
    void change_year(Scanner sc) {
        System.out.println("Введите год издания: ");
        year = sc.nextInt();
    }
    void change_pages(Scanner sc) {
        System.out.println("Введите год издания: ");
        pages = sc.nextInt();
    }
    void find(String s, Book... a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].name.equals(s))  {
                a[i].show();
                return;
            }
        }
        System.out.println("Книга с таким названием не обнаружена.");
    }
    void show() {
        System.out.println("Автор: " + author + "\nНазвание книги: " + name + "\nГод выпуска: " + year + "\nКоличество страниц: " + pages);
    }

}
