package LoopsOnCollections;
import java.util.*;
public class Normalloops
{
    public static void main(String[] args)
    {
        List<String> fruits = Arrays.asList("apple", "banana", "orange");    //Collection
        for (int i = 0; i < fruits.size(); i++)                              //using normal loop
        {
            fruits.set(i, fruits.get(i).toUpperCase());                      //changing one by one uppercase
            System.out.println(fruits);
        }
    }
}
