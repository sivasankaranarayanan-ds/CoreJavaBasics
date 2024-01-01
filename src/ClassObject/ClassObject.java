package ClassObject;

public class ClassObject
{
    public static void main(String[] args)
    {
        //Creating and initializing laptop object
        Laptop main = new Laptop(30000.0,8,"DELL");
        main.display();
        System.out.println("***************");
        Laptop main1 = new Laptop(45000.0,12,"APPLE");
        main1.display();
    }
}
