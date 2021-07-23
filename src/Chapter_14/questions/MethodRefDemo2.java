package Chapter_14.questions;

/*
    Вопрос №16.

    Добавление метода hasCommonFactor возвращающий true,
    если его аргумент типа int и значение,
    которое хранится в вызывающем объекте MyIntNum,
    имеют по крайней мере один общий делитель.
 */

import Chapter_14.IntPredicate;

/*
    Данный класс хранит значение типа int и определяет метод
    isFactor(), который возвращает значение true, если его
    аргумент является делителем числа, хранящегося в классе.
 */
class MyIntNum
{
    private int v;

    MyIntNum(int x)
    {
        v = x;
    }

    int getNum()
    {
        return v;
    }

    // Вернуть true, если n - делитель v
    boolean isFactor(int n)
    {
        return (v % n) == 0;
    }

    boolean hasCommonFactor(int n)
    {
        for (int i = 2; i < n; i++)
        {
            if (((n % i) == 0) && ((v % i) == 0))
                return true;
        }
        return false;
    }
}

public class MethodRefDemo2
{
    public static void main(String[] args)
    {
        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);
        MyIntNum myNum3 = new MyIntNum(25);

        // Создать ссылку ip на метод isFactor объекта myNum
        IntPredicate ip = myNum::isFactor;  // ссылка на метод экземпляра

        /*
            Использовать ссылку для вызова метода isFactor()
            через метод test()
         */

        result = ip.test(3);
        if (result)
            System.out.println("3 является делителем " + myNum.getNum());

        /*
            Создать ссылку на метод isFactor для объекта myNum2
            и использовать ее для вызова метода isFactor()
            через метод test()
         */
        ip = myNum2::isFactor;
        result = ip.test(3);
        if (!result)
            System.out.println("3 не является делителем " + myNum2.getNum());

        ip = myNum3::hasCommonFactor;
        result = ip.test(50);
        if (result)
            System.out.println("У 50 есть общий делитель с числом " + myNum3.getNum());
    }
}
