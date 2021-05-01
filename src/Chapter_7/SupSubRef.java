package Chapter_7;

/*
    Обращение к объекту подкласса по ссылочной переменной суперкласса
 */

class X {
    int a;

    X(int i) { a = i;}
}

class Y extends X {
    int b;

    Y(int i, int j) {
        super(j);
        b = i;
    }
}

public class SupSubRef {
    public static void main(String[] args) {
        X x = new X(10);
        X x2;
        Y y = new Y(5, 6);

        x2 = x; // допустимо, поскольку обе переменные одного типа
        System.out.println("x2.a: " + x2.a);

        /*
            Класс Y является подклассом X, поэтому переменные 'x2' и 'y' могут ссылаться
             на один и тот же объект производного класса.
         */

        x2 = y;
        System.out.println("x2.a: " + x2.a);

        // В классе X известны только члены класса X
        x2.a = 19; // допустимо
        // x2.b = 27; // ошибка, так как переменная b не является членом класса X
    }
}

