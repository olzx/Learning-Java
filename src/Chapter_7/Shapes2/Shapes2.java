package Chapter_7.Shapes2;

/*
    Использование методов доступа для установки и
     получения значений закрытых членов.

     Добавление конструктора в класс Triangle.

     Добавление конструкторов в класс TwoDShape.

     Добавление дополнительных конструкторов в класс TwoDShape
 */

// Класс, описывающий двумерные объекты
class TwoDShape {
    // Переменные объявлены как закрытые:
    private double width;
    private double height;

    // Конструктор, заданный по умолчанию
    TwoDShape() {
        width = height = 0;
    }

    // Параметризированный конструктор
    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    // Создание объекта с одинаковыми значениями
    //  переменных экземпляра width и height
    TwoDShape(double x) {
        width = height = x;
    }

    // Методы доступа к закрытым переменным экземпляра width и height
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}

// Подкласс для представления треугольников,
//  производный от класса TwoDShape
class Triangle extends TwoDShape {
    private String style;

    // Конструктор по умолчанию
    Triangle() {
        super();

        style = "none";
    }

    // Конструктор
    Triangle(String s, double w, double h) {
        super(w, h); // вызов конструктора суперкласса

        style = s;
    }

    // Конструктор с одним аргументом
    Triangle(double x) {
        super(x);   // вызов конструктора суперкласса с одним аргументом

        style = "закрашенный";
    }

    double area() {
        // Использование методов доступа, предоставляемых суперклассом
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник - " + style);
    }
}

public class Shapes2 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle("контурный", 8.0, 12.0);
        Triangle t3 = new Triangle(4.0);

        t1 = t2;

        System.out.println("Информаация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информаация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());

        System.out.println();

        System.out.println("Информаация о t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Площадь - " + t3.area());
    }
}
