package Chapter_10.Questions;

/*
    Вопрос №7.
    Программа для копирования файлов,
    заменяющая пробелы на дефисы.
    Для чтения файла используются байтовые потоки,
    файлы закрываются явным образом через метод close().

    Используйте: java CopyFileSpaceReplace файл1 файл2
 */

import java.io.*;

public class CopyFileSpaceReplace {
    public static void main(String[] args) {
        int i; // хранение читающего символа
        FileInputStream fin = null; // для чтения файла
        FileOutputStream fout = null; // для записи в файл

        // Проверка на передачу программе имен обоих файлов
        if (args.length != 2) {
            System.out.println("Используйте: java CopyFileSpaceReplace файл1 файл2");
            return;
        }

        // Копирование файла
        try {
            // Попытка открыть файлы
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read(); // чтение байтов из первого файла
                if (i != -1) {  // если не конец файла
                    if (i == 32) // если символ = пробел
                        fout.write(45); // записываем в файл дефис (45 код в Unicode)
                    else
                        fout.write(i); // если не пробел, записываем символ как в первом файле
                }
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        } finally {
            // Если файлы открыты (не null) - закрываем
            try {
                if (fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии входного файла");
            }

            try {
                if (fout != null) fout.close();
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии выходного файла");
            }
        }
    }
}
