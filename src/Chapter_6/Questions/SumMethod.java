package Chapter_6.Questions;

/*
    Вопрос №13

    Реализация метода sum() принимающий список аргументов переменной длины типа int,
     и предназначенный для суммирования передаваемых ему значений.
    Метод возвращает результат суммирования.
 */

public class SumMethod {
    public static int sum(int ...v) {
        int sum = 0;

        for(int i : v)
            sum += i;

        return sum;
    }

    public static void main(String[] args) {
        int result = sum(5, 10, 30, 100);

        System.out.println("Результат суммирования: " + result);
    }
}
