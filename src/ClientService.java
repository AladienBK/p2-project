

import java.util.ArrayList;

public class ClientService {

    private ArrayList<Client> clients = new ArrayList<>(); // نخزن فيها جميع العملاء

    //اضافة عملاء
    public boolean addCustomer(Client client) {

        if(searchClient(client.getClientId()) != null)
            return false;

        clients.add(client);
        return true;
    }

    // id البحث عن عملاء بواسطة ال
    public Client searchClient(int id) {

        for(Client c : clients) {

            if(c.getClientId() == id)
                return c;
        }

        return null;
    }

    //عرض جميع العملاء
    public void displayClients() {

        for(Client c : clients)
            c.displayInfo();
    }

    //ارجاع عدد العملاء
    public int getClinetsCount() {

        return clients.size();
    }

    // Arraylist ارجاع العملاء في 
    public ArrayList<Client> getClients() {

        return clients;
    }


}