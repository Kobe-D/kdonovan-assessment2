//The Visitor class is used to track the theme park visitors
//extends the person class
public class Visitor extends Person{
//Add at least 2 instance variables suitable for a theme park member 
    private boolean familyGroup;
    private boolean adult; 
    private String  ticketnumber;
    private boolean student; 
// constructor 
public Visitor(){
    super(); 
    this.familyGroup = false;
    this.adult = false;
    this.ticketnumber = "ticketnumber";
    this.student = false;
}
//setting parematers 
public Visitor(String name, String mobile, String gender, boolean familyGroup, boolean adult, boolean student, String ticketnumber){
    super(name, mobile, gender);
    this.familyGroup = familyGroup;
    this.adult = adult;
    this.ticketnumber = ticketnumber;
    this.student = student;

}














    
}
