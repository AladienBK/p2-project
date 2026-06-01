
public class App {

    public static void main(String[] args) {

        VehicleService service = new VehicleService();
        //تجريب توابع خدمة المركبات
        // // ==========================
        // // Add Vehicles
        // // ==========================

        // service.addVehicle(
        // new Car(
        // "CAR001",
        // "Toyota",
        // "Corolla",
        // 100,
        // true,
        // "Gasoline",
        // 5,
        // true));

        // service.addVehicle(
        // new Car(
        // "CAR002",
        // "Tesla",
        // "Model 3",
        // 200,
        // true,
        // "Electric",
        // 5,
        // true));

        // service.addVehicle(
        // new Motorcycle(
        // "MOT001",
        // "Honda",
        // "CBR",
        // 50,
        // true,
        // 600,
        // true));

        // service.addVehicle(
        // new Truck(
        // "TRK001",
        // "Mercedes",
        // "Actros",
        // 300,
        // true,
        // 10000,
        // true));

        // // ==========================
        // // Display All Vehicles
        // // ==========================

        // System.out.println("\n========== ALL VEHICLES ==========");

        // service.displayAllVehicles();

        // // ==========================
        // // Search Vehicle
        // // ==========================

        // System.out.println("\n========== SEARCH VEHICLE ==========");

        // Vehicle found = service.searchVehicle("CAR001");

        // if (found != null)
        // found.displayInfo();
        // else
        // System.out.println("Vehicle not found");

        // // ==========================
        // // Rental Cost Test
        // // ==========================

        // System.out.println("\n========== RENTAL COSTS FOR 5 DAYS ==========");

        // for (Vehicle v : service.getVehicles()) {

        // System.out.println(
        // v.getPlateNumber()
        // + " --> "
        // + v.calculateRentalCost(5));
        // }

        // // ==========================
        // // Rent Vehicle Test
        // // ==========================

        // System.out.println("\n========== RENT TEST ==========");

        // Vehicle car = service.searchVehicle("CAR001");

        // car.rent();

        // System.out.println(
        // "CAR001 Available = "
        // + car.isAvailable());

        // // ==========================
        // // Available Vehicles
        // // ==========================

        // System.out.println("\n========== AVAILABLE VEHICLES ==========");

        // service.displayAvailableVehicles();

        // // ==========================
        // // Return Vehicle Test
        // // ==========================

        // System.out.println("\n========== RETURN TEST ==========");

        // car.returnVehicle();

        // System.out.println(
        // "CAR001 Available = "
        // + car.isAvailable());

        // // ==========================
        // // Remove Vehicle Test
        // // ==========================

        // System.out.println("\n========== BEFORE REMOVE ==========");

        // service.displayAllVehicles();

        // service.removeVehicle("MOT001");

        // System.out.println("\n========== AFTER REMOVE ==========");

        // service.displayAllVehicles();

        // // ==========================
        // // Vehicle Count
        // // ==========================

        // System.out.println("\n========== VEHICLE COUNT ==========");
        // System.out.println(
        // "Total Vehicles = "
        // + service.getVehiclesCount());
    // تجريب توابع خدمة العملاء
        ClientService customerService = new ClientService();

        customerService.addCustomer(
                new Individual(
                        1,
                        "Ahmad",
                        "Damascus",
                        "0999999999",
                        "DL123",
                        "2000-01-01"));

        customerService.addCustomer(
                new Institution(
                        2,
                        "ABC Company",
                        "Damascus",
                        "011123456",
                        "CR001",
                        10));

        System.out.println(
                "\n========== CUSTOMERS ==========");

        customerService.displayClients();س
    }
}