package Chapter_7.DynShapes;

/*
    Использование динамической диспетчеризации методов
 */

class TwoDShape {
    // Переменные объявлены как закрытые:
    private double width;
    private double height;
    private String name;

    // Конструктор, заданный по умолчанию
    TwoDShape() {
        width = height = 0;
        name = "none";
    }

    // Параметризированный конструктор
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Создание объекта с одинаковыми значениями
    //  переменных экземпляра width и height
    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    // Создание одного объекта на основе другого
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Методы доступа к закрытым переменным экземпляра width и height
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    String getName() { return name; }

    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }

    // Метод area(), определенный классом TwoDShape
    double area() {
        System.out.println("Метод area() должен быть переопределен");
        return 0.0;
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
        super(w, h, "треугольник"); // вызов конструктора суперкласса
        style = s;
    }

    // Конструктор с одним аргументом
    Triangle(double x) {
        super(x, "треугольник");   // вызов конструктора суперкласса с одним аргументом
        style = "закрашенный";
    }

    // Создание одного объекта на основе другого
    Triangle(Triangle ob) {
        super(ob);
        style = ob.style;
    }

    // Переопределение метода area() для класса Triangle
    double area() {
        // Использование методов доступа, предоставляемых суперклассом
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник - " + style);
    }
}

// Подкласс для представления прямоугольников,
// производный от класса TwoDShape
class Rectangle extends TwoDShape {
    // Конструктор по умолчанию
    Rectangle() {
        super();
    }

    // Конструктор класса Rectangle
    Rectangle(double w, double h) {
        super(w, h, "прямоугольник"); // вызов конструктора суперкласса
    }

    // Создание квадрата
    Rectangle(double x) {
        super(x, "прямоугольник"); // вызов конструктора суперкласса
    }

    // Создание одного объекта на основе другого
    Rectangle(Rectangle ob) {
        super(ob);  // передача объекта конструктору класса TwoDShape
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) return true;
        else return false;
    }

    // Переопределение метода area() для класса Rectangle
    double area() {
        return getWidth() * getHeight();
    }
}

public class DynShapes {
    public static void main(String[] args) {
        TwoDShape shapes[] = new TwoDShape[5];

        shapes[0] = new Triangle("контурный", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7.0);

        shapes[4] = new TwoDShape(10, 20, "фигура");

        for(TwoDShape i : shapes) {
            System.out.println("Объект - " + i.getName());
            System.out.println("Площадь - " + i.area()); // для каждой фигуры вызывается соответсвующий метод area()
            System.out.println();
        }
    }
}
