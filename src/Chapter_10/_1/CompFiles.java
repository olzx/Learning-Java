package Chapter_10._1;

/*
    Упражнение 10.1

    Сравнение двух файлов.

    Если содержимое не совпадает, выводится номер строки,
    и номер символа который не совпал.

    При вызове этой программы следует указать имена
    сравниваемых файлов. Например, чтобы сравнить файл
    FIRST.TXT с файлом SECOND.TXT, в командной строке
    нужно ввести следующую команду:
    java CompFiles FIRST.TXT SECOND.TXT
 */

import java.io.*;

public class CompFiles {
    public static void main(String[] args) {
        int i = 0, j = 0;

        int lineBreak = 1;
        int charNum = 1;

        // Прежде всего необходимо убедиться в том, что программе
        // передаются имена обоих файлов
        if (args.length != 2) {
            System.out.println("Использование: CompFiles файл1 файл2");
            return;
        }

        // Сравнение файлов
        try (FileInputStream f1 = new FileInputStream(args[0]);
             FileInputStream f2 = new FileInputStream(args[1]))
        {
            // Проверка содержимого каждого файла
            do {
                i = f1.read();
                j = f2.read();

                if (i != j) {
                    break;
                }

                if ((char) i == '\n') {
                    lineBreak++;
                    charNum = 1;
                } else
                    charNum++;

            } while (i != -1 && j != -1);

            if (i != j)
                System.out.print("Содержимое файлов отличается в строке: " + lineBreak +
                                ", позиция символа: " + charNum);
            else
                System.out.println("Содержимое файлов совпадает.");

        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
