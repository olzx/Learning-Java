package Chapter_4;

public class VehConsDemo {
    public static void main(String[] args) {

        // Завершение создания объектов транспортных средств
        VehicleConst minivan = new VehicleConst(7, 16, 21);
        VehicleConst sportscar = new VehicleConst(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль мини-фургону требуется " +
                gallons + " галлонов топлива.");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль спортивному автомобилю требуется " +
                gallons + " галлонов топлива.");
    }
}
