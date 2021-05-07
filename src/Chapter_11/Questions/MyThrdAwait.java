package Chapter_11.Questions;

/*
    Вопрос №4

    Ожидание завершения потока с помощью метода join().
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

public class MyThrdAwait {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        Thread thr = new Thread(new MyThread("Поток №1"));

        thr.start();

        thr.setPriority(Thread.NORM_PRIORITY + 3);
        System.out.println("Приоритет потока " + thr.getName() + ": " + thr.getPriority());

        try {
            thr.join();

            System.out.println("Поток - завершен.");
        } catch (InterruptedException exc) {
            System.out.println("Остановка основного потока.");
        }
    }
}
