package Сhapter_2.Questions;

/*
    Вопрос №7
 */

public class PreventZero {
    public static void main(String[] args) {
        int a, b;

        a = 6;
        b = 0;
        if (b != 0 && (a % b) == 0) {
            System.out.println("a делится на b без остатка");
        }
    }
}
