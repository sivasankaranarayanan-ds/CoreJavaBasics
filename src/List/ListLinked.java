package List;
import java.util.*;
//Linkedlist program
public class ListLinked
{
    public static void main(String[] args)
    {
        LinkedList<String> l=new LinkedList<String>();
        l.add("Ravi");
        l.add("Vijay");
        l.add("Ravi");
        l.add("Ajay");

        Iterator<String> a=l.iterator();
        while(a.hasNext())
        {
            System.out.println("Student Name: " + a.next());
        }
    }
}


