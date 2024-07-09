import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuelFillingSystem {
    private List<FuelType> fuelTypes;
    private List<Customer> customers;
    private List<FuelStation> fuelStations;

    public FuelFillingSystem() {
        fuelTypes = new ArrayList<>();
        customers = new ArrayList<>();
        fuelStations = new ArrayList<>();
    }

    public void addFuelType(FuelType fuelType) {
        fuelTypes.add(fuelType);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void fuelFilling(FuelType fuelType, Customer customer, int fuelPump, int fuelLitter) {
        if (fuelType.isAvailable()) {
            fuelType.filling();
            fuelStations.add(new FuelStation(customer, fuelType, fuelPump));
            double totalPrice = fuelType.calculatePrice(fuelLitter);
            System.out.println("Fuel Pumping Bill...");
            System.out.println("Customer Details: " + customer);
            System.out.println("Fuel Type: " + fuelType.getFuelType());
            System.out.println("Fuel Price: " + fuelType.getFuelPrice());
            System.out.println("Total Price: " + totalPrice);
            System.out.println("Have a good travel");
        } else {
            System.out.println("This type of fuel is not available now.");
        }
    }

    public void menu() {
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("==== Welcome to Thaj Fuel Station ====");
            System.out.println("1. Check Fuel Types Available");
            System.out.println("2. Fuel Filling");
            System.out.println("3. Exit");
            System.out.println("Enter Your Choice: ");

            int choice = scn.nextInt();
            scn.nextLine(); // newline

            switch (choice) {
                case 1: {
                    System.out.println("==== Available Fuels ====");
                    for (FuelType fuelType : fuelTypes) {
                        if (fuelType.isAvailable()) {
                            System.out.println(fuelType.getFuelId() + " - " + fuelType.getFuelType() + " - " + fuelType.getFuelPrice());
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter Your Name: ");
                    String customerName = scn.nextLine();

                    System.out.println("Enter Your Vehicle Number: ");
                    int vehicleNum = scn.nextInt();
                    scn.nextLine();

                    System.out.println("Enter Your NIC Number: ");
                    int NICnum = scn.nextInt();
                    scn.nextLine();

                    System.out.println("Enter the Fuel Type ID: ");
                    String fuelId = scn.nextLine();

                    System.out.println("Enter the number of liters for pump: ");
                    int fuelLitter = scn.nextInt();
                    scn.nextLine();

                    Customer newCustomer = new Customer("CUS" + (customers.size() + 1), customerName, vehicleNum, NICnum);
                    addCustomer(newCustomer);

                    FuelType selectedFuel = null;
                    for (FuelType fuelType : fuelTypes) {
                        if (fuelType.getFuelId().equals(fuelId) && fuelType.isAvailable()) {
                            selectedFuel = fuelType;
                            break;
                        }
                    }

                    if (selectedFuel != null) {
                        fuelFilling(selectedFuel, newCustomer, fuelStations.size() + 1, fuelLitter);
                    } else {
                        System.out.println("Selected fuel type is not available.");
                    }
                    break;
                }
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        FuelFillingSystem system = new FuelFillingSystem();
        system.addFuelType(new FuelType("F01", "Petrol", true, 180));
        system.addFuelType(new FuelType("F02", "Diesel", true, 150));
        system.menu();
    }
}
