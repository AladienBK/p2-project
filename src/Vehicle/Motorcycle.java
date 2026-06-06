package Vehicle;

public class Motorcycle extends Vehicle {

    private int engineCapacity;
    private boolean sidecar;

    public Motorcycle(String plateNumber,
            String brand,
            String model,
            double dailyPrice,
            boolean available,
            int engineCapacity,
            boolean sidecar) {

        super(plateNumber, brand, model,
                dailyPrice, available);

        this.engineCapacity = engineCapacity;
        this.sidecar = sidecar;
    }

    @Override
    public double calculateRentalCost(int days) {

        double cost = dailyPrice * days;

        if (sidecar)
            cost *= 1.02;

        return cost;
    }

    
    @Override
    public String toString() {
        return "Vehicle.Motorcycle{" +
                "\nplateNumber='" + plateNumber + "' \n" +
                "brand='" + brand + "' \n" +
                "model='" + model + "' \n" +
                "dailyPrice=" + dailyPrice + " \n" +
                "engineCapacity: " + engineCapacity + "\n" +
                "sidecar: " + sidecar + "\n" +
                "available=" + available + '}' + "\n" ; 
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public boolean isSidecar() {
        return sidecar;
    }

}