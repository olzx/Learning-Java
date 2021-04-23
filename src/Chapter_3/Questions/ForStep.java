package Chapter_3.Questions;

/*
    Вопрос №4
 */

public class ForStep {
    public static void main(String[] args) {
        // Цикл for от 1000 до 0 с шагом 2
        for (int i = 1000; i >= 0; i = i - 2)
            System.out.print(i + " ");
    }
}
