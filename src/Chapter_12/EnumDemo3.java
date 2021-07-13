package Chapter_12;

//  Использование конструктора, переменной экземпляра и метода перечисления

public class EnumDemo3
{
    enum Transport
    {
        CAR(100), TRUCK(80), AIRPLANE(900), TRAIN(120), BOAT(35);  // указаны значения инициализации

        // Добавляем переменную экземпляра
        private int speed;  // типичная скорость транспортного средства

        // Конструктор
        Transport (int s) { speed = s; }

        // Метод
        int getSpeed() { return speed; }
    }

    public static void main(String[] args)
    {
        Transport tp;

        // Отобразить скорость самолета (путем вызова метода getSpeed())
        System.out.println("Типичная скорость самолета: " +
                            Transport.AIRPLANE.getSpeed() +
                            " км в час\n");

        // Отобразить все виды транспорта и скорость их движения
        System.out.println("Типичные скорости движения транспортных средств");
        for (Transport t : Transport.values())
            System.out.println(t + ": " + t.getSpeed() + " км в час");
    }
}
