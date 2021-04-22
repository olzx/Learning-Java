package Chapter_3;

/*
    Демонстрация использования цикла while
 */

public class WhileDemo {
    public static void main(String[] args) {
        char ch;

        // Вывод букв английского алфавита, используя цикл while
        ch = 'a';
        while (ch <= 'z') {
            System.out.print(ch + " ");
            ch++;
        }
    }
}
