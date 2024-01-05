package Map;
import java.util.*;
public class Linked
{
    public static void main(String[] args)
    {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");                 //It contains unique elements
        map.put(102,"Rahul");
        map.put(null,"Kiran");                //one null key
        map.put(106,null);
        map.put(107,null);                    //multiple null values
        //Fetching key only
        System.out.println("Keys: "+map.keySet());
        //Fetching value only
        System.out.println("Values: "+map.values());
        //Fetching key-value pair
        System.out.println("Key-Value pairs: "+map.entrySet());

        System.out.println("Running for-each loop method");
        for(Map.Entry m : map.entrySet())            //It maintains insertion order
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
