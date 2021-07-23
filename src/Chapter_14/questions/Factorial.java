package Chapter_14.questions;

/*
    Вопрос №7

    Блочное лямбда-выражение для вычисления факториала целого числа.
    В качестве интерфейса используется NumericFunc.
 */

import Chapter_14.NumericFunc;

public class Factorial
{
    public static void main(String[] args)
    {
        int answer;

        NumericFunc factorialInt = (n) -> {
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
