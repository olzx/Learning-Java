package Сhapter_2.Questions;

/*
    Вопрос №10
 */

public class PrimeNumbers {
    public static void main(String[] args) {
        int err = 0;

        System.out.print("Простые числа до 100: ");
        for (int b = 2; b <= 100; b++) {
            err = 0;
            for(int a = 2; a*a <= b; a++) {
                if (b % a == 0) {
                    err += 1;
                }
            }
            if (err == 0) {
                System.out.print(" " + b);
            }
        }
    }
}
