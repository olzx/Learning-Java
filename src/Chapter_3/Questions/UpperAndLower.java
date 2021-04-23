package Chapter_3.Questions;

/*
    Вопрос №10
    Программа для чтения символов с клавиатуры.
     При выводе пребразовывает прописные буквы в строчные, а строчные в прописные.
     Так же подсчитывает кол-во измененых символов при выходе из программы (. - выход).
 */

public class UpperAndLower {
    public static void main(String[] args) throws java.io.IOException {
        int counter = 0;
        char symbol, ignore;

        for (;;) {
            do {
                System.out.print("Введите символ (. - выход): ");
                symbol = (char) System.in.read();

                if (symbol >= 'a' && symbol <= 'z') {
                    System.out.println("Верхний регистр: " + (char) (symbol - 32));
                    counter++;
                } else if (symbol >= 'A' && symbol <= 'Z') {
                    System.out.println("Нижний регистр: " + (char) (symbol + 32));
                    counter++;
                }

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (symbol != '.');

            if (symbol == '.') break;
        }

        if (counter != 0) System.out.println("Кол-во измененных регистров: " + counter);
    }
}
