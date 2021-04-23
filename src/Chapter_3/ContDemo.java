package Chapter_3;

/*
    Применение инсрукции continue
 */

public class ContDemo {
    public static void main(String[] args) {
        int i;

        // Вывод четных чисел в пределах от 0 до 100
        System.out.print("Четные числа от 0 до 100: ");
        for (i = 0; i <= 100; i++) {
            if ((i % 2) != 0) continue; // завершение шага терации цикла
            System.out.print(i + " ");
        }
    }
}
