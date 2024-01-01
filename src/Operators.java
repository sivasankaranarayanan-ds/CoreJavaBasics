public class Operators
{
    public static void main(String[] args) {

        int x = 15;
        int y = 12;

        //arithmetic operators

        //Addition
        int a = x + y;

        //Sub
        int s = x - y;

        //Multiple
        int m = x * y;

        //Division
        int d = x / y;

        //Modulus
        int mo = x % y;

        System.out.println("Arithmetic Operators");
        System.out.println("Add: " + a);
        System.out.println("Sub: " + s);
        System.out.println("Mul: " + m);
        System.out.println("Div: " + d);
        System.out.println("Mod: " + mo);
        System.out.println("****************");


        //assignment operators

        //(=)operator
        int z = y;

        //(+=)operator
        int p = 8;
        p += 20;

        //(-=)operator
        int q = 25;
        q -= 10;

        //(*=)operator
        int r = 8;
        r *= 8;

        //(/=)operator
        int t = 20;
        t /= 10;

        //(%=)operator
        int w = 5;
        w %= 3;
        System.out.println("Assignment Operators");
        System.out.println("Assign Equ opr: " + z);
        System.out.println("Assign Add opr: " + p);
        System.out.println("Assign Sub opr: " + q);
        System.out.println("Assign Mul opr: " + r);
        System.out.println("Assign Div opr: " + t);
        System.out.println("Assign Mod opr: " + w);
        System.out.println("****************");

        //Relational operators
        System.out.println("Relation Operators");
        //(==)operator
        int val1 = 9;
        int val2 = 9;
        int val3 = 8;
        System.out.println("val1 == val2: " + (val1 == val2));
        System.out.println("val1 == val3: " + (val1 == val3));
        //(!=)operator
        System.out.println("val1 != val2: " + (val1 != val2));
        System.out.println("val1 != val3: " + (val1 != val3));
        //(>)operator
        System.out.println("val1 > val2: " + (val1 > val2));
        System.out.println("val1 > val3: " + (val1 > val3));
        //(<)operator
        System.out.println("val1 < val2: " + (val1 < val2));
        System.out.println("val3 < val1: " + (val3 < val1));
        //(>=)operator
        int val4 = 7;
        System.out.println("val3 >= val1: " + (val3 >= val1));
        System.out.println("val1 >= val4: " + (val1 >= val4));
        //(<=)operator
        System.out.println("val3 <= val1: " + (val3 <= val1));
        System.out.println("val1 <= val4: " + (val1 <= val4));
        System.out.println("****************");

        //Logical operator
        System.out.println("Logical Operators");
        // initializing variables
        int i = 10, j = 20, k = 20, l = 0;
        System.out.println("Var1 = " + i);
        System.out.println("Var2 = " + j);
        System.out.println("Var3 = " + k);
        //(&&)AND operator
        System.out.println("(i < j) && (j == k)= " + ((i < j) && (j == k)));
        System.out.println("(i < j) && (j == k)= " + ((i < j) && (j != k)));
        //(||)OR operator
        System.out.println("(i < j)||(j == k)= " + ((i < j)||(j == k)));
        System.out.println("(i > j)||(j != k)= " + ((i > j)||(j != k)));
        //(!)NOT operator
        System.out.println("!(i < j) = " + !(i < j));
        System.out.println("!(l > k) = " + !(l > k));
        System.out.println("****************");

        //Bitwise operator
        System.out.println("Bitwise Operators");
        int g = 7;
        int h = 9;
        System.out.println("g&h = " + (g & h));
        System.out.println("g|h = " + (g | h));
        System.out.println("g^h = " + (g ^ h));
    }
}
