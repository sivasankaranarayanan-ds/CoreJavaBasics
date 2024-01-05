package Set;
import java.util.*;
public class LinkedHash
{
    public static void main(String[] args)
    {
        //Creating HashSet and adding elements
        LinkedHashSet<Integer> set=new LinkedHashSet();
        set.add(789);
        set.add(456);
        set.add(123);
        set.add(147);
        set.add(258);
        set.add(369);
        Iterator<Integer> i=set.iterator();     //LinkedHashset preserves insertion order,not ascending order
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
