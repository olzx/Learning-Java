package Chapter_7.Questions;

/*
    Вопрос №2

    Класс Circle с методом area() вычисляющий площадь круга.
 */

abstract class TwoDShape {
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

    // Метод area() абстрактный
    abstract double area();
}

// Класс описывающий круг, унаследованный от класса TwoDShape
class Circle extends TwoDShape {
    Circle(double r) {
        super(r, "круг");
    }

    double area() {
        return (getWidth() * getWidth()) * Math.PI;
    }
}

class CircleDemo {
    public static void main(String[] args) {
        Circle cir = new Circle(20);

        System.out.println("cir: " + cir.getName() + ", с радиусом: " + cir.getWidth());
        System.out.println("Площадь: " + cir.area());
    }
}
