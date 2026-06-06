package Customer;

public class Institution extends Client {

    private String commercialRecord;
    private double discountRate;

    public Institution(int customerId,
            String name,
            String address,
            String phone,
            String commercialRecord,
            double discountRate) {

        super(customerId, name, address, phone);

        this.commercialRecord = commercialRecord;
        this.discountRate = discountRate;
    }

    

    @Override
    public double calculateDiscount(double amount) {

        return amount * discountRate / 100;
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {

        return "instution{" +
                " Client Id=" + clientId + "\n" +
                "name='" + name + "' \n" +
                "address='" + address + "' \n" +
                "phone='" + phone + "' \n" +
                "commercial Record='" + commercialRecord + "' \n" +
                "discount Rate=" + discountRate + '}' + "\n";
    }
}