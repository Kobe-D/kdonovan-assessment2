//part 4 B
import java.util.Comparator;


public class VisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor v1, Visitor v2) {
        // Comparevisitors names 
        int nameComparison = v1.getName().compareTo(v2.getName());
        
        // If names are the same, compare by mobiles of visistors 
        if (nameComparison == 0) {
            return v1.getMobile().compareTo(v2.getMobile());
        }
        
        return nameComparison;
    }
}