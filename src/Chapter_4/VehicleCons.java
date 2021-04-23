package Chapter_4;

class VehicleConst {
    int passengers; // количество пассажиров
    int fuelcap;    // емкость топливного бака
    int mpg;        // потребление топлива в милях на галлон

    // Это конструктор класса Vehicle
    VehicleConst(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Отображение дальности поездки транспортного средства
    void range() {
        System.out.println("Дальность - " + fuelcap * mpg + " миль.");
    }

    // Для того что бы метод range работал в уже созданных классах, создам другой метод: rangeInt
    int rangeInt() {
        return fuelcap * mpg; // возврат дальности поездки для заданного транспортного средства
    }

    /*
        Добавление параметризированного метода, в котором выполняется
         расчет объема топлива, необходимого транспортному средству
         для преодоления заданного расстояния.
     */
    double fuelneeded (int miles) {
        return (double) miles / mpg;
    }
}
