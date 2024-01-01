public class Loops
{
    public static void main(String[] args)
    {
        //for loop
        System.out.println("for loop");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("-------------");
        //while loop
        System.out.println("while loop");
        int k=1;
        while(k<=5)
        {
            System.out.println(k);
            k++;
        }
        System.out.println("-----------------");
        //do-while loop
        System.out.println("do-while");
        int i =2;
        do{
            System.out.println("atleast one time iterate");
            i++;
        }while(i>10);
        System.out.println("--------------");
        //if statement
        System.out.println("if statement");
        int a=10;
        if(a<20)
        {
            System.out.println("10 is less than 20");
        }
        //if-else statement
        System.out.println("if-else statement");
        int b=15;
        if(b>20)
        {
            System.out.println("b is greater than 20");
        }
        else
        {
            System.out.println("b is not greater than 20");
        }
        //if-else-if statement
        System.out.println("if-else-if statement");
        if(a==20)
        {
            System.out.println("a is equal to 20");
        }
        else if (a==15)
        {
            System.out.println("a is equal to 15");
        }
        else if (a==10)
        {
            System.out.println("a is equal to 10");
        }
        System.out.println("-------------");
        //continue
        System.out.println("Continue statement");
        for (int t = 0; t <= 15; t++) {
            if (t == 10 || t == 12) {
                continue;
            }
            System.out.print(t + " ");
        }
        System.out.println("");
        System.out.println("-------------");
        //break
        System.out.println("Break statement");
        int s = 2;
        switch(s)
        {
            case 1:
                System.out.println("GFG");
                break;
            case 2:
                System.out.println("Second Case");
                break;
            default:
                System.out.println("default case");
        }
    }
}
