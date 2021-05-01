package Chapter_7.Shapes7;

import java.awt.*;

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

    // Создание одного объекта на основе другого
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
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

    // Создание одного объекта на основе другого
    Triangle(Triangle ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        // Использование методов доступа, предоставляемых суперклассом
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник - " + style);
    }
}

public class Shapes7 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("контурный", 8.0, 12.0);

        // Создать копию объекта t1
        Triangle t2 = new Triangle(t1);

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());
    }
}
