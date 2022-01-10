package se.lexicon.susanne;

public class Truck extends Vehicle{
    private int maxSpeed;
    private int weight;

    public Truck(int vehicleId, String registrationNumber, String brand, int maxSpeed, int weight) {
        super(vehicleId, registrationNumber, brand);
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    @Override
    public void drive() {
        System.out.println("Truck is driving");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
