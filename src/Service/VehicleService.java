package Service;

import Vehicle.*;
import java.util.ArrayList;

public class VehicleService {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    // اضافة مركبة
    public boolean addVehicle(Vehicle vehicle) {

        if (searchVehicle(vehicle.getPlateNumber()) != null) {
            System.out.println("Plate already exists");
            return false;
        }

        vehicles.add(vehicle);
        System.out.println("Added");
        return true;

    }

    // ازالة مركبة بواسطة رقم اللوحة
    public void removeVehicle(String plateNumber) {

        Vehicle vehicle = searchVehicle(plateNumber);

        if (vehicle != null) {
            vehicles.remove(vehicle);
            System.out.println("\n*** Remove Successful ***");
        } else
            System.out.println("\n*** Remove Fail!, this plate Number Not Found. ***");

    }

    // البحث عن مركبة بواسطة رقم اللوحة و ارجاعها ك اوبجيكت
    public Vehicle searchVehicle(String plateNumber) {

        for (Vehicle v : vehicles) {

            if (v.getPlateNumber().equalsIgnoreCase(plateNumber))
                return v;
        }

        return null;
    }

    // عرض جميع المركبات
    public void displayAllVehicles() {

        for (Vehicle v : vehicles)
            v.displayInfo();
    }

    // عرض المركبات المتاحة
    public void displayAvailableVehicles() {

        for (Vehicle v : vehicles) {

            if (v.isAvailable())
                v.displayInfo();
        }
    }

    // عرض المركبات المؤجرة حاليا
    public void displayRentedVehicles() {

        for (Vehicle v : vehicles) {

            if (!v.isAvailable())
                v.displayInfo();
            else if (vehicles.size() == 0)
                System.out.println("Not Found any Rented Vehicles");
        }
    }

}