package Chapter_11.suspend;

/*
    Приостановка, возобновление и остановка потока
 */

class MyThread implements Runnable {
    Thread thrd;
    boolean suspended;  // приостанавливает поток при значении true
    boolean stopped;    // останавливает поток при значении true

    MyThread(String name) {
        thrd = new Thread(this, name);
        suspended = stopped = false;
    }

    // Создание и запуск потока с помощью фабричного метода
    static MyThread createAndStart(String name) {
        MyThread myThrd = new MyThread(name);

        myThrd.thrd.start();
        return myThrd;
    }

    @Override
    // Точка входа для потока
    public void run() {
        System.out.println(thrd.getName() + " - запуск.");
        try {
            for (int i = 0; i < 100; i++) {
                System.out.print(i + " ");
                if ((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                // Использование синхронизированного блока для
                // проверки значения переменных suspended и stopped
                synchronized (this) {
                    while (suspended) wait();

                    if (stopped) break;
                }
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - прерван.");
        } finally {
            System.out.println(thrd.getName() + " - выход.");
        }
    }

    // Остановить поток
    synchronized void mystop() {
        stopped = true;

        // Следующие инструкции полность останавливают
        // приостановленный поток
        suspended = false;
        notify();
    }

    // Приостановить поток
    synchronized void mysuspend() {
        suspended = true;
    }

    // Возобновить поток
    synchronized void myresume() {
        suspended = false;
        notify();
    }
}

public class Suspend {
    public static void main(String[] args) {
        MyThread mt1 = MyThread.createAndStart("Мой поток");

        try {
            int delay = 1000;

            Thread.sleep(delay); // основной поток ждет секунду

            mt1.mysuspend();
            System.out.println("Приостановка поока.");
            Thread.sleep(delay);

            mt1.myresume();
            System.out.println("Возобновление потока.");
            Thread.sleep(delay);

            mt1.mysuspend();
            System.out.println("Приостановка поока.");
            Thread.sleep(delay);

            mt1.myresume();
            System.out.println("Возобновление потока.");
            Thread.sleep(delay);

            mt1.mysuspend();
            System.out.println("Остановка потока.");
            mt1.mystop();
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока.");
        }

        // Ожидание завершение основного потока
        try {
            mt1.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока.");
        } finally {
            System.out.println("Выход из основного потока.");
        }
    }
}
