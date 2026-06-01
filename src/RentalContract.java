public class RentalContract {

    private int contractId;
    private Client client;
    private Vehicle vehicle;
    private int rentalDays;
    private String rentalDate;

    public RentalContract(int contractId,
            Client client,
            Vehicle vehicle,
            int rentalDays,
            String rentalDate) {

        this.contractId = contractId;
        this.client = client;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
        this.rentalDate = rentalDate;
    }

    // حساب المبلغ الكلي
    public double calculateTotalCost() {

        double total = vehicle.calculateRentalCost(rentalDays);

        double discount = client.calculateDiscount(total);

        return total - discount;
    }

    // عرض معلومات العرض
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
                "totalCost=" + calculateTotalCost() + '}' + "\n";
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

    public String getRentalDate() {
        return rentalDate;
    }
}
