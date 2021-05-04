package Chapter_10;

/*
    Версия программы, в которой используется инструкция try с ресурсами.
    В ней демонстрируется управление двумя ресурсами
    (в данном случае - файлами) с помощью единственной инструкции try.
 */

import java.io.*;

public class CopyFileAutoClose {
    public static void main(String[] args) {
        int i;

        // Прежде всего необходимо убедиться в том,
        // что программе передаются оба имени файла
        if (args.length != 2) {
            System.out.println("Используйте: CopyFileAutoClose файл_источник файл_назначения");
            return;
        }

        // Открытие двух файлов и управление
        // ими с помощью инструкции try
        try (FileInputStream fin = new FileInputStream(args[0]);    // Управление двумя ресурсами
             FileOutputStream fout = new FileOutputStream(args[1]))
        {
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}
