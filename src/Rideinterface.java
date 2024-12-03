//part 2
public interface Rideinterface{
    void addVisitortoQueue(Visitor visitor);
    void removeVisitorfromQueue(Visitor visitor);
    void printQueue();
    void runOneCycle();
    void addVisitorToHistory(Visitor visitor);
    boolean checkVisitorfromHistory(Visitor visitor);
    int numberofVisitors();
    void printRideHistory();


}   
