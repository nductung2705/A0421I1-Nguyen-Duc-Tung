package casestudy.models;

public class Room extends Facility{
    private String serviceBonus;

    public Room(String roomStandard, int numbersOfFloor,String serviceName, float area, float cost, int capacity, String rentType,String serviceBonus) {
        super(serviceName,area, cost, capacity, rentType);
        this.serviceBonus=serviceBonus;
    }
    @Override
    public float getCost() {
        return 0;
    }
}
