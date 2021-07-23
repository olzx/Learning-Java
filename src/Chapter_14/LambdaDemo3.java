package Chapter_14;

// Функциональный интерфейс, тестирующий две строки
interface StringTest
{
    boolean test(String aStr, String bStr);
}

public class LambdaDemo3
{
    public static void main(String[] args)
    {
        /*
            Данное лямбда-выражение определяет,
            является ли одна строка частью другой
         */
        StringTest isIn = (a, b) -> a.contains(b);

        String str = "Это тест";

        System.out.println("Тестируемая строка: " + str);

        if (isIn.test(str, "Это"))
            System.out.println("'Это' найдено");
        else
            System.out.println("'Это' не найдено");

        if (isIn.test(str, "xyz"))
            System.out.println("'xyz' найдено");
        else
            System.out.println("'xyz' не найдено");
    }
}
