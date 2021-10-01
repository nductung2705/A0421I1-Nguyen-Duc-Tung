package casestudy.models;

public class House extends Facility{
    private String roomStandard;
    private int numbersOfFloor;

    public House(String roomStandard, int numbersOfFloor,String serviceName, float area, float cost, int capacity, String rentType) {
        super(serviceName,area, cost, capacity, rentType);
        this.roomStandard = roomStandard;
        this.numbersOfFloor = numbersOfFloor;
    }
    @Override
    public float getCost() {
        return 0;
    }
}