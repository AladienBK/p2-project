package Vehicle;

public class Car extends Vehicle {

    private String fuelType;
    private int seats;
    private boolean hasAC;

    public Car(String plateNumber , String brand , String model,
            double dailyPrice,
            boolean available,
            String fuelType,
            int seats,
            boolean hasAC) {

        super(plateNumber, brand, model, dailyPrice, available);

        this.fuelType = fuelType;
        this.seats = seats;
        this.hasAC = hasAC;
    }

    @Override
    public double calculateRentalCost(int days) {

        double cost = dailyPrice * days;

        if (fuelType.equals("electric"))
            cost *= 1.05;

        return cost;
    }

    @Override
    public String toString() {
        return "Vehicle.Car{" +
                "\nplateNumber='" + plateNumber + "' \n" +
                "brand='" + brand + "' \n" +
                "model='" + model + "' \n" +
                "dailyPrice=" + dailyPrice + "\n" +
                "fuelType='" + fuelType + "\n" +
                "seats=" + seats + "\n" +
                "hasAC=" + hasAC + "\n" +
                "available=" + available + '}' + "\n";
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isHasAC() {
        return hasAC;
    }
}