package Chapter_9;

/*
    В инструкция catch исключения подкласса должны
    предшествовать исключениям суперкласса
 */

public class ExcDemo5 {
    public static void main(String[] args) {
        int numer[] = { 4, 8, 16, 32, 64 ,128, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        for(int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " +
                        denom[i] + " = " +
                        (numer[i] / denom[i]));
            }
            catch (ArithmeticException exc) {   // перехват подкласса
                // Перехват исключения
                System.out.println("Попытка деления на нуль!");
            }
            catch (Throwable exc) { // перехват суперкласса
                System.out.println("Возникло исключение!");
            }
        }
    }
}
