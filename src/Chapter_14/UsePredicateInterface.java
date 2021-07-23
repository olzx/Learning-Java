package Chapter_14;

// Использование встроенного функционального интерфейса Predicate.

// Импортировать интерфейсы Predicate
import java.util.function.Predicate;

public class UsePredicateInterface
{
    public static void main(String[] args)
    {
        /*
            Данное лямбда-выражение использует интерфейс
            Predicate<Integer> для определения того, четно ли
            заданное число
         */
        Predicate<Integer> isEven = (n) -> (n % 2) ==0;  // использование встроенного интерфейса Predicate

        if (isEven.test(4))
            System.out.println("4 - четное число");

        if (!isEven.test(5))
            System.out.println("5 - не четное число");
    }
}
