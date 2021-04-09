package FirstProgram;

/*
    Демонстрация различия между типами int и double.
 */

public class Example3 {
    public static void main(String[] args) {
        int var;
        double x;

        var = 10;

        x = 10.0;

        System.out.println("Начальное значение переменных var: " + var + ". x: " + x);
        System.out.println(); // пустая строка

        var = var / 4;
        x = x / 4;

        System.out.println("Значения переменных после деления var: " + var + ". x: " + x);
    }
}
