package Chapter_12;

//  Использование встроенных методов перечислений.

public class EnumDemo2
{
    // Перечисление, представляющее разновидности транспортных средств
    enum Transport
    {
        CAR, TRUCK, AIRPLANE, TRAIN, BOAT
    }

    public static void main(String[] args)
    {
        Transport tp;

        System.out.println("Константы Transport:");

        // Применение метода values()
        Transport allTransports[] = Transport.values(); // получение массива констант Transport
        for (Transport t : allTransports)
            System.out.println(t);

        System.out.println();

        // Применение метода valueOf()
        tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp содержит: " + tp);
    }
}
