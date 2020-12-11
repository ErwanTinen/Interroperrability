


public class Room {
    public int numberOfChair ;
    public int maxNumberOfPeople ;
    public int numberOfComputers ;
    public int numberOfBoards ;

    public boolean Projector;

    public String name;

    public Room(int numberOfChair, int maxNumberOfPeople, int numberOfComputers, int numberOfBoards, boolean projector, String name) {
        this.numberOfChair = numberOfChair;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.numberOfComputers = numberOfComputers;
        this.numberOfBoards = numberOfBoards;
        Projector = projector;
        this.name = name;
    }
}
