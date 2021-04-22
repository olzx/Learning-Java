package Chapter_3;

/*
    Игра в угадывание букв, третья версия
 */

public class Guess3 {
    public static void main(String[] args) throws java.io.IOException {
        char ch, answer = 'K';

        System.out.println("Задумана буква из диапазона A-Z");
        System.out.print("Попытайтесь её угадать: ");

        ch = (char) System.in.read();

        if (ch == answer) System.out.println("*** Правильно! ***");
        else {
            System.out.print("...Извините, но вы не угадали =( Нужная буква находится ");

            if (ch < answer) System.out.print("ближе к концу алфавита.");
            else System.out.print("ближе к началу алфавита.");
        }
    }
}
