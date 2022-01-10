package se.lexicon.susanne;

public class Car extends Vehicle{

    private int numberOfDoors;
    private int numberOfPassengers;

    public Car(int vehicleId, String registrationNumber, String brand, int numberOfDoors, int numberOfPassengers) {
        super(vehicleId, registrationNumber, brand);
        this.numberOfDoors = numberOfDoors;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public void drive(){
        System.out.println("Car is driving");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
