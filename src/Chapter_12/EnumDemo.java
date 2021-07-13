package Chapter_12;

// Использование перечисления Transport.

public class EnumDemo
{
    // Перечисление, представляющее разновидности транспортных средств
    enum Transport
    {
        CAR, TRUCK, AIRPLANE, TRAIN, BOAT // объявление перечисления
    }

    public static void main(String[] args)
    {
        Transport tp; // объявление ссылки Transport

        tp = Transport.AIRPLANE; // присваивание переменной tp константы AIRPLANE

        // Отобразить перечислимое значение
        System.out.println("Значение tp: " + tp);
        System.out.println();

        tp = Transport.TRAIN;

        // Сравнить два перечислимых значения
        if (tp == Transport.TRAIN)
            System.out.println("tp содержит TRAIN\n");

        // Использование перечисления для управления
        // инструкцией switch
        switch (tp)
        {
            case CAR:
                System.out.println("Автомобиль везет людей");
                break;
            case TRUCK:
                System.out.println("Грузовик перевозит груз");
                break;
            case AIRPLANE:
                System.out.println("Самолет летит");
                break;
            case TRAIN:
                System.out.println("Поезд движется по рельсам");
                break;
            case BOAT:
                System.out.println("Лодка плывет по реке");
                break;
        }
    }
}
