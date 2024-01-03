//5 types of inheritance

    /*  To achieve inheritance extends keyword is most important
     1) Single inheritance
     2) Multi-level inheritance
     3) Multiple inheritance --> java doesn't support multiple inheritance through extends keyword
     4) Hierarchical inheritance
     5) Hybrid inheritance  */

// single inheritance and Multi-level inheritance example
class Single
{
    int bankacc= 594104278;
    String bankname="Data";
}

class Multilevel extends Single
{
    static String bankholdername="Sirpi";
}
public class Inheritance extends Multilevel
{
    static String IFSC = "DATA09123";

    public static void main(String[] args) {
        Inheritance i=new Inheritance();
        System.out.println("Bank Acc no: " + i.bankacc);
        System.out.println("Bank Acc Holder Name: " + i.bankholdername);
        System.out.println("Bank Name: " + i.bankname);
        System.out.println("Bank IFSC CODE: " + i.IFSC);
    }

}
