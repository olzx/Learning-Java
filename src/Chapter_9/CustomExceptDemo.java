package Chapter_9;

/*
    Использование специально создаваемого исключения
 */

// Создание исключения
class NonIntResultException extends Exception {
    int n, d;

    NonIntResultException(int a, int b) {
        n = a;
        d = b;
    }

    public String toString() {
        return "Результат операции " + n + " / " + d + " не является целым числом";
    }
}

public class CustomExceptDemo {
    public static void main(String[] args) {

        // В массиве numer содержатся нечетные сисла
        int numer[] = { 4, 8, 15, 32, 64 ,127, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        for (int i = 0; i < numer.length; i++) {
            try {
                if (numer[i] % 2 != 0)
                    throw new NonIntResultException(numer[i], denom[i]);

                System.out.println(numer[i] + " / " +
                        denom[i] + " = " +
                        (numer[i] / denom[i]));
            }
            catch (ArithmeticException exc) {
                // Перехват исключения
                System.out.println("Попытка деления на нуль");
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                // Перехват исключения
                System.out.println("Соответсвующий элемент не найден");
            }
            catch (NonIntResultException exc) {
                System.out.println(exc);
            }
        }
    }
}
