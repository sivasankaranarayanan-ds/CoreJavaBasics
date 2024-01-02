public class Accessmod
{

    //Private:   The access level of a private modifier is only within the class.
    //           It cannot be accessed from outside the class.
    //Default:   The access level of a default modifier is only within the package.
    //           It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
    //Protected: The access level of a protected modifier is within the package and outside the package through child class.
    //           If you do not make  the child class, it cannot be accessed from outside the package.
    //Public:    The access level of a public modifier is everywhere.
    //           It can be accessed from within the class, outside the class, within the package and outside the package.


    public static void main(String[] args)
    {
        employee obj = new employee();
        System.out.println("Employee name: " + obj.name);
        System.out.println("Employee company: " + obj.company);
        //Here, we can't print (age variable) because it is private modifier.
    }
}

class employee
{
    public String name = "Max";        //public modifier
    private int age = 44;              //private modifier
    String company = "Xavier";  //Default modifier
}
