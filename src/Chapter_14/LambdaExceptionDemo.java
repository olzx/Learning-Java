package Chapter_14;

import java.io.IOException;
import java.io.Reader;

interface MyIOAction
{
    boolean ioAction(Reader rdr) throws IOException;
}

public class LambdaExceptionDemo
{
    public static void main(String[] args)
    {
        /*
            Данное блочное лямбда-выражение может генерировать
            исключение IOException. Следовательно, это исключение
            должно быть указано в спецификации throws метода
            ioAction() функционального интерфейса MyIOAction.
         */
        MyIOAction myIO = (rdr) ->  // это лямбда-выражение может генерировать исключение
        {
            int ch = rdr.read();  // может генерировать исключение IOException

            // ...
            return true;
        };
    }
}
