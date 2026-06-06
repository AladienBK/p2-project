package Vehicle;

public abstract class Vehicle {

    protected String plateNumber;
    protected String brand;
    protected String model;
    protected double dailyPrice;
    protected boolean available;

    public Vehicle(String plateNumber, String brand,
            String model, double dailyPrice,
            boolean available) {

        this.plateNumber = plateNumber;
        this.brand = brand;
        this.model = model;
        this.dailyPrice = dailyPrice;
        this.available = available;
    }
    
    //في حالة استئجار المركبة
    public void rent() {
        available = false;
    }
    
    //في حالة اعادة المركبة
    public void returnVehicle() {
        available = true;
    }

    //حساب قيمة عقد الاجار
    public abstract double calculateRentalCost(int days);

    //عرض معلومات المركبة
    public abstract void displayInfo();

    //-------Setters&Getters--------

    public String getPlateNumber() {
        return plateNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }



}