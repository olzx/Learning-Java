package Chapter_12;

// Упаковка и распаковка значений вручную

public class Wrap
{
    public static void main(String[] args)
    {
        Integer iOb = new Integer(100);  // ручная упаковка значения 100

        int i = iOb.intValue();  // ручная распаковка значения в iOb

        System.out.println(i + " и " + iOb);
    }
}
