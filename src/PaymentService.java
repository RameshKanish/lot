public class PaymentService {

    public int makePayment(Car car ,int exitTime){
        int entryTime = car.getEntryTime();
        int fare = car.getPArketInSuvSpot() ? 40 : car.getAmount();
        return (exitTime - entryTime) * fare;
    }
}