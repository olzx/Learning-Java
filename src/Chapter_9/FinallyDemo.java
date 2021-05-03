package Chapter_9;

/*
    Использование блока finally
 */

class UseFinally {
    public static void genException(int what) {
        int t;
        int nums[] = new int[2];

        System.out.println("Получено: " + what);
        try {
            switch (what) {
                case 0:
                    // Сгенерировать ошибку деления на нуль
                    t = 10 / what;
                    break;
                case 1:
                    // Сгенерировать ошибку обращения к массиву
                    nums[4] = what;
                    break;
                case 2:
                    // Возврат из блока try
                    return;
            }
        }
        catch (ArithmeticException exc) {
            // Перехват исключения
            System.out.println("Попытка деления на нуль");
            return; // возврат из блока catch
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // Перехват исключения
            System.out.println("Соответсвующий элемент не найден");
        }
        /*
            Этот блок (finally) выполняется независимо от того,
            каким образом завершается блок try/catch
         */
        finally {
            System.out.println("Выход из блока try");
        }
    }
}

public class FinallyDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
}
