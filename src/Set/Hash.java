package Set;
import java.util.*;
public class Hash
{
    public static void main(String args[]) {
        //Creating HashSet and adding elements
        HashSet<String> set = new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");                          //hashset won't allow duplicate values
        set.add("Ajay");
        set.add(null);                            //Only one null value it allows

        for (String i:set)                        //it won't preserve insertion order
        {
            System.out.println("Employee name: " + i);
        }
    }
}
