package Chapter_14;

// Демонстрация двух простых лямбда-выражений.

// Функциональный интерфейс
interface MyValue
{
    double getValue();
}

// Еще один функциональный интерфейс
interface MyParamValue
{
    double getValue(double v);
}

public class LambdaDemo
{
    public static void main(String[] args)
    {
        MyValue myVal;  // объявление ссылки на интерфейс

        /*
            Здесь лямбда-выражение - это просто константа.
            При его назначении переменной myVal создается
            экземпляр класса, в котором лямбда-выражение
            реализует метод getValue() интерфейса MyValue.
         */
        myVal = () -> 98.6;  // простое лямбда-выражение

        // Вызвать метод getValue(), предоставляемый ранее
        // назначенным лямбда-выражением
        System.out.println("Постоянное значение: " + myVal.getValue());

        /*
            Создать параметризованное лямбда-выражение и
            назначить его ссылке на экземпляр MyParamValue.
            Это лямбда-выражение возвращает обратную величину
            своего аргумента.
         */
        MyParamValue myPval = (n) -> 1.0 / n;  // лямбда-выражение с параметром

        // Вызвать метод getValue(n) посредством ссылки myPval.
        System.out.println("Обратная величина 4 равна: " + myPval.getValue(4));
        System.out.println("Обратная величина 8 равна: " + myPval.getValue(8));

        /*
            Лямбда-выражение должно быть совместимо с методом,
            который определяется функциональным интерфейсом. Поэтому
            приведенные ниже два фрагмента кода не будут работать.
         */
        // myVal = () -> "hello";         // Ошибка: тип String не совместим с типом double!
        // myPval = () -> Math.random();  // Ошибка: требуется параметр!
    }
}