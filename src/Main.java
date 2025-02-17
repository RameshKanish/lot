//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        ParkingLot parkingLot = new ParkingLot(2 ,1 , 1);

        Car car1 = CarFactory.getInstance(CarType.SUV, 10);
        Car car2 = CarFactory.getInstance(CarType.HATCHBACK, 11);
        Car car3 = CarFactory.getInstance(CarType.HATCHBACK, 13);

        parkingLot.parkCars(car1);
        parkingLot.parkCars(car2);


        parkingLot.releaseCar(car1 , 12);

        parkingLot.parkCars(car3);

        parkingLot.printCars();
    }
}