package Chapter_12;

// Использование автораспаковки в инструкции Switch

public class AutoBoxSwitch
{
    public static void main(String[] args)
    {
        Integer iOb = 2;

        /*
            Объект iOb распаковывается,
            и последующей обработке подвергается значение
            типа int, упакованное в этом объекте
         */
        switch (iOb)
        {
            case 1:
                System.out.println("один");
                break;
            case 2:
                System.out.println("два");
                break;
            case 3:
                System.out.println("три");
                break;
        }
    }
}
