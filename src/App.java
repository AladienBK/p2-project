import java.time.LocalDate;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        VehicleService vehicleService = new VehicleService();
        ClientService clientService = new ClientService();
        RentalService rentalService = new RentalService() ;
        ReportService reportService = new ReportService() ;
        
        //--------------------البيانات الاولية--------------------
        // ================= VEHICLES =================

        vehicleService.addVehicle(new Car("AA111" ,
                                        "Toyota",
                                        "Corolla",
                                        50,
                                        true,
                                        "Gasoline",
                                        5,
                                        true));

        vehicleService.addVehicle(new Car("BB222",
                                        "Tesla",
                                        "Model 3",
                                        100,
                                        true,
                                        "Electric",
                                        5,
                                        true));

        vehicleService.addVehicle(new Motorcycle("CC333",
                                                "Honda",
                                                "CBR",
                                                30,
                                                true,
                                                600,
                                                false));

        vehicleService.addVehicle(new Motorcycle("DD444",
                                                "Yamaha",
                                                "MT07",
                                                35,
                                                true,
                                                700, true));

        vehicleService.addVehicle(new Truck("EE555",
                                            "Mercedes",
                                            "Actros",
                                            150,
                                            true,
                                            10000,
                                            false));

        vehicleService.addVehicle(new Truck("FF666",
                                            "Volvo",
                                            "FH16",
                                            180,
                                            true,
                                            12000,
                                            true));


        // ================= CLIENTS =================


        clientService.addClient(new Individual(1,
                                            "Ahmad Ali",
                                            "Damascus",
                                            "0991111111",
                                            "LIC100",
                                            LocalDate.of(2000, 5, 10)));

        clientService.addClient(new Individual(2,
                                            "Mohammad Hassan",
                                            "Homs",
                                            "0992222222",
                                            "LIC200",
                                            LocalDate.of(1998, 8, 15)));

        clientService.addClient(new Individual(3,
                                            "Omar Khaled",
                                            "Aleppo",
                                            "0993333333",
                                            "LIC300",
                                            LocalDate.of(1995, 2, 20)));

        clientService.addClient(new Institution(4,
                                            "Tech Company",
                                            "Damascus",
                                            "0114444444",
                                            "REG100",
                                            10));

        clientService.addClient(new Institution(5,
                                            "Transport Co",
                                            "Homs",
                                            "0115555555",
                                            "REG200",
                                            15));


        int choice;

        do {

            System.out.println("\n===== CAR RENTAL SYSTEM =====");
            System.out.println("1. Vehicle service");
            System.out.println("2. Client service");
            System.out.println("3. Rental service");
            System.out.println("4. Reports");
            System.out.println("0. Exit");

            System.out.print("Choose: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    vehicleMenu(vehicleService, input);
                    break;

                case 2:
                    clientMenu(clientService, input);
                    break;

                case 3:
                    rentalMenu(rentalService, input);
                    break;

                case 4:
                    reportsMenu(reportService, input);
                    break;

                case 0:
                    System.out.println("Good Bye");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 0);

        input.close();
    }

    // قائمة المركبات
    private static void vehicleMenu(VehicleService service, Scanner input) {

        int choice;

        do {

            System.out.println("\n===== VEHICLE MENU =====");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Show All Vehicles");
            System.out.println("0. Back");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    // add vehicle
                    break;

                case 2:
                    // remove vehicle
                    break;

                case 3:
                    // search vehicle
                    break;

                case 4:
                    // show all vehicles
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);
    }

    // قائمة العملاء
    private static void clientMenu(ClientService service, Scanner input) {

        int choice;

        do {

            System.out.println("\n===== CLIENT MENU =====");
            System.out.println("1. Add Client");
            System.out.println("2. Search Client");
            System.out.println("3. Edit Client");
            System.out.println("4. Show All Clients");
            System.out.println("0. Back");

            System.out.print("Choose: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    // Add Client
                    break;

                case 2:
                    // Search Client
                    break;

                case 3:
                    // Edit Client
                    break;

                case 4:
                    //Show All Clients
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 0);
    }

    // قائمة الايجار
    private static void rentalMenu(RentalService service, Scanner input) {

        int choice;

        do {

            System.out.println("\n===== RENTAL MENU =====");
            System.out.println("1. Rent Vehicle");
            System.out.println("2. Return Vehicle");
            System.out.println("3. Active Contracts");
            System.out.println("4. Finished Contracts");
            System.out.println("5. Currently Rented Vehicles");
            System.out.println("0. Back");

            System.out.print("Choose: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    // Rent Vehicle
                    break;

                case 2:
                    // Return Vehicle
                    break;

                case 3:
                    service.showActiveContracts();
                    break;

                case 4:
                    service.showFinishedContracts();
                    break;

                case 5:
                    service.;
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 0);
    }

    // قائمة التقارير
    private static void reportsMenu(ReportService service, Scanner input) {

        int choice;

        do {

            System.out.println("\n===== REPORTS MENU =====");
            System.out.println("1. Revenue Report");
            System.out.println("2. Most Rented Vehicles");
            System.out.println("3. VIP Clients");
            System.out.println("4. Vehicles With Fines");
            System.out.println("5. Vehicles Between Dates");
            System.out.println("6. Clients By Vehicle");
            System.out.println("0. Back");

            System.out.print("Choose: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    service.;
                    break;

                case 2:
                    service.;
                    break;

                case 3:
                    service.;
                    break;

                case 4:
                    service.;
                    break;

                case 5:
                    // Vehicles Between Dates
                    break;

                case 6:
                    // Clients By Vehicle
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 0);
    }

}
