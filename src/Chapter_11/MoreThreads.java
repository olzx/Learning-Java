package Chapter_11;

/*
    Создание нескольких потоков

    Использование метода isAlive()
 */

import Chapter_11.*;

public class MoreThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        // Создание и запуск трех потоков
        MyThread2 mt1 = MyThread2.createAndStart("Порожденный поток №1");
        MyThread2 mt2 = MyThread2.createAndStart("Порожденный поток №2");
        MyThread2 mt3 = MyThread2.createAndStart("Порожденный поток №3");

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока.");
            }
        } while (mt1.thrd.isAlive() ||
                 mt2.thrd.isAlive() ||
                 mt3.thrd.isAlive());

        System.out.println("Завершение основного потока.");
    }
}
