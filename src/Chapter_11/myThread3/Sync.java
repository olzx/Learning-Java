package Chapter_11.myThread3;

/*
    Использование ключевого слова synchronize для
    управления доступом
 */

// Использование синхронизированного блока
// для управления доступом к SumArray
class SumArray {
    private int sum;

    // Метод sumArray не синхронизирован
    int sumArray(int nums[]) {
        sum = 0; // обнуление суммы

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Текущее значение суммы для " + Thread.currentThread().getName() +
                                " будет " + sum);
            try {
                Thread.sleep(10); // разрешение переключения между задачами
            } catch (InterruptedException exc) {
                System.out.println("Поток прерван.");
            }
        }
        return sum;
    }
}

class MyThread implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    // Конструктор нового потока
    MyThread(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
    }

    // Создание и запуск потока с помощью фабричного метода
    public static MyThread createAndStart(String name, int nums[]) {
        MyThread myThrd = new MyThread(name, nums);

        myThrd.thrd.start(); // запуск потока
        return myThrd;
    }

    // Точка входа для потока
    public void run() {
        int sum;

        System.out.println(thrd.getName() + " - запуск.");

        // Синхронизация вызовов sumArray()
        synchronized (sa) {
            answer = sa.sumArray(a);
        }

        System.out.println("Сумма для " + thrd.getName() + " будет " + answer);

        System.out.println(thrd.getName() + " - завершение.");
    }
}

public class Sync {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        MyThread mt1 = MyThread.createAndStart("Порожденный поток №1", a);
        MyThread mt2 = MyThread.createAndStart("Порожденный поток №2", a);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока.");
        }
    }
}
