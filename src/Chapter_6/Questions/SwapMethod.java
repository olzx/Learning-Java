package Chapter_6.Questions;

/*
    Вопрос №4

    Метод swap(ob, ob) реализующий обмен содержимым между двумя объектами типа Test,
     на которые ссылаются две переменные данного типа
 */

class Test {
    int a;

    Test(int i) {
        this.a = i;
    }
}

public class SwapMethod {
    public static void swap(Test ob1, Test ob2) {
        int b;

        b = ob1.a;
        ob1.a = ob2.a;
        ob2.a = b;
    }

    public static void main(String[] args) {
        Test ob1 = new Test(10);
        Test ob2 = new Test(20);

        System.out.println("ob1 и ob2: " + ob1.a + " " + ob2.a);

        System.out.println("Меняем значения местами.");

        swap(ob1, ob2);

        System.out.println("ob1 и ob2: " + ob1.a + " " + ob2.a);
    }
}
