package Chapter_4;

/*
    Добавление метода range() в класс Vehicle
 */

public class AddMeth {
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

        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров.");
        minivan.range(); // отображение информации о дальности поездки мини-фургона

        System.out.println("Спортивный автомобиль может перевезти " + sportscar.passengers + " пассажиров.");
        sportscar.range(); // отображение информации о дальности поездки спортивного автомобиля
    }
}
