package FirstProgram.Questions;

/*
    Вопрос № 10

    Программа для отображения таблицы перевода дюймов в метры.
 */

public class InchToMetre {
    public static void main(String[] args) {
        double inch, metre;
        int counter;

        counter = 0;
        for (inch = 1; inch <= 100; inch++) {
            metre = inch * 0.0254; // преобразование в метры
            System.out.println(inch + " дюймов соответствует " + metre + " метров.");

            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
