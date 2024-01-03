//Polymorphism --> 2types
       // 1) Compile time polymorphism
       // 2) Run time polymorphism

//Run-time polymorphism example
     //To achieve runtime polymorphism inheritance,upcasting and method overriding is mandatory
class Departments
{
    void subdept()
    {
        String dept="Three";
        System.out.println("Sub Departments: " + dept);
    }
}
class MECH extends Departments  //inheritance
{
    int count = 43;
    void subdept()   //method overriding
    {
        System.out.println("Total Strength in MECH Dept: " + count);
    }
}
class CS extends  Departments
{
    int count = 55;
    void subdept()
    {
        System.out.println("Total Strength in CS Dept: " + count);
    }
}
class ECE extends Departments
{
    int count = 52;
    void subdept()
    {
        System.out.println("Total Strength in ECE Dept: " + count);
    }
}

//Compile time polymorphism
  // Method overloading
class Symbols
{
    static int add(int a, int b)
    {
           return a+b;
    }
}
class Sign extends Symbols
{
    static int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
public class Poly
{
    public static void main(String[] args)
    {
        //run-time polymorphism
        System.out.println("*********************");
        System.out.println("Run-time polymorphism");
        System.out.println("*********************");
        System.out.println("Departments Strength");
        Departments D1,D2,D3;
        D1 = new MECH();        //upcasting
        D2 = new CS();
        D3 = new ECE();
        D1.subdept();
        D2.subdept();
        D3.subdept();
        System.out.println("*************************");
        //compile time polymorphism
        System.out.println("Compile time polymorphism");
        System.out.println("*************************");
        Symbols s1 =new Sign();    //up-casting
        Sign s2 = (Sign)s1;        //down-casting
        System.out.println(s1.add(8,14));
        System.out.println(s2.add(8,47,25));
    }
}
