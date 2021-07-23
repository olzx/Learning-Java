package Chapter_14.questions;

/*
    Вопрос №8

    Реализация обобщенного функционального интерфейса MyFunc<T>,
    на примере создания лямбда-выражения вычисляющее факториал.
 */

import Chapter_14.NumericFunc;

interface MyFunc<T>
{
    T func(T n);
}

public class GenericFactorial
{
    public static void main(String[] args)
    {
        int answer;

        MyFunc<Integer> factorialInt = (n) -> {
            int result = 1;

            for(int i = 1; i <= n; i++)
                result *= i;

            return result;
        };

        for (int i = 0; i <= 10; i ++)
        {
            answer = factorialInt.func(i);
            System.out.println("Факториал " + i + " = " + answer);
        }
    }
}
