package Chapter_10;

/*
    Пример простой утилиты для чтения данных с диска и вывода их
    на экран, демонстрирующий использование класса FileReader.
 */

import java.io.*;

public class DtoS {
    public static void main(String[] args) {
        String s;

        // Создать и использовать объект FileReader, помещенный
        // в оболочку на основе класса BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader("write.txt")))
        {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
