package Chapter_14.questions;

/*
    Вопрос № 9.

    Лямбда-выражение удаляющее все пробелы из заданной строки
    и возвращающее результат.
 */

import Chapter_14._1.LambdaArgumentDemo;
import Chapter_14._1.StringFunc;

public class SpacesDel
{
    public static void main(String[] args)
    {
        StringFunc spacesDel = (n) -> n.replace(" ", "");

        String result = LambdaArgumentDemo.changeStr(spacesDel, "Hello - World - And - Java!");

        System.out.println(result);
    }
}
