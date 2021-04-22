package Сhapter_2;

/*
    Неожиданный результат повышения типов!
 */

public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b;  // приведение типов не требуется,
                    // так как тип уже повышен до int (при вычислении выражения)

        b = 10;
        b = (byte) (b * b); // нужно приведения типов, т.к. результат (b * b) повышается до int

        System.out.println("i и b: " + i + " " + b);

        char ch1, ch2;

        ch1 = 'a';
        ch2 = 'b';

        ch1 = (char) (ch1 + ch2); // требуется приведение типов,
                                  // поскольку операнды ch1 и ch2 в выражении повышаются до типа int

        System.out.println("ch1: " + ch1); // Ã
    }
}
