public class CarFactory {
    public static Car  getInstance(CarType carType , int entryTime) throws  Exception {
        return switch (carType){
            case CarType.SUV -> new SuvCar(carType , entryTime);
            case CarType.HATCHBACK -> new HatchBack(carType , entryTime);
            default -> throw new Exception("Invalid");
        };
    }
}