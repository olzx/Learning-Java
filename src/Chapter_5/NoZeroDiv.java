package Chapter_5;

/*
    Предотвращение деления на нуль с помощью оператора ?
 */

public class NoZeroDiv {
    public static void main(String[] args) {
        int result;

        for(int i = -5; i < 6; i++) {
            result = i != 0 ? 100 / i : 0; // предотвращается деление на нуль
            if (result != 0)
                System.out.println("100 / " + i + " равно " + result);
        }
    }
}
