public class Customer {
    private String cusId;
    private String name;
    private int vehicleNum;
    private int NICnum;

    public Customer(String cusId, String name, int vehicleNum, int NICnum) {
        this.cusId = cusId;
        this.name = name;
        this.vehicleNum = vehicleNum;
        this.NICnum = NICnum;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVehicleNum() {
        return vehicleNum;
    }

    public void setVehicleNum(int vehicleNum) {
        this.vehicleNum = vehicleNum;
    }

    public int getNICnum() {
        return NICnum;
    }

    public void setNICnum(int NICnum) {
        this.NICnum = NICnum;
    }

    @Override
    public String toString() {
        return "Customer ID: " + cusId + ", Name: " + name + ", Vehicle Number: " + vehicleNum + ", NIC Number: " + NICnum;
    }
}
