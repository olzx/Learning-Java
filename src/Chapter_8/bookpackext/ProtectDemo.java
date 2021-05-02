package Chapter_8.bookpackext;

/*
    Пример использования модификатора protected
 */

class ExtBook extends Chapter_8.BookPack2.Book {
    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println("Publisher: " + publisher);
        System.out.println();
    }

    public String getPublisher() { return publisher; }
    public void setPublisher(String p) { publisher = p; }

    // Следующие инструкции допустимы, поскольку подклассы имеют
    // право доступа к членам класса, объявленным защищенными
    public String getTitle() { return title; }
    public void setTitle(String t) { title = t; }
    public String getAuthor() { return author; }    // доступ к членам класса Book разрешен для подклассов
    public void setAuthor(String a) { author = a; }
    public int getPubDate() { return pubDate; }
    public void setPubDate(int d) { pubDate = d; }
}

public class ProtectDemo {
    public static void main(String[] args) {
        ExtBook books[] = new ExtBook[5];

        books[0] = new ExtBook("Java: руководство для начинающих 7-е издание",
                "Герберт Шилдт", 2018, "Вильямс");
        books[1] = new ExtBook("Искусство программирования на Java", "Герберт Шилдт", 2005, "Вильямс");
        books[2] = new ExtBook("Java: полное руководство, 10-е издание", "Герберт Шилдт", 2018, "Вильямс");
        books[3] = new ExtBook("Красный шторм поднимается", "Том Клэнси", 2006, "Эксмо");
        books[4] = new ExtBook("В дороге", "Джек Керуак", 2012, "Азбука");

        for(ExtBook b : books)
            b.show();

        // Поиск книг по автору
        System.out.println("Поиск книг по автору: \"Герберт Шилдт\":");
        for(ExtBook b : books) {
            if(b.getAuthor() == "Герберт Шилдт")
                b.getTitle();
        }

        // Доступ к защищенным полям класса Book возможен только из его подклассов
        // books[0].title = "test title"; // Ошибка: доступ запрещен!
    }
}
