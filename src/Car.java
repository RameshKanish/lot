public abstract class Car {

    private CarType carType;
    private int entryTime ;
    private int exitTime ;
    private int amount ;
    private boolean parkedInSuvSpot;

    public Car(CarType carType , int entryTime ){

        this.carType = carType;
        this.entryTime = entryTime;
        this.parkedInSuvSpot = false;

        switch (carType) {
            case SUV -> this.amount = 40;
            case HATCHBACK -> this.amount = 20;
        }
    }


    public CarType getCarType() {
        return carType;
    }

    public int getEntryTime() {
        return entryTime;
    }

    public int getExitTime() {
        return exitTime;
    }

    public int getAmount() {
        return amount;
    }
    public void setParkedInSuvSpot(){
        this.parkedInSuvSpot = true;
    }

    public boolean getPArketInSuvSpot(){
        return parkedInSuvSpot;
    }
}
