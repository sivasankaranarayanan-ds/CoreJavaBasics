/*
               Interface --> is a definition block which is used to achieve abstraction.
               To achieve multiple inheritance through interface using implements keyword.
               It can be used to achieve loose coupling.
               In interface class inside Function members are by default abstract method.
               No constructor.
               Default access is public
               */
interface Rectangle
{
    int l =12;
    int w = 23;
    void rec();       //abstract method
}
interface Square
{
    int a =6;
    void squ();
}
class Drawable implements Rectangle,Square
{
    public void rec()
    {
        System.out.println("Length of the Rec: " + l);
        System.out.println("Width of the Rec: " + w);
        System.out.println("Drawing Rectangle");
    }
    public void squ()
    {
        System.out.println("Area of square: " + a);
        System.out.println("Drawing Square");
    }
}
public class Interface
{
    public static void main(String[] args)
    {
        Drawable r = new Drawable();
        r.rec();
        r.squ();
    }
}
