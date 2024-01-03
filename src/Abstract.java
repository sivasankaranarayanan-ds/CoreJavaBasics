//Using Abstraction to hiding the implementations details and showing necessary details
//Abstract class
abstract class Pets
{
    abstract void meow();   //abstract method
    void dog()              //non-abstract method
    {
        System.out.println("Dog barking: bow bow");
    }
}
public class Abstract extends Pets
{
    void meow()
    {
        System.out.println("Meow sound: meow meow");
    }

    public static void main(String[] args)
    {
        Pets obj =new Abstract();
        obj.meow();
        obj.dog();
    }
}
