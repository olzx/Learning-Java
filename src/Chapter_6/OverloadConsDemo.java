package Chapter_6;

/*
    Демонстрация перегрузки конструкторов
 */

class MyTestClass {
    int x;

    // Создание объектов разными способами:

    MyTestClass() {
        System.out.println("Внутри MyTestClass()");
        x = 0;
    }

    MyTestClass(int i) {
        System.out.println("Внутри MyTestClass(int)");
        x = i;
    }

    MyTestClass(double d) {
        System.out.println("Внутри MyTestClass(double)");
        x = (int) d;
    }

    MyTestClass(int i, int j) {
        System.out.println("Внутри MyTestClass(int, int)");
        x = i * j;
    }
}

public class OverloadConsDemo {
    public static void main(String[] args) {
        MyTestClass t1 = new MyTestClass();
        MyTestClass t2 = new MyTestClass(88);
        MyTestClass t3 = new MyTestClass(17.23);
        MyTestClass t4 = new MyTestClass(2, 4);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}
