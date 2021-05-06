package Chapter_11._1;

/*
    Упражнение 11.1
    Расширение класса Thread.
 */

class MyThread extends Thread {

    // Конструктор нового потока
    MyThread(String name) {
        super(name);
    }

    // Точка входа для потока
    public void run() {
        System.out.println(getName() + " - запуск.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В " + getName() + ", счетчик: " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println( getName() + " - прерван.");
        } finally {
            System.out.println(getName() + " - завершение.");
        }
    }

    // Фабричный метод, позволяющий запустить поток
    // сразу после его создания
    public static MyThread createAndStart(String name) {
        MyThread myThrd = new MyThread(name);

        myThrd.start();
        return myThrd;
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока.");

        MyThread mt = new MyThread("Порожденный поток №1");

        // Создание потока с автоматическим запуском.
        MyThread mt2 = MyThread.createAndStart("Порожденный поток №2");

        mt.start();

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока.");
            }
        }

        System.out.println("Завершение основного потока.");
    }
}
