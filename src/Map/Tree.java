package Map;
import java.util.*;
public class Tree
{
    public static void main(String[] args)
    {
        TreeMap<Integer,String> tree=new TreeMap<Integer,String>(); //It preserves ascending order by default
        tree.put(100,"Amit");
        tree.put(102,"Ravi");
        tree.put(101,"Vijay");
        tree.put(103,"Rahul");            //Tree-map doesn't allow null key or value.

        //Maintains descending order
        System.out.println("descendingMap: "+tree.descendingMap());
        //Returns key-value pairs whose keys are less than or equal to the specified key.
        System.out.println("headMap: "+tree.headMap(102,true));
        //Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("tailMap: "+tree.tailMap(102,true));
        //Returns key-value pairs exists in between the specified key.
        System.out.println("subMap: "+tree.subMap(100, true, 102, true));

    }
}
