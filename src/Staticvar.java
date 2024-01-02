public class Staticvar
{
    //Static Variable
    static String sname;
    static int sage;
    static String sdept;

    //Static method
    static void students(String sname,int sage,String sdept)
    {
        System.out.println("Student Name: " + sname);
        System.out.println("Student Age: " + sage);
        System.out.println("Student Dept: " + sdept);
    }

    public static void main(String[] args)
    {
        System.out.println("Stativ variable & Static method");
        System.out.println("****************");
        students("Kannan",22,"CS");
        students("Vela",23,"MECH");
    }
}
