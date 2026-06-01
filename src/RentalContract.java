import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class RentalContract {

    private int contractId;
    private Client client;
    private Vehicle vehicle;
    private int rentalDays;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private int lateDays;
    private boolean finished;
    private double fine;
    private double finalCost;
    private double basicCost;

    public RentalContract(int contractId,
            Client client,
            Vehicle vehicle,
            int rentalDays,
            LocalDate rentalDate) {

        this.contractId = contractId;
        this.client = client;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
        this.rentalDate = rentalDate;
        this.finished = false;

        basicCost = vehicle.calculateRentalCost(rentalDays);
        double discount = client.calculateDiscount(basicCost);
        finalCost = basicCost - discount;
    }

    // حساب المبلغ الكلي
    public double calculateTotalCost() {

        double total = vehicle.calculateRentalCost(rentalDays);

        double discount = client.calculateDiscount(total);

        return total - discount;
    }

    // انهاء العقد
    public void closeContract(LocalDate actualReturnDate) {
        returnDate = actualReturnDate;
        LocalDate expectedDate = rentalDate.plusDays(rentalDays);

        if (actualReturnDate.isAfter(expectedDate)) {
            lateDays = (int) ChronoUnit.DAYS.between(expectedDate, actualReturnDate);
            fine = basicCost * 0.10 * lateDays;
        } else {
            lateDays = 0;
            fine = 0;
        }

        finalCost += fine;
        finished = true;
    }

    // عرض معلومات العقد
    public void displayContract() {
        System.out.println(this);
    }

    @Override
    public String toString() {

        return "RentalContract{" + "\n" +
                "contractId=" + contractId + "\n" +
                "client=" + client.getName() + "\n" +
                "vehicle=" + vehicle.getPlateNumber() + "\n" +
                "rentalDays=" + rentalDays + "\n" +
                "rentalDate='" + rentalDate + "' \n" +
                "totalCost=" + calculateTotalCost() + '}' + "\n" +
                "finalCost=" + finalCost + "\n";

    }

    //تابع عرض الفاتورة
    public void printInvoice() {

        System.out.println("\n===== FINAL INVOICE =====");

        System.out.println("Contract ID : " + contractId);
        System.out.println("Client      : " + client.getName());
        System.out.println("Vehicle     : " + vehicle.getPlateNumber());

        System.out.println("-------------------------");

        System.out.println("Basic Cost  : " + basicCost);
        System.out.println("Discount    : " + getDiscount());
        System.out.println("Late Days   : " + lateDays);
        System.out.println("Fine        : " + fine);

        System.out.println("-------------------------");

        System.out.println("Final Cost  : " + finalCost);

        System.out.println("=========================\n");
    }

    public int getContractId() {
        return contractId;
    }

    public Client getClient() {
        return client;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public boolean isFinished() {
        return finished;
    }

    public int getLateDays() {
        return lateDays;
    }

    public double getFine() {
        return fine;
    }

    public double getFinalCost() {
        return finalCost;
    }

    public double getBasicCost() {
        return basicCost;
    }

    public double getDiscount() {
        return client.calculateDiscount(basicCost);
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

}
