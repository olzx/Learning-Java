package Chapter_10;

/*
    В этой версии программы инструкция try с ресурсами
    применяется для автоматического закрытия файла, когда в нем
    больше нет необходимости.
 */

import java.io.*;

public class ShowFileAutoClose {
    public static void main(String[] args) {
        int i;

        // Прежде всего необходимо убедиться в том,
        // что программе передается имя файла
        if (args.length != 1) {
            System.out.println("Используйте: ShowFileAutoClose имя_файла");
            return;
        }

        // Использование инструкции try с ресурсами для
        // открытия файла с последующим его закрытием после
        // того, как будет покинут блок try
        try (FileInputStream fin = new FileInputStream(args[0])) { // блок try с ресурсами
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
