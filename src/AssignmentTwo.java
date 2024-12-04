
public class AssignmentTwo {
    public static void main(String[] args) {
    }
    public void partThree(){
    //making new ride
    Ride ride1 = new Ride("rider 1", null, true, 3); 

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
//removing from queue
ride1.removeVisitorfromQueue(v005);
ride1.removeVisitorfromQueue(v008);
ride1.removeVisitorfromQueue(v001);
    
// pring method 
ride1.printQueue();

 }

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
ride2.addVisitortoQueue(v009);
ride2.addVisitortoQueue(v008);
ride2.addVisitortoQueue(v007);
ride2.addVisitortoQueue(v006);
ride2.addVisitortoQueue(v005);

// check for specific Visitor is in the rides history 
System.out.println("Searching for Jessica Rabbit in ride 2 history" + ride2.checkVisitorfromHistory(v009));

// Print the number of Visitors in the that have visited the ride
System.out.println(" Ride two has had : " + ride2.numberofVisitors() + "many recorded visitors ");

//Print all Visitors in the ride history 
ride2.printRideHistory();
    
    }
    public void partFourB(){
    }
    public void partFive(){
    }
    public void partSix(){
    }
    public void partSeven(){
    }
    }
    