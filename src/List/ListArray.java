package List;
import java.util.*;
//Arraylist program
public class ListArray
{
    public static void main(String[] args)
    {
        ArrayList<String> stations=new ArrayList<String>();
        stations.add("Tirunelveli junction");
        stations.add("Delhi junction");
        stations.add("Coimbatore junction");
        stations.add("Madurai junction");
        stations.add("Tiruchirappalli junction");

        ListIterator<String> listIterator=stations.listIterator();
        System.out.println("In the forward direction : ");
        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
        System.out.println("***************************");
        System.out.println("In the backward direction:- ");
        while(listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }
    }
}
