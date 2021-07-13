package Chapter_12.questions;

/*
    Вопрос №3

    Используя метод values() отобразить список констант и их значений
 */

public class ShowEnum
{
    enum Tools
    {
        SCREWDRIVER, WRENCH, HAMMER, PLIERS
    }

    public static void main(String[] args)
    {
        System.out.println("Список констант из перечисления Tools:");
        for(Tools t : Tools.values())
            System.out.println("  " + t);
    }
}
