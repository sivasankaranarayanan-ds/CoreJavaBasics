public class StaticBlock
{
    //static keyword
    static int i;   //static variable
    int j;          //non-static variable

    static {        //static block
        i=20;
        System.out.println("Static Block is created");
    }

    public static void main(String[] args)
    {
        System.out.println(StaticBlock.i);
    }
}
