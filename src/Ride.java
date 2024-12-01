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
//getters amd setters 


    
}
