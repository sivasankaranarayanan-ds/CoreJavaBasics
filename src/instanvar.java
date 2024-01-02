public class instanvar
{
    public String empname;  //public instance
    String empdivision;
    private int empage;
    public instanvar(String name)
    {
        empname=name;
    }
    public void setdiv(String div)
    {
        empdivision= div;
    }
    public void setage(int age)
    {
        empage=age;
    }
    public void displayemp()
    {
        System.out.println("Employee Name: " +empname);
        System.out.println("Employee Division: " +empdivision);
        System.out.println("Employee Age: " +empage);
    }
    public static void main(String[] args)
    {
        System.out.println("Instance Variables");
        instanvar i = new instanvar("DataSirpi");
        i.setdiv("C");
        i.setage(22);
        i.displayemp();
    }
}
