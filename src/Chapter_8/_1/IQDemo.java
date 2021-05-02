package Chapter_8._1;

import Chapter_8.Questions.qpack.*;

// Демонстрация трех реализаций интерфейса ICharQ
public class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;

        char ch;
        int i;

        iQ = q1;
        // Помещение ряда символов в очередь фиксированного размера
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        // Отображение содержимого очереди
        System.out.print("Содержимое фиксированной очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q2;
        // Помещение ряда символов в динамическую очередь
        for (i = 0; i < 10; i++)
            iQ.put((char) ('Z' - i));

        // Отображение содержимого очереди
        System.out.print("Содержимое динамической очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q3;
        // Помещение ряда символов в кольцевую очередь
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        // Отображение содержимого очереди
        System.out.print("Содержимое кольцевой очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        // Помещение дополнительных символов в кольцевую очередь
        for (i = 10; i < 20; i++)
            iQ.put((char) ('A' + i));

        // Отображение содержимого очереди
        System.out.print("Содержимое кольцевой очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q1;
        // Сбрасываем фиксированную очередь и выводим ее
        iQ.reset();
        System.out.print("Содержимое фиксированной очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
    }
}
