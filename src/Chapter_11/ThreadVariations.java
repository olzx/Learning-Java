package Chapter_11;

/*
    Изменения класса MyThread. Эта версия класса MyThread
    создает объект Thread путем вызова его конструктора
    и сохранения в переменной экземпляра thrd.
    Также присваивается имя потоку и используется
    фабричный метод для создания и запуска потока.
 */

class MyThread2 implements Runnable {
    Thread thrd; // ссылка на поток хранится в переменной thrd

    // Создание нового потока на основе интерфейса и
    // присваивание ему имени
    MyThread2(String name) {
        thrd = new Thread(this, name); // имя потоку присваивается при его создании
    }

    // Создание и запуск потока с помощью фабричного метода
    public static MyThread2 createAndStart(String name) {
        MyThread2 myThrd = new MyThread2(name);

        myThrd.thrd.start(); // запуск потока
        return myThrd;
    }

    @Override
    // Точка входа для потока
    public void run() {
        System.out.println(thrd.getName() + " - запуск.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В " + thrd.getName() + ", счетчик: " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - прерван.");
        } finally {
            System.out.println(thrd.getName() + " - завершение.");
        }
    }
}

public class ThreadVariations {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока.");

        // Создание и запуск потока
        MyThread2 mt = MyThread2.createAndStart("Порожденный поток №2"); // запуск нового потока после его создания

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока.");
            }
        }

        System.out.println("Завершение основного потока.");
    }
}
