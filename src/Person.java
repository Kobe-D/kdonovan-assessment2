public abstract class Person {
//Add at least 3 instance variables suitable for a person
    private String name;
    private String contactdetails;
    private String gender; 

// constructor
    public Person(){
        this.name = "ENTER NAME";
        this.contactdetails = "ENTER CONTACT";
        this.gender = "enter gender";
    
    }
// making parameter fr constructor 

    public Person(String name, String contactdetails, String gender) {
        this.name = name;
        this.contactdetails = contactdetails;
        this.gender = gender;
    }
// setting up the getters for variables 

    public String getName(){
        return name;
    }

    public String getContactdetails(){
        return contactdetails;
    }

    public String getGender(){
        return gender;
    }

// method for displaying information from subclasses 
public abstract void displayInfo();

}
