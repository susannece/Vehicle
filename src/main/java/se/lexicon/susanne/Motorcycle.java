package se.lexicon.susanne;

public class Motorcycle extends Vehicle{

    private String motorcycleType;

    public Motorcycle(int vehicleId, String registrationNumber, String brand, String motorcycleType) {
        super(vehicleId, registrationNumber, brand);
        this.motorcycleType = motorcycleType;
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle is driving");
    }

    public String getMotorcycleType() {
        return motorcycleType;
    }

    public void setMotorcycleType(String motorcycleType) {
        this.motorcycleType = motorcycleType;
    }
}
