package Chapter_10;

/*
    Демонстрация произвольного доступа к файлам
 */

import java.io.*;

public class RandomAccessDemo {
    public static void main(String[] args) {
        double data[] = { 12.3, 5.3, 312.2, 75.3, 89.2, 54.2, 14.9, 31.7, 10.1 };
        double d;

        // Открыть и использовать файл с произвольным доступом
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw"))
        {
            // Запись значения в файл
            for (double i : data)
                raf.writeDouble(i);

            // Считывание отдельных значений из файла
            raf.seek(0);    // найти первое значение типа double
                                // установка указателя на файл с помощью метода seek()
            d = raf.readDouble();
            System.out.println("Первое значение: " + d);

            raf.seek(8);    // найти второе значение типа double
            d = raf.readDouble();
            System.out.println("Второе значение: " + d);

            raf.seek(8 * 3);    // найти четвертое значение типа double
            d = raf.readDouble();
            System.out.println("Четвертое значение: " + d);

            System.out.println();

            // Прочитать значения через одно
            System.out.println("Чтение значений с нечетными порядковыми номерами: ");
            for (int i = 0; i < data.length; i += 2) {
                raf.seek(8 * i); // найти i-e значение типа double
                d = raf.readDouble();
                System.out.print(d + " ");
            }
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
