package Chapter_7.Overload;

/*
    Методы с разными сигнаурами не переопределяются,
     а перегружаются.
 */

class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    /*
        Поскольку сигнатуры разные, эта версия
         метода show() просто перегружает
         метод show() в суперклассе A
     */
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Перегрузка метода show()
    void show(String msg) {
        System.out.println(msg + k);
    }
}

public class Overload {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);

        subOb.show("k: ");  // вызов метода show() из класса B
        subOb.show();   // вызов метода show() из класса A
    }
}
