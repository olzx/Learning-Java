package Chapter_10;

/*
    Использование класса BufferedReader
    для чтения символов с консоли
 */

import java.io.*;

public class ReadChars {
    public static void main(String[] args) throws IOException {
        char c;
        // Создание класса BufferedRead, связанного с потоком System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите символы. Окончание ввода - символ точки.");

        // Считывание символов
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != '.');
    }
}
