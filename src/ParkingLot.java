import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Car> parkedCars = new ArrayList<>();

    private ParkingLotManager parkingLotManager;
    private PaymentService paymentService;

    public ParkingLot(int totalSpot , int suvSpots , int hatchBackSpot){
        this.parkingLotManager = new ParkingLotManager(totalSpot , suvSpots , hatchBackSpot);
        this.paymentService = new PaymentService();
    }


    public void parkCars(Car car){
        boolean isParked = parkingLotManager.reserveSpot(car);
        if(isParked){
            parkedCars.add(car);
        }
    }

    public void releaseCar(Car car , int exitTime){
        int paidAmount = paymentService.makePayment(car , exitTime);
        System.out.println("Paid Amount is" + paidAmount);
        parkingLotManager.releaseSpot(car);
        parkedCars.remove(car);
    }

    public void printCars(){
        for(Car parkedCard : parkedCars){
            System.out.println("Type: " + parkedCard.getCarType() + ", Entry Time: " + parkedCard.getEntryTime());
        }
    }
}