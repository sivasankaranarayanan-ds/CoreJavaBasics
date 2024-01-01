package ClassObject;

public class Laptop
{
    double price;
    int ram;
    String company;
    //constructor
    public Laptop(double price,int ram,String company)
    {
        this.price=price;
        this.ram=ram;
        this.company=company;
    }
    //method
    void display()
    {
        System.out.println("ClassObject.Laptop Price: " + price);
        System.out.println("ClassObject.Laptop RAM: " + ram);
        System.out.println("ClassObject.Laptop Company: " + company);
    }
}
