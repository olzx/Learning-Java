package Chapter_6.Questions;

/*
    Вопрос №6

    Реализация рекурсивного метода revers, который отображает строку задом наперед
 */

public class ReverseString {
    public static void reverse(String s, int index) {
        if (index == 0) {
            System.out.println(s.charAt(index));
            return;
        }

        System.out.print(s.charAt(index));
        reverse(s, index - 1);
    }

    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println("Исходная строка: " + str);

        System.out.print("Перевернутая строка: ");
        reverse(str, str.length() - 1);
    }
}
