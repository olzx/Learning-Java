package Chapter_9;

/*
    Использование методов класса Throwable
 */

class ExcTest2 {
    static void genException() {
        int nums[] = new int[4];

        System.out.println("До генерации исключения");

        // Генерирование исключения в связи с
        // выходом индекса за пределы массива
        nums[6] = 10;
        System.out.println("Эта строка не будет отображаться");
    }
}

public class UseThrowableMethods {
    public static void main(String[] args) {
        try {
            ExcTest2.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // Перехват исключения
            System.out.println("Стандартное сообщение: ");
            System.out.println(exc);
            System.out.println("\nСтек вызовов: ");
            exc.printStackTrace();
        }
    }
}
