package Chapter_10._2;

/*
    Упражнение 10.2

    Справочная система, использующая дисковый файл
    для хранения информации.
 */

import java.io.*;

/*
    В классе Help открывается файл со справочной информацией,
    выполняется поиск указанной темы, а затем отображается
    справочная информация. Данный класс обрабатывает все исключения,
    освобождая от этого вызывающий код.
 */

class Help {
    String helpfile; // имя файла справки

    Help(String fname) {
        helpfile = fname;
    }

    // Отображение справочной информации по указанной теме
    boolean helpon(String what) {
        int ch;
        String topic, info;

        // открыть справочный файл
        try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile)))
        {
            do {
                // Читать символы до тех пор, пока не встретится символ #
                ch = helpRdr.read();

                if (ch == '#') {
                    topic = helpRdr.readLine();
                    if (what.compareTo(topic) == 0) { // найти тему
                        do {
                            info = helpRdr.readLine();
                            if (info != null) System.out.println(info);
                        } while ((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while (ch != -1);
        }
        catch (IOException exc) {
            System.out.println("Ошибка при попытке доступа к файлу справки: " + exc);
            return false;
        }
        return false; // тема не найдена
    }

    void getTopics() {
        String topic;
        int ch;

        // Открыть справочный файл
        try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile)))
        {
            System.out.println("\nДоступные темы:");
            do {
                // Читать символы до тех пор пока не встретится символ #
                ch = helpRdr.read();
                if (ch == '#') {
                    topic = helpRdr.readLine();
                    System.out.println(" " + topic);
                }
            } while (ch != -1);
            System.out.println();
        } catch (IOException exc) {
            System.out.println("Ошибка при попытке доступа к справки: " + exc);
        }
    }

    // Получение темы справки
    String getSelection() {
        String topic = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Укажите тему: ");
        try {
            topic = br.readLine();
        } catch (IOException exc) {
            System.out.println("Ошибка при чтении из консоли: " + exc);
        }
        return topic;
    }
}

public class FileHelp {
    public static void main(String[] args) {
        Help hlpobj = new Help("helpfile.txt");
        String topic;

        System.out.println("Воспользуйтесь справочной системой.\n" +
                            "Для выхода из системы введите 'stop'.");

        System.out.println("\nДля отображения всех заголовков тем введите 'topics'");

        do {
            topic = hlpobj.getSelection();

            if (topic.compareTo("topics") == 0)
                hlpobj.getTopics();
            else
                if (!hlpobj.helpon(topic))
                    System.out.println("Тема не найдена.\n");
        } while (topic.compareTo("stop") != 0);
    }
}
