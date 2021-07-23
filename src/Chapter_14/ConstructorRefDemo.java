package Chapter_14;

// Демонстрация использования ссылок на конструкторы.

/*
    MyFunc - функциональный интерфейс, метод которого
    возвращает ссылку на MyClass
 */
interface MyFuncTwo
{
    MyClassTwo func(String s);
}

class MyClassTwo
{
    private String str;

    // Этот конструктор имеет аргумент
    MyClassTwo(String s) { str = s; }

    // Это конструктор по умолчанию
    MyClassTwo() { str = ""; }

    String getStr() { return str; }
}

public class ConstructorRefDemo
{
    public static void main(String[] args)
    {
        /*
            Создать ссылку на конструктор MyClassTwo.
            Поскольку метод func() интерфейса MyFunc
            имеет аргумент, new ссылается на параметризованный
            конструктор MyClass, а не на конструктор по умолчанию.
         */
        MyFuncTwo myClassCons = MyClassTwo::new;  // ссылка на конструктор

        /*
            Создать экземпляр MyClassTwo посредством
            ссылки на конструктор
         */
        MyClassTwo mc = myClassCons.func("Тестирование");

        // Использовать только что созданный экземпляр MyClassTwo
        System.out.println("Строка str в mc: " + mc.getStr());
    }
}
