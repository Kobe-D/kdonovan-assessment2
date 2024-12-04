// kobe donovan 24210524
//The Employee class is used to track the theme park staff who operate rides.
//extends the person class
public class Employee extends Person{
    //making employee class unique vairables
    private String role;
    private String uID;
//constructor 
public Employee(){
//call constuctor from parent class (Person)
    super();
    this.role = "role";
    this.uID = "uID";
}
// set up the paremters for consturcor
public Employee(String name, String mobile, String gender, String role, String uID){
    super(name, mobile, gender);
    this.role = role;
    this.uID = uID;
}
// implementing getters and setter 
public String getRole() {
    return role; 
}

public String getUID() {
    return uID;
}

public void setRole(String role) {
    this.role = role;
}

public void setUID(String uID) {
    this.uID = uID;
}
//overide method so the employee class can communicate to Person class 
//this was used in the last assessment under the recomendation of gen AI
//so i will still refer to the @overide code being Ai generated. 
@Override
public void displayInfo() {
    // add a method to display the employee info
    System.out.println("Employee Info: " + getName() + ", " + getRole() + ", " + getUID());
}
@Override
public String toString() {  //to string allows a better formatted employee output
    return "Employee Info: " + uID + ", " + getName() + ", " + getMobile() + ", " + getGender() + ", " + role;
}

}
