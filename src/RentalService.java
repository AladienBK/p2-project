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

        if (!contract.getVehicle().isAvailable())
            return false;

        contract.getVehicle().rent();

        contracts.add(contract);

        return true;
    }

    //ارجاع مركبة 
    public boolean returnVehicle(int contractId) {

        RentalContract contract = searchContract(contractId);

        if (contract == null)
            return false;

        contract.getVehicle().returnVehicle();

        return true;
    }

}