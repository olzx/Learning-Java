package Chapter_10;

/*
    Запись и чтение двоичных данных
 */

import java.io.*;

public class RWData {
    public static void main(String[] args) {
        int i = 10;
        double d = 1023.56;
        boolean b = true;

        // Запись ряда значений
        try (DataOutputStream dataOut =
                new DataOutputStream(new FileOutputStream("testdata")))
        {
            System.out.println("Записано: " + i);
            dataOut.writeInt(i);    // запись двоичных данных

            System.out.println("Записано: " + d);
            dataOut.writeDouble(d); // запись двоичных данных

            System.out.println("Записано: " + b);
            dataOut.writeBoolean(b);    // запись двоичных данных

            System.out.println("Записано: " + 12.2 * 7.4);
            dataOut.writeDouble(12.2 * 7.4); // запись двоичных данных
        } catch (IOException exc) {
            System.out.println("Ошибка при записи");
        }

        System.out.println();

        // А теперь прочитать записанные значения
        try (DataInputStream dataIn =
                new DataInputStream(new FileInputStream("testdata")))
        {
            i = dataIn.readInt();   // считывание двоичных данных
            System.out.println("Прочитано: " + i);

            d = dataIn.readDouble();    // считывание двоичных данных
            System.out.println("Прочитано: " + d);

            b = dataIn.readBoolean();   // считывание двоичных данных
            System.out.println("Прочитано: " + b);

            d = dataIn.readDouble();    // считывание двоичных данных
            System.out.println("Прочитано: " + d);
        } catch (IOException exc) {
            System.out.println("Ошибка при чтении");
        }
    }
}
