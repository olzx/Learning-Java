// Данный класс принадлежит пакету bookpackext
package Chapter_8.bookpackext;

import Chapter_8.bookpack.*; // импорт всех классов из пакета bookpack

/*
    Использование класса Book из пакета bookpack.
    Использование ключевого слова import
 */

public class UseBook {
    public static void main(String[] args) {
        // Теперь к классу Book можно обращаться непосредственно,
        // без указания его полного имени
        Book books[] = new Book[5];

        books[0] = new Chapter_8.bookpack.Book("Java: руководство для начинающихБ 7-е издание",
                            "Герберт Шилдт", 2018);
        books[1] = new Book("Искусство программирования на Java", "Герберт Шилдт", 2005);
        books[2] = new Book("Java: полное руководство, 10-е издание", "Герберт Шилдт", 2018);
        books[3] = new Book("Красный шторм поднимается", "Том Клэнси", 2006);
        books[4] = new Book("В дороге", "Джек Керуак", 2012);

        for(Book b : books)
            b.show();
    }
}
