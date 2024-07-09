public class FuelType {
    private String fuelId;
    private String fuelType;
    private boolean isAvailable;
    private double basePricePerLitter;

    public FuelType(String fuelId, String fuelType, boolean isAvailable, double fuelPrice){
        this.fuelId = fuelId;
        this.fuelType = fuelType;
        this.isAvailable = true;
        this.basePricePerLitter = fuelPrice;
    }

    public String getFuelId() {
        return fuelId;
    }

    public void setFuelId(String fuelId) {
        this.fuelId = fuelId;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double getFuelPrice() {
        return basePricePerLitter;
    }

    public void setFuelPrice(double fuelPrice) {
        this.basePricePerLitter = fuelPrice;
    }

    public double calculatePrice(int fillinglitter){
        return basePricePerLitter * fillinglitter;
    }

     public void filling(){
        isAvailable = false;
     }
     public void fuelcheck(){
        isAvailable = true;
     }
}
