package Vehicle;

public class Truck extends Vehicle {

    private double loadCapacity;
    private boolean refrigerated;

    public Truck(String plateNumber,
            String brand,
            String model,
            double dailyPrice,
            boolean available,
            double loadCapacity,
            boolean refrigerated) {

        super(plateNumber, brand, model,
                dailyPrice, available);

        this.loadCapacity = loadCapacity;
        this.refrigerated = refrigerated;
    }

    @Override
    public double calculateRentalCost(int days) {

        double cost = dailyPrice * days;

        if (refrigerated)
            cost *= 1.05;

        return cost;
    }

    @Override
    public String toString() {
        return "Vehicle.Truck{" +
                "\nplateNumber='" + plateNumber + "' \n" +
                "brand='" + brand + "' \n" +
                "model='" + model + "' \n" +
                "dailyPrice=" + dailyPrice + "\n" +
                "loadCapacity: " + loadCapacity + "\n" +
                "refrigerated: " + refrigerated + "\n" +
                "available=" + available +'}' + "\n" ;
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public boolean isRefrigerated() {
        return refrigerated;
    }

}