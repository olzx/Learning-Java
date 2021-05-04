package Chapter_10;

/*
    Копирование текстового файла.
    При вызове этой программы следует указать имена исходного и целевого файлов.
    Например, для копирования файла FIRST.TXT в файл SECOND.TXT в командной строке
    нужно ввести следующую команду:
    java CopyFile FIRST.TXT SECOND.TXT
 */

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // Сначало нужно убедиться в том, что программе
        // передаются имена обоих файлов
        if (args.length != 2) {
            System.out.println("Используйте: java CopyFile источник.TXT назначение.TXT");
            return;
        }

        // Копирование файла
        try {
            // Попытка открытия фалов
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();             // чтение байтов из одного файла
                if (i != -1) fout.write(i); // и запись их в другой файл
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        } finally {
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
