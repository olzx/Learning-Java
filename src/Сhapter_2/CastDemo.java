package Сhapter_2;

/*
    Демонстрация приведения типов
 */

public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); // привести тип double к типу int
        System.out.println("Целочисленный результат деления x / y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Значение b: " + b);

        i = 257;
        b = (byte) i; // на этот раз информация теряется. Тип byte не может содержать значение 257
        System.out.println("Значение b: " + b);

        b = 88; // представление чимвола X в коде ASCII
        ch = (char) b; // явное приведение несовместимых типов
        System.out.println("ch: " + ch);
    }
}
