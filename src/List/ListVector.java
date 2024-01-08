package List;
import java.util.*;
//Vector program
public class ListVector
{
    public static void main(String args[]) {
        //Create a vector
        Vector<String> vec = new Vector<String>();
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");
        vec.add("Rat");
        vec.add("Cat");
        vec.add("Deer");

        for (String v1: vec)
        {
            System.out.println("Animal are: " + v1);
        }
        System.out.println("Animal Size: " + vec.size());
    }
}
