package LoopsOnCollections;
import java.util.*;

//Why stream?
        //If you change the existing stream or create the new stream,
        //it will not affect the list which is you create already the collection.
        //Once you consume the stream, you can't reuse it then it will close automatically.
        //So, the advantage is your data is not leakage.
public class Streams
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(2,9,3,8,4,7,5);   //Collection
        nums.stream()
                .filter(n -> n%2==1)                        //filter the odd numbers
                .sorted()                                   //and sorted
                .map(n -> n*2)                              //and double it
                .forEach(n -> System.out.println(n));       //and print the values through for-each loop.
    }
}
