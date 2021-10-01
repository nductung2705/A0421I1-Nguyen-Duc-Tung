package casestudy.models;

public class Villa extends Facility{
    private String roomStandard;
    private float poolArea;
    private int numbersOfFloor;

    public Villa(String roomStandard, float poolArea, int numbersOfFloor,String serviceName, float area, float cost, int capacity, String rentType) {
        super(serviceName,area, cost, capacity, rentType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numbersOfFloor = numbersOfFloor;
    }

    @Override
    public float getCost() {
        return this.cost;
    }
}
