public class Constructor
{
    //Two types of constructor
    // 1) Default constructor (no-arg constructor)
    // 2) Parameterized constructor (with arg constructor)

    int id;
    String name;

    //Default Constructor example without arg
    Constructor(){
        System.out.println("Constructor without arg is created!!");
    }

    //Parameter Constructor example with arg
    Constructor(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void display()
    {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
    }
    public static void main(String[] args)
    {
      Constructor c1 = new Constructor();  //type-->1 no arg
        System.out.println("****************");
      Constructor c2 = new Constructor(76,"Dhoni"); //type-->2 with arg
      c2.display();
    }

}
