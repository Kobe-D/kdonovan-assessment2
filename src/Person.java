public abstract class Person {
//Add at least 3 instance variables suitable for a person
    private String name;
    private String mobile;
    private String gender; 

// constructor
public Person(){
    this.name = "name";
    this.mobile = "contact";
    this.gender = "gender";
    
    }
// making parameter fr constructor 
public Person(String name, String mobile, String gender) {
    this.name = name;
    this.mobile = mobile; //( Mobile phone numbers are not stored as integers, as the integer data type holds values that have the potential to be used in calculations.)
    this.gender = gender;
}
// setting up the getters for variables 

public String getName(){
    return name;
}

public String getMobile(){
    return mobile;
}

public String getGender(){
    return gender;
}

    // implementing setters
public void setName(String name) {
    this.name = name;
}

public void setmobile(String mobile){
    this.mobile = mobile;
}

public void setGender(String gender){
    this.gender = gender;
}
// method for displaying information from subclasses 
public abstract void displayInfo();

}
