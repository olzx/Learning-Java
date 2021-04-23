package Chapter_4;

public class RetMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        // Присваивание значений полям объекта minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Присваивание значений полям объекта sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // Получение дальности поездки для разных транспортных средств
        range1 = minivan.rangeInt();
        range2 = sportscar.rangeInt();

        System.out.println("Мини-фургон может перевезти " + minivan.passengers +
                " пассажиров на расстояние " + range1 + " миль.");
        System.out.println("Спортивный автомобиль может перевезти " + sportscar.passengers +
                " пассажиров на расстояние " + range2 + " миль.");
    }
}
