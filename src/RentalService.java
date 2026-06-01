import java.time.LocalDate;
import java.util.ArrayList;

public class RentalService {

    private ArrayList<RentalContract> contracts = new ArrayList<>();

    // اضافة عقد
    public boolean addContract(RentalContract contract) {

        if (searchContract(contract.getContractId()) != null)
            return false;

        contracts.add(contract);

        return true;
    }

    // البحث عن عقد
    public RentalContract searchContract(int id) {

        for (RentalContract contract : contracts) {

            if (contract.getContractId() == id)
                return contract;
        }

        return null;
    }

    // عرض العقود النشطة
    public void showActiveContracts() {

        for (RentalContract contract : contracts) {

            if (!contract.isFinished())
                System.out.println(contract);
        }
    }

    // عرض العقود المنتهة
    public void showFinishedContracts() {

        for (RentalContract contract : contracts) {

            if (contract.isFinished())
                System.out.println(contract);
        }
    }

    // عرض عقود عميل حسب الاسم
    public void showContractsByClientName(String name) {

        for (RentalContract contract : contracts) {

            if (contract.getClient().getName().equalsIgnoreCase(name))
                System.out.println(contract);
        }
    }

    // عرض عقود المؤسسات فقط
    public void showInstitutionContracts() {

        for (RentalContract contract : contracts) {

            if (contract.getClient() instanceof Institution)
                System.out.println(contract);
        }
    }

    // عرض المركبات التي عليها غرامات
    public void showVehiclesWithFines() {

        for (RentalContract contract : contracts) {

            if (contract.getFine() > 0)
                contract.getVehicle().displayInfo();
        }
    }

    // عرض جميع العقود
    public void displayContracts() {

        for (RentalContract contract : contracts) {

            contract.displayContract();
        }
    }

    // حذف العقد
    public boolean removeContract(int id) {

        RentalContract contract = searchContract(id);

        if (contract == null)
            return false;

        contracts.remove(contract);

        return true;
    }

    // عدد العقود
    public int getContractsCount() {

        return contracts.size();
    }

    // ArrayList ارجاع العقود ك
    public ArrayList<RentalContract> getContracts() {

        return contracts;
    }

    // تاجير مركبة
    public boolean rentVehicle(RentalContract contract) {

        if (searchContract(contract.getContractId()) != null)
            return false;

        if (!contract.getVehicle().isAvailable())
            return false;
        contract.getVehicle().rent();

        contracts.add(contract);

        return true;
    }

    // ارجاع مركبة
    public boolean returnVehicle(int contractId) {

        RentalContract contract = searchContract(contractId);

        if (contract == null)
            return false;

        contract.closeContract(LocalDate.now());

        contract.getVehicle().returnVehicle();
        contract.printInvoice();
        return true;
    }

    // عدد العقود المنتهية للعميل الواحد
    public int countFinishedContractsForClient(Client client) {

        int count = 0;

        for (RentalContract contract : contracts) {

            if (contract.isFinished()
                    && contract.getClient().getClientId() == client.getClientId()) {

                count++;
            }
        }

        return count;
    }

    
    // عرض العملاء الذين استاجروا سيارة معينة
    public void showClientsByVehicle(String plateNumber) {

        ArrayList<Integer> printedClients = new ArrayList<>();
        boolean found = false;
        for (RentalContract contract : contracts) {

            if (contract.getVehicle().getPlateNumber().equalsIgnoreCase(plateNumber)) {

                int clientId = contract.getClient().getClientId();
                if (!printedClients.contains(clientId)) {

                    System.out.println(contract.getClient());
                    printedClients.add(clientId);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No clients found for this vehicle.");
        }
    }

    // عرض المركبات المؤجرة خلال فترة زمنية محددة
    // false جميع المركبات
    // true motorcycle
    public void showRentedVehiclesBetween(LocalDate startDate, LocalDate endDate, boolean motorcyclesOnly) {

        ArrayList<String> printedVehicles = new ArrayList<>();
        boolean found = false;
        for (RentalContract contract : contracts) {

            LocalDate rentDate = contract.getRentalDate();
            if ((rentDate.isEqual(startDate) || rentDate.isAfter(startDate))&& (rentDate.isEqual(endDate) || rentDate.isBefore(endDate))) {

                Vehicle vehicle = contract.getVehicle();
                if (motorcyclesOnly && !(vehicle instanceof Motorcycle))
                    continue;
                String plate = vehicle.getPlateNumber();

                if (!printedVehicles.contains(plate)) {

                    System.out.println(vehicle);
                    printedVehicles.add(plate);
                    found = true;
                }
            }
        }

        if (!found)
            System.out.println("No vehicles found.");
    }

    // عرض المركبات الاكثر تاجيرا
    public void showMostRentedVehicles() {

        if (contracts.isEmpty()) {
            System.out.println("No rental contracts found.");
            return;
        }

        ArrayList<Vehicle> mostRentedVehicles = new ArrayList<>();

        int maxRentCount = 0;

        for (int i = 0; i < contracts.size(); i++) {

            Vehicle vehicle = contracts.get(i).getVehicle();

            int count = 0;

            for (int j = 0; j < contracts.size(); j++) {

                if (contracts.get(j).getVehicle()
                        .getPlateNumber()
                        .equals(vehicle.getPlateNumber())) {

                    count++;
                }
            }

            if (count > maxRentCount) {

                maxRentCount = count;

                mostRentedVehicles.clear();

                mostRentedVehicles.add(vehicle);

            } else if (count == maxRentCount) {

                boolean exists = false;

                for (Vehicle v : mostRentedVehicles) {

                    if (v.getPlateNumber()
                            .equals(vehicle.getPlateNumber())) {

                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    mostRentedVehicles.add(vehicle);
                }
            }
        }

        System.out.println("\n===== MOST RENTED VEHICLES =====");

        for (Vehicle vehicle : mostRentedVehicles) {

            System.out.println(vehicle);
            System.out.println("Rental Count = " + maxRentCount);
            System.out.println("--------------------");
        }
    }

    // عرض الايرادات الكلية
    public void showTotalRevenue() {

        double totalRevenue = 0;

        for (RentalContract contract : contracts) {

            if (contract.isFinished()) {
                totalRevenue += contract.getFinalCost();
            }
        }

        System.out.println("\n===== COMPANY REVENUE =====");
        System.out.println("Total Revenue = " + totalRevenue);
        System.out.println("===========================\n");
    }

}