package Chapter_11.Questions.tickTock;

class TickTock {
    String state;   // содержит сведения о состоянии часов

    synchronized void tick(boolean running) {
        if(!running) { // остановить часы
            state = "ticked";
            notify();
            return;
        }

        System.out.print("Tick ");

        try {
            Thread.sleep(500);
        } catch (InterruptedException exc) {
            System.out.println("Прерывание потока.");
        }

        state = "ticked"; // установить текущее состояние после такта "тик"
        notify(); // позволить выполняться методу tock()
                  // (метод tick() посылает уведомление методу tock())
        try {
            while(!state.equals("tocked"))
                wait(); // ожидать до завершения метода tock()
                        // (метод tick() ожидает завершения метода tock())
        }
        catch (InterruptedException exc) {
            System.out.println("Прерывание потока");
        }
    }

    synchronized void tock(boolean running) {
        if(!running) {
            state = "tocked";
            notify();   // уведомить ожидающие потоки
            return;
        }

        System.out.println("Tock");

        try {
            Thread.sleep(500);
        } catch (InterruptedException exc) {
            System.out.println("Прерывание потока.");
        }

        state = "tocked"; // установить текущее состояние
                          // после такта "так"
        notify(); // позволить выполняться методу tick()
                  // (метод tock() посылает уведомления методу tick())
        try {
            while(!state.equals("ticked"))
                wait(); // ожидать до завершения метода tick()
                        // метод tock() ожидает завершения метода tick()
        }
        catch (InterruptedException exc) {
            System.out.println("Прерывание потока");
        }
    }
}

class MyThread implements Runnable {
    Thread thrd;
    TickTock ttOb;

    // Конструктор нового потока
    public MyThread(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
    }

    // Создание и запуск потока с помощью фабричного метода
    public static MyThread createAndStart(String name, TickTock tt) {
        MyThread myThrd = new MyThread(name, tt);

        myThrd.thrd.start(); // запуск потока
        return myThrd;
    }

    // Точка входа для потока
    public void run() {
        if (thrd.getName().compareTo("Tick") == 0) {
            for(int i = 0; i < 5; i++) {
                ttOb.tick(true);
            }
            ttOb.tick(false);
        } else {
            for(int i = 0; i < 5; i++) {
                ttOb.tock(true);
            }
            ttOb.tock(false);
        }
    }
}

public class TickTockMain {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThread mt1 = MyThread.createAndStart("Tick", tt);
        MyThread mt2 = MyThread.createAndStart("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
    }
}
