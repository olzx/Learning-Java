package Chapter_13;

// Использование шаблона аргумента
class NumericFnsUpd<T extends Number>
{
    T num;

    // Передать конструктору ссылку на числовой объект
    NumericFnsUpd(T n)
    {
        num = n;
    }

    // Вернуть обратную величину
    double reciprocal()
    {
        return 1 / num.doubleValue();
    }

    // Вернуть дробную часть
    double fraction()
    {
        return num.doubleValue() - num.intValue();
    }

    // Проверить равенство абсолютных значений двух объектов
    boolean absEqual(NumericFnsUpd<?> ob)
    {
        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
            return true;
        else
            return false;
    }
}

// Демонстрация использования шаблона аргумента
public class WildcardDemo
{
    public static void main(String[] args)
    {
        NumericFnsUpd<Integer> iOb = new NumericFnsUpd<Integer>(6);
        NumericFnsUpd<Double> dOb = new NumericFnsUpd<Double>(-6.0);
        NumericFnsUpd<Long> lOb = new NumericFnsUpd<Long>(5L);

        System.out.println("Сравнение iOb и dOb:");
        if (iOb.absEqual(dOb))  // в этом вызове метода тип аргумента шаблона совпадает с типом Double
            System.out.println("Абсолютные значения совпадают.");
        else
            System.out.println("Абсолютные значения отличаются.");

        System.out.println();

        System.out.println("Сравнение iOb и lOb.");
        if (iOb.absEqual(lOb))  // в этом вызове метода тип аргумента шаблона совпадает с типом Long
            System.out.println("Абсолютные значения совпадают.");
        else
            System.out.println("Абсолютные значения отличаются.");
    }
}
