package Chapter_6;

/*
    Применение статической переменной
 */

class StaticDemo {
    int x;  // обычная переменная экземпляра
    static int y;   // статическая переменная (все объекты используют одну и ту же копию статической переменной)

    // Возврат суммы значений переменной экземпляра x и статической переменной y
    int sum() {
        return x + y;
    }
}

public class SDemo {
    public static void main(String[] args) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        // У каждого объекта имеется своя копия переменной экземпляра
        ob1.x = 10;
        ob2.x = 20;
        System.out.println("ob1.x и ob2.x " + ob1.x + " " + ob2.x);
        System.out.println();

        // Все объекты совместно используют одну общую копию статической переменной
        System.out.println("Статическая переменная y - общая");
        StaticDemo.y = 5;
        System.out.println("Присвоить StaticDemo.y значение 5");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();

        StaticDemo.y = 100;
        System.out.println("Изменить значение StaticDemo.y на 100");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();
    }
}
