public class Exception
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Before Execution");
            //Code causes the exception
            int data=10/0;
            System.out.println("After Execution");
        }
        catch(ArithmeticException e1)
        {
            //Code Solves the exception
            System.out.println("I am in Catch");
        }
        finally
        {
            System.out.println("I am in finally");
        }
    }
}
