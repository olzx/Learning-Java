package Chapter_12;

// Пример использования аннотации @Depricated

// Пометить класс как не рекомендованный к применению
@Deprecated
class MyClass {
    private String msg;

    MyClass(String m)
    {
        msg = m;
    }

    // Пометить метод как не рекомендованный к применению
    @Deprecated
    String getMsg()
    {
        return msg;
    }

    // ..
}

public class AnnoDemo
{
    public static void main(String[] args)
    {
        MyClass myObj = new MyClass("Test");

        System.out.println(myObj.getMsg());
    }
}
