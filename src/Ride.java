//The Ride class is used to track the rides available at the theme park, e.g., roller coaster, water riders, etc.
public class Ride implements Rideinterface {
    private String rideName;
    private Employee operator;
    private boolean isOpen;
    private int length;

//part 3 stating visitor queue variables
    private Visitor[] queue;
    private int queueSize;
    private final int maxQueueSize = 56; // setting the max queue size as double what the avg roller coaster rides seat is ( according to asking chatgpt : :"whats the average of how many seats are on a roller coaster" )

//part 3 stating ride history variables
    private Visitor[] rideHistory;
    private int historySize;




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
// if else statmen to either print employye assigned name or say if no ones has been assigned yet
    if (operator != null){
        System.out.println("Assigned operator: " + operator.getName());
    } else {
        System.out.println("No assigned operator yet");
    }
    System.out.println("Ride lenght: " + length + "minutes");
    System.out.println("Is open: " + isOpen);
}

// updating ride file for part 2 
//implementing methods for rideinterface  ( will be continued on in further parts)
@Override
public void addVisitortoQueue(Visitor visitor) {
// part 3 implementation
}

@Override 
public void removeVisitorfromQueue(Visitor visitor) {
// part 3 implementation
}

@Override
public void printQueue(){
    //part 3 implemnation
}

@Override
public void runOneCycle() {
// part 5 implemnation
}

@Override
public void addVisitorToHistory(Visitor visitor) {
}

@Override
public boolean checkVisitorfromHistory(Visitor visitor) {
// part 4 implementation 
    return false; 
}

@Override
public int numberofVisitors(){
//part 4 implementation 
    return 0;
}

@Override
public void printRideHistory(){
// part 4 implementation 
}

}