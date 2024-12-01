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

public String setRole(String role) {
    this.role = role;
}

public String setUID(String uID) {
    this.uID = uID;
}




}
