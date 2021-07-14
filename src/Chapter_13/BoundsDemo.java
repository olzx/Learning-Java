package Chapter_13;

/*
    В этой версии класса NumericFns аргументом типа,
    заменяющим параметр типа T, должен стать класс Number
    или производный от него подкласс, как показано ниже
 */
class NumericFns<T extends Number>
{
    T num;

    // Передать конструктору ссылку на числовой объект
    NumericFns(T n)
    {
        num = n;
    }

    // Вернуть обратную велечину
    double reciprocal()
    {
        return 1 / num.doubleValue();
    }

    // Вернуть дробную часть
    double fraction()
    {
        return num.doubleValue() - num.intValue();
    }
}

// Демонстрация класса NumericFns
public class BoundsDemo
{
    public static void main(String[] args)
    {
        NumericFns<Integer> iOb = new NumericFns<Integer>(5);  // допустимо, т.к. Integer является подклассом Number

        System.out.println("Обратная величина iOb - " + iOb.reciprocal());
        System.out.println("Дробная часть iob - " + iOb.fraction());

        System.out.println();

        // Применение класса Double также допустимо
        NumericFns<Double> dOb = new NumericFns<Double>(5.25);

        System.out.println("Обратная величина dOb - " + dOb.reciprocal());
        System.out.println("Дробная часть dOb - " + dOb.fraction());

        /*
            Следующая строка кода не будет компилироваться, так как
            класс String не является производным от класса Number.
         */
        // NumericFns<String> strOb = new NumericFns<String>("Ошибка");
    }
}
