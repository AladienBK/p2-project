
public class App {

    public static void main(String[] args) {

        // VehicleService service = new VehicleService();
        // // تجريب توابع خدمة المركبات
        // // ==========================
        // // Add Vehicles
        // // ==========================

        // service.addVehicle(
        //         new Car(
        //                 "CAR001",
        //                 "Toyota",
        //                 "Corolla",
        //                 100,
        //                 true,
        //                 "Gasoline",
        //                 5,
        //                 true));

        // service.addVehicle(
        //         new Car(
        //                 "CAR002",
        //                 "Tesla",
        //                 "Model 3",
        //                 200,
        //                 true,
        //                 "Electric",
        //                 5,
        //                 true));

        // service.addVehicle(
        //         new Motorcycle(
        //                 "MOT001",
        //                 "Honda",
        //                 "CBR",
        //                 50,
        //                 true,
        //                 600,
        //                 true));

        // service.addVehicle(
        //         new Truck(
        //                 "TRK001",
        //                 "Mercedes",
        //                 "Actros",
        //                 300,
        //                 true,
        //                 10000,
        //                 true));

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
        //     found.displayInfo();
        // else
        //     System.out.println("Vehicle not found");

        // // ==========================
        // // Rental Cost Test
        // // ==========================

        // System.out.println("\n========== RENTAL COSTS FOR 5 DAYS ==========");

        // for (Vehicle v : service.getVehicles()) {

        //     System.out.println(
        //             v.getPlateNumber()
        //                     + " --> "
        //                     + v.calculateRentalCost(5));
        // }

        // // ==========================
        // // Rent Vehicle Test
        // // ==========================

        // System.out.println("\n========== RENT TEST ==========");

        // Vehicle car = service.searchVehicle("CAR001");

        // car.rent();

        // System.out.println(
        //         "CAR001 Available = "
        //                 + car.isAvailable());

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
        //         "CAR001 Available = "
        //                 + car.isAvailable());

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
        //         "Total Vehicles = "
        //                 + service.getVehiclesCount());
        // // تجريب توابع خدمة العملاء
        // ClientService clientService = new ClientService();

        // clientService.addClient(
        //         new Individual(
        //                 1,
        //                 "Ahmad",
        //                 "Damascus",
        //                 "099999999",
        //                 "DL123",
        //                 "2000-01-01"));

        // clientService.addClient(
        //         new Institution(
        //                 2,
        //                 "ABC Company",
        //                 "Damascus",
        //                 "011123456",
        //                 "CR001",
        //                 10));

        // System.out.println("\n========== ALL CLIENTS ==========");
        // clientService.displayClients();

        // System.out.println("\n========== INDIVIDUALS ==========");
        // clientService.displayIndividuals();

        // System.out.println("\n========== INSTITUTIONS ==========");
        // clientService.displayInstitutions();

        // System.out.println("\n========== DISCOUNT TEST ==========");

        // Client client = clientService.searchClient(2);

        // System.out.println(
        //         "Discount = " +
        //                 client.calculateDiscount(1000));

        // System.out.println("\n========== UPDATE TEST ==========");

        // clientService.updateClient(
        //         2,
        //         "XYZ Company",
        //         "Aleppo",
        //         "011999999");

        // clientService.displayClients();

        // System.out.println("\n========== REMOVE TEST ==========");

        // clientService.removeClient(1);

        // clientService.displayClients();

        // System.out.println(
        //         "\nTotal Clients = "
        //                 + clientService.getClientsCount());

        // // -----------اختبار العقود-------------

        // client = clientService.searchClient(2);

        // Vehicle vehicle = service.searchVehicle("CAR002");

        // RentalContract contract = new RentalContract(
        //         1,
        //         client,
        //         vehicle,
        //         5,
        //         "2025-05-01");

        // contract.displayContract();
        // RentalService rentalService = new RentalService();
        // RentalContract contract1 = new RentalContract(
        //         1,
        //         clientService.searchClient(2),
        //         service.searchVehicle("CAR002"),
        //         5,
        //         "2025-05-01");

        // rentalService.rentVehicle(contract1);
        // System.out.println(
        //         "\n========== CONTRACTS ==========");

        // rentalService.displayContracts();
        // System.out.println(
        //         "\nAvailable = "
        //                 + service
        //                         .searchVehicle("CAR002")
        //                         .isAvailable());
        // rentalService.returnVehicle(1);
        // System.out.println(
        //         "\nAvailable = "
        //                 + service
        //                         .searchVehicle("CAR002")
        //                         .isAvailable());
        // System.out.println(
        //         "\nContracts Count = "
        //                 + rentalService.getContractsCount());

        // ReportService reportService = new ReportService();
        // System.out.println(
        //         "\n========== VEHICLE REPORT ==========");

        // reportService.vehicleCountReport(
        //         service);
        // System.out.println(
        //         "\n========== CLIENT REPORT ==========");

        // reportService.clientCountReport(
        //         clientService);
        // System.out.println(
        //         "\n========== CONTRACT REPORT ==========");

        // reportService.contractCountReport(
        //         rentalService);
        // System.out.println(
        //         "\n========== REVENUE REPORT ==========");

        // reportService.totalRevenueReport(
        //         rentalService);
        // System.out.println(
        //         "\n========== AVAILABLE VEHICLES ==========");

        // reportService.availableVehiclesReport(
        //         service);
    }
}