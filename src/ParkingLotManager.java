public class ParkingLotManager {

    private int totalSpot ;
    private int suvSpot;
    private int hatchBackSport;


    public ParkingLotManager(int totalSpot , int suvSpot , int hatchBackSport){
        this.totalSpot = totalSpot;
        this.suvSpot = suvSpot;
        this.hatchBackSport = hatchBackSport;
    }

    public boolean reserveSpot(Car car){
       if(totalSpot > 0) {
           if (car.getCarType() == CarType.SUV && suvSpot > 0) {
               suvSpot--;
               return true;
           } else if (car.getCarType() == CarType.HATCHBACK) {
               if (hatchBackSport > 0) {
                   hatchBackSport--;
                   System.out.println("hatchBackSport Parking Lot alloted");
                   return true;

               } else if (suvSpot > 0 && hatchBackSport <= 0) {
                   suvSpot--;
                   car.setParkedInSuvSpot();
                   System.out.println("No hatchBatch Spot here so SUV Parking Lot alloted");
                   return true;
               }else {
                   System.out.println("All Parking Lots are Filled"); // Fixed: Handling when no parking is available
                   return false;
               }
           }
           totalSpot--;
       }
       return false;
    }
    public void releaseSpot (Car car){
        if(car.getCarType() == CarType.SUV || (car.getCarType() == CarType.HATCHBACK && car.getPArketInSuvSpot())) {
            suvSpot++;
        }
        else if (!car.getPArketInSuvSpot()) {
            hatchBackSport++;
            System.out.println("Release the Car Successfully");
        }
        totalSpot++;
        System.out.println("Car released successfully");
    }
}