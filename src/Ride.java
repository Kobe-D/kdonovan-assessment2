// part 4 implementing linked list using guidence from GenAi(Chatgpt)
import java.util.Iterator;
import java.util.LinkedList;

public class Ride implements Rideinterface {
    private String rideName;
    private Employee operator;
    private boolean isOpen;
    private int length;

//part 3 stating visitor queue variables
    private Visitor[] queue;
    private int queueSize;
    private final int maxQueueSize = 56; // setting the max queue size as double what the avg roller coaster rides seat is ( according to asking chatgpt : :"whats the average of how many seats are on a roller coaster" )

//part 4 Guidence from GenAI(chatgpt) for linked list
    private LinkedList<Visitor> rideHistory;
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
//part 3 initialise my queues and history  as arrays
    this.queue = new Visitor[maxQueueSize];
    this.queueSize = 0;
    // help with GenAi for part4A
    this.rideHistory = new LinkedList<>();
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
    if (queueSize < maxQueueSize) {
        queue[queueSize++] = visitor;
        System.out.println(visitor.getName() + " has joined the queue!!");
    } else {
        System.out.println("Sorry were full " + visitor.getName() + " cannot be added to the queue at this time :( " );
       }
} 


@Override 
public void removeVisitorfromQueue(Visitor visitor) {
// part 3 implementation
    boolean found = false;
    for (int i = 0; i < queueSize; i++) {
        if (queue[i].equals(visitor)) {
            found = true;
            for ( int x = i; x < queueSize - 1; x++) {
                queue[x] = queue[x + 1];
            }
            //reducing size of queue and clearing the last one 
            queue[--queueSize] = null;
            System.out.println(visitor.getName() + " Visitor has succesfully been removed from the queue ");
            break;

        }
    }
    if (!found) {
        System.out.println(visitor.getName() + " is no longer in the queue");
    }
}
@Override
public void printQueue(){
    //part 3 implemnation
    System.out.println(" The current queue for " + rideName + "");
    if (queueSize == 0) {
        System.out.println("this queue is currently empty");
    } else {
        for (int i = 0; i < queueSize; i++) {
            System.out.println(" " + queue[i].getName());

        }
    }
}
@Override
public void runOneCycle() {
// part 5 implemnation
}

@Override
public void addVisitorToHistory(Visitor visitor) {
    // part 4 implementation
    rideHistory.add(visitor); 
    System.out.println(visitor.getName() + " has been added to the ride history.");
}

@Override
public boolean checkVisitorfromHistory(Visitor visitor) {
    // part 4 implementation
    return rideHistory.contains(visitor); 
}


@Override
public int numberofVisitors(){
//part 4 implementation 
    return rideHistory.size();
}

@Override
public void printRideHistory() {
    System.out.println("List of previous riders for " + rideName + ":");
    if (rideHistory.isEmpty()) {
        System.out.println("Currently no visitor history for this ride.");
    } else {
        Iterator<Visitor> iterator = rideHistory.iterator();
        int index = 1;
        while (iterator.hasNext()) {
            Visitor visitor = iterator.next();
            System.out.println("Visitor " + index + ": " + visitor.getName());
            index++;
            }
        }
    }    
}
