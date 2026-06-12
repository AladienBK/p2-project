package Service;

import Customer.Client;
import java.util.ArrayList;

public class ClientService {

    private ArrayList<Client> clients = new ArrayList<>(); // نخزن فيها جميع العملاء

    // اضافة عميل جديد
    public boolean addClient(Client client) {

        if (searchClient(client.getClientId()) != null)
            return false;

        clients.add(client);
        return true;
    }

    // id البحث عن عملاء بواسطة ال
    public Client searchClient(int id) {

        for (Client c : clients) {

            if (c.getClientId() == id)
                return c;
        }

        return null;
    }

    // البحث عن عميل بالاسم
    public Client searchClient(String name) {

        for (Client client : clients) {

            if (client.getName().equalsIgnoreCase(name))
                return client;
        }

        return null;
    }

    // عرض جميع العملاء
    public void displayClients() {

        for (Client c : clients)
            c.displayInfo();
    }

    // تعديل معلومات العميل
    public boolean updateClient(int id, String newName, String newAddress, String newPhone) {

        Client client = searchClient(id);

        if (client == null)
            return false;

        client.setName(newName);
        client.setAddress(newAddress);
        client.setPhone(newPhone);
        
        return true;
    }
    
    // VIP عرض العملاء ال
    public void showVipClients(RentalService rentalService) {

        for (Client client : clients) {

            if (rentalService.countFinishedContractsForClient(client) >= 5)
                client.displayInfo();
        }
    }


}