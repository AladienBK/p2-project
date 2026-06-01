
public abstract class Client {

    protected int clientId;
    protected String name;
    protected String address;
    protected String phone;

    public Client(int clientId,
                    String name,
                    String address,
                    String phone) {

        this.clientId = clientId;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public int getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public abstract double calculateDiscount(double amount);

    public abstract void displayInfo();
}