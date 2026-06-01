
import java.util.ArrayList;

public class ClientService {

    private ArrayList<Client> clients = new ArrayList<>(); // نخزن فيها جميع العملاء

    // اضافة عملاء
    public boolean addClient(Client client) {

        if (searchClient(client.getClientId()) != null)
            return false;

        clients.add(client);
        return true;
    }

    // حذف عميل
    public boolean removeClient(int clientId) {

        Client client = searchClient(clientId);

        if (client == null)
            return false;

        clients.remove(client);
        return true;
    }

    // تعديل بيانات العميل
    public boolean updateClient(int id,
            String newName,
            String newAddress,
            String newPhone) {

        Client client = searchClient(id);

        if (client == null)
            return false;

        client.setName(newName);
        client.setAddress(newAddress);
        client.setPhone(newPhone);

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

    // عرض المؤسسات فقط
    public void displayInstitutions() {

        for (Client client : clients) {

            if (client instanceof Institution)
                client.displayInfo();
        }
    }

    //عرض الافراد فقط
    public void displayIndividuals() {

        for (Client client : clients) {

            if (client instanceof Individual)
                client.displayInfo();
        }
    }

    // عرض جميع العملاء
    public void displayClients() {

        for (Client c : clients)
            c.displayInfo();
    }

    // ارجاع عدد العملاء
    public int getClientsCount() {

        return clients.size();
    }

    // Arraylist ارجاع العملاء في
    public ArrayList<Client> getClients() {

        return clients;
    }

}