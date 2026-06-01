
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

    // البحث عن مركبة بواسطة رقم اللوحة و ارجاعها ك اوبجيكت
    public Vehicle searchVehicle(String plateNumber) {

        for (Vehicle v : vehicles) {

            if (v.getPlateNumber().equalsIgnoreCase(plateNumber))
                return v;
        }

        return null;
    }

    // ازالة مركبة بواسطة رقم اللوحة
    public void removeVehicle(String plateNumber) {

        Vehicle vehicle = searchVehicle(plateNumber);

        if (vehicle != null)
            vehicles.remove(vehicle);
    }

    // عرض جميع المركبات
    public void displayAllVehicles() {

        for (Vehicle v : vehicles)
            v.displayInfo();
    }

    // عرض السيارات فقط
    public void displayCars() {
        for (Vehicle v : vehicles) {
            if (v instanceof Car)
                v.displayInfo();
        }
    }

    // عرض الدراجات النارية فقط
    public void displayMotorcycles() {
        for (Vehicle v : vehicles) {
            if (v instanceof Motorcycle)
                v.displayInfo();
        }
    }

    // عرض الشاحنات فقط
    public void displayTrucks() {
        for (Vehicle v : vehicles) {
            if (v instanceof Truck)
                v.displayInfo();
        }
    }

    // عرض المركبات المتاحة
    public void displayAvailableVehicles() {

        for (Vehicle v : vehicles) {

            if (v.isAvailable())
                v.displayInfo();
        }
    }

    // ارجاع المركبات المتاحة
    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    // عرض المركبات المؤجرة حاليا
    public void displayRentedVehicles() {

        for (Vehicle v : vehicles) {

            if (!v.isAvailable())
                v.displayInfo();
        }
    }

    // ارجاع عدد المركبات
    public int getVehiclesCount() {
        return vehicles.size();
    }

    // معرفة اذا ما كانت الشاحنة موجودة ام لا
    public boolean vehicleExists(String plateNumber) {
        return searchVehicle(plateNumber) != null;
    }
}