package Chapter_9;

/*
    Генерирование исключения вручную
 */

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println("До инструкции throw");

            throw new ArithmeticException(); // генерироваие исключения
        }
        catch (ArithmeticException exc) {
            // Перехват исключения
            System.out.println("Исключение перехвачено");
        }

        System.out.println("После блока try/catch");
    }
}
