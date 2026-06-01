public class ReportService {

        // عرض عدد المركبات
        public void vehicleCountReport(VehicleService vehicleService) {
                System.out.println("Total Vehicles = " + vehicleService.getVehiclesCount());
        }

        // عرض عدد العملاء
        public void clientCountReport(ClientService clientService) {
                System.out.println("Total Clients = " + clientService.getClientsCount());
        }

        // عرض عدد العقود
        public void contractCountReport(RentalService rentalService) {
                System.out.println("Total Contracts = "+ rentalService.getContractsCount());
        }

        // حساب اجمالي الارباح
        public void totalRevenueReport(RentalService rentalService) {
                double total = 0;
                for (RentalContract contract : rentalService.getContracts()) {
                        total += contract.getFinalCost();
                }

                System.out.println("Total Revenue = " + total);
        }

        // عرض المركبات المتاحة
        public void availableVehiclesReport(VehicleService vehicleService) {
                vehicleService.displayAvailableVehicles();
        }

}
