package Chapter_5.Questions;

/*
    Вопрос №4

    Алгоритма пузырьковой сортировки строк
 */

public class BubbleString {
    public static void main(String[] args) {
        String words[] = {"Привет", "Тест", "Как дела", "Проверка", "Раз", "Два", "Пять", "Десять", "Java", "Hello World"};
        String t;

        // Отображение исходного массива
        System.out.print("Исходный массив: ");
        for(String s : words)
            System.out.print(s + " ");
        System.out.println();

        // Реализация агоритма пузырьковой сортировки
        for(int a = 1; a < words.length; a++) {
            for(int b = words.length - 1; b >= a; b--) {
                if(words[b-1].length() > words[b].length()) {
                    /*
                        Если требуемый порядок
                        следования не соблюдается,
                        поменять элементы местами
                     */
                    t = words[b-1];
                    words[b-1] = words[b];
                    words[b] = t;
                }
            }
        }

        // Отображение отсортированного массива
        System.out.print("Отсортированный массив: ");
        for(String s : words)
            System.out.print(s + "[" + s.length() + "]" + " ");
    }
}
