package Chapter_13;

/*
    Простой обобщенный класс.
    Здесь Т - это параметр типа, вместо которого
    при создании объекта класса Gen будет подставляться
    реально существующий тип.
 */

// В объявлении этого класса T означает обобщенный тип
class Gen<T>
{
    T ob;  // объявить объект типа Т

    // Передать конструктору ссылку на объект типа Т
    Gen(T o)
    {
       ob = o;
    }

    // Вернуть объект ob из метода
    public T getOb()
    {
        return ob;
    }

    // Отобразить тип T
    void showType()
    {
        System.out.println("Тип Т - это " + ob.getClass().getName());
    }
}

// Демонстрация использования обобщенного класса
public class GenDemo
{
    public static void main(String[] args)
    {
        // Создать обобщенную ссылку на целочисленное значение
        Gen<Integer> iOb;

        /*
            Создать объект типа Gen<Integer> и присвоить ссылку
            на него переменной iOb. Значение 88 автоупаковывается
            в объекте типа Integer.
         */
        iOb = new Gen<Integer>(88);  // создание экземпляра типа Gen<Integer>

        // Отобразить тип данных, используемых в объекте iOb
        iOb.showType();

        /*
            Получить значения из объекта iOb.
            Приведение типов здесь не требуется.
         */
        int v = iOb.getOb();
        System.out.println("Значение v: " + v);
        System.out.println();

        // Создание объекта типа Gen для строк
        Gen<String> strOb = new Gen<String>("Тестирование обобщений");  // создание ссылки и объекта типа Gen<String>

        // Отобразить тип данных, используемых в объекте strOb
        strOb.showType();

        /*
            Получить значение из объекта strOb.
            Приведение типов здесь не требуется.
         */
        String str = strOb.getOb();
        System.out.println("Значение str: " + str);
    }
}