package Chapter_11;

public class MyThread2 implements Runnable {
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
