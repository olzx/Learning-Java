package Chapter_11;

/*
    Создание потока путем реализации интерфейса Runnable
 */

/*
    Объекты класса MyThread могут
    выполняться в своих собственных
    потоках, поскольку класс MyThread
    реализует интерфейс Runnable.
 */
class MyThread implements Runnable {
    String thrdName;

    MyThread(String name) {
        thrdName = name;
    }

    // Точка входа в поток (Запуск потоков на выполнение)
    public void run() {
        System.out.println(thrdName + " - запуск");

        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В " + thrdName + ", счетчик: " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrdName + " - прерван");
        } finally {
            System.out.println(thrdName + " - завершение");
        }
    }
}

public class UseThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        // Сначала создать объект типа MyThread
        MyThread mt = new MyThread("Порожденный поток №1"); // создание выполняемого объекта

        // Затем сформировать поток на основе этого объекта
        Thread newThrd = new Thread(mt); // конструирование потока на основе этого объекта


        // Наконец, начать выполнение потока
        newThrd.start(); // запуск потока на выполнение

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        }

        System.out.println("Завершение основного потока");
    }
}
