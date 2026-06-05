import Customer.Client;
import Customer.Individual;
import Customer.Institution;
import Rental.RentalContract;
import Service.RentalService;
import Service.ClientService;
import Service.ReportService;
import Service.VehicleService;
import Vehicle.Car;
import Vehicle.Motorcycle;
import Vehicle.Truck;
import Vehicle.Vehicle;
import Rental.RentalContract;
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





        Scanner in =new Scanner(System.in);
        while (true) {
            System.out.println();

            System.out.println("**************************************************************************");
            System.out.println(" 1. Add Vehicle.\n" +
                    " 2. Remove Vehicle.\n" +
                    " 3. Search Vehicle by Plate Number.\n" +
                    " 4. Display All Vehicle .\n" +
                    " 5. Display All Vehicle available.\n" +
                    " 6. Add New Customer.\n" +
                    " 7. Search Customers.\n" +
                    " 8. Display Customers.\n" +
                    " 9. Edit Customer Information.\n" +
                    " 10. Rental Vehicle.\n" +
                    " 11. return Vehicle.\n" +
                    " 12. Display rental Contract in Company.\n" +
                    " 13. Display rental Contract for customer.\n" +
                    " 14. Display Vehicle rental now.\n" +
                    " 15. Display Vehicle rental Late Fees.\n" +
                    " 16. Display Vehicle rental for Date.\n" +
                    " 17. Display customer rented Vehicle.\n" +
                    " 18. Display Revenue Report.\n" +
                    " 19. Display Most Rented Vehicles.\n" +
                    " 20. Display VIP Clients  .\n" +
                    " 21. Exit.");
            System.out.println("**************************************************************************");
            System.out.println();


            int choice ;
            if(in.hasNextInt()){
                choice=in.nextInt();
            }
            else{
                System.out.println("Please Enter Integer Number!");
                in.next();//تنظيف الذاكرة المؤقتة من النص
                continue;
            }
            switch (choice) {

                case 1: {

                    System.out.println("\n 1. you need add Vehicle_Car. \n 2. you need add Vehicle_Motorcycle.  \n 3. you need add Vehicle_Truck");
                    String add = in.next();

                        if (add.equals("1")) {
                                System.out.println("\nPlease Enter Plate Number: ");
                                String plateNumber = in.next();

                                Vehicle found = vehicleService.searchVehicle(plateNumber);
                            if (found == null) {
                                System.out.println("\nPlease Enter Brand: ");
                                String brand = in.next();
                                System.out.println("\nPlease Enter Model: ");
                                String model = in.next();
                                System.out.println("\nPlease Enter Daily Price ");
                                int price = in.nextInt();
                                System.out.println("\nPlease Enter Available (True, False) ");
                                boolean available = in.nextBoolean();
                                System.out.println("\nPlease Enter Fuel Type (Gasoline , Electric , Diesel ) ");
                                String type = in.next();
                                System.out.println("\nPlease Enter Number of Seats ");
                                int seats = in.nextInt();
                                System.out.println("\nPlease Enter Has AC (True , False) ");
                                boolean ac = in.nextBoolean();

                                vehicleService.addVehicle(new Car(plateNumber, brand, model, price, available, type, seats, ac));
                                System.out.println("Added Vehicle_Car Successful.");
                            }
                            else
                                System.out.println("Sorry this Plate Number is Added, You Can’t Added again!");
                            }
                        else if (add.equals("2")) {
                                System.out.println("\nPlease Enter Plate Number: ");
                                String plateNumber = in.next();

                                Vehicle found = vehicleService.searchVehicle(plateNumber);
                                if (found == null) {
                                    System.out.println("\nPlease Enter Brand: ");
                                    String brand = in.next();
                                    System.out.println("\nPlease Enter Model: ");
                                    String model = in.next();
                                    System.out.println("\nPlease Enter Daily Price ");
                                    int price = in.nextInt();
                                    System.out.println("\nPlease Enter Available: (True, False) ");
                                    boolean available = in.nextBoolean();
                                    System.out.println("\nPlease Enter EngineCapacity: ");
                                    int eng = in.nextInt();
                                    System.out.println("\nPlease Enter Side Vehicle.Car:  (True,False) ");
                                    boolean sid = in.nextBoolean();

                                    vehicleService.addVehicle(new Motorcycle(plateNumber, brand, model, price, available, eng, sid));
                                    System.out.println("Added Vehicle_Motorcycle Successful.");

                                }
                                else
                                    System.out.println("Sorry this Plate Number is Added, You Can’t Added again!");

                        }
                        else if (add.equals("3")) {
                                System.out.println("\nPlease Enter Plate Number: ");
                                String plateNumber = in.next();

                                Vehicle found = vehicleService.searchVehicle(plateNumber);
                             if (found == null) {
                                System.out.println("\nPlease Enter Brand: ");
                                String brand = in.next();
                                System.out.println("\nPlease Enter Model: ");
                                String model = in.next();
                                System.out.println("\nPlease Enter Daily Price ");
                                int price = in.nextInt();
                                System.out.println("\nPlease Enter Available: (True, False) ");
                                boolean available = in.nextBoolean();
                                System.out.println("\nPlease Enter Load Capacity: ");
                                int load = in.nextInt();
                                System.out.println("\nPlease Enter Refrigerated:  (True,False) ");
                                boolean ref = in.nextBoolean();

                                vehicleService.addVehicle(new Truck(plateNumber, brand, model, price, available, load, ref));
                                 System.out.println("Added Vehicle_Truck Successful.");
                            }
                               else
                                System.out.println("Sorry this Plate Number is Added, You Can’t Added again!");
                       }

                        else
                        System.out.println("It is Wrong, Please Enter right Number.");

                    break;
                }


                case 2: {
                    vehicleService.displayAllVehicles();
                    System.out.println("\n\n Please Enter Plate Number You need remove\n");
                    String remov = in.next();
                    vehicleService.removeVehicle(remov);

                    break;
                }


                case 3: {
                    System.out.println(" Please Enter Plate Name For Vehicle: ");
                    String plateNumber = in.next();

                    Vehicle found = vehicleService.searchVehicle(plateNumber);
                    if (found != null)
                        found.displayInfo();
                    else
                        System.out.println("Sorry Vehicle not found");

                    break;
                }


                case 4: {
                    vehicleService.displayAllVehicles();
                    break;}


                case 5: {
                    System.out.println(" --Available Vehicles--  \n");
                    vehicleService.displayAvailableVehicles();
                    break;
                }


                case 6: {

                    System.out.println("\n 1. you need add Customer_Individual. \n 2. you need add Customer_Institution.  ");
                    String addC = in.next();

                    if (addC.equals("1")) {
                        System.out.println("\nPlease Enter Customer ID : ");
                        int id = in.nextInt();
                        in.nextLine();
                        Customer.Client found2 = clientService.searchClient(id);
                        if (found2 == null) {


                            System.out.println("\nPlease Enter Name: ");
                            String name = in.nextLine();
                            System.out.println("\nPlease Enter Address: ");
                            String address = in.next();
                            System.out.println("\nPlease Enter Phone: ");
                            String phone = in.next();
                            System.out.println("\nPlease Enter Driving License:");
                            String drive = in.next();

                            System.out.println("\nPlease Enter Local Date for Year : ");
                            int y = in.nextInt();
                            System.out.println("\nPlease Enter Local Date for Month : ");
                            int m = in.nextInt();
                            System.out.println("\nPlease Enter Local Date for Day : ");
                            int d = in.nextInt();

                            clientService.addClient(new Individual(id, name, address, phone, drive, LocalDate.of(y, m, d)));
                            System.out.println("Added Customer_Individual Successful.");
                        }
                        else
                            System.out.println("Sorry this ID is Added, You Can’t Added again!");
                    }
                    else if (addC.equals("2")) {
                        System.out.println("\nPlease Enter Customer ID : ");
                        int idI = in.nextInt();
                        in.nextLine();
                        Customer.Client found2 = clientService.searchClient(idI);
                        if (found2 == null) {
                        System.out.println("\nPlease Enter Name: ");
                        String nameI = in.nextLine();
                        System.out.println("\nPlease Enter Address: ");
                        String addressI = in.next();
                        System.out.println("\nPlease Enter Phone: ");
                        String phoneI = in.next();
                        System.out.println("\nPlease Enter Commercial Record :");
                        String record = in.next();

                        System.out.println("\nPlease Enter Discount Rate : ");
                        int discount = in.nextInt();


                        clientService.addClient(new Institution(idI, nameI, addressI, phoneI, record, discount));
                            System.out.println("Added Customer_Institution Successful.");
                        }
                        else
                            System.out.println("Sorry this ID is Added, You Can’t Added again!");


                    } else
                        System.out.println("It is Wrong, Please Enter right Number.");


                    break;

                }


                case 7: {

                    System.out.println(" Please Enter ID for Customer: ");
                    int id = in.nextInt();

                    Customer.Client found2 = clientService.searchClient(id);
                    if (found2 != null)
                        found2.displayInfo();
                    else
                        System.out.println("Sorry Customer not found");

                    break;
                }


                case 8: {
                    clientService.displayClients();
                    break;   }


                case 9: {
                    System.out.println(" Please Enter ID for Customer You need Edit Information: ");
                    int id = in.nextInt();
                    in.nextLine();
                    System.out.println("\nPlease Enter New Name: ");
                    String name = in.nextLine();

                    System.out.println("\nPlease Enter New Address: ");
                    String address = in.next();
                    System.out.println("\nPlease Enter New Phone: ");
                    String phone = in.next();

                    boolean found2 = clientService.updateClient(id,name,address,phone);
                    if (found2){
                        System.out.println(" Edit Information Successful.");
                    }
                    else
                        System.out.println("Sorry ID Customer not found");
                    break; }


                case 10: {
                    System.out.println("\nPlease Enter Plate Number For Vehicle you need Rental: ");
                    String plateNumber = in.next();


                    Vehicle found = vehicleService.searchVehicle(plateNumber);
                    if (found != null)
                    {
                        System.out.println("\nPlease Enter Customer ID : ");
                        int id = in.nextInt();

                        Customer.Client found2 = clientService.searchClient(id);
                        if (found2 != null){
                            System.out.println("\nPlease Enter Contract ID for Rental : ");
                            int idContract = in.nextInt();
                            System.out.println("\nPlease Enter Rental Days : ");
                            int numberDays = in.nextInt();
                            System.out.println("\nPlease Enter Rental Date (Year) : ");
                            int y= in.nextInt();
                            System.out.println("\nPlease Enter Rental Date (Month) : ");
                            int m = in.nextInt();
                            System.out.println("\nPlease Enter Rental Date (Day) : ");
                            int d= in.nextInt();

                            RentalContract  contract=new RentalContract(idContract,found2,found,numberDays,LocalDate.of(y,m,d));

                           boolean addContract= rentalService.rentVehicle(contract);
                            if (addContract){
                                contract.displayContract();

                                System.out.println("\n Rental Vehicle Successful.\n");

                            }
                            else System.out.println("It is wrong this Contract Added, (Rental Fail) !");

                        }
                        else
                            System.out.println("Sorry ID Customer not found");
                    }
                    else
                        System.out.println("Sorry Vehicle Plate Number not found");

                    break;}


                case 11: {

                    System.out.println("\nPlease Enter Contract ID for Return : ");
                    int idContract = in.nextInt();

                        boolean finishContract = rentalService.returnVehicle(idContract);
                        if (finishContract)
                            System.out.println("\n ** Return Vehicle Successful **\n ");
                    else
                            System.out.println("\n ** Return Vehicle Fail! this ID Contract Not Found **\n ");
                    break;  }


                case 12: {
                    System.out.println("\n 1. You need Display rental Contract Active. \n 2. You need Display rental Contract Finish.  ");
                    String showCon = in.next();

                    if (showCon.equals("1")) {
                        rentalService.showActiveContracts();
                    }
                   else if (showCon.equals("2")) {
                            rentalService.showFinishedContracts();
                        }
                            else
                            System.out.println("It is Wrong, Please Enter right Number.");

                    break;

                }


                case 13: {
                    System.out.println("\n 1. You need Display rental Contract Customer By Name Client. \n 2. You need Display rental Contract Customer He is Institution.  ");
                    String showCos = in.next();

                    if (showCos.equals("1")) {
                        System.out.println("Please Enter Client Name:");
                        String name = in.nextLine();
                        rentalService.showContractsByClientName(name);
                    }
                   else if (showCos.equals("2")) {
                        rentalService.showInstitutionContracts();
                    }
                    else
                        System.out.println("It is Wrong, Please Enter right Number.");

                    break;

                }


                case 14: {
               vehicleService.displayRentedVehicles();
                    break;

                }


                case 15: {
                        rentalService.showVehiclesWithFines();
                    break;

                }


                case 16: {

                    System.out.println("\n 1. You need Display All rental Vehicles for Date. \n 2. You need Display rental Motorcycle Only for Date.  ");
                    String showCon = in.next();

                    if (showCon.equals("1")) {

                        System.out.println("\nPlease Enter Start Rental Date (Year) : ");
                        int ys= in.nextInt();
                        System.out.println("\nPlease Enter Start Rental Date (Month) : ");
                        int ms = in.nextInt();
                        System.out.println("\nPlease Enter Start Rental Date (Day) : ");
                        int ds= in.nextInt();
                        System.out.println("\n-----------------------------------------\n");
                        System.out.println("\nPlease Enter End Rental Date (Year) : ");
                        int ye= in.nextInt();
                        System.out.println("\nPlease Enter End Rental Date (Month) : ");
                        int me = in.nextInt();
                        System.out.println("\nPlease Enter End Rental Date (Day) : ");
                        int de= in.nextInt();

                        rentalService.showRentedVehiclesBetween(LocalDate.of(ys,ms,ds),LocalDate.of(ye,me,de),false);
                    }
                    else if (showCon.equals("2")) {

                        System.out.println("\nPlease Enter Start Rental Date (Year) : ");
                        int ys= in.nextInt();
                        System.out.println("\nPlease Enter Start Rental Date (Month) : ");
                        int ms = in.nextInt();
                        System.out.println("\nPlease Enter Start Rental Date (Day) : ");
                        int ds= in.nextInt();
                        System.out.println("\n-----------------------------------------\n");
                        System.out.println("\nPlease Enter End Rental Date (Year) : ");
                        int ye= in.nextInt();
                        System.out.println("\nPlease Enter End Rental Date (Month) : ");
                        int me = in.nextInt();
                        System.out.println("\nPlease Enter End Rental Date (Day) : ");
                        int de= in.nextInt();

                        rentalService.showRentedVehiclesBetween(LocalDate.of(ys,ms,ds),LocalDate.of(ye,me,de),true);
                    }
                    else
                        System.out.println("It is Wrong, Please Enter right Number.");

                    break;

                }


                case 17: {
                    System.out.println("\nPlease Enter Plate Number For Vehicle, you need Display its Customers: ");
                    String plateNumber = in.next();
                    rentalService.showClientsByVehicle(plateNumber);
                    break;

                }


                case 18: {
                    rentalService.showTotalRevenue();

                    break;

                }


                case 19: {
                    rentalService.showMostRentedVehicles();
                    break;

                }


                case 20: {
clientService.showVipClients(rentalService);
                    break;

                }


                case 21: {
                    return;
                }

                default:
                    System.out.println(" It is Wrong, Please Enter again.\n");
                    break;
            }


        }


    }
}


