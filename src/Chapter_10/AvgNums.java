package Chapter_10;

/*
    Данная программа находит среднее арифметическое для
    ряда чисел, введенных пользователем с клавиатуры.
 */

import java.io.*;

public class AvgNums {
    public static void main(String[] args) throws IOException {
        // Создание объекта типа BufferedReader,
        // использующего поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum = 0.0;
        double avg, t;

        System.out.print("Сколько чисел нужно ввести: ");
        str = br.readLine();

        try {
            n = Integer.parseInt(str); // преобразование строки в тип int
        } catch (NumberFormatException exc) {
            System.out.println("Неверный формат");
            n = 0;
        }

        System.out.println("Ввод " + n + " значений:");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + (i+1) + "]" + ": ");
            str = br.readLine();
            try {
                t = Double.parseDouble(str); // преобразование строки в тип double
            } catch (NumberFormatException exc) {
                System.out.println("Неверный формат");
                t = 0.0;
            }
            sum += t;
        }
        avg = sum / n;
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее значение: " + avg);
    }
}
