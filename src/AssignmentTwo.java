
public class AssignmentTwo {

    //CODE BELOW FROM GEN AI IN ATTEMPT TO GET AN ACTUAL OUTPUT 
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();

        System.out.println("=== Part 3 Testing ===");
        assignment.partThree();

        System.out.println("\n=== Part 4A Testing ===");
        assignment.partFourA();

        System.out.println("\n=== Part 4B Testing ===");
        assignment.partFourB();


    
// CODE ABOVE FROM GEN AI IN ATTEMP TO GET AN OUTPUT 
        System.out.println("\n=== Part 5 Testing ===");
        assignment.partFive();

        System.out.println("\n=== Part 6 Testing ===");
        assignment.partSix();

        System.out.println("\n=== Part 7 Testing ===");
        assignment.partSeven();


}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void partThree(){
    //making new ride
    Ride ride1 = new Ride("ride 1", null, true, 3); 

// creating a list of visitors                         
    Visitor v001 = new Visitor("Tame Impala", "0444444444", "Male", false, true, false, "T0001");
    Visitor v002 = new Visitor("Kurt Cobain", "0477777777", "Male", true, true, false, "T0002");
    Visitor v003 = new Visitor("Jordan Carter", "066666666", "Male", false, true, true, "T0003");
    Visitor v004 = new Visitor("Pastel Ghost", "0202020202", "Female", false, true, false, "T0004");
    Visitor v005 = new Visitor("Pixies", "4545454544", "Male", true, true, false, "T0005");
    Visitor v006 = new Visitor("Tony Hawk", "46565456163", "Male", false, false, true, "T0006");
    Visitor v007 = new Visitor("Eric Smith", "741852963", "Male", false, true, true, "T0007");
    Visitor v008 = new Visitor("Jotaro Kujo", "4785245654", "Male", false, false, true, "T0008");
    Visitor v009 = new Visitor("Jessica Rabbit", "098527368", "Female", false, false, false, "T0009");
    Visitor v010 = new Visitor("Jade Pirf", "416468314", "Female", true, true, true, "T0010");
    
// putting visitors in the queue 
ride1.addVisitortoQueue(v010);
ride1.addVisitortoQueue(v009);
ride1.addVisitortoQueue(v008);
ride1.addVisitortoQueue(v007);
ride1.addVisitortoQueue(v006);
ride1.addVisitortoQueue(v005);
ride1.addVisitortoQueue(v004);
ride1.addVisitortoQueue(v003);
ride1.addVisitortoQueue(v002);
ride1.addVisitortoQueue(v001);
// adding a space and a bar to seperate information to make it clearer in terminal 
System.out.println();
System.out.println("=== Visitors who have left / been removed from queue ===");
System.out.println();
//removing from queue
ride1.removeVisitorfromQueue(v005);
ride1.removeVisitorfromQueue(v008);
ride1.removeVisitorfromQueue(v001);
System.out.println();
// adding a space and a bar to seperate information to make it clearer in terminal 
System.out.println();
System.out.println("=== The current queue for Ride 1 ===");
System.out.println();
// pring method 
ride1.printQueue();

 }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void partFourA(){
// new ride

Ride ride2 = new Ride("ride 2", null, true, 3);

// at least 5 visitors 
Visitor v005 = new Visitor("Pixies", "4545454544", "Male", true, true, false, "T0005");
Visitor v006 = new Visitor("Tony Hawk", "46565456163", "Male", false, false, true, "T0006");
Visitor v007 = new Visitor("Eric Smith", "741852963", "Male", false, true, true, "T0007");
Visitor v008 = new Visitor("Jotaro Kujo", "4785245654", "Male", false, false, true, "T0008");
Visitor v009 = new Visitor("Jessica Rabbit", "098527368", "Female", false, false, false, "T0009");

// add visitors to history of ride
ride2.addVisitorToHistory(v009);
ride2.addVisitorToHistory(v008);
ride2.addVisitorToHistory(v007);
ride2.addVisitorToHistory(v006);
ride2.addVisitorToHistory(v005);
// adding a space and a bar to seperate information to make it clearer in terminal 
System.out.println();
System.out.println("=== searching for past visitors ===");
System.out.println();

// check for specific Visitor is in the rides history 
System.out.println("Searching if Jessica Rabbit has previously been on Ride2 = " + ride2.checkVisitorfromHistory(v009));
// adding a space and a bar to seperate information to make it clearer in terminal 
System.out.println();
System.out.println("=== Amount of past visitors ===");
System.out.println();
// Print the number of Visitors in the that have visited the ride
System.out.println(" Ride two has had : *" + ride2.numberofVisitors() + "*  many recorded visitors ");
// adding a space and a bar to seperate information to make it clearer in terminal 
System.out.println();

//Print all Visitors in the ride history 
ride2.printRideHistory();
    
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void partFourB(){
        Ride ride3 = new Ride("ride 3", null, true, 15); 

        Visitor v008 = new Visitor("Jotaro Kujo", "4785245654", "Male", false, false, true, "T0008");
        Visitor v002 = new Visitor("Kurt Cobain", "0477777777", "Male", true, true, false, "T0002");
        Visitor v003 = new Visitor("Jordan Carter", "066666666", "Male", false, true, true, "T0003"); 
        Visitor v010 = new Visitor("Jade Pirf", "416468314", "Female", true, true, true, "T0010");
        Visitor v009 = new Visitor("Jessica Rabbit", "098527368", "Female", false, false, false, "T0009");        
        Visitor v001 = new Visitor("Tame Impala", "0444444444", "Male", false, true, false, "T0001");
// add visitors
        ride3.addVisitorToHistory(v002);
        ride3.addVisitorToHistory(v009);
        ride3.addVisitorToHistory(v008);
        ride3.addVisitorToHistory(v003);
        ride3.addVisitorToHistory(v001);
        ride3.addVisitorToHistory(v010);
        ride3.addVisitorToHistory(v003);

// print history before sorting 
System.out.println();
System.out.println("Visitor list before sorting: ");
System.out.println();
ride3.printRideHistory();


// sorting visitor history 
ride3.sortRideHistory();
//printing sorted histort
System.out.println();
System.out.println("Sorted Visitor histy list: ");
System.out.println();
ride3.printRideHistory();
 }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   
    public void partFive(){
        
        Ride ride4 = new Ride("ride 4", null, true, 3); 
        //making employee 
        

// sett the max amount of visitors who can be on ride at once
ride4.setMaxRider(4);


        // creating a list of visitors          
    Visitor v001 = new Visitor("Tame Impala", "0444444444", "Male", false, true, false, "T0001");
    Visitor v002 = new Visitor("Kurt Cobain", "0477777777", "Male", true, true, false, "T0002");
    Visitor v003 = new Visitor("Jordan Carter", "066666666", "Male", false, true, true, "T0003");
    Visitor v004 = new Visitor("Pastel Ghost", "0202020202", "Female", false, true, false, "T0004");
    Visitor v005 = new Visitor("Pixies", "4545454544", "Male", true, true, false, "T0005");
    Visitor v006 = new Visitor("Tony Hawk", "46565456163", "Male", false, false, true, "T0006");
    Visitor v007 = new Visitor("Eric Smith", "741852963", "Male", false, true, true, "T0007");
    Visitor v008 = new Visitor("Jotaro Kujo", "4785245654", "Male", false, false, true, "T0008");
    Visitor v009 = new Visitor("Jessica Rabbit", "098527368", "Female", false, false, false, "T0009");
    Visitor v010 = new Visitor("Jade Pirf", "416468314", "Female", true, true, true, "T0010");
    
// putting visitors in the queue 
    ride4.addVisitortoQueue(v010);
    ride4.addVisitortoQueue(v009);
    ride4.addVisitortoQueue(v008);
    ride4.addVisitortoQueue(v007);
    ride4.addVisitortoQueue(v006);
    ride4.addVisitortoQueue(v005);
    ride4.addVisitortoQueue(v004);
    ride4.addVisitortoQueue(v003);
    ride4.addVisitortoQueue(v002);
    ride4.addVisitortoQueue(v001);
// list visitors in the queue before running a cycle
System.out.println();
System.out.println("=== Visitors in the Queue Before Running Cycle ==");
ride4.printQueue();
System.out.println();
//run a cycle
System.out.println("The ride is about to begin ");
ride4.runOneCycle();      
System.out.println("The ride has completed a cycle");
System.out.println();

// print remaining visitors in the queue
System.out.println("  The remaining queue : ");
ride4.printQueue();
System.out.println();

// print ride history 

System.out.println("Ride4's visitor history:");
ride4.printRideHistory();

}


    public void partSix(){
        Ride ride5 = new Ride("ride 5", null, true, 3); 
    //adding visitors
    Visitor v001 = new Visitor("Tame Impala", "0444444444", "Male", false, true, false, "T0001");
    Visitor v002 = new Visitor("Kurt Cobain", "0477777777", "Male", true, true, false, "T0002");
    Visitor v003 = new Visitor("Jordan Carter", "066666666", "Male", false, true, true, "T0003");
    Visitor v004 = new Visitor("Pastel Ghost", "0202020202", "Female", false, true, false, "T0004");
    Visitor v005 = new Visitor("Pixies", "4545454544", "Male", true, true, false, "T0005");

    ride5.addVisitorToHistory(v005);
    ride5.addVisitorToHistory(v004);
    ride5.addVisitorToHistory(v003);
    ride5.addVisitorToHistory(v002);
    ride5.addVisitorToHistory(v001);

// export the the info to the file
String filePath = "C:\\Users\\61476\\OneDrive - Southern Cross University\\object orintated programing\\kdonovan-A2\\kdonovan-ass2\\exports\\ride_history.csv";
ride5.exportRideHistory(filePath);
//conformation message 
System.out.println(" ride history of visitors successefully uploaded to  " + filePath);

 }






    public void partSeven(){
    }
}
    