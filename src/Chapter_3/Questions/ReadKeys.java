package Chapter_3.Questions;

/*
    Вопрос №1
 */

public class ReadKeys {
    public static void main(String[] args) throws java.io.IOException {
        int counter = 0;
        char symbol, ignore;

        for(;;) {
            do {
                System.out.print("Введите символ (. - выход): ");
                symbol = (char) System.in.read();

                if (symbol == ' ') counter++;

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (symbol != '.');

            if (symbol == '.') break;
        }
        System.out.println("Вы вышли из программы.");
        if (counter != 0) System.out.println("Кол-во пробелов: " + counter);
    }
}
