package Customer;

import java.time.LocalDate;


public class Individual extends Client {

    private String drivingLicense;
    private LocalDate birthDate;

    public Individual(int clientId,
                      String name,
                      String address,
                      String phone,
                      String drivingLicense,
                      LocalDate birthDate
                      ) {

        super(clientId, name, address, phone);

        this.drivingLicense = drivingLicense;
        this.birthDate = birthDate;
    }

    @Override
    public double calculateDiscount(double amount) {
        return 0;
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {

        return "Individual{" +
                "Client Id=" + clientId + "\n" + 
                "name='" + name + "' \n" +
                "address='" + address + "' \n" +
                "phone='" + phone + "' \n" +
                "driving License='" + drivingLicense + "' \n" +
                "birth Date='" + birthDate + '}' + "\n";
    }
}