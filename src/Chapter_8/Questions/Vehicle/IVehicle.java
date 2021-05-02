package Chapter_8.Questions.Vehicle;

/*
    Вопрос №9

    Создание интерфейса для класса Vehicle.
 */

public interface IVehicle {
    int range(); // Дальность поездки транспортного средства
    double fuelneeded(int miles); // расчет объема топлива, необходимого транспортному средству
                                    // для преодоления заданного расстояния
}

class Vehicle implements IVehicle {
    private int passengers; // количество пассажиров
    private int fuelcap;    // емкость топливного бака
    private int mpg;        // потребление топлива в милях на галлон

    // Конструктор класса Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Дальность поездки транспортного средства
    public int range() {
        return fuelcap * mpg;
    }

    /*
        Добавление параметризированного метода, в котором выполняется
         расчет объема топлива, необходимого транспортному средству
         для преодоления заданного расстояния.
     */
    public double fuelneeded (int miles) {
        return (double) miles / mpg;
    }

    // Методы доступа к переменным экземпляра
    int getPassengers() { return passengers; }
    void setPassengers(int p) { passengers = p; }
    int getFuelcap() { return fuelcap; }
    void setFuelcap(int f) { fuelcap = f; }
    int getMpg() { return mpg; }
    void setMpg(int m) { mpg = m; }
}
