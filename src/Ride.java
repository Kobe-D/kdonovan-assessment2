//The Ride class is used to track the rides available at the theme park, e.g., roller coaster, water riders, etc.
public class Ride {
    private String rideName;
    private Employee operator;
    private boolean isOpen;
    private int length;
//constructor   
public Ride(){
    this.rideName = "ride name";
    this.operator = null; 
    this.isOpen = false;
    this.length = 0;
}
//setting parameters 
public Ride(String rideName, Employee operator, boolean isOpen, int length){
    this.rideName = rideName;
    this.operator = operator;
    this.isOpen = isOpen;
    this.length = length;
}
//getters and setters 
public String getRideName(){
    return rideName;
}
public Employee getOperator(){
    return operator;
}
public boolean isOpen(){
    return isOpen;
}
public int getlenght(){
    return length;
}
public void setRideNames(String rideName) {
    this.rideName = rideName;
}

public void setOperator(Employee operator) {
    this.operator = operator;
}
public void setOpen(boolean isOpen){
    this.isOpen = isOpen;
}
public void setLength(int length) {
    this.length = length;
}
   
// adding a print method to print information for ride class
public void displayInfor(){
    System.out.println(rideName);
    if (operator != null){
        System.out.println("Assigned operator: " + operator.getName());
    } else {
        System.out.println("No assigned operator yet");
    }
    System.out.println("Ride lenght: " + length + "minutes");
    System.out.println("Is open: " + isOpen);
}


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

}