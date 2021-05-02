package Chapter_8.BookPack2;

/*
    Объявление защищенными переменных экземпляра в классе Book
 */

// Класс Book и его члены должны быть объявлены открытыми,
// чтобы их можно было использовать в других пакетах.
public class Book {
    // При объявлении этих переменных использован
    // модификатор доступа protected
    protected String title;
    protected String author;
    protected int pubDate;

    // Теперь конструктор стал открытым
    public Book(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    // Теперь метод стал открытым
    public void show() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("PubDate: " + pubDate);
        System.out.println();
    }
}
