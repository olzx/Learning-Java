package Chapter_10;

/*
    Отображение текстового файла.

    При вызове этой программы следует указать имя файла,
    содержимое которого требуется открыть.
 */

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        // Сначала нужно убедиться в том, что программе
        // передается имя файла
        if (args.length != 1) {
            System.out.println("Использование ShowFile имя_файла");
            return;
        }

        try {
            fin = new FileInputStream(args[0]); // открытие файла

            // Чтение байтов, пока не встретится символ EOF (конца строки)
            do {
                i = fin.read(); // считывание данных из файла
                if (i != -1) System.out.print((char) i);
            } while (i != -1);  // если i = -1 значит, достигнут конец строки
            System.out.println();

        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        } finally {
            // Файл закрывается в любом случае
            try {
                if (fin != null) fin.close(); // закрыть файл, если значение fin != null
                System.out.println("Файл был успешно закрыт.");
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии файла");
            }
        }
    }
}
