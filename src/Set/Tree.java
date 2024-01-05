package Set;
import java.util.*;
public class Tree
{
    public static void main(String[] args)
    {
        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(88);
        nums.add(77);
        nums.add(66);
        nums.add(55);
        //nums.add(null);  Tree-set won't allow null value

        Iterator i=nums.iterator();             //it's preserves ascending order, not insertion order
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
