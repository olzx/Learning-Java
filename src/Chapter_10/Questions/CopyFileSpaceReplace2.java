package Chapter_10.Questions;

/*
    Вопрос №8.
    Программа для копирования файлов,
    заменяющая пробелы на дефисы.
    Для чтения файла используются символьные потоки,
    Используется try с ресурсами, поэтому файлы
    закрываются автоматически.

    Используйте: java CopyFileSpaceReplace файл1 файл2
 */

import java.io.*;

public class CopyFileSpaceReplace2 {
    public static void main(String[] args) {
        int i;

        // Проверка на передачу программе имен обоих файлов
        if (args.length != 2) {
            System.out.println("Используйте: java CopyFileSpaceReplace2 файл1 файл2");
            return;
        }

        // Копирование файла
        try (FileReader fr = new FileReader(args[0]);
             FileWriter fw = new FileWriter(args[1]))
        {
            do {
                i = fr.read(); // чтение байтов из первого файла
                if (i != -1) {  // если не конец файла
                    if (i == 32) // если символ = пробел
                        fw.write(45); // записываем в файл дефис (45 код в Unicode)
                    else
                        fw.write(i); // если не пробел, записываем символ как в первом файле
                }
            } while (i != -1);
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
