package Chapter_6;

/*
    Объекты передаются методам по ссылке
 */

class Test2 {
    int a, b;

    Test2(int i, int j) {
        a = i;
        b = j;
    }

    // Передача объекта методу. Теперь переменные ob.a и ob.b
    //  объекта, используемого при вызове, также будут изменяться.
    void change(Test2 ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}

public class CallByRef {
    public static void main(String[] args) {
        Test2 ob = new Test2(15, 20);

        System.out.println("a и b перед вызовом: " + ob.a + " " + ob.b);

        ob.change(ob);

        System.out.println("a и b после вызова: " + ob.a + " " + ob.b);
    }
}
