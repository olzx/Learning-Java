package Сhapter_2;

/*
    Демонстрация автоматического преобразования типа long в тип double
 */

public class LtoD {
    public static void main(String[] args) {
        long L;
        double D;

        L = 100123285L;
        D = L; // автоматическое преобразование типа long в тип double

        System.out.println("L и D: " + L + " " + D);
    }
}
