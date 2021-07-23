package Chapter_14.questions;

/*
    Вопрос №5

    Реализация интерфейса IntInRange принимающий любое значение типа int,
    и возвращающее boolean в случае если передаваемое число в диапазоне от 10 до 20.
 */

interface IntInRange
{
    boolean num(int n);
}

public class Range
{
    public static void main(String[] args)
    {
        IntInRange range = (n) -> (n >= 10) && (n <= 20);

        if (range.num(15))
            System.out.println("15 - в диапазоне от 10 до 20");

        if (!range.num(21))
            System.out.println("21 не в диапазоне от 10 до 20");
    }
}
