package Chapter_9;

/*
    Использование средства группового перехвата исключений.
    Примечание: для компиляции этого кода требуется JDK 7 или выше.
 */

public class MultiCatch {
    public static void main(String[] args) {
        int a = 88, b = 0;
        int result;
        char chrs[] = { 'A', 'B', 'C' };

        for(int i = 0; i < 2; i++) {
            try {
                if (i == 0)
                    // Генерирование исключения ArithmeticException
                    result = a / b;
                else
                    // Генерирование исключения ArrayIndexOutOfBoundsException
                    chrs[5] = 'X';
            }
            catch (ArithmeticException | ArrayIndexOutOfBoundsException exc) {
                System.out.println("Перехваченное исключение: " + exc);
            }
        }

        System.out.println("После группового перехватчика исключений");
    }
}
