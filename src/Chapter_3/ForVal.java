package Chapter_3;

/*
    Объявление переменной цикла в самом цикле for
 */

public class ForVal {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        // Вычисление факториала чисел от 1 до 5
        for(int i = 1; i <= 5; i++) {
            sum += i;
            fact *= i;
        }

        System.out.println("Сумма: " + sum);
        System.out.println("Факториал: " + fact);
    }
}
