package casestudy.models;

public abstract class Facility {
    private String serviceName="";
    private float area;
    protected float cost;
    private int capacity;
    private String rentType;

    public Facility(String serviceName, float area, float cost, int capacity, String rentType) {
        this.serviceName = serviceName;
        this.area = area;
        this.cost = cost;
        this.capacity = capacity;
        this.rentType = rentType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public abstract float getCost();

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }
}
