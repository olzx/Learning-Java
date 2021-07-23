package Chapter_14._1;

// Использование лямбда-выражения в качестве аргумента метода.

public class LambdaArgumentDemo
{
    /*
        В данном методе типом первого параметра является
        функциональный интерфейс. Следовательно, ему можно передать
        ссылку на любой экземпляр этого интерфейса, в том числе и на
        экземпляр, созданный посредством лямбда-выражения. С помощью
        второго параметра задается строка, подлежащая обработке.
     */
    public static String changeStr(StringFunc sf, String s)
    {
        return sf.func(s);
    }

    public static void main(String[] args)
    {
        String inStr = "Лямбда-выражения расширяют Java";
        String outStr;

        System.out.println("Входная строка: " + inStr);

        /*
            Лямбда-выражение, распологающее содержимое
            строки в обратном порядке, и присвоенное переменной,
            ссылающейся на экземпляр StringFunc
         */
        StringFunc reverse = (str) ->
        {
            String result = "";
            for (int i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };

        /*
            Передача лямбда-выражения reverse методу changeStr()
            в качестве первого аргумента. Передача входной строки
            в качестве второго аргумента.
         */
        outStr = changeStr(reverse, inStr);
        System.out.println("Обращенная строка: " + outStr);

        /*
            Данное лямбда-выражение заменяет пробелы дефисами.
            Оно внедряется непосредственно в вызов метода changeStr().
         */
        outStr = changeStr(str -> str.replace(' ', '-'), inStr);
        System.out.println("Строка с замененными пробелами: " + outStr);

        /*
            Данное блочное лямбда-выражение обращает регистр
            букв в строке. Оно также внедряется непосредственно
            в вызов метода changeStr().
         */
        outStr = changeStr((str) ->
        {
            String result = "";
            char ch;

            for(int i = 0; i < str.length(); i++)
            {
                ch = str.charAt(i);
                if (Character.isUpperCase(ch))
                    result += Character.toLowerCase(ch);
                else
                    result += Character.toUpperCase(ch);
            }

            return result;
        }, inStr);
        System.out.println("Строка с обращенным регистром букв: " + outStr);
    }
}
