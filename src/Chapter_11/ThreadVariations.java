package Chapter_11;

/*
    Изменения класса MyThread. Эта версия класса MyThread
    создает объект Thread путем вызова его конструктора
    и сохранения в переменной экземпляра thrd.
    Также присваивается имя потоку и используется
    фабричный метод для создания и запуска потока.
 */

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
