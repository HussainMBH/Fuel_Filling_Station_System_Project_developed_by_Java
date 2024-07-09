public class FuelStation {
    private Customer customer;
    private  FuelType fuelType;
    private int pumplitter;

    public FuelStation(Customer customer, FuelType fuelType, int pumplitter){
        this.customer = customer;
        this.fuelType = fuelType;
        this.pumplitter = pumplitter;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }


}
