package Chapter_7.Override;

/*
    Переопределение метода
 */

class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    // Отображение переменных i и j
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

    // Отображение переменной k - переопределение метода show() в A
    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}

public class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);

        subOb.show(); // вызов метода show() из класса B
    }
}
