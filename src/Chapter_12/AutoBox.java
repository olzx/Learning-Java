package Chapter_12;

// Демонстрация автоупаковки и автораспаковки

public class AutoBox
{
    public static void main(String[] args)
    {
        Integer iOb = 100;  // автоупаковка целого числа

        int i = iOb;  // автораспаковка

        System.out.println(i + " и " + iOb);  // отображает 100 и 100
    }
}
