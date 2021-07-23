package Chapter_14;

// Демонстрация использования ссылок на статические методы.

/*
    Данный класс определяет три статических метода, которые
    проверяют целое число на соответствие определенным условиям
 */
class MyIntPredicates
{
    /*
        Статический метод, который возвращает true,
        если заданное число простое
     */
    static boolean isPrime(int n)
    {
        if (n < 2) return false;

        for (int i = 2; i <= n/i; i++)
            if ((n % i) == 0)
                return false;

        return true;
    }

    /*
        Статический метод, который возвращает true,
        если заданное число четное
     */
    static boolean isEven(int n)
    {
        return (n % 2) == 0;
    }

    /*
        Статический метод, который возвращает true,
        если заданное число положительное
     */
    static boolean isPositive(int n)
    {
        return n > 0;
    }
}

public class MethodRefDemo
{
    /*
        В данном методе типом первого параметра является
        функциональный интерфейс. Следовательно, ему можно передать
        ссылку на любой экземпляр этого интерфейса, в том числе и на
        экземпляр, созданный посредством ссылки на метод.
     */
    static boolean numTest(IntPredicate p, int v)
    {
        return p.test(v);
    }

    public static void main(String[] args)
    {
        boolean result;

        /*
            Здесь методу numTest() передается ссылка
            на метод isPrime()
         */
        result = numTest(MyIntPredicates::isPrime, 17);  // здесь и далее - использование ссылок на статические методы
        if (result)
            System.out.println("17 - простое число");

        /*
            Здесь методу numTest() передается ссылка
            на метод isEven()
         */
        result = numTest(MyIntPredicates::isEven, 12);
        if (result)
            System.out.println("12 - четное число");

        /*
            Здесь методу numTest() передается ссылка
            на метод isPositive()
         */
        result = numTest(MyIntPredicates::isPositive, 11);
        if (result)
            System.out.println("11 - положительное число");
    }
}
