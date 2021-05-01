package Chapter_7;

/*
    Упражнение 7.1

    Создание подкласса класса Vehicle для грузовиков
 */

class Vehicle {
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
    int range() {
        return fuelcap * mpg;
    }

    /*
        Добавление параметризированного метода, в котором выполняется
         расчет объема топлива, необходимого транспортному средству
         для преодоления заданного расстояния.
     */
    double fuelneeded (int miles) {
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

class Truck extends Vehicle {
    private int cargocap;   // грузоподъемность, выраженная в футах

    // Конструктор класса Truck
    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargocap = c;
    }

    // Методы доступа к переменной cargocap
    int getCargocap() { return cargocap; }
    void setCargocap(int c) { cargocap = c; }
}

// Создание класса, описывающего внедорожники
class OffRoad extends Vehicle {
    private int groundClearance; // дорожный просвет, выраженный в дюймах

    OffRoad(int p, int f, int m, int g) {
        super(p, f, m);
        groundClearance = g;
    }

    // Методы доступа к переменной groundClearance
    int getGroundClearance() { return groundClearance; }
    void setGroundClearance(int g) { groundClearance = g; }
}

public class TruckDemo {
    public static void main(String[] args) {
        // Создание ряда новых объектов типа Truck
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);

        System.out.println("Грузовик может перевезти " + semi.getCargocap() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль, грузовику требуется " +
                gallons + " галлонов топлива.\n");

        gallons = pickup.fuelneeded(dist);

        System.out.println("Пикап может перевезти " + pickup.getCargocap() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль, пикапу требуется " +
                gallons + " галлонов топлива.");
    }
}
