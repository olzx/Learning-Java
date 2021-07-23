package Chapter_14;

/*
    Использование ссылки на метод экземпляра для обращения
    к любому интерфейсу.
 */

/*
    Функциональный интерфейс для числовых предикатов, которые
    воздействуют на объект типа MyIntNum и целочисленное значение
 */
interface MyIntNumPredicate
{
    boolean test(MyIntNumTwo mv, int n);
}

/*
    Данный класс хранит значение типа int и определяет метод
    isFactor(), который возвращает true, если его аргумент
    является делителем числа, хранящегося в классе
 */
class MyIntNumTwo
{
    private int v;

    MyIntNumTwo(int x)
    {
        v = x;
    }

    int getNum() { return v; }

    // Вернуть true, если n - делитель v
    boolean isFactor(int n)
    {
        return (v % n) == 0;
    }
}

public class MethodRefDemo3
{
    public static void main(String[] args)
    {
        boolean result;

        MyIntNumTwo myNum = new MyIntNumTwo(12);
        MyIntNumTwo myNum2 = new MyIntNumTwo(16);

        // Создать ссылку inp на метод экземпляра isFactor()
        MyIntNumPredicate inp = MyIntNumTwo::isFactor;  // ссылка на метод любого объекта типа MyIntNum

        // Вызвать метод isFactor() для объекта myNum
        result = inp.test(myNum, 3);
        if (result)
            System.out.println("3 является делителем " + myNum.getNum());

        // Вызвать метод isFactor() для объекта myNum2
        result = inp.test(myNum2, 3);
        if (!result)
            System.out.println("3 не является делителем " + myNum2.getNum());
    }
}
