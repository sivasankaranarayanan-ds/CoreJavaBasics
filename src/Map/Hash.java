package Map;
import java.util.*;
public class Hash
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> map=new HashMap<Integer,String>();  //Creating HashMap with key and value
        map.put(858,"Orange");         //Put elements in Map using put method
        map.put(471,"Apple");
        map.put(5967,"Mango");
        map.put(25413,"Grapes");        //key won't allow duplicates
        map.put(2114,"Banana");
        map.put(1455,"Mango");          //value allow duplicates
        map.put(null,"Watermelon");     //hash-map allow null keys or values.
        map.put(5478,null);

        System.out.println("Hashmap...");
        for(Map.Entry m : map.entrySet())            //It maintains no order.
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Map Size: " + map.size());
        System.out.println(map.remove(471,"Apple"));
        System.out.println("After Removing, Map Size is: " + map.size());

    }
}
