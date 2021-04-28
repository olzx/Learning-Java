package Chapter_6;

/*
    Класс, реализующий очередь для хранения символов.
    Модификация: используется перегрузка конструкторов.
 */

class Queue2 {
    // Эти члены класса теперь являются закрытыми
    private char q[]; //массив для хранения элементов очереди
    private int putloc, getloc; // индексы для вставки и извлечения элементов очереди

    // Создание пустой очереди заданного размера
    Queue2(int size) {
        q = new char[size]; // выделение памяти для очереди
        putloc = getloc = 0;
    }

    // Создание очереди на основе имеющегося объекта Queue
    Queue2(Queue2 ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // Копирование элементов очереди
        for(int i = getloc; i < putloc; i++)
            q[i] = ob.q[i];
    }

    // Создание очереди на основе массива исходных значений
    Queue2(char a[]) {
        putloc = getloc = 0;
        q = new char[a.length + 1];

        for(int i = 0; i < a.length; i++)
            put(a[i]);
    }

    // Помещение символа в очередь
    public void put(char ch) {
        if(putloc == q.length) {
            System.out.println(" - Очередь заполнена");
            return;
        }

        q[putloc++] = ch;
    }

    // Извлечение символа из очереди
    public char get() {
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        return q[getloc++];
    }
}

// Демонстрация использования класса Queue
public class QDemo2 {
    public static void main(String[] args) {
        // Создание пустой очереди для хранения 10 элементов
        Queue2 q1 = new Queue2(10);

        char name[] = { 'T', 'o', 'm' };
        // Создание очереди на основе массива
        Queue2 q2 = new Queue2(name);

        char ch;
        int i;

        // Помещение ряда символов в очередь q1
        for(i = 0; i < 10; i++)
            q1.put((char) ('A' + i));

        // Создание одной очереди на основе другой
        Queue2 q3 = new Queue2(q1);

        // Отображение очередей
        System.out.print("Содержимое q1: ");
        for(i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Содержимое q2: ");
        for(i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Содержимое q3: ");
        for(i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
