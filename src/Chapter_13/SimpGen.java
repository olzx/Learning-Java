package Chapter_13;

// Простой обобщенный класс с двумя параметрами типа: T и V
class TwoGen<T, V>
{
    T ob1;
    V ob2;

    // Передать конструктору класса ссылки на объекты типов T и V
    TwoGen(T o1, V o2)
    {
        ob1 = o1;
        ob2 = o2;
    }

    // Отобразить типы T и V
    void showTypes()
    {
        System.out.println("Тип T - это " + ob1.getClass().getName());
        System.out.println("Тип V - это " + ob2.getClass().getName());
    }

    // Сравнение на совпадение двух объектов обобщенного класса
    boolean isSame(TwoGen<T, V> o)
    {
        if (ob1 == o.ob1 && ob2 == o.ob2)
            return true;
        else
            return false;
    }

    T getOb1()
    {
        return ob1;
    }

    V getOb2()
    {
        return ob2;
    }
}

// Демонстрация класса TwoGen
public class SimpGen
{
    public static void main(String[] args)
    {
        // Передача типа Integer параметру T и типа String параметру V
        TwoGen<Integer, String> tgObg = new TwoGen<Integer, String>(88, "Обобщения");

        // Отобразить типы
        tgObg.showTypes();

        // Получить и отобразить значения
        int v = tgObg.getOb1();
        System.out.println("Значение v: " + v);

        String str = tgObg.getOb2();
        System.out.println("Значение str: " + str);

        if (tgObg.isSame(new TwoGen<>(88, "Обобщения")))
            System.out.println("Два обекта класса TwoGen совпадают");

        TwoGen<?, ?> tOb[] = new TwoGen<?, ?>[10];
        tOb[0] = new TwoGen<String, Integer>("qwerty", 123);  // так
        tOb[1] = new TwoGen<>("qwerty", 123);  // или так - короткий вариант
    }
}
