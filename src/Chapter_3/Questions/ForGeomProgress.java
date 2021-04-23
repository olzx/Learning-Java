package Chapter_3.Questions;

/*
    Вопрос №9
 */

public class ForGeomProgress {
    public static void main(String[] args) {
        // Цикл for выводящий значения в геометрической прогрессии
        for (int i = 1; i < 1000; i *= 2) {
            System.out.print(i + " ");
        }
    }
}
